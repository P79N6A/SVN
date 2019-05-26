package com.jy.moudles.shieldConfig.dao;

import java.util.List;
import java.util.Map;

import com.jy.moudles.shieldConfig.entity.ShieldConfig;
import com.jy.common.persistence.annotation.MyBatisDao;

/** 
 * ShieldConfig数据接口
 * 创建人：Administrator
 * 创建时间：2018-11-22
 */
@MyBatisDao
public interface ShieldConfigDao {

	/**
	 * 新增ShieldConfig对象
	 *
	 * @param ShieldConfig
	 */
	public void insertShieldConfig(ShieldConfig ShieldConfig);
	
	/**
	 * 更新ShieldConfig对象
	 *
	 * @param ShieldConfig
	 */
	public void updateShieldConfig(ShieldConfig ShieldConfig);
	
	/**
	 * 根据ID获取ShieldConfig对象
	 *
	 * @param id
	 */
	public ShieldConfig getShieldConfigById(String id);
	
	/**
	 * 根据过滤条件获取ShieldConfig列表对象
	 *
	 * @param filter
	 */
	public List<ShieldConfig> queryShieldConfigsFilter(Map<String, Object> filter);
	
	/**
	 * 根据Id删除ShieldConfig列表对象
	 *
	 * @param id
	 */
	public void deleteShieldConfigById(String id);
	
	/**
	 * 根据Id集合批量删除ShieldConfig列表对象
	 *
	 * @param ids
	 */
	public void deleteShieldConfigs(List<String> ids);
	
}



