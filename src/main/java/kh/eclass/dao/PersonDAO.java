package kh.eclass.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kh.eclass.dto.PersonDTO;

@Repository
public class PersonDAO {
	@Autowired
	private SqlSession db;
	
	public int insert(PersonDTO dto) {
		return db.insert("Person.insert",dto);
	}
	
	public List
}
