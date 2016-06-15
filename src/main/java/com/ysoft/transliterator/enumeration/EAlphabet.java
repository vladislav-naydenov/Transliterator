/**
 * 
 */
package com.ysoft.transliterator.enumeration;

import com.google.common.base.Strings;

/**
 * Enumeration containing all supported alphabets. 
 * @author Vladislav Naydenov
 */
public enum EAlphabet {

	LATIN("Latin"),
	CYRILLIC("Cyrillic"),
	RUSSIAN("Russian"),
	CZECH("Czech"),
	GREEK("Greek"),
	TURKISH("Turkish"),
	HEBREW("Hebrew");
	
	private String alphabetName;
	
	private EAlphabet(String alphabetName) {
		this.alphabetName = alphabetName;
	}
	
	public String getAlphabetName() {
		return alphabetName;
	}
	
	public static EAlphabet of(String alphabetName) {
		if (Strings.isNullOrEmpty(alphabetName)) {
			throw new IllegalArgumentException("alphabetName cannot be null or empty!");
		}
		
		return EAlphabet.valueOf(alphabetName.toUpperCase());
	}
}
