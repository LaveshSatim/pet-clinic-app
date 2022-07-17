package com.petclinic.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.petclinic.app.service.Ownerservice;

@Controller
public class OwnerController {

	@Autowired
	private Ownerservice ownerservice;

	@RequestMapping("/owners")
	public String show(Model model) {
		model.addAttribute("owners", ownerservice.findAll());
		return "owners/index";
	}
}
