package kh.eclass.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import kh.eclass.dto.PersonDTO;
import kh.eclass.service.PersonService;

@Controller
public class PersonController {
	@Autowired
	PersonService service;
	
	@RequestMapping("output.person")
	public String output(Model model) {
		
		//리스트 받고 보내기
		List<PersonDTO> list = service.selectAll();
		
		model.addAttribute("list", list);
		
		return "output";
	}
	
	@ExceptionHandler
	public String exception(Exception e) {
		e.printStackTrace();
		return "error";
	}
}
