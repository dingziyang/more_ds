package com.dcm.more_ds.constant.base;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dcm.more_ds.config.TargetDataSource;
import com.dcm.more_ds.constant.DataSourceType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

public abstract class BaseOracleServiceImpl<T, Q, P> implements BaseService<T, Q, P> {

	/**
	 * 澶勭悊鎸佷箙鍖栨搷浣滅殑鍩虹被n
	 */
	protected BaseDao<T, Q> baseDao;

	public abstract void setDao();

	// 鐢ㄤ簬json杞璞�
	private Class<?> type = null;

	private Class<?> example = null;

	// 鐢ㄤ簬鑾峰彇鎻掑叆鏁版嵁琛ㄤ腑杩斿洖鐨勪富閿柟娉�
	// private Method getPk = null;

	public BaseOracleServiceImpl() {
		// 鑾峰彇娉涘瀷鍙傛暟,闃叉CGLIB涓ゆ鍔犺浇
		if (type == null && !this.getClass().getName().contains("EnhancerBySpringCGLIB")) {
			if (this.getClass().getGenericSuperclass() instanceof ParameterizedType) {
				ParameterizedType superGclass = (ParameterizedType) this.getClass().getGenericSuperclass();
				Type[] arguments = superGclass.getActualTypeArguments();

				if (arguments.length > 0) {
					type = (Class<?>) arguments[0];
					example = (Class<?>) arguments[1];
				}
			}
			// Class<?> superclazz = type.getSuperclass();
			// getPk = superclazz.getMethod("getPk");
		}
	}

	@Transactional(readOnly = true)
	@TargetDataSource(DataSourceType.Oracle)
	public List<T> list(Integer startNum, Integer limit) {
		setDao();
		return baseDao.selectWithPage(Arrays.asList(startNum, limit));
	}

	@TargetDataSource(DataSourceType.Oracle)
	public List<T> selectByRequestBodyIds(@RequestBody List<P> ids) {
		return selectByPrimaryKeys(ids);
	}

	// 鏍规嵁鏉′欢鏌ヨ 鐩稿簲缁撴灉
	@Transactional(readOnly = true)
	@TargetDataSource(DataSourceType.Oracle)
	public T selectByPrimaryKey(@PathVariable("id") P id) {
		setDao();
		return baseDao.selectByPrimaryKey(id);
	}

	@Transactional(readOnly = true)
	@TargetDataSource(DataSourceType.Oracle)
	public List<T> selectByPrimaryKeys(@RequestBody List<P> ids) {
		setDao();
		if (ids != null && ids.size() == 1) {
			return Arrays.asList(baseDao.selectByPrimaryKey(ids.get(0)));
		}
		return baseDao.selectByPrimaryKeys(ids);
	}

	
	// 鏍规嵁鏉′欢鏌ヨ 鐩稿簲缁撴灉
	@Transactional(readOnly = true)
	@TargetDataSource(DataSourceType.Oracle)
	public List<T> selectByExample(@RequestBody Q example) {
		setDao();
		return  baseDao.selectByExample(example);
	}

	// 鏍规嵁鏉′欢鏌ヨ 鐩稿簲缁撴灉
	@Transactional(readOnly = true)
	@TargetDataSource(DataSourceType.Oracle)
	public List<T> selectByExampleWithBLOBs(@RequestBody Q example) {
		setDao();
		return baseDao.selectByExampleWithBLOBs(example);
	}

	/**
	 * 鏂板涓氬姟
	 */
	@Transactional
	@TargetDataSource(DataSourceType.Oracle)
	public Object insert(T t) {
		setDao();
		setPrimaryKey(t);
		return baseDao.insert(t);
	}

	@Transactional
	@TargetDataSource(DataSourceType.Oracle)
	public Object insertSelective(T t) {
		setDao();
		setPrimaryKey(t);
		return baseDao.insertSelective(t);
	}

	/**
	 * for寰幆鎻掑叆鏁堢巼涓嶉珮
	 */
	@Transactional
	@TargetDataSource(DataSourceType.Oracle)
	public Object insertBatch(@RequestBody List<T> ts){
		setDao();
		baseDao.insertBatch(ts);
		return null;
	}

	@Transactional
	@TargetDataSource(DataSourceType.Oracle)
	public Object insertSelectiveBatch(@RequestBody List<T> ts) {
		setDao();
		return insertBatch(ts);
	}

	@SuppressWarnings("unchecked")
	@Transactional
	@TargetDataSource(DataSourceType.Oracle)
	public Object insertByJSON(String t) {
		return insert((T) JSON.parseObject(t, type));
	}

