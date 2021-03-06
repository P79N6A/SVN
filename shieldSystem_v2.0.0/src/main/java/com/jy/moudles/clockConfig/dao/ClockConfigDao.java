package com.jy.moudles.clockConfig.dao;

import java.util.List;
import java.util.Map;

import com.jy.moudles.clockConfig.entity.ClockConfig;
import com.jy.common.persistence.annotation.MyBatisDao;

/** 
 * ClockConfig数据接口
 * 创建人：Administrator
 * 创建时间：2018-10-30
 */
@MyBatisDao
public interface ClockConfigDao {

	/**
	 * 新增ClockConfig对象
	 *
	 * @param ClockConfig
	 */
	public void insertClockConfig(ClockConfig ClockConfig);
	
	/**
	 * 更新ClockConfig对象
	 *
	 * @param ClockConfig
	 */
	public void updateClockConfig(ClockConfig ClockConfig);
	
	/**
	 * 根据ID获取ClockConfig对象
	 *
	 * @param id
	 */
	public ClockConfig getClockConfigByKey(String key);
	
	/**
	 * 根据过滤条件获取ClockConfig列表对象
	 *
	 * @param filter
	 */
	public List<ClockConfig> queryClockConfigsFilter(Map<String, Object> filter);
	
	/**
	 * 根据Id删除ClockConfig列表对象
	 *
	 * @param id
	 */
	public void deleteClockConfigByKey(String key);
	
	/**
	 * 根据Id集合批量删除ClockConfig列表对象
	 *
	 * @param ids
	 */
	public void deleteClockConfigs(List<String> ids);
	
}



