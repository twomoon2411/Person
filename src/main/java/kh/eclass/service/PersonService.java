package kh.eclass.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.DataBinder;

import kh.eclass.dao.PersonDAO;
import kh.eclass.dto.PersonDTO;


@Service
public class PersonService {
	
	@Autowired
	private PersonDAO dao;
	public int input(PersonDTO dto) {
		return dao.insert(dto);
	}
}
