package com.sunpx.self.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import com.sunpx.self.entity.AppArticle;

@Component
public interface AppArticleMapper {

	@Select("SELECT * FROM APP_ARTICLE")
	List<AppArticle> getAppArticleList();
	
	int selectCount();
}
