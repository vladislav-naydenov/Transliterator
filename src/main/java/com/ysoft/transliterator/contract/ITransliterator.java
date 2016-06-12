/**
 * 
 */
package com.ysoft.transliterator.contract;

import javax.validation.constraints.NotNull;

/**
 * An interface that defines a transliterator
 * @author Vladislav Naydenov
 */
public interface ITransliterator {

	/**
	 * Creates a mappings between the supported alphabets.
	 * */
	void createMappings();
	
	/**
	 * Performs a transliteration of the argument to the destination alphabet
	 * @param input - text that will be transliterated to the destination alphabet
	 * @return transliterated text 
	 * */
	String transliterate(@NotNull String input);
	
	/**
	 * Performs a backward transliteration of the argument to the source alphabet
	 * @param input - text that will be transliterated to the source alphabet
	 * @return transliterated text 
	 * */
	String transliterateReverse(@NotNull String input);
}
