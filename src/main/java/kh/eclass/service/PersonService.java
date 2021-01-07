package kh.eclass.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kh.eclass.dao.PersonDAO;
import kh.eclass.dto.PersonDTO;

@Service
public class PersonService {
	
	@Autowired
	PersonDAO dao;
	
	//리스트 받기
	public List<PersonDTO> selectAll(){
		return dao.selectAll();
	}
}
