/**
 * 
 */
package com.ysoft.transliterator.implementation;

import com.ysoft.transliterator.annotation.AlphabetMapping;
import com.ysoft.transliterator.enumeration.EAlphabet;

/**
 * Implements transliteration from Latin to Greek alphabet
 * @author Vladislav Naydenov
 */
@AlphabetMapping(from = EAlphabet.LATIN, to = EAlphabet.GREEK)
public class LatinToGreekTransliterator extends AbstractTransliterator {

	@Override
	protected void createSourceToDestinationMapping() {
		this.sourceToDestinationAlphabetMap.put('A', "A");
		this.sourceToDestinationAlphabetMap.put('a', "α");
		this.sourceToDestinationAlphabetMap.put('B', "B");
		this.sourceToDestinationAlphabetMap.put('b', "β");
		this.sourceToDestinationAlphabetMap.put('c', "c");
		this.sourceToDestinationAlphabetMap.put('D', "Δ");
		this.sourceToDestinationAlphabetMap.put('d', "δ");
		this.sourceToDestinationAlphabetMap.put('E', "Ε");
		this.sourceToDestinationAlphabetMap.put('e', "ε");
		this.sourceToDestinationAlphabetMap.put('f', "f");
		this.sourceToDestinationAlphabetMap.put('G', "Γ");
		this.sourceToDestinationAlphabetMap.put('g', "γ");
		this.sourceToDestinationAlphabetMap.put('H', "H");
		this.sourceToDestinationAlphabetMap.put('h', "η");
		this.sourceToDestinationAlphabetMap.put('I', "I");
		this.sourceToDestinationAlphabetMap.put('i', "ι");
		this.sourceToDestinationAlphabetMap.put('j', "j");
		this.sourceToDestinationAlphabetMap.put('K', "K");
		this.sourceToDestinationAlphabetMap.put('k', "κ");
		this.sourceToDestinationAlphabetMap.put('L', "Λ");
		this.sourceToDestinationAlphabetMap.put('l', "λ");
		this.sourceToDestinationAlphabetMap.put('M', "M");
		this.sourceToDestinationAlphabetMap.put('m', "μ");
		this.sourceToDestinationAlphabetMap.put('N', "N");
		this.sourceToDestinationAlphabetMap.put('n', "ν");
		this.sourceToDestinationAlphabetMap.put('o', "o");
		this.sourceToDestinationAlphabetMap.put('P', "Π");
		this.sourceToDestinationAlphabetMap.put('p', "π");
		this.sourceToDestinationAlphabetMap.put('q', "q");
		this.sourceToDestinationAlphabetMap.put('R', "Ρ");
		this.sourceToDestinationAlphabetMap.put('r', "ρ");
		this.sourceToDestinationAlphabetMap.put('S', "Σ");
		this.sourceToDestinationAlphabetMap.put('s', "σ");
		this.sourceToDestinationAlphabetMap.put('T', "T");
		this.sourceToDestinationAlphabetMap.put('t', "τ");
		this.sourceToDestinationAlphabetMap.put('U', "Υ");
		this.sourceToDestinationAlphabetMap.put('u', "υ");
		this.sourceToDestinationAlphabetMap.put('v', "v");
		this.sourceToDestinationAlphabetMap.put('w', "w");
		this.sourceToDestinationAlphabetMap.put('X', "Ξ");
		this.sourceToDestinationAlphabetMap.put('x', "ξ");
		this.sourceToDestinationAlphabetMap.put('y', "y");
		this.sourceToDestinationAlphabetMap.put('Z', "Z");
		this.sourceToDestinationAlphabetMap.put('z', "ζ");
	}

	@Override
	protected void createDestinationToSourceMapping() {
		this.destinationToSourceAlphabetMap.put('A', "A");
		this.destinationToSourceAlphabetMap.put('α', "a");
		this.destinationToSourceAlphabetMap.put('B', "B");
		this.destinationToSourceAlphabetMap.put('β', "b");
		this.destinationToSourceAlphabetMap.put('Γ', "G");
		this.destinationToSourceAlphabetMap.put('γ', "g");
		this.destinationToSourceAlphabetMap.put('Δ', "D");
		this.destinationToSourceAlphabetMap.put('δ', "d");
		this.destinationToSourceAlphabetMap.put('E', "e");
		this.destinationToSourceAlphabetMap.put('ε', "e");
		this.destinationToSourceAlphabetMap.put('Z', "Z");
		this.destinationToSourceAlphabetMap.put('ζ', "z");
		this.destinationToSourceAlphabetMap.put('H', "H");
		this.destinationToSourceAlphabetMap.put('η', "h");
		this.destinationToSourceAlphabetMap.put('Θ', "Th");
		this.destinationToSourceAlphabetMap.put('θ', "th");
		this.destinationToSourceAlphabetMap.put('I', "I");
		this.destinationToSourceAlphabetMap.put('ι', "i");
		this.destinationToSourceAlphabetMap.put('K', "K");
		this.destinationToSourceAlphabetMap.put('κ', "k");
		this.destinationToSourceAlphabetMap.put('Λ', "L");
		this.destinationToSourceAlphabetMap.put('λ', "l");
		this.destinationToSourceAlphabetMap.put('M', "M");
		this.destinationToSourceAlphabetMap.put('μ', "m");
		this.destinationToSourceAlphabetMap.put('N', "N");
		this.destinationToSourceAlphabetMap.put('ν', "n");
		this.destinationToSourceAlphabetMap.put('Ξ', "X");
		this.destinationToSourceAlphabetMap.put('ξ', "x");
		this.destinationToSourceAlphabetMap.put('O', "O");
		this.destinationToSourceAlphabetMap.put('ο', "o");
		this.destinationToSourceAlphabetMap.put('Π', "P");
		this.destinationToSourceAlphabetMap.put('π', "p");
		this.destinationToSourceAlphabetMap.put('P', "R");
		this.destinationToSourceAlphabetMap.put('ρ', "r");
		this.destinationToSourceAlphabetMap.put('Σ', "S");
		this.destinationToSourceAlphabetMap.put('σ', "s");
		this.destinationToSourceAlphabetMap.put('T', "T");
		this.destinationToSourceAlphabetMap.put('τ', "t");
		this.destinationToSourceAlphabetMap.put('Y', "U");
		this.destinationToSourceAlphabetMap.put('υ', "u");
		this.destinationToSourceAlphabetMap.put('Φ', "Ph");
		this.destinationToSourceAlphabetMap.put('φ', "ph");
		this.destinationToSourceAlphabetMap.put('X', "Ch");
		this.destinationToSourceAlphabetMap.put('χ', "ch");
		this.destinationToSourceAlphabetMap.put('Ψ', "Ps");
		this.destinationToSourceAlphabetMap.put('ψ', "ps");
		this.destinationToSourceAlphabetMap.put('Ω', "O");
		this.destinationToSourceAlphabetMap.put('ω', "o");
	}
}
