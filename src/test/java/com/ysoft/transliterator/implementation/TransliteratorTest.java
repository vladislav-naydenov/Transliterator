package com.ysoft.transliterator.implementation;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Assert;
import org.junit.Test;

import com.ysoft.transliterator.contract.ITransliterator;

public class TransliteratorTest {

	private ITransliterator cut;
	
	@Test
	public void testLatinToCyrillicTransliterate() {
		this.cut = new LatinToCyrillicTransliterator();
		String latinText = "The quick, brown fox jump over the lazy dog.";
		String expected = "Тхе qуицк, бровн фох jумп овер тхе лазь дог.";
		String actual = cut.transliterate(latinText);
		
		Assert.assertThat(actual, is(expected));
	}
	
	@Test
	public void testLatinToCyrillicTransliterateReverse() {
		this.cut = new LatinToCyrillicTransliterator();
		String cyrillicText = "Бързата, кафява лисица скочи над мързеливото куче.";
		String expected = "Barzata, kafyava lisitsa skochi nad marzelivoto kuche.";
		String actual = cut.transliterateReverse(cyrillicText);
		
		Assert.assertThat(actual, is(expected));
	}
	
	@Test
	public void testLatinToCzechTransliterate() {
		this.cut = new LatinToCzechTransliterator();
		String latinText = "The quick, brown fox jump over the lazy dog.";
		String expected = "The quick, brown fox jump over the lazy dog.";
		String actual = cut.transliterate(latinText);
		
		Assert.assertThat(actual, is(expected));
	}
	
	@Test
	public void testLatinToCzechTransliterateReverse() {
		this.cut = new LatinToCzechTransliterator();
		String czechText = "Gruň grutichdivlask i pli, kani zich. Pěticur stav žlor něnib ukez a děr úsaď tiz "
						 + "vehoudi clučniv? Di oňažchlask něpuv gýtlout mrá zkývys ticlké. A kteň. Fétcho křuv "
						 + "stoglyžro něsk ni ptošlív ťách timtě pufle dloun. I dijdrclo ťuděř tlichryň tibřektýd a tězkepať.";
		String expected = "Grun grutichdivlask i pli, kani zich. Peticur stav zlor nenib ukez a der usad tiz "
				 		+ "vehoudi clucniv? Di onazchlask nepuv gytlout mra zkyvys ticlke. A kten. Fetcho kruv "
				 		+ "stoglyzro nesk ni ptosliv tach timte pufle dloun. I dijdrclo tuder tlichryn tibrektyd a tezkepat.";
		String actual = cut.transliterateReverse(czechText);
		
		Assert.assertThat(actual, is(expected));
	}
	
	@Test
	public void testLatinToGreekTransliterate() {
		this.cut = new LatinToGreekTransliterator();
		String latinText = "The quick, brown fox jump over the lazy dog.";
		String expected = "Τηε qυιcκ, βρowν foξ jυμπ ovερ τηε λαζy δoγ.";
		String actual = cut.transliterate(latinText);
		
		Assert.assertThat(actual, is(expected));
	}
	
	@Test
	public void testLatinToGreekTransliterateReverse() {
		this.cut = new LatinToGreekTransliterator();
		String greekText = "Σεα αν δισο σινθ λυσιλιυς, εως φαβυλας επισυρι ευ. Νοσθερ οπωρθερε φις νο. "
						 + "Σανστυς μολεστιε ετ φιμ, ει πρω αλιενυμ φωλυπθαρια.";
		String expected = "Sea an diso sinth lusilius, eos phabulas episuri eu. Nosther oporthere phis no. "
						+ "Sanstus molestie et phim, ei pro alienum pholuptharia.";
		String actual = cut.transliterateReverse(greekText);
		
		Assert.assertThat(actual, is(expected));
	}
	
	@Test
	public void testLatinToRussianTransliterate() {
		this.cut = new LatinToRussianTransliterator();
		String latinText = "The quick, brown fox jump over the lazy dog.";
		String expected = "Тхе qуицк, бровн фох йумп овер тхе лазы дог.";
		String actual = cut.transliterate(latinText);
		
		Assert.assertThat(actual, is(expected));
	}
	
	@Test
	public void testLatinToRussianTransliterateReverse() {
		this.cut = new LatinToRussianTransliterator();
		String russianText = "Ед квуй июварыт дытракжйт зэнтынтиаэ, про ан декам дэлььиката импэрдеэт. "
						   + "Но мэя тальэ тота кытэрож. Про ат зальы апэриам докэндё, про ипзум фюгит тебиквюэ ад.";
		String expected = "Ed kvuj ijuvaryt dytrakzhjt zjentyntiaje, pro an dekam djel''ikata impjerdejet. "
						+ "No mjeja tal'je tota kytjerozh. Pro at zal'y apjeriam dokjendjo, pro ipzum fjugit tebikvjuje ad.";
		String actual = cut.transliterateReverse(russianText);
		
		Assert.assertThat(actual, is(expected));
	}
	
	@Test
	public void testLatinToTurkishTransliterate() {
		this.cut = new LatinToTurkishTransliterator();
		String latinText = "The quick, brown fox jump over the lazy dog.";
		String expected = "The quick, brown fox jump over the lazy dog.";
		String actual = cut.transliterate(latinText);
		
		Assert.assertThat(actual, is(expected));
	}
	
	@Test
	public void testLatinToTurkishTransliterateReverse() {
		this.cut = new LatinToTurkishTransliterator();
		String turkishText = "Yukarda mavi gök, asağıda yağız yer yaratıldıkta; ikisinin arasında insan oğlu yaratılmış. "
						   + "İnsan oğulları üzerine ecdadım Bumın hakan, İstemi hakan tahta oturmuş; oturarak Türk milletinin "
						   + "ülkesini, türesini, idare edivermiş, tanzim edivermis.";
		String expected = "Yukarda mavi gok, asagida yagiz yer yaratildikta; ikisinin arasinda insan oglu yaratilmis. "
				   		+ "Insan ogullari uzerine ecdadim Bumin hakan, Istemi hakan tahta oturmus; oturarak Turk milletinin "
				   		+ "ulkesini, turesini, idare edivermis, tanzim edivermis.";
		String actual = cut.transliterateReverse(turkishText);
		
		Assert.assertThat(actual, is(expected));
	}
}
