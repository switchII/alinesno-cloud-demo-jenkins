package com.alinesno.cloud.base.boot.feign.dto;

import com.alinesno.cloud.common.facade.feign.BaseDto;

/**
 * <p> 传输对象</p>
 *
 * @author LuoAnDong
 * @since 2019-09-15 14:04:42
 */
@SuppressWarnings("serial")
public class ManagerApplicationDto extends BaseDto {

	private String applicationDesc;
	
	private String applicationIcons;
	
	private String applicationName;
	
	private String pid;
	
	private String applicationLink;
	
	private String departmentId;
	
	private String fieldId;
	
	private String operatorId;
	


	public String getApplicationDesc() {
		return applicationDesc;
	}

	public void setApplicationDesc(String applicationDesc) {
		this.applicationDesc = applicationDesc;
	}

	public String getApplicationIcons() {
		return applicationIcons;
	}

	public void setApplicationIcons(String applicationIcons) {
		this.applicationIcons = applicationIcons;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getApplicationLink() {
		return applicationLink;
	}

	public void setApplicationLink(String applicationLink) {
		this.applicationLink = applicationLink;
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
