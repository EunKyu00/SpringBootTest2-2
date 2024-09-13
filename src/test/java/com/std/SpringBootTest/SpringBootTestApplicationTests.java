package com.std.SpringBootTest;

import com.std.SpringBootTest.article.Article;
import com.std.SpringBootTest.article.ArticleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class SpringBootTestApplicationTests {
	@Autowired
	private ArticleRepository articleRepository;
	@Test
	void contextLoads() {
		Article a = new Article();
		a.setTitle("이은규");
		a.setContent("2차 테스트");
		a.setCreateDate(LocalDateTime.now());
		this.articleRepository.save(a);
	}

}
