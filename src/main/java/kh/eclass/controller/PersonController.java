package kh.eclass.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kh.eclass.service.PersonService;

@Controller
public class PersonController {
	@Autowired
	PersonService service;
	
	@RequestMapping
	public String output(Model model) {
		
		//리스트 받고 보내기
		//List<PersonDTO> list = service.getList();
		
		//model.addAttribute("list", list);
		
		return "output";
	}
	
}
