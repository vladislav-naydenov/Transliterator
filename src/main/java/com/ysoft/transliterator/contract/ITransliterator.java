/**
 * 
 */
package com.ysoft.transliterator.contract;

/**
 * @author Vladislav Naydenov
 *
 */
public interface ITransliterator {

	void createMappings();
	
	String transliterate(String input);
	
	String transliterateReverse(String input);
}
