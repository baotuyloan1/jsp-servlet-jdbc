package com.baonguyenduc.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.baonguyenduc.dao.IGenericDAO;
import com.baonguyenduc.mapper.IRowMapper;

public class AbstractDAO<T> implements IGenericDAO<T> {
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/servletuhocthang62018";
			String username = "truyenbo";
			String password = "Truyenbo99";
			return DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			System.out.println("Driver error");
			return null;
		} catch (SQLException e) {
			System.out.println("Password error");
			return null;
		}

	}

	@Override
	public List<T> query(String sql, IRowMapper<T> rowMapper, Object... parameters) {
		List<T> ressults = new ArrayList<>();
		Connection connection = getConnection();
		PreparedStatement statement = null;
		ResultSet resultset = null;
		try {
			connection = getConnection();
			statement = connection.prepareStatement(sql);
			setParameter(statement, parameters);
			resultset = statement.executeQuery();
			while (resultset.next()) {
				ressults.add(rowMapper.mapRow(resultset));
			}
			return ressults;
		} catch (SQLException e) {
			return null;
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if (statement != null) {
					statement.close();
				}
				if (resultset != null) {
					resultset.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private void setParameter(PreparedStatement statement, Object... parameters) {
		for (int i = 0; i < parameters.length; i++) {
			Object parameter = parameters[i];
			int index = i + 1;
			try {
				if (parameter instanceof Long) {
					statement.setLong(index, (Long) parameter);
				}else if (parameter instanceof String) {
					statement.setString(index, (String) parameter);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
