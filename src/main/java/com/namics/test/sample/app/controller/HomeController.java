package com.namics.test.sample.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.namics.test.sample.app.service.CityService;
import com.namics.test.sample.app.service.PersonService;

@Controller
public class HomeController {

	@Autowired
	private PersonService personService;

	@Autowired
	private CityService cityService;

	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("people", personService.getPeople());
		model.addAttribute("cities", cityService.getCities());
		return "index";
	}

}
