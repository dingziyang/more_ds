package com.dcm.more_ds.constant.base;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

public abstract class BaseServiceImpl <T, Q, P> implements BaseService<T, Q, P> {

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

	public BaseServiceImpl() {
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
	public List<T> list(Integer startNum, Integer limit) {
		setDao();
		return baseDao.selectWithPage(Arrays.asList(startNum, limit));
	}

	public List<T> selectByRequestBodyIds(@RequestBody List<P> ids) {
		return selectByPrimaryKeys(ids);
	}

	// 鏍规嵁鏉′欢鏌ヨ 鐩稿簲缁撴灉
	@Transactional(readOnly = true)
	public T selectByPrimaryKey(@PathVariable("id") P id) {
		setDao();
		return baseDao.selectByPrimaryKey(id);
	}

	@Transactional(readOnly = true)
	public List<T> selectByPrimaryKeys(@RequestBody List<P> ids) {
		setDao();
		if (ids != null && ids.size() == 1) {
			return Arrays.asList(baseDao.selectByPrimaryKey(ids.get(0)));
		}
		return baseDao.selectByPrimaryKeys(ids);
	}

	
	// 鏍规嵁鏉′欢鏌ヨ 鐩稿簲缁撴灉
	@Transactional(readOnly = true)
	public List<T> selectByExample(@RequestBody Q example) {
		setDao();
		return  baseDao.selectByExample(example);
	}

	// 鏍规嵁鏉′欢鏌ヨ 鐩稿簲缁撴灉
	@Transactional(readOnly = true)
	public List<T> selectByExampleWithBLOBs(@RequestBody Q example) {
		setDao();
		return baseDao.selectByExampleWithBLOBs(example);
	}

	/**
	 * 鏂板涓氬姟
	 */
	@Transactional
	public Object insert(T t) {
		setDao();
		setPrimaryKey(t);
		return baseDao.insert(t);
	}

	@Transactional
	public Object insertSelective(T t) {
		setDao();
		setPrimaryKey(t);
		return baseDao.insertSelective(t);
	}

	/**
	 * for寰幆鎻掑叆鏁堢巼涓嶉珮
	 */
	@Transactional
	public Object insertBatch(@RequestBody List<T> ts){
		setDao();
		baseDao.insertBatch(ts);
		return null;
	}

	@Transactional
	public Object insertSelectiveBatch(@RequestBody List<T> ts) {
		setDao();
		return insertBatch(ts);
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public Object insertByJSON(String t) {
		return insert((T) JSON.parseObject(t, type));
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public Object insertByJSONObject(JSONObject t) {
		return insert((T) JSON.toJavaObject(t, type));
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public Object insertSelectiveByJSON(String t) {
		return insertSelective((T) JSON.parseObject(t, type));
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public Object insertSelectiveByJSONObject(JSONObject t) {
		return insertSelective((T) JSON.toJavaObject(t, type));
	}

	/**
	 * 鏇存柊
	 */
	@Transactional
	public Object updateByPrimaryKeySelective(@RequestBody T t) {
		setDao();
		return baseDao.updateByPrimaryKeySelective(t);
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public Object updateByJSONPrimaryKey(String t) {
		setDao();
		return updateByPrimaryKey((T) JSON.parseObject(t, type));
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public Object updateByJSONPrimaryKeySelective(String t) {
		setDao();
		return updateByPrimaryKeySelective(((T) JSON.parseObject(t, type)));
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public Object updateByJSONObjectPrimaryKey(JSONObject t) {
		setDao();
		return updateByPrimaryKey((T) JSON.toJavaObject(t, type));
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public Object updateByJSONObjectPrimaryKeySelective(JSONObject t) {
		setDao();
		return updateByPrimaryKeySelective(((T) JSON.toJavaObject(t, type)));
	}

	// 鏍规嵁鏉′欢鏇存柊
	@Transactional
	public Object updateByExampleSelective(T t, Q q) {
		setDao();
		return baseDao.updateByExampleSelective(t, q);
	}

	@Transactional
	public Object updateByExampleWithBLOBs(T t, Q q) {
		setDao();
		return baseDao.updateByExampleWithBLOBs(t, q);
	}

	@Transactional
	public Object updateByExample(T t, Q q) {
		setDao();
		return baseDao.updateByExample(t, q);
	}

	@Transactional
	public Object updateByPrimaryKey(T t) {
		setDao();
		return baseDao.updateByPrimaryKey(t);
	}

	public Object updateByRequestBody(@RequestBody T t) {
		return updateByPrimaryKey(t);
	}

	@Transactional(readOnly = true)
	public int countByExample(@RequestBody Q example) {
		setDao();
		return baseDao.countByExample(example);

	}

	/**
	 * 鍒犻櫎
	 */
	@Transactional
	public int deleteByPrimaryKey(@PathVariable("id") P id) {
		setDao();
		return baseDao.deleteByPrimaryKey(id);
	}

	/**
	 * 鍒犻櫎
	 */
	@Transactional
	public int deleteByPrimaryKeys(@PathVariable("ids") List<P> ids) {
		setDao();
		return baseDao.deleteByPrimaryKeys(ids);
	}

	@Transactional
	public int deleteByExample(@RequestBody Q q) {
		setDao();
		return baseDao.deleteByExample(q);
	}

	@Transactional
	public int deleteByRequestBody(@RequestBody List<P> ids) {
		return deleteByPrimaryKeys(ids);
	}

	protected void setPrimaryKey(T t) {

	}

	public P getPrimaryKey() {
		return null;
	}
}
