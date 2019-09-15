package com.alinesno.cloud.base.boot.feign.dto;

import com.alinesno.cloud.common.facade.feign.BaseDto;

/**
 * <p> 传输对象</p>
 *
 * @author LuoAnDong
 * @since 2019-09-15 14:04:42
 */
@SuppressWarnings("serial")
public class InfoSchoolDto extends BaseDto {

	private String owners;
	
	private String schoolAddress;
	
	private String schoolCode;
	
	private String schoolName;
	
	private String schoolOwner;
	
	private String schoolOwnerCode;
	
	private String schoolProperties;
	
	private String schoolPropertiesCode;
	
	private String schoolProvince;
	
	private String schoolProvinceCode;
	
	private String schoolType;
	
	private String schoolTypeName;
	
	private String departmentId;
	
	private String fieldId;
	
	private String operatorId;
	


	public String getOwners() {
		return owners;
	}

	public void setOwners(String owners) {
		this.owners = owners;
	}

	public String getSchoolAddress() {
		return schoolAddress;
	}

	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}

	public String getSchoolCode() {
		return schoolCode;
	}

	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolOwner() {
		return schoolOwner;
	}

	public void setSchoolOwner(String schoolOwner) {
		this.schoolOwner = schoolOwner;
	}

	public String getSchoolOwnerCode() {
		return schoolOwnerCode;
	}

	public void setSchoolOwnerCode(String schoolOwnerCode) {
		this.schoolOwnerCode = schoolOwnerCode;
	}

	public String getSchoolProperties() {
		return schoolProperties;
	}

	public void setSchoolProperties(String schoolProperties) {
		this.schoolProperties = schoolProperties;
	}

	public String getSchoolPropertiesCode() {
		return schoolPropertiesCode;
	}

	public void setSchoolPropertiesCode(String schoolPropertiesCode) {
		this.schoolPropertiesCode = schoolPropertiesCode;
	}

	public String getSchoolProvince() {
		return schoolProvince;
	}

	public void setSchoolProvince(String schoolProvince) {
		this.schoolProvince = schoolProvince;
	}

	public String getSchoolProvinceCode() {
		return schoolProvinceCode;
	}

	public void setSchoolProvinceCode(String schoolProvinceCode) {
		this.schoolProvinceCode = schoolProvinceCode;
	}

	public String getSchoolType() {
		return schoolType;
	}

	public void setSchoolType(String schoolType) {
		this.schoolType = schoolType;
	}

	public String getSchoolTypeName() {
		return schoolTypeName;
	}

	public void setSchoolTypeName(String schoolTypeName) {
		this.schoolTypeName = schoolTypeName;
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
