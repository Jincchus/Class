package kr.ch07.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.ch07.dto.User6DTO;
import kr.ch07.mapper.User6Mapper;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class User6Controller {

	@Autowired
	private User6Mapper mapper;
	
	@GetMapping("/user6/register")
	public String register() {
		
		return "/user6/register";
	}
	
	@PostMapping("/user6/register")
	public String register(User6DTO dto) {
		
		mapper.insertUser6(dto);
		
		return "redirect:/user6/list";
	}
	
	@GetMapping("/user6/list")
	public String list(Model model) {

		List<User6DTO> users = mapper.selectUser6s();
		model.addAttribute("users",users);
		
		return "/user6/list";
	}
	
	@GetMapping("/user6/modify")
	public String modify(String uid, Model model) {
		
		User6DTO user = mapper.selectUser6(uid);
		model.addAttribute("user", user);
		return "/user6/modify";
	}
	@PostMapping("/user6/modify")
	public String modify(User6DTO dto) {
		
		mapper.updateUser6(dto);
		return "redirect:/user6/list";
	}
	@GetMapping("/user6/delete")
	public String delete(String uid) {
		
		mapper.deleteUser6(uid);
		return "redirect:/user6/list";
	}
	
	
}
