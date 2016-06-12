package com.ysoft.transliterator.exception;

import com.ysoft.transliterator.contract.ITransliterator;

/**
 * Thrown to indicate that the searched implementation of {@link ITransliterator}
 * does not exists.
 * @author Vladislav Naydenov
 * */
public class NonExistentTransliteratorException extends Exception {

	private static final long serialVersionUID = -1679172269753011535L;

	public NonExistentTransliteratorException(String message) {
		super(message);
	}
}
