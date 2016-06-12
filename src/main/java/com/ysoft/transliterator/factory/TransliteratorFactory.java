/**
 * 
 */
package com.ysoft.transliterator.factory;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.core.type.filter.AnnotationTypeFilter;

import com.ysoft.transliterator.annotation.AlphabetMapping;
import com.ysoft.transliterator.contract.ITransliterator;
import com.ysoft.transliterator.enumeration.EAlphabet;
import com.ysoft.transliterator.exception.NonExistentTransliteratorException;

/**
 * Factory that can create instances of {@link ITransliterator}
 * @author Vladislav Naydenov
 */
public class TransliteratorFactory {

	private static final Map<TransliteratorKey, Class<ITransliterator>> ALPHABET_TRANSLITERATORS = new HashMap<>();
	
	static {
		try {
			scan();
		} catch (ClassNotFoundException e) {
			// this should never happen
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * Produces an instance of {@link ITransliterator} for the given alphabets
	 * @param fromAlphabet - the source alphabet
	 * @param toAlphabet - the destination alphabet
	 * @return an instance of {@link ITransliterator} which knows how to transliterate text in source alphabet to destination alphabet
	 * and backwards.
	 * @throws NonExistentTransliteratorException - if does not exists such implementation of {@link ITransliterator}
	 * @throws InstantiationException 
	 * @throws IllegalAccessException
	 * */
	public static ITransliterator produce(EAlphabet fromAlphabet, EAlphabet toAlphabet) throws InstantiationException, IllegalAccessException, NonExistentTransliteratorException {
		Class<ITransliterator> transliteratorClass = ALPHABET_TRANSLITERATORS.get(new TransliteratorKey(fromAlphabet, toAlphabet));
		
		if (transliteratorClass == null) {
			throw new NonExistentTransliteratorException(String.format("There is no ITransliterator implementation for source alphabet %s and target alphabet %s", fromAlphabet.getAlphabetName(), toAlphabet.getAlphabetName()));
		}
		
		return transliteratorClass.newInstance();
	}
	
	/**
	 * Scans the 'com.ysoft.transliterator.implementation' package and searches for a classes annotated with
	 * {@link AlphabetMapping} annotation and stores the {@link Class}{@literal <}{@link ITransliterator}{@literal >}
	 * instances in a map mapped with proper {@link TransliteratorKey}
	 * */
	@SuppressWarnings("unchecked")
	private static void scan() throws ClassNotFoundException {
		ClassPathScanningCandidateComponentProvider scanner = new ClassPathScanningCandidateComponentProvider(false);
		scanner.addIncludeFilter(new AnnotationTypeFilter(AlphabetMapping.class));
		
		for (BeanDefinition beanDefinition : scanner.findCandidateComponents("com.ysoft.transliterator.implementation")) {
			Class<ITransliterator> transliteratorClass = (Class<ITransliterator>) Class.forName(beanDefinition.getBeanClassName());
			AlphabetMapping alphabetMapping = transliteratorClass.getAnnotation(AlphabetMapping.class);
			
			ALPHABET_TRANSLITERATORS.put(new TransliteratorKey(alphabetMapping.from(), alphabetMapping.to()), transliteratorClass);
		}
	}
}
