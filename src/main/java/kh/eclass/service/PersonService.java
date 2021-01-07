package kh.eclass.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kh.eclass.dao.PersonDAO;

@Service
public class PersonService {
	
	@Autowired
	PersonDAO dao;
	
	//리스트 받기
//	public List<PersonDTO> getList(){
//		return dao.getList();
//	}
}
