package com.alinesno.cloud.base.boot.feign.dto;

import com.alinesno.cloud.common.facade.feign.BaseDto;
import java.util.Date;

/**
 * <p> 传输对象</p>
 *
 * @author LuoAnDong
 * @since 2019-09-15 14:04:42
 */
@SuppressWarnings("serial")
public class ManagerTenantLogDto extends BaseDto {

	private String actionType;
	
	private Date endTime;
	
	private String logBusinessId;
	
	private String logChannel;
	
	private String logContent;
	
	private String logIp;
	
	private String logMachine;
	
	private String departmentId;
	
	private String fieldId;
	
	private String operatorId;
	


	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getLogBusinessId() {
		return logBusinessId;
	}

	public void setLogBusinessId(String logBusinessId) {
		this.logBusinessId = logBusinessId;
	}

	public String getLogChannel() {
		return logChannel;
	}

	public void setLogChannel(String logChannel) {
		this.logChannel = logChannel;
	}

	public String getLogContent() {
		return logContent;
	}

	public void setLogContent(String logContent) {
		this.logContent = logContent;
	}

	public String getLogIp() {
		return logIp;
	}

	public void setLogIp(String logIp) {
		this.logIp = logIp;
	}

	public String getLogMachine() {
		return logMachine;
	}

	public void setLogMachine(String logMachine) {
		this.logMachine = logMachine;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getFieldId() {
		return fieldId;
	}

	public void setFieldId(String fieldId) {
		this.fieldId = fieldId;
	}

	public String getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

}
