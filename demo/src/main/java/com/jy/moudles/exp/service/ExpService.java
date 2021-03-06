package com.jy.moudles.exp.service;

import com.jy.moudles.exp.entity.Exp;
import java.util.List;
import java.util.Map;

/** 
 * Exp业务接口
 * 创建人：Administrator
 * 创建时间：2018-11-09
 */
public interface ExpService {

	/**
	 * 新增Exp对象
	 *
	 * @param Exp
	 */
	public void insertExp(Exp Exp);
	
	/**
	 * 更新Exp对象
	 *
	 * @param Exp
	 */
	public void updateExp(Exp Exp);
	
	/**
	 * 根据ID获取Exp对象
	 *
	 * @param id
	 */
	public Exp getExpById(String id);
	
	/**
	 * 根据过滤条件获取Exp列表对象
	 *
	 * @param filter
	 */
	public List<Exp> queryExpsFilter(Map<String, Object> filter);
	
	/**
	 * 根据Id删除Exp列表对象
	 *
	 * @param id
	 */
	public void deleteExpById(String id);
	
	/**
	 * 根据Id集合批量删除Exp列表对象
	 *
	 * @param ids
	 */
	public void deleteExps(List<String> ids);
	
}

