package kr.co.sboard.controller.article;

import jakarta.servlet.http.HttpServletRequest;
import kr.co.sboard.dto.ArticleDTO;
import kr.co.sboard.entity.ArticleEntity;
import kr.co.sboard.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/article/list")
    public String list(Model model, String cate, @RequestParam(defaultValue = "1") int pg){
        Page<ArticleEntity> pageArticles = articleService.findByParent(pg);
        model.addAttribute("pageArticle",pageArticles);
        return "/article/list";
    }

    @GetMapping("/article/register")
    public String register(){ return "/article/register"; }

    @PostMapping("/article/register")
    public String register(ArticleDTO dto, HttpServletRequest request){
        dto.setRegip(request.getRemoteAddr());
        articleService.save(dto);
        return "redirect:/article/list";
    }

}
