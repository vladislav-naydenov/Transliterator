/**
 * 
 */
package com.ysoft.transliterator.implementation;

import com.ysoft.transliterator.annotation.AlphabetMapping;
import com.ysoft.transliterator.enumeration.EAlphabet;

/**
 * @author Vladislav Naydenov
 *
 */
@AlphabetMapping(from = EAlphabet.LATIN, to = EAlphabet.RUSSIAN)
public class LatinToRussianTransliterator extends AbstractTransliterator {

	@Override
	protected void createSourceToDestinationMapping() {
		this.sourceToDestinationAlphabetMap.put('a', "à");
		this.sourceToDestinationAlphabetMap.put('b', "á");
		this.sourceToDestinationAlphabetMap.put('c', "ö");
		this.sourceToDestinationAlphabetMap.put('d', "ä");
		this.sourceToDestinationAlphabetMap.put('e', "å");
		this.sourceToDestinationAlphabetMap.put('f', "ô");
		this.sourceToDestinationAlphabetMap.put('g', "ã");
		this.sourceToDestinationAlphabetMap.put('h', "õ");
		this.sourceToDestinationAlphabetMap.put('i', "è");
		this.sourceToDestinationAlphabetMap.put('j', "é");
		this.sourceToDestinationAlphabetMap.put('k', "ê");
		this.sourceToDestinationAlphabetMap.put('l', "ë");
		this.sourceToDestinationAlphabetMap.put('m', "ì");
		this.sourceToDestinationAlphabetMap.put('n', "í");
		this.sourceToDestinationAlphabetMap.put('o', "î");
		this.sourceToDestinationAlphabetMap.put('p', "ï");
		this.sourceToDestinationAlphabetMap.put('q', "q");
		this.sourceToDestinationAlphabetMap.put('r', "ð");
		this.sourceToDestinationAlphabetMap.put('s', "ñ");
		this.sourceToDestinationAlphabetMap.put('t', "ò");
		this.sourceToDestinationAlphabetMap.put('u', "ó");
		this.sourceToDestinationAlphabetMap.put('v', "â");
		this.sourceToDestinationAlphabetMap.put('w', "â");
		this.sourceToDestinationAlphabetMap.put('x', "õ");
		this.sourceToDestinationAlphabetMap.put('y', "û");
		this.sourceToDestinationAlphabetMap.put('z', "ç");
	}
	
	@Override
	protected void createDestinationToSourceMapping() {
		this.destinationToSourceAlphabetMap.put('à', "a");
		this.destinationToSourceAlphabetMap.put('á', "b");
		this.destinationToSourceAlphabetMap.put('â', "v");
		this.destinationToSourceAlphabetMap.put('ã', "g");
		this.destinationToSourceAlphabetMap.put('ä', "d");
		this.destinationToSourceAlphabetMap.put('å', "e");
		this.destinationToSourceAlphabetMap.put('¸', "jo");
		this.destinationToSourceAlphabetMap.put('æ', "zh");
		this.destinationToSourceAlphabetMap.put('ç', "z");
		this.destinationToSourceAlphabetMap.put('è', "i");
		this.destinationToSourceAlphabetMap.put('é', "j");
		this.destinationToSourceAlphabetMap.put('ê', "k");
		this.destinationToSourceAlphabetMap.put('ë', "l");
		this.destinationToSourceAlphabetMap.put('ì', "m");
		this.destinationToSourceAlphabetMap.put('í', "n");
		this.destinationToSourceAlphabetMap.put('î', "o");
		this.destinationToSourceAlphabetMap.put('ï', "p");
		this.destinationToSourceAlphabetMap.put('ð', "r");
		this.destinationToSourceAlphabetMap.put('ñ', "s");
		this.destinationToSourceAlphabetMap.put('ò', "t");
		this.destinationToSourceAlphabetMap.put('ó', "u");
		this.destinationToSourceAlphabetMap.put('ô', "f");
		this.destinationToSourceAlphabetMap.put('õ', "h");
		this.destinationToSourceAlphabetMap.put('ö', "c");
		this.destinationToSourceAlphabetMap.put('÷', "ch");
		this.destinationToSourceAlphabetMap.put('ø', "sh");
		this.destinationToSourceAlphabetMap.put('ù', "shh");
		this.destinationToSourceAlphabetMap.put('ú', "''");
		this.destinationToSourceAlphabetMap.put('û', "y");
		this.destinationToSourceAlphabetMap.put('ü', "'");
		this.destinationToSourceAlphabetMap.put('ý', "je");
		this.destinationToSourceAlphabetMap.put('þ', "ju");
		this.destinationToSourceAlphabetMap.put('ÿ', "ja");
	}
}
