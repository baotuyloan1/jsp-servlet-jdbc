package com.baonguyenduc.service;

import java.util.List;

import com.baonguyenduc.model.NewsModel;

public interface INewsService {
	List<NewsModel> findNewsByCategoryId(Long categoryId);

	Long save(NewsModel news);
}
