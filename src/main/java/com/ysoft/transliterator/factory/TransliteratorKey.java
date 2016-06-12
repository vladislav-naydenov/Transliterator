/**
 * 
 */
package com.ysoft.transliterator.factory;

import com.ysoft.transliterator.contract.ITransliterator;
import com.ysoft.transliterator.enumeration.EAlphabet;

/**
 * Represents a key by which an {@link ITransliterator} implementations will be searched 
 * @author Vladislav Naydenov
 */
public class TransliteratorKey {

	private EAlphabet fromAlphabet;
	private EAlphabet toAlphabet;
	
	/**
	 * Creates an instance of this class initialized with the given alphabets
	 * */
	public TransliteratorKey(EAlphabet fromAlphabet, EAlphabet toAlphabet) {
		this.fromAlphabet = fromAlphabet;
		this.toAlphabet = toAlphabet;
	}

	public EAlphabet getFromAlphabet() {
		return fromAlphabet;
	}

	public EAlphabet getToAlphabet() {
		return toAlphabet;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fromAlphabet == null) ? 0 : fromAlphabet.hashCode());
		result = prime * result + ((toAlphabet == null) ? 0 : toAlphabet.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		TransliteratorKey other = (TransliteratorKey) obj;
		if (fromAlphabet != other.fromAlphabet) {
			return false;
		}
		if (toAlphabet != other.toAlphabet) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return String.format("From %s, to %s", fromAlphabet, toAlphabet);
	}
}
