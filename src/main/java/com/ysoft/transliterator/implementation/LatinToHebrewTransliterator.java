/**
 * 
 */
package com.ysoft.transliterator.implementation;

import com.ysoft.transliterator.annotation.AlphabetMapping;
import com.ysoft.transliterator.enumeration.EAlphabet;

/**
 * Implements transliteration between Latin and Hebrew alphabets 
 * @author Vladislav Naydenov
 */
@AlphabetMapping(from = EAlphabet.LATIN, to = EAlphabet.HEBREW)
public class LatinToHebrewTransliterator extends AbstractTransliterator {

	@Override
	protected void createSourceToDestinationMapping() {
		this.sourceToDestinationAlphabetMap.put('a', "א");
		this.sourceToDestinationAlphabetMap.put('b', "ב");
		this.sourceToDestinationAlphabetMap.put('c', "צ");
		this.sourceToDestinationAlphabetMap.put('d', "ד");
		this.sourceToDestinationAlphabetMap.put('e', "ע");
		this.sourceToDestinationAlphabetMap.put('f', "פ");
		this.sourceToDestinationAlphabetMap.put('g', "ג");
		this.sourceToDestinationAlphabetMap.put('h', "ה");
		this.sourceToDestinationAlphabetMap.put('i', "י");
		this.sourceToDestinationAlphabetMap.put('j', "ט");
		this.sourceToDestinationAlphabetMap.put('k', "ק");
		this.sourceToDestinationAlphabetMap.put('l', "ל");
		this.sourceToDestinationAlphabetMap.put('m', "ם");
		this.sourceToDestinationAlphabetMap.put('n', "ן");
		this.sourceToDestinationAlphabetMap.put('o', "אָ");
		this.sourceToDestinationAlphabetMap.put('p', "פ");
		this.sourceToDestinationAlphabetMap.put('q', "ק");
		this.sourceToDestinationAlphabetMap.put('r', "ר");
		this.sourceToDestinationAlphabetMap.put('s', "ס");
		this.sourceToDestinationAlphabetMap.put('t', "ט");
		this.sourceToDestinationAlphabetMap.put('u', "ו");
		this.sourceToDestinationAlphabetMap.put('v', "װ");
		this.sourceToDestinationAlphabetMap.put('w', "צ");
		this.sourceToDestinationAlphabetMap.put('x', "ח");
		this.sourceToDestinationAlphabetMap.put('y', "י");
		this.sourceToDestinationAlphabetMap.put('z', "ז");
	}

	@Override
	protected void createDestinationToSourceMapping() {
		this.destinationToSourceAlphabetMap.put('אַ', "a");
		this.destinationToSourceAlphabetMap.put('א', "a");
		this.destinationToSourceAlphabetMap.put('אָ', "o");
		this.destinationToSourceAlphabetMap.put('ב', "b");
		this.destinationToSourceAlphabetMap.put('בּ', "b");
		this.destinationToSourceAlphabetMap.put('בֿ', "V");
		this.destinationToSourceAlphabetMap.put('װ', "v");
		this.destinationToSourceAlphabetMap.put('וֹ', "v");
		this.destinationToSourceAlphabetMap.put('ג', "g");
		this.destinationToSourceAlphabetMap.put('ד', "d");
		this.destinationToSourceAlphabetMap.put('ה', "h");
		this.destinationToSourceAlphabetMap.put('ו', "u");
		this.destinationToSourceAlphabetMap.put('וּ', "u");
		this.destinationToSourceAlphabetMap.put('ױ', "ou");
		this.destinationToSourceAlphabetMap.put('ז', "z");
		this.destinationToSourceAlphabetMap.put('ח', "x");
		this.destinationToSourceAlphabetMap.put('י', "y");
		this.destinationToSourceAlphabetMap.put('יִ', "y");
		this.destinationToSourceAlphabetMap.put('ײ', "ey");
		this.destinationToSourceAlphabetMap.put('ײַ', "ay");
		this.destinationToSourceAlphabetMap.put('כּ', "K");
		this.destinationToSourceAlphabetMap.put('ק', "k");
		this.destinationToSourceAlphabetMap.put('כ', "q");
		this.destinationToSourceAlphabetMap.put('ך', "q");
		this.destinationToSourceAlphabetMap.put('ת', "S");
		this.destinationToSourceAlphabetMap.put('שׂ', "s");
		this.destinationToSourceAlphabetMap.put('ס', "s");
		this.destinationToSourceAlphabetMap.put('תּ', "T");
		this.destinationToSourceAlphabetMap.put('ט', "t");
		this.destinationToSourceAlphabetMap.put('ש', "c");
		this.destinationToSourceAlphabetMap.put('ר', "r");
		this.destinationToSourceAlphabetMap.put('צ', "w");
		this.destinationToSourceAlphabetMap.put('ץ', "w");
		this.destinationToSourceAlphabetMap.put('פֿ', "f");
		this.destinationToSourceAlphabetMap.put('ף', "f");
		this.destinationToSourceAlphabetMap.put('פּ', "p");
		this.destinationToSourceAlphabetMap.put('פ', "p");
		this.destinationToSourceAlphabetMap.put('ע', "e");
		this.destinationToSourceAlphabetMap.put('נ', "n");
		this.destinationToSourceAlphabetMap.put('ן', "n");
		this.destinationToSourceAlphabetMap.put('מ', "m");
		this.destinationToSourceAlphabetMap.put('ם', "m");
		this.destinationToSourceAlphabetMap.put('ל', "l");
	}
}
