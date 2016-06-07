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

/**
 * @author Vladislav Naydenov
 *
 */
public class TransliteratorFactory {

	private static final Map<TransliteratorKey, Class<ITransliterator>> ALPHABET_TRANSLITERATORS = new HashMap<>();
	
	static {
		try {
			scan();
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
	
	public static ITransliterator produce(EAlphabet fromAlphabet, EAlphabet toAlphabet) throws InstantiationException, IllegalAccessException {
		return ALPHABET_TRANSLITERATORS.get(new TransliteratorKey(fromAlphabet, toAlphabet)).newInstance();
	}
	
	@SuppressWarnings("unchecked")
	private static void scan() throws ClassNotFoundException {
		ClassPathScanningCandidateComponentProvider scanner = new ClassPathScanningCandidateComponentProvider(false);
		scanner.addIncludeFilter(new AnnotationTypeFilter(AlphabetMapping.class));
		
		for (BeanDefinition beanDefinition : scanner.findCandidateComponents("com.ysoft.transliterator.implementation")) {
			Class<ITransliterator> mapperClass = (Class<ITransliterator>) Class.forName(beanDefinition.getBeanClassName());
			AlphabetMapping alphabetMapping = mapperClass.getAnnotation(AlphabetMapping.class);
			
			ALPHABET_TRANSLITERATORS.put(new TransliteratorKey(alphabetMapping.from(), alphabetMapping.to()), mapperClass);
		}
	}
}
