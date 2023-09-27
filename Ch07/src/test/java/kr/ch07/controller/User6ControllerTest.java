package kr.ch07.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import kr.ch07.mapper.User6Mapper;
import kr.ch07.service.User6Service;

@WebMvcTest(controllers = User6Controller.class)
public class User6ControllerTest {
	
	// MVC 테스트를 위한 가상 mvc 객체
	@Autowired
	private MockMvc mvc;
	
	@MockBean
	private User6Mapper mapper;
	
	@Test
	public void register() throws Exception {

		// 테스트 코드
		mvc
		 .perform(
			post("/user6/register")
			.param("uid", "아이디")
			.param("name", "이름")
			.param("birth", "2023-09-26")
			.param("gender", "f")
			.param("age", "23")
			.param("addr", "서울")
			.param("hp", "010-0000-0000")
		 )
			.andExpect(status().isOk())
			.andExpect(view().name("/user6/register"))
			.andDo(print());
		}
	
}
