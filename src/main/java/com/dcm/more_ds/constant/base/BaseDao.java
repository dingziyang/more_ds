package com.dcm.more_ds.constant.base;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BaseDao<T, Q> {

	T selectByPrimaryKey(Object id);
	
	List<T> selectWithPage(List<Integer> list);

	List<T> selectByPrimaryKeys(@SuppressWarnings("rawtypes") List ids);
	
	List<T> criteria(Q q);

	List<T> selectByExampleWithBLOBs(Q q);

	int insert(T t);

	int insertSelective(T t);
	
	void insertBatch(List<T> ts);

	int countByExample(Q q);

	int updateByPrimaryKeySelective(T t);

	int updateByPrimaryKey(T t);

	int updateByExampleSelective(@Param("record") T t, @Param("example") Q q);

	int updateByExample(@Param("record") T t, @Param("example") Q q);

	int updateByExampleWithBLOBs(@Param("record") T t, @Param("example") Q q);

	int deleteByPrimaryKey(Object id);

	int deleteByPrimaryKeys(@Param("ids") List list);
	
	int deleteByExample(Q q);
	
	List<T> selectByExample(Q q);
	

}
