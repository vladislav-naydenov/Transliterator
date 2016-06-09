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
		model.addAttribute("input", transliteratorModel.getInput());
		model.addAttribute("result", transliteratorModel.getResult());
		
		return "home";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String transliterate(@ModelAttribute("transliteratorModel") TransliteratorModel transliteratorModel, ModelMap model) {
		model.addAttribute("transliteratorModel", transliteratorModel);
		model.addAttribute("targetAlphabets", transliteratorModel.getTargetAlphabets());
		model.addAttribute("input", transliteratorModel.getInput());
		try {
			transliteratorModel.setResult(doTransliterate(transliteratorModel));
		} catch (NonExistentTransliteratorException e) {
			model.addAttribute("error", String.format("Transliteration from %s to %s is not yet implemented.", transliteratorModel.getPrimaryAlphabet(), transliteratorModel.getTargetAlphabet()));
		}
		model.addAttribute("result", transliteratorModel.getResult());
		
		return "home";
	}
	
	private String doTransliterate(TransliteratorModel transliteratorModel) throws NonExistentTransliteratorException {
		ITransliterator transliterator = null;
		try {
			transliterator = TransliteratorFactory.produce(EAlphabet.of(transliteratorModel.getPrimaryAlphabet()), EAlphabet.of(transliteratorModel.getTargetAlphabet()));
		} catch (InstantiationException | IllegalAccessException e) {
			throw new RuntimeException("Failed to create transliterator", e);
		}
		
		String transliteratedText = transliterator.transliterate(transliteratorModel.getInput());
		
		return transliteratedText;
	}
}
