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
@Table(name="info_professional")
public class InfoProfessionalEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

	private String owners;
	@Column(name="professional_name")
	private String professionalName;
	@Column(name="professional_prop")
	private String professionalProp;
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

	public String getProfessionalName() {
		return professionalName;
	}

	public void setProfessionalName(String professionalName) {
		this.professionalName = professionalName;
	}

	public String getProfessionalProp() {
		return professionalProp;
	}

	public void setProfessionalProp(String professionalProp) {
		this.professionalProp = professionalProp;
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
		return "InfoProfessionalEntity{" +
			"owners=" + owners +
			", professionalName=" + professionalName +
			", professionalProp=" + professionalProp +
			", departmentId=" + departmentId +
			", fieldId=" + fieldId +
			", operatorId=" + operatorId +
			"}";
	}
}
