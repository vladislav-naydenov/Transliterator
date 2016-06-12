/**
 * 
 */
package com.ysoft.transliterator.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.ysoft.transliterator.enumeration.EAlphabet;
import com.ysoft.transliterator.implementation.AbstractTransliterator;

/**
 * Designates a class which will implement logic for transliteration from source to target alphabet.
 * This class must be a subtype of {@link AbstractTransliterator}
 * @author Vladislav Naydenov
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface AlphabetMapping {

	public EAlphabet from();
	
	public EAlphabet to();
}
