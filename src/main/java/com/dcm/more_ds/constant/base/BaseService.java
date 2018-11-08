package com.dcm.more_ds.constant.base;

import com.alibaba.fastjson.JSONObject;

import java.util.List;

public interface BaseService<T, Q, P> {


	public T selectByPrimaryKey(P id);
	
    public List<T> selectByRequestBodyIds(List<P> ids);

	public List<T> list(Integer startNum, Integer endNum);

	public List<T> selectByPrimaryKeys(List<P> ids);

	// 鏍规嵁鏉′欢鏌ヨ 鐩稿簲缁撴灉
	public List<T> selectByExample(Q example);

	public List<T> selectByExampleWithBLOBs(Q example);

	/**
	 * 新增
	 */
	public Object insert(T t);

	public Object insertSelective(T t);

	public Object insertBatch(List<T> models);

	public Object insertSelectiveBatch(List<T> models);

	public Object insertByJSON(String t);

	public Object insertByJSONObject(JSONObject t);

	public Object insertSelectiveByJSON(String t);

	public Object insertSelectiveByJSONObject(JSONObject t);

	/**
	 * 鏇存柊
	 */

	public Object updateByPrimaryKey(T t);

	public Object updateByJSONPrimaryKey(String t);

	public Object updateByJSONObjectPrimaryKey(JSONObject t);

	public Object updateByJSONObjectPrimaryKeySelective(JSONObject t);

	public Object updateByPrimaryKeySelective(T t);

	public Object updateByExample(T t, Q q);

	public Object updateByExampleSelective(T t, Q q);

	public Object updateByExampleWithBLOBs(T t, Q q);

	public Object updateByRequestBody(T t);

	public int countByExample(Q example);

	/**
	 * 鍒犻櫎
	 */
	public int deleteByPrimaryKey(P id);

	public int deleteByPrimaryKeys(List<P> ids);

	public int deleteByExample(Q q);

	public int deleteByRequestBody(List<P> ids);
	
	public P getPrimaryKey();

}
