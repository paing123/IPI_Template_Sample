package com.ipi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TemplateController {
	
	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public String callIndex(Model model) {
		return "index";
	}
}
