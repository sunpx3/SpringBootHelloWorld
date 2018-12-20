package com.sunpx.self;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sunpx.self.entity.AppArticle;
import com.sunpx.self.mapper.AppArticleMapper;

@Controller
@EnableAutoConfiguration	
@MapperScan("com.sunpx.self.mapper")

public class Main {

	@Autowired
	private AppArticleMapper mapper;
	
	@RequestMapping("/")
	@ResponseBody
	String home() {
		//List<AppArticle> listArticle = mapper.getAppArticleList();
		//System.out.println(listArticle.size());
		
		System.out.println("------------------------");
		
		return "Hello World!";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Main.class, args);
	}
}
