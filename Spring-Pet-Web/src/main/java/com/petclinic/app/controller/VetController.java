package com.petclinic.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.petclinic.app.service.Vetservice;

@Controller
public class VetController {

	@Autowired
	private Vetservice vetservice;

	public VetController(Vetservice vetService) {
		this.vetservice = vetService;
	}

	@RequestMapping({ "/vets", "/vets/index", "/vets/index.html", "/vets.html" })
	public String show(Model model) {
		model.addAttribute("vets", vetservice.findAll());
		return "vets/index";
	}
}
