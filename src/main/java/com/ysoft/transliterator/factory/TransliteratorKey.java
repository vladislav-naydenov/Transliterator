/**
 * 
 */
package com.ysoft.transliterator.factory;

import com.ysoft.transliterator.enumeration.EAlphabet;

/**
 * @author Vladislav Naydenov
 *
 */
public class TransliteratorKey {

	private EAlphabet fromAlphabet;
	private EAlphabet toAlphabet;
	
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
