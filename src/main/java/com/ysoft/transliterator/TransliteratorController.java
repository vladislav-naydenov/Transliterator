package com.ysoft.transliterator;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ysoft.transliterator.models.AlphabetsModel;

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
		AlphabetsModel alphabetsModel = new AlphabetsModel();
		model.addAttribute("targetAlphabets", alphabetsModel.getTargetAlphabets());
		
		return "home";
	}
	
}
