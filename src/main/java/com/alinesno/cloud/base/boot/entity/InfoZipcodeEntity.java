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
@Table(name="info_zipcode")
public class InfoZipcodeEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

	private String area;
	private String owners;
	@Column(name="zip_code")
	private String zipCode;
	@Column(name="department_id")
	private String departmentId;
	@Column(name="field_id")
	private String fieldId;
	@Column(name="operator_id")
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


	@Override
	public String toString() {
		return "InfoZipcodeEntity{" +
			"area=" + area +
			", owners=" + owners +
			", zipCode=" + zipCode +
			", departmentId=" + departmentId +
			", fieldId=" + fieldId +
			", operatorId=" + operatorId +
			"}";
	}
}
