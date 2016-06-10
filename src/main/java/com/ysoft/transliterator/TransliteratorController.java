package com.ysoft.transliterator;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.common.base.Strings;
import com.ysoft.transliterator.contract.ITransliterator;
import com.ysoft.transliterator.enumeration.EAlphabet;
import com.ysoft.transliterator.exception.NonExistentTransliteratorException;
import com.ysoft.transliterator.factory.TransliteratorFactory;
import com.ysoft.transliterator.models.TransliteratorModel;

/**
 * Handles requests for the application home page.
 */
@Controller
public class TransliteratorController {
	
	private static final Logger logger = LoggerFactory.getLogger(TransliteratorController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		TransliteratorModel transliteratorModel = new TransliteratorModel();
		model.addAttribute("transliteratorModel", transliteratorModel);
		model.addAttribute("targetAlphabets", transliteratorModel.getTargetAlphabets());
		model.addAttribute("sourceAlphabetString", transliteratorModel.getSourceAlphabetString());
		model.addAttribute("targetAlphabetString", transliteratorModel.getTargetAlphabetString());
		
		return "home";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST, params = "transliterate")
	public String transliterate(@ModelAttribute("transliteratorModel") TransliteratorModel transliteratorModel, ModelMap model) {
		if (Strings.isNullOrEmpty(transliteratorModel.getSourceAlphabetString())) {
			model.addAttribute("info", "No text for transliteration in source alphabet box.");
			return "home";
		}
		return transliterate(transliteratorModel, model, false);
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST, params = "transliterateReverse")
	public String transliterateReverse(@ModelAttribute("transliteratorModel") TransliteratorModel transliteratorModel, ModelMap model) {
		if (Strings.isNullOrEmpty(transliteratorModel.getTargetAlphabetString())) {
			model.addAttribute("info", "No text for transliteration in target alphabet box.");
			return "home";
		}
		return transliterate(transliteratorModel, model, true);
	}
	
	private String transliterate(TransliteratorModel transliteratorModel, ModelMap model, boolean reverse) {
		model.addAttribute("transliteratorModel", transliteratorModel);
		model.addAttribute("targetAlphabets", transliteratorModel.getTargetAlphabets());
		model.addAttribute("sourceAlphabetString", transliteratorModel.getSourceAlphabetString());
		try {
			if (reverse) {
				transliteratorModel.setSourceAlphabetString(doTransliterate(transliteratorModel, reverse));
			} else {
				transliteratorModel.setTargetAlphabetString(doTransliterate(transliteratorModel, reverse));
			}
		} catch (NonExistentTransliteratorException e) {
			model.addAttribute("error", String.format("Transliteration from %s to %s is not yet implemented.", transliteratorModel.getSourceAlphabet(), transliteratorModel.getTargetAlphabet()));
		}
		model.addAttribute("targetAlphabetString", transliteratorModel.getTargetAlphabetString());
		
		return "home";
	}
	
	private String doTransliterate(TransliteratorModel transliteratorModel, boolean reverse) throws NonExistentTransliteratorException {
		ITransliterator transliterator = null;
		try {
			transliterator = TransliteratorFactory.produce(EAlphabet.of(transliteratorModel.getSourceAlphabet()), EAlphabet.of(transliteratorModel.getTargetAlphabet()));
		} catch (InstantiationException | IllegalAccessException e) {
			throw new RuntimeException("Failed to create transliterator", e);
		}
		
		String transliteratedText = null;
		if (reverse) {
			transliteratedText = transliterator.transliterateReverse(transliteratorModel.getTargetAlphabetString());
		} else {
			transliteratedText = transliterator.transliterate(transliteratorModel.getSourceAlphabetString());
		}
		
		return transliteratedText;
	}
}
