package com.jy.moudles.device.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.jy.moudles.device.entity.Device;
import com.jy.moudles.statistics.entity.DeviceCollectVO;
import com.jy.common.persistence.annotation.MyBatisDao;

/** 
 * 
 * xipeng
 * 2017-10-17
 */
@MyBatisDao
public interface DeviceDao {

	Device getDeviceByAddress(String address);

	void clearDeviceData();

	void deleteDeviceGroupNo(String id);
	
	void addDeviceGroupNo(@Param("id")String id,@Param("list")List<String> list);
	/**
	 * 
	 * @param id 设备分组id
	 * @return
	 */
	List<Device> queryDevicesByGroupNo(String id);
	
	//统计设备
	List<DeviceCollectVO> queryDeviceCount();
	/**
	 *
	 * @param device
	 */
	public void insertDevice(Device device);
	
	/**
	 *
	 * @param device
	 */
	public void updateDevice(Device device);
	
	/**
	 *
	 * @param id
	 */
	public Device getDeviceById(String id);
	
	/**
	 *
	 * @param filter
	 */
	public List<Device> queryDevicesFilter(Map<String, Object> filter);
	
	/**
	 *
	 * @param id
	 */
	public void deleteDeviceById(String id);
	
	/**
	 *
	 * @param ids
	 */
	public void deleteDevices(List<String> ids);
	
	public void openOrCloseSelectedDevices(Map<String,Object> params);

	/**
	 * @param operationType
	 */
	public void openOrCloseAllDevices(String operationType);
	
	
	public Device getDeviceByMac(String mac);

	List<Device> getDeviceListByIds(List<String> ids);
	
	public void updateDeviceByMac(Device device);
	
	/**
	 * 协议专用更新文件
	 * */
	public void updateDeviceStatusOnAgreement();
	
	public void deleteDevicesByKafka(Map<String,Object> filter);

	public void insertDevicesBatch(List<Device> list);

	/**
	 * 根据list_order排序获取屏蔽终端
	 */
	public List<Device> queryDevicesByListOrder();

    /**
     * 查询屏蔽终端ip,过滤list_order不为空的
     */
	public List<String> queryIPs();

    public List<String> queryMACs();

    /**
     * 更新屏蔽终端list_order
     */
	public  void updateShieldListOrder(Map<String,Object> filter);

	/**
	 * 阻断设备总开关(只改在线的设备)
	 */
    public void updateAllOnlineShield(@Param("poweroff") String poweroff, @Param("operationType") String operationType);

	/**
	 * 清除屏蔽设备的listorder
	 */
	public void clearListOrder(String id);

	/**
	 * 统计在线和异常屏蔽
	 */
	public List<Integer> countShiledOnlinAndAbnormal();
	
	/**
	 * 更改ip状态
	 */
	public void updateDeviceByIp(String ip);

}



