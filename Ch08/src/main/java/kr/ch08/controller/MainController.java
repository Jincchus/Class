package kr.ch08.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import kr.ch08.entity.User1Entity;
import kr.ch08.repository.User1Repository;

@Controller
public class MainController {
	
	@Autowired
	private User1Repository repo;
	
	@GetMapping(value= {"/","/index"})
	public String index() {
		return "/index";
	}
	
	@GetMapping("/query1")
	public String query1() {
		User1Entity entity = repo.findUser1EntityByUid("bacchus");
		System.out.println(entity);
		return "redirect:/";
	}
	@GetMapping("/query2")
	public String query2() {
		List<User1Entity> entities = repo.findUser1EntityByName("박카스");
		System.out.println(entities);
		return "redirect:/";
	}
	@GetMapping("/query3")
	public String query3() {
		List<User1Entity> entities = repo.findUser1EntityByNameNot("박카스");
		System.out.println(entities);
		return "redirect:/";
	}
	@GetMapping("/query4")
	public String query4() {

		User1Entity entity = repo.findUser1EntityByUidAndName("bacchus","카스");
		System.out.println(entity);
		return "redirect:/";
	}
	@GetMapping("/query5")
	public String query5() {
		List<User1Entity> entities = repo.findUser1EntityByUidOrName("bacchus","박카스");
		System.out.println(entities);
		return "redirect:/";
	}
	@GetMapping("/query6")
	public String query6() {
		List<User1Entity> entities = repo.findUser1EntityByAgeGreaterThan(5);
		System.out.println(entities);
		return "redirect:/";
	}
	@GetMapping("/query7")
	public String query7() {
		List<User1Entity> entities = repo.findUser1EntityByAgeGreaterThanEqual(5);
		System.out.println(entities);
		return "redirect:/";
	}
	@GetMapping("/query8")
	public String query8() {
		List<User1Entity> entities = repo.findUser1EntityByAgeLessThan(5);
		System.out.println(entities);
		return "redirect:/";
	}
	@GetMapping("/query9")
	public String query9() {
		List<User1Entity> entities = repo.findUser1EntityByAgeLessThanEqual(5);
		System.out.println(entities);
		return "redirect:/";
	}
	@GetMapping("/query10")
	public String query10() {
		List<User1Entity> entities = repo.findUser1EntityByAgeBetween(3, 5);
		System.out.println(entities);
		return "redirect:/";
	}
	@GetMapping("/query11")
	public String query11() {
		List<User1Entity> entities = repo.findUser1EntityByNameLike("삼순");
		System.out.println(entities);
		return "redirect:/";
	}
	@GetMapping("/query12")
	public String query12() {
		List<User1Entity> entities = repo.findUser1EntityByNameContains("삼순");
		System.out.println(entities);
		return "redirect:/";
	}
	@GetMapping("/query13")
	public String query13() {
		List<User1Entity> entities = repo.findUser1EntityByNameStartsWith("삼순");
		System.out.println(entities);
		return "redirect:/";
	}
	@GetMapping("/query14")
	public String query14() {
		List<User1Entity> entities = repo.findUser1EntityByNameEndsWith("삼순");
		System.out.println(entities);
		return "redirect:/";
	}
	@GetMapping("/query15")
	public String query15() {
		List<User1Entity> entities = repo.findUser1EntityByOrderByName();
		System.out.println(entities);
		return "redirect:/";
	}
	@GetMapping("/query16")
	public String query16() {
		List<User1Entity> entities = repo.findUser1EntityByOrderByAgeAsc();
		System.out.println(entities);
		return "redirect:/";
	}
	@GetMapping("/query17")
	public String query17() {
		List<User1Entity> entities = repo.findUser1EntityByOrderByAgeDesc();
		System.out.println(entities);
		return "redirect:/";
	}
	@GetMapping("/query18")
	public String query18() {
		List<User1Entity> entities = repo.findUser1EntityByAgeGreaterThanOrderByAgeDesc(5);
		System.out.println(entities);
		return "redirect:/";
	}
	@GetMapping("/query19")
	public String query19() {
		int uidCount = repo.countUser1EntityByUid("bacchus");
		System.out.println(uidCount);
		return "redirect:/";
	}
	@GetMapping("/query20")
	public String query20() {
		int nameCount = repo.countUser1EntityByName("카스");
		System.out.println(nameCount);
		return "redirect:/";
	}
	@GetMapping("/query21")
	public String query21() {
		List<User1Entity> entities = repo.selectUser1UnderAge30();
		System.out.println(entities);
		return "redirect:/";
	}
	@GetMapping("/query22")
	public String query22() {
		List<User1Entity> entities = repo.selectUser1ByName("삼순");
		System.out.println(entities);
		return "redirect:/";
	}
	@GetMapping("/query23")
	public String query23() {
		List<User1Entity> entities = repo.selectUser1ByNameParam("삼순");
		System.out.println(entities);
		return "redirect:/";
	}
}
