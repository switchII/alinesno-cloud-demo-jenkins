package com.alinesno.cloud.base.boot.feign.dto;

import com.alinesno.cloud.common.facade.feign.BaseDto;

/**
 * <p> 传输对象</p>
 *
 * @author LuoAnDong
 * @since 2019-09-15 14:04:42
 */
@SuppressWarnings("serial")
public class InfoZipcodeDto extends BaseDto {

	private String area;
	
	private String owners;
	
	private String zipCode;
	
	private String departmentId;
	
	private String fieldId;
	
	private String operatorId;
	


	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getOwners() {
		return owners;
	}

	public void setOwners(String owners) {
		this.owners = owners;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
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
