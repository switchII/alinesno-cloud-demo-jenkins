package com.alinesno.cloud.base.boot.entity;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Entity;
import com.alinesno.cloud.common.core.orm.entity.BaseEntity;


/**
 * <p>
 * 
 * </p>
 *
 * @author LuoAnDong
 * @since 2019-09-15 14:04:42
 */
@Entity
@Table(name="info_school")
public class InfoSchoolEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

	private String owners;
	@Column(name="school_address")
	private String schoolAddress;
	@Column(name="school_code")
	private String schoolCode;
	@Column(name="school_name")
	private String schoolName;
	@Column(name="school_owner")
	private String schoolOwner;
	@Column(name="school_owner_code")
	private String schoolOwnerCode;
	@Column(name="school_properties")
	private String schoolProperties;
	@Column(name="school_properties_code")
	private String schoolPropertiesCode;
	@Column(name="school_province")
	private String schoolProvince;
	@Column(name="school_province_code")
	private String schoolProvinceCode;
	@Column(name="school_type")
	private String schoolType;
	@Column(name="school_type_name")
	private String schoolTypeName;
	@Column(name="department_id")
	private String departmentId;
	@Column(name="field_id")
	private String fieldId;
	@Column(name="operator_id")
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


	@Override
	public String toString() {
		return "InfoSchoolEntity{" +
			"owners=" + owners +
			", schoolAddress=" + schoolAddress +
			", schoolCode=" + schoolCode +
			", schoolName=" + schoolName +
			", schoolOwner=" + schoolOwner +
			", schoolOwnerCode=" + schoolOwnerCode +
			", schoolProperties=" + schoolProperties +
			", schoolPropertiesCode=" + schoolPropertiesCode +
			", schoolProvince=" + schoolProvince +
			", schoolProvinceCode=" + schoolProvinceCode +
			", schoolType=" + schoolType +
			", schoolTypeName=" + schoolTypeName +
			", departmentId=" + departmentId +
			", fieldId=" + fieldId +
			", operatorId=" + operatorId +
			"}";
	}
}
