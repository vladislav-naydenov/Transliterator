/**
 * 
 */
package com.ysoft.transliterator.implementation;

import javax.validation.constraints.NotNull;

import com.ysoft.transliterator.annotation.AlphabetMapping;
import com.ysoft.transliterator.enumeration.EAlphabet;

/**
 * @author Vladislav Naydenov
 *
 */
@AlphabetMapping(from = EAlphabet.LATIN, to = EAlphabet.CYRILLIC)
public class LatinToCyrillicTransliterator extends AbstractTransliterator {

	@Override
	public void createMappings() {
		createSourceToDestinationMapping();
		createDestinationToSourceMapping();
	}
	
	@Override
	public String transliterate(@NotNull String input) {
		return this.doTransliterate(input, this.sourceToDestinationAlphabetMap);
	}
	
	@Override
	public String transliterateReverse(@NotNull String input) {
		return this.doTransliterate(input, this.destinationToSourceAlphabetMap);
	}
	
	private void createSourceToDestinationMapping() {
		this.sourceToDestinationAlphabetMap.put('a', "à");
		this.sourceToDestinationAlphabetMap.put('b', "á");
		this.sourceToDestinationAlphabetMap.put('c', "ö");
		this.sourceToDestinationAlphabetMap.put('d', "ä");
		this.sourceToDestinationAlphabetMap.put('e', "å");
		this.sourceToDestinationAlphabetMap.put('f', "ô");
		this.sourceToDestinationAlphabetMap.put('g', "ã");
		this.sourceToDestinationAlphabetMap.put('h', "õ");
		this.sourceToDestinationAlphabetMap.put('i', "è");
		this.sourceToDestinationAlphabetMap.put('j', "j");
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
		this.sourceToDestinationAlphabetMap.put('y', "ü");
		this.sourceToDestinationAlphabetMap.put('z', "ç");
	}
	
	private void createDestinationToSourceMapping() {
		this.destinationToSourceAlphabetMap.put('à', "a");
		this.destinationToSourceAlphabetMap.put('á', "b");
		this.destinationToSourceAlphabetMap.put('â', "v");
		this.destinationToSourceAlphabetMap.put('ã', "g");
		this.destinationToSourceAlphabetMap.put('ä', "d");
		this.destinationToSourceAlphabetMap.put('å', "e");
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
		this.destinationToSourceAlphabetMap.put('ö', "ts");
		this.destinationToSourceAlphabetMap.put('÷', "ch");
		this.destinationToSourceAlphabetMap.put('ø', "sh");
		this.destinationToSourceAlphabetMap.put('ù', "sht");
		this.destinationToSourceAlphabetMap.put('ú', "a");
		this.destinationToSourceAlphabetMap.put('ü', "y");
		this.destinationToSourceAlphabetMap.put('þ', "yu");
		this.destinationToSourceAlphabetMap.put('ÿ', "ya");
	}
}
