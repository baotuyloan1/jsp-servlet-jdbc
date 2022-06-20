package com.baonguyenduc.dao;

import java.util.List;

import com.baonguyenduc.model.NewsModel;

public interface INewsDAO extends IGenericDAO<NewsModel> {
	List<NewsModel> findNewsByCategoryId(Long categoryId);
}
