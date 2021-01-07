package kh.eclass.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kh.eclass.service.PersonService;

@Controller
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	private PersonService service;
	
	@RequestMapping("toInput.person")
	public String toInput() {
		return "input.jsp";
	}
	@RequestMapping("input.person")
	public String input(String name, String message) {
		service.input(name, message);
		System.out.println("이름 : " + name);
		System.out.println(("메세지 : " + message));
		return "home";
	}
	
	@RequestMapping("toOutput.person")
	public String toOutput() {
		return "output.jsp";
	}
}
