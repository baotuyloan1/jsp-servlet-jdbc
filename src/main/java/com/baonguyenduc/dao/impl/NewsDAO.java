package com.baonguyenduc.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.baonguyenduc.dao.INewsDAO;
import com.baonguyenduc.mapper.NewsMapper;
import com.baonguyenduc.model.NewsModel;

public class NewsDAO extends AbstractDAO<NewsModel> implements INewsDAO {

	@Override
	public List<NewsModel> findNewsByCategoryId(Long categoryId) {
		List<NewsModel> results = new ArrayList<>();
		String sql = "SELECT * FROM news WHERE categoryid = ?";
		return query(sql, new NewsMapper(), categoryId);
//		// open connection
//		Connection connection = getConnection();
//		PreparedStatement statement = null;
//		ResultSet resultset = null;
//		if (connection != null) {
//			try {
//				statement = connection.prepareStatement(sql);
//				// init parameter
//				statement.setLong(1, categoryId);
//				resultset = statement.executeQuery();
//				while (resultset.next()) {
//					NewsModel news = new NewsModel();
//					news.setId(resultset.getLong("id"));
//					news.setTitle(resultset.getString("title"));
//					news.setCategoryid(resultset.getLong("categoryid"));
//
//					results.add(news);
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

}
