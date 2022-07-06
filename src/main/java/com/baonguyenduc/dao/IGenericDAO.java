package com.baonguyenduc.dao;

import java.util.List;

import com.baonguyenduc.mapper.IRowMapper;

public interface IGenericDAO<T> {
	List<T> query(String sql, IRowMapper<T> rowMapper, Object... parameters);

	Long insert(String sql, Object... objects);

	void update(String sql, Object... objects);
}
