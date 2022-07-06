package com.baonguyenduc.dao.impl;

import java.util.List;

import com.baonguyenduc.dao.ICategoryDAO;
import com.baonguyenduc.mapper.CategoryMapper;
import com.baonguyenduc.model.CategoryModel;

public class CategoryDAO extends AbstractDAO<CategoryModel> implements ICategoryDAO {

	@Override
	public List<CategoryModel> findAll() {
		String sql = "SELECT * FROM category ";
		return query(sql, new CategoryMapper());
		// open connection
//		Connection connection = getConnection();
//		PreparedStatement statement = null;
//		ResultSet resultset = null;
//		if (connection != null) {
//			try {
//				statement = connection.prepareStatement(sql);
//				// init parameter
//				resultset = statement.executeQuery();
//				while (resultset.next()) {
//					CategoryModel categoryModel = new CategoryModel();
//					categoryModel.setId(resultset.getLong("id"));
//					categoryModel.setCode(resultset.getString("code"));
//					categoryModel.setName(resultset.getString("name"));
//					categoryModel.setCreateData(resultset.getTimestamp("createdata"));
//					categoryModel.setCreatedBy(resultset.getString("createdby"));
//					categoryModel.setModifiedBy(resultset.getString("modifiedby"));
//					results.add(categoryModel);
//				}
//				return results;
//			} catch (SQLException e) {
//				e.printStackTrace();
//			} finally {
//
//				try {
//					if (connection != null) {
//						connection.close();
//					}
//					if (statement != null) {
//						statement.close();
//					}
//					if (resultset != null) {
//						resultset.close();
//					}
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//
//		}
//		return null;

	}

	@Override
	public Long saveCategory(String sql, Object... objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCategory() {
		// TODO Auto-generated method stub
		
	}





}
