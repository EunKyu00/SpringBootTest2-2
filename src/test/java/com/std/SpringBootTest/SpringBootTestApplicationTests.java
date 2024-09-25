package com.std.SpringBootTest;

import com.std.SpringBootTest.article.Article;
import com.std.SpringBootTest.article.ArticleRepository;
import com.std.SpringBootTest.article.ArticleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class SpringBootTestApplicationTests {

	@Autowired
	private ArticleRepository articleRepository;

	@Autowired
	private ArticleService articleService;

	@Test
	void contextLoads() {
		Article a = new Article();
		a.setTitle("이은규");
		a.setContent("2차 테스트");
		a.setCreateDate(LocalDateTime.now());
		this.articleRepository.save(a);
	}
	@Test
	void testJpa(){
		for(int i = 1; i <= 300; i++){
			String title = String.format("테스트 데이터입니다 : [%03d]", i);
			String content = "내용무";
			this.articleService.create(title,content,null);
		}
	}

}
