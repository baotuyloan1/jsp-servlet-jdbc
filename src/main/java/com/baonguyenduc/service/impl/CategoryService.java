package com.baonguyenduc.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.baonguyenduc.dao.ICategoryDAO;

import com.baonguyenduc.model.CategoryModel;
import com.baonguyenduc.service.ICategoryService;

public class CategoryService implements ICategoryService {
	
//	private ICategoryDAO categoryDAO;
//	
//	public CategoryService() {
//		categoryDAO = new CategoryDAO();
//	}
	
	
	@Inject
	private ICategoryDAO categoryDAO;
	@Override
	public List<CategoryModel> findAll() {
		return categoryDAO.findAll();
	}
	

}
