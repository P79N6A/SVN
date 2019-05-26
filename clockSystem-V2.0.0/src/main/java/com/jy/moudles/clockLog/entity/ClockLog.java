package com.jy.moudles.clockLog.entity;
import java.util.Date;

import com.jy.common.entity.BaseEntity;
import com.jy.common.persistence.annotation.logAspect.OpType;
import com.jy.common.utils.UUIDUtil;
/**
*时钟菜单表，记录时钟系统菜单信息；该信息同步至公共数据库
*/
public class ClockLog extends BaseEntity{
	
	private static final long serialVersionUID = -1L;
	
	public ClockLog() {}
	
	public ClockLog(OpType opType, String opInfo, String operationMoudle) {
		
		Date now = new Date();
		
		this.operationMoudle = "时钟系统." + operationMoudle;
		
		switch (opType) {
		case ADD:
			this.operationType = 1;
			this.operationInfo = "新增" + opInfo;
			break;
		case EDIT:
			this.operationType = 2;
			this.operationInfo = "修改" + opInfo;
			break;
		case DEL:
			this.operationType = 3;
			this.operationInfo = "删除" + opInfo;
			break;
		default:
			break;
		}
		
		this.operationTime = now;
		
		this.operationUser = "测试用户";
		
		super.setId(UUIDUtil.get32UUID());
		super.setCreateDate(now);
		super.setCreateUser("测试用户");
		super.setUpdateUser("测试用户");
		super.setUpdateDate(now);
		
	}
	
	/**
	 * 操作模块
	 */
	private String operationMoudle;
	
	/**
	 * 操作类型：1：add；2：update；3：del
	 */
	private int operationType;
	
	/**
	 * 操作时间
	 */
	private Date operationTime;
	
	/**
	 * 操作用户，32位UUID
	 */
	private String operationUser;
	
	/**
	 * 操作信息
	 */
	private String operationInfo;
	
	
	//关联字段
	private String operationUserName;
	
	
	public String getOperationMoudle() {
		return operationMoudle;
	}

	public void setOperationMoudle(String operationMoudle) {
		this.operationMoudle = operationMoudle;
	}
	
	public int getOperationType() {
		return operationType;
	}

	public void setOperationType(int operationType) {
		this.operationType = operationType;
	}
	
	public Date getOperationTime() {
		return operationTime;
	}

	public void setOperationTime(Date operationTime) {
		this.operationTime = operationTime;
	}
	
	public String getOperationUser() {
		return operationUser;
	}

	public void setOperationUser(String operationUser) {
		this.operationUser = operationUser;
	}
	
	public String getOperationInfo() {
		return operationInfo;
	}

	public void setOperationInfo(String operationInfo) {
		this.operationInfo = operationInfo;
	}

	public String getOperationUserName() {
		return operationUserName;
	}

	public void setOperationUserName(String operationUserName) {
		this.operationUserName = operationUserName;
	}
	
}



