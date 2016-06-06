/**
 * 
 */
package com.ysoft.transliterator.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.ysoft.transliterator.enumeration.EAlphabet;

/**
 * @author Vladislav Naydenov
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface AlphabetMapping {

	public EAlphabet from();
	
	public EAlphabet to();
}
