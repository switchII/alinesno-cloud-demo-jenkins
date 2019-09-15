package com.alinesno.cloud.base.boot.feign.dto;

import com.alinesno.cloud.common.facade.feign.BaseDto;

/**
 * <p> 传输对象</p>
 *
 * @author LuoAnDong
 * @since 2019-09-15 14:04:42
 */
@SuppressWarnings("serial")
public class ManagerResourceActionDto extends BaseDto {

	private String resourceActionIcon;
	
	private String resourceActionMethod;
	
	private String resourceActionName;
	
	private Integer resourceActionOrder;
	
	private Boolean resourceActionStatus;
	
	private String resourceId;
	
	private String departmentId;
	
	private String fieldId;
	
	private String operatorId;
	


	public String getResourceActionIcon() {
		return resourceActionIcon;
	}

	public void setResourceActionIcon(String resourceActionIcon) {
		this.resourceActionIcon = resourceActionIcon;
	}

	public String getResourceActionMethod() {
		return resourceActionMethod;
	}

	public void setResourceActionMethod(String resourceActionMethod) {
		this.resourceActionMethod = resourceActionMethod;
	}

	public String getResourceActionName() {
		return resourceActionName;
	}

	public void setResourceActionName(String resourceActionName) {
		this.resourceActionName = resourceActionName;
	}

	public Integer getResourceActionOrder() {
		return resourceActionOrder;
	}

	public void setResourceActionOrder(Integer resourceActionOrder) {
		this.resourceActionOrder = resourceActionOrder;
	}

	public Boolean isResourceActionStatus() {
		return resourceActionStatus;
	}

	public void setResourceActionStatus(Boolean resourceActionStatus) {
		this.resourceActionStatus = resourceActionStatus;
	}

	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
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
