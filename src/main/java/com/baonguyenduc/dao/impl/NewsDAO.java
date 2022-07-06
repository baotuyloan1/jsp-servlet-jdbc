package com.baonguyenduc.dao.impl;

import java.util.List;

import com.baonguyenduc.dao.INewsDAO;
import com.baonguyenduc.mapper.NewsMapper;
import com.baonguyenduc.model.NewsModel;

public class NewsDAO extends AbstractDAO<NewsModel> implements INewsDAO {

	@Override
	public List<NewsModel> findNewsByCategoryId(Long categoryId) {
		String sql = "SELECT * FROM news WHERE categoryid = ?";
		return query(sql, new NewsMapper(), categoryId);
	}

	@Override
	public Long saveNews(NewsModel newsModel) {
		String sql = "INSERT INTO news (title, content, categoryid) VALUES (?, ?, ?)";
		return insert(sql, newsModel.getTitle(), newsModel.getContent(), newsModel.getCategoryid());
	}

	@Override
	public void updateNews(NewsModel newsModel) {
		String sql = "INSERT INTO news (title, content, categoryid) VALUES (?, ?, ?)";
		update(sql,newsModel.getTitle(), newsModel.getContent(), newsModel.getCategoryid());
	}

}
