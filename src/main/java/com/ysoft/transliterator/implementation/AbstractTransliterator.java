package com.ysoft.transliterator.implementation;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;

import com.google.common.base.Strings;
import com.ysoft.transliterator.contract.ITransliterator;

/**
 * @author Vladislav Naydenov
 *
 */
public abstract class AbstractTransliterator implements ITransliterator {

	protected Map<Character, String> sourceToDestinationAlphabetMap;
	protected Map<Character, String> destinationToSourceAlphabetMap;
	
	public AbstractTransliterator() {
		this.sourceToDestinationAlphabetMap = new HashMap<>();
		this.destinationToSourceAlphabetMap = new HashMap<>();
		this.createMappings();
	}
	
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
	
	protected void validateInput(String input) {
		if (Strings.isNullOrEmpty(input)) {
			throw new IllegalArgumentException("Input must not be null or empty string!");
		}
	}
	
	@Override
	public String transliterate(@NotNull String input) {
		return this.doTransliterate(input, this.sourceToDestinationAlphabetMap);
	}

	@Override
	public String transliterateReverse(@NotNull String input) {
		return this.doTransliterate(input, this.destinationToSourceAlphabetMap);
	}
	
	@Override
	public void createMappings() {
		this.createSourceToDestinationMapping();
		this.createDestinationToSourceMapping();
	}
	
	protected abstract void createSourceToDestinationMapping();
	protected abstract void createDestinationToSourceMapping();
}
