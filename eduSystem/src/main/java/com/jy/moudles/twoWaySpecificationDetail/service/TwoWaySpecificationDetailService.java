package com.jy.moudles.twoWaySpecificationDetail.service;

import com.jy.moudles.twoWaySpecificationDetail.entity.TwoWaySpecificationDetail;
import java.util.List;
import java.util.Map;

/** 
 * twoWaySpecificationDetail业务接口
 * 创建人：1
 * 创建时间：2017-11-29
 */
public interface TwoWaySpecificationDetailService {

	/**
	 * 新增twoWaySpecificationDetail对象
	 *
	 * @param twoWaySpecificationDetail
	 */
	public void insertTwoWaySpecificationDetail(TwoWaySpecificationDetail twoWaySpecificationDetail);

	/**
	 * 批量新增twoWaySpecificationDetail对象
	 *
	 * @param twoWaySpecificationDetails
	 */
	public void batchInsertTwoWaySpecificationDetail(List<TwoWaySpecificationDetail> twoWaySpecificationDetails);

	/**
	 * 更新twoWaySpecificationDetail对象
	 *
	 * @param twoWaySpecificationDetail
	 */
	public void updateTwoWaySpecificationDetail(TwoWaySpecificationDetail twoWaySpecificationDetail);
	
	/**
	 * 根据ID获取twoWaySpecificationDetail对象
	 *
	 * @param id
	 */
	public TwoWaySpecificationDetail getTwoWaySpecificationDetailById(String id);
	
	/**
	 * 根据过滤条件获取twoWaySpecificationDetail列表对象
	 *
	 * @param filter
	 */
	public List<TwoWaySpecificationDetail> queryTwoWaySpecificationDetailsFilter(Map<String, Object> filter);
	
	/**
	 * 根据Id删除twoWaySpecificationDetail列表对象
	 *
	 * @param id
	 */
	public void deleteTwoWaySpecificationDetailById(String id);

	/**
	 * 根据父Id删除twoWaySpecificationDetail列表对象
	 *
	 * @param parentId
	 */
	public void deleteTwoWaySpDetailsByPid(String parentId);

	/**
	 * 根据Id集合批量删除twoWaySpecificationDetail列表对象
	 *
	 * @param ids
	 */
	public void deleteTwoWaySpecificationDetails(List<String> ids);
	
}

