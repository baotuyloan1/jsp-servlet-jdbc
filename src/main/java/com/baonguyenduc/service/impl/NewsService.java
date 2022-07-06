package com.baonguyenduc.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.baonguyenduc.dao.INewsDAO;
import com.baonguyenduc.dao.impl.NewsDAO;
import com.baonguyenduc.model.NewsModel;
import com.baonguyenduc.service.INewsService;

public class NewsService implements INewsService {

	@Inject
	private INewsDAO INewsDAO;

	@Override
	public List<NewsModel> findNewsByCategoryId(Long categoryId) {

		return INewsDAO.findNewsByCategoryId(categoryId);
	}

	@Override
	public Long save(NewsModel news) {
		return INewsDAO.saveNews(news);
	}

}
