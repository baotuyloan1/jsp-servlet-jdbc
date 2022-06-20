package com.baonguyenduc.dao;

import java.util.List;

import com.baonguyenduc.model.CategoryModel;

public interface ICategoryDAO extends IGenericDAO<CategoryModel> {
	List<CategoryModel> findAll();

}
