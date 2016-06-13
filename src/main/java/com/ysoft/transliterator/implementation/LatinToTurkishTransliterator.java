/**
 * 
 */
package com.ysoft.transliterator.implementation;

import com.ysoft.transliterator.annotation.AlphabetMapping;
import com.ysoft.transliterator.enumeration.EAlphabet;

/**
 * Implements transliteration from Latin to Turkish alphabet
 * @author Vladislav Naydenov
 */
@AlphabetMapping(from = EAlphabet.LATIN, to = EAlphabet.TURKISH)
public class LatinToTurkishTransliterator extends AbstractTransliterator {

	@Override
	protected void createSourceToDestinationMapping() {
		this.sourceToDestinationAlphabetMap.put('a', "a");
		this.sourceToDestinationAlphabetMap.put('b', "b");
		this.sourceToDestinationAlphabetMap.put('c', "c");
		this.sourceToDestinationAlphabetMap.put('d', "d");
		this.sourceToDestinationAlphabetMap.put('e', "e");
		this.sourceToDestinationAlphabetMap.put('f', "f");
		this.sourceToDestinationAlphabetMap.put('g', "g");
		this.sourceToDestinationAlphabetMap.put('h', "h");
		this.sourceToDestinationAlphabetMap.put('i', "i");
		this.sourceToDestinationAlphabetMap.put('j', "j");
		this.sourceToDestinationAlphabetMap.put('k', "k");
		this.sourceToDestinationAlphabetMap.put('l', "l");
		this.sourceToDestinationAlphabetMap.put('m', "m");
		this.sourceToDestinationAlphabetMap.put('n', "n");
		this.sourceToDestinationAlphabetMap.put('o', "o");
		this.sourceToDestinationAlphabetMap.put('p', "p");
		this.sourceToDestinationAlphabetMap.put('q', "q");
		this.sourceToDestinationAlphabetMap.put('r', "r");
		this.sourceToDestinationAlphabetMap.put('s', "s");
		this.sourceToDestinationAlphabetMap.put('t', "t");
		this.sourceToDestinationAlphabetMap.put('u', "u");
		this.sourceToDestinationAlphabetMap.put('v', "v");
		this.sourceToDestinationAlphabetMap.put('w', "w");
		this.sourceToDestinationAlphabetMap.put('x', "x");
		this.sourceToDestinationAlphabetMap.put('y', "y");
		this.sourceToDestinationAlphabetMap.put('z', "z");
	}

	@Override
	protected void createDestinationToSourceMapping() {
		this.destinationToSourceAlphabetMap.put('a', "a");
		this.destinationToSourceAlphabetMap.put('b', "b");
		this.destinationToSourceAlphabetMap.put('c', "c");
		this.destinationToSourceAlphabetMap.put('ç', "c");
		this.destinationToSourceAlphabetMap.put('d', "d");
		this.destinationToSourceAlphabetMap.put('e', "e");
		this.destinationToSourceAlphabetMap.put('f', "f");
		this.destinationToSourceAlphabetMap.put('g', "g");
		this.destinationToSourceAlphabetMap.put('ğ', "g");
		this.destinationToSourceAlphabetMap.put('h', "h");
		this.destinationToSourceAlphabetMap.put('İ', "I");
		this.destinationToSourceAlphabetMap.put('i', "i");
		this.destinationToSourceAlphabetMap.put('I', "I");
		this.destinationToSourceAlphabetMap.put('ı', "i");
		this.destinationToSourceAlphabetMap.put('j', "j");
		this.destinationToSourceAlphabetMap.put('k', "k");
		this.destinationToSourceAlphabetMap.put('l', "l");
		this.destinationToSourceAlphabetMap.put('m', "m");
		this.destinationToSourceAlphabetMap.put('n', "n");
		this.destinationToSourceAlphabetMap.put('o', "o");
		this.destinationToSourceAlphabetMap.put('ö', "o");
		this.destinationToSourceAlphabetMap.put('p', "p");
		this.destinationToSourceAlphabetMap.put('r', "r");
		this.destinationToSourceAlphabetMap.put('s', "s");
		this.destinationToSourceAlphabetMap.put('ş', "s");
		this.destinationToSourceAlphabetMap.put('t', "t");
		this.destinationToSourceAlphabetMap.put('u', "u");
		this.destinationToSourceAlphabetMap.put('ü', "u");
		this.destinationToSourceAlphabetMap.put('v', "v");
		this.destinationToSourceAlphabetMap.put('y', "y");
		this.destinationToSourceAlphabetMap.put('z', "z");
	}
}
