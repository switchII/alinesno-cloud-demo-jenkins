package com.alinesno.cloud.base.boot.feign.dto;

import com.alinesno.cloud.common.facade.feign.BaseDto;

/**
 * <p> 传输对象</p>
 *
 * @author LuoAnDong
 * @since 2019-09-15 14:04:42
 */
@SuppressWarnings("serial")
public class ManagerResourceDto extends BaseDto {

	private Integer menuType;
	
	private String resourceIcon;
	
	private String resourceLink;
	
	private String resourceName;
	
	private Integer resourceOrder;
	
	private String resourceParent;
	
	private String departmentId;
	
	private String fieldId;
	
	private String operatorId;
	


	public Integer getMenuType() {
		return menuType;
	}

	public void setMenuType(Integer menuType) {
		this.menuType = menuType;
	}

	public String getResourceIcon() {
		return resourceIcon;
	}

	public void setResourceIcon(String resourceIcon) {
		this.resourceIcon = resourceIcon;
	}

	public String getResourceLink() {
		return resourceLink;
	}

	public void setResourceLink(String resourceLink) {
		this.resourceLink = resourceLink;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public Integer getResourceOrder() {
		return resourceOrder;
	}

	public void setResourceOrder(Integer resourceOrder) {
		this.resourceOrder = resourceOrder;
	}

	public String getResourceParent() {
		return resourceParent;
	}

	public void setResourceParent(String resourceParent) {
		this.resourceParent = resourceParent;
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
