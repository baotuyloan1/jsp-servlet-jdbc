package com.baonguyenduc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.baonguyenduc.model.NewsModel;

public class NewsMapper implements IRowMapper<NewsModel> {

	@Override
	public NewsModel mapRow(ResultSet resultset) {
		NewsModel news = new NewsModel();
		try {
			news.setId(resultset.getLong("id"));
			news.setTitle(resultset.getString("title"));
			news.setCategoryid(resultset.getLong("categoryid"));
			return news;
		} catch (SQLException e) {
			return null;
		}

	}

}
