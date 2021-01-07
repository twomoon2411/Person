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
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	private PersonService service;
	
	@RequestMapping("toInput.person")
	public String toInput() {
		return "input.jsp";
	}
	@RequestMapping("input.person")
	public String input(PersonDTO dto) {
		service.input(dto);
		System.out.println("이름 : " + dto.getName());
		System.out.println(("메세지 : " + dto.getMessage()));
		return "home";
	}
	
	@RequestMapping("toOutput.person")
	public String toOutput(Model model) {
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
