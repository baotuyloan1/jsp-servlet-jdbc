package com.baonguyenduc.dao;

import java.util.List;

import javax.swing.tree.RowMapper;

import com.baonguyenduc.mapper.IRowMapper;

public interface IGenericDAO<T> {
	List<T> query(String sql, IRowMapper<T> rowMapper, Object... parameters);
}
