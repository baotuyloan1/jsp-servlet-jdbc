package com.baonguyenduc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.baonguyenduc.model.CategoryModel;

public class CategoryMapper implements IRowMapper<CategoryModel> {

	@Override
	public CategoryModel mapRow(ResultSet resultset) {
		CategoryModel categoryModel = new CategoryModel();
		try {
			categoryModel.setId(resultset.getLong("id"));
			categoryModel.setCode(resultset.getString("code"));
			categoryModel.setName(resultset.getString("name"));
			categoryModel.setCreateData(resultset.getTimestamp("createdata"));
			categoryModel.setCreatedBy(resultset.getString("createdby"));
			categoryModel.setModifiedBy(resultset.getString("modifiedby"));
			return categoryModel;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

}