	@SuppressWarnings("unchecked")
	@Transactional
	@TargetDataSource(DataSourceType.Oracle)
	public Object insertByJSONObject(JSONObject t) {
		return insert((T) JSON.toJavaObject(t, type));
	}

	@SuppressWarnings("unchecked")
	@Transactional
	@TargetDataSource(DataSourceType.Oracle)
	public Object insertSelectiveByJSON(String t) {
		return insertSelective((T) JSON.parseObject(t, type));
	}

	@SuppressWarnings("unchecked")
	@Transactional
	@TargetDataSource(DataSourceType.Oracle)
	public Object insertSelectiveByJSONObject(JSONObject t) {
		return insertSelective((T) JSON.toJavaObject(t, type));
	}

	/**
	 * 更新
	 */
	@Transactional
	@TargetDataSource(DataSourceType.Oracle)
	public Object updateByPrimaryKeySelective(@RequestBody T t) {
		setDao();
		return baseDao.updateByPrimaryKeySelective(t);
	}

	@SuppressWarnings("unchecked")
	@Transactional
	@TargetDataSource(DataSourceType.Oracle)
	public Object updateByJSONPrimaryKey(String t) {
		setDao();
		return updateByPrimaryKey((T) JSON.parseObject(t, type));
	}

	@SuppressWarnings("unchecked")
	@Transactional
	@TargetDataSource(DataSourceType.Oracle)
	public Object updateByJSONPrimaryKeySelective(String t) {
		setDao();
		return updateByPrimaryKeySelective(((T) JSON.parseObject(t, type)));
	}

	@SuppressWarnings("unchecked")
	@Transactional
	@TargetDataSource(DataSourceType.Oracle)
	public Object updateByJSONObjectPrimaryKey(JSONObject t) {
		setDao();
		return updateByPrimaryKey((T) JSON.toJavaObject(t, type));
	}

	@SuppressWarnings("unchecked")
	@Transactional
	@TargetDataSource(DataSourceType.Oracle)
	public Object updateByJSONObjectPrimaryKeySelective(JSONObject t) {
		setDao();
		return updateByPrimaryKeySelective(((T) JSON.toJavaObject(t, type)));
	}

	// 鏍规嵁鏉′欢鏇存柊
	@Transactional
	@TargetDataSource(DataSourceType.Oracle)
	public Object updateByExampleSelective(T t, Q q) {
		setDao();
		return baseDao.updateByExampleSelective(t, q);
	}

	@Transactional
	@TargetDataSource(DataSourceType.Oracle)
	public Object updateByExampleWithBLOBs(T t, Q q) {
		setDao();
		return baseDao.updateByExampleWithBLOBs(t, q);
	}

	@Transactional
	@TargetDataSource(DataSourceType.Oracle)
	public Object updateByExample(T t, Q q) {
		setDao();
		return baseDao.updateByExample(t, q);
	}

	@Transactional
	@TargetDataSource(DataSourceType.Oracle)
	public Object updateByPrimaryKey(T t) {
		setDao();
		return baseDao.updateByPrimaryKey(t);
	}

	@TargetDataSource(DataSourceType.Oracle)
	public Object updateByRequestBody(@RequestBody T t) {
		return updateByPrimaryKey(t);
	}

	@Transactional(readOnly = true)
	@TargetDataSource(DataSourceType.Oracle)
	public int countByExample(@RequestBody Q example) {
		setDao();
		return baseDao.countByExample(example);

	}

	@Transactional
	@TargetDataSource(DataSourceType.Oracle)
	public int deleteByPrimaryKey(@PathVariable("id") P id) {
		setDao();
		return baseDao.deleteByPrimaryKey(id);
	}

	@Transactional
	@TargetDataSource(DataSourceType.Oracle)
	public int deleteByPrimaryKeys(@PathVariable("ids") List<P> ids) {
		setDao();
		return baseDao.deleteByPrimaryKeys(ids);
	}

	@Transactional
	@TargetDataSource(DataSourceType.Oracle)
	public int deleteByExample(@RequestBody Q q) {
		setDao();
		return baseDao.deleteByExample(q);
	}

	@Transactional
	@TargetDataSource(DataSourceType.Oracle)
	public int deleteByRequestBody(@RequestBody List<P> ids) {
		return deleteByPrimaryKeys(ids);
	}

	protected void setPrimaryKey(T t) {

	}

	public P getPrimaryKey() {
		return null;
	}
}
