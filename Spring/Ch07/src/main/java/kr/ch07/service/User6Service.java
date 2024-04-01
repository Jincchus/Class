package kr.ch07.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ch07.dto.User6DTO;
import kr.ch07.mapper.User6Mapper;

@Service
public class User6Service {
	
	@Autowired
	private User6Mapper mapper;
	
	public void insertUser6(User6DTO dto) {
		mapper.insertUser6(dto);
	}
}
