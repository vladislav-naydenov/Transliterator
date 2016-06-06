/**
 * 
 */
package com.ysoft.transliterator.enumeration;

import com.google.common.base.Strings;

/**
 * @author Vladislav Naydenov
 *
 */
public enum EAlphabet {

	LATIN("Latin"),
	CYRILLIC("Cyrillic");
	
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
