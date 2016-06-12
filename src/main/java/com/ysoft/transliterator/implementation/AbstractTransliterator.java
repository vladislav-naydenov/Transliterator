package com.ysoft.transliterator.implementation;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;

import com.google.common.base.Strings;
import com.ysoft.transliterator.contract.ITransliterator;

/**
 * Base class for {@link ITransliterator} implementations that provides the basic
 * logic for transliteration from one alphabet to another and backwards.
 * @author Vladislav Naydenov
 */
public abstract class AbstractTransliterator implements ITransliterator {

	/**
	 * Contains the mappings between characters from source to destination alphabet
	 * */
	protected Map<Character, String> sourceToDestinationAlphabetMap;
	/**
	 * Contains the mappings between characters from destination to source alphabet
	 * */
	protected Map<Character, String> destinationToSourceAlphabetMap;
	
	public AbstractTransliterator() {
		this.sourceToDestinationAlphabetMap = new HashMap<>();
		this.destinationToSourceAlphabetMap = new HashMap<>();
		this.createMappings();
	}
	
	/**
	 * Transliterates the {@code input} using the provided {@code lookupMap} which contains the
	 * mappings between the characters of the supported alphabets.
	 * @param input - the input string which will be transliterated
	 * @param lookupMap - {@link Map}{@literal<}{@link Character}, {@link String}{@literal >} that contains the mappings needed for transliteration
	 * */
	protected String doTransliterate(@NotNull String input, @NotNull Map<Character, String> lookupMap) {
		validateInput(input);
		
		StringBuilder result = new StringBuilder(input.length());
		for (int i = 0; i < input.length(); i++) {
			char letter = input.charAt(i);
			char lowerCaseLetter = Character.toLowerCase(letter);
			if (lookupMap.containsKey(lowerCaseLetter)) {
				if (Character.isLowerCase(letter)) {
					result.append(lookupMap.get(lowerCaseLetter));
				} else {
					result.append(lookupMap.get(lowerCaseLetter).toUpperCase());
				}
			} else {
				result.append(letter);
			}
		}
		
		return result.toString();
	}
	
	/**
	 * Checks if the string passed is not {@code null} or empty.
	 * @throws IllegalArgumentException if the argument is {@code null} or empty
	 * */
	protected void validateInput(String input) {
		if (Strings.isNullOrEmpty(input)) {
			throw new IllegalArgumentException("Input must not be null or empty string!");
		}
	}
	
	/**
	 * Performs transliteration from source to destination alphabet
	 * @param input - the text that will be transliterated
	 * @return transliterated version of the {@code input} string
	 * */
	@Override
	public String transliterate(@NotNull String input) {
		return this.doTransliterate(input, this.sourceToDestinationAlphabetMap);
	}

	/**
	 * Performs transliteration from destination to source alphabet
	 * @param input - the text that will be transliterated
	 * @return transliterated version of the {@code input} string
	 * */
	@Override
	public String transliterateReverse(@NotNull String input) {
		return this.doTransliterate(input, this.destinationToSourceAlphabetMap);
	}
	
	/**
	 * Creates the mappings source -> destination alphabet and
	 * destination -> source alphabet 
	 * */
	@Override
	public void createMappings() {
		this.createSourceToDestinationMapping();
		this.createDestinationToSourceMapping();
	}
	
	protected abstract void createSourceToDestinationMapping();
	protected abstract void createDestinationToSourceMapping();
}
