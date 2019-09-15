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
@Table(name="manager_code")
public class ManagerCodeEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

	@Column(name="code_name")
	private String codeName;
	@Column(name="code_type_name")
	private String codeTypeName;
	@Column(name="code_type_value")
	private String codeTypeValue;
	@Column(name="code_value")
	private String codeValue;
	@Column(name="department_id")
	private String departmentId;
	@Column(name="field_id")
	private String fieldId;
	@Column(name="operator_id")
	private String operatorId;


	public String getCodeName() {
		return codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

	public String getCodeTypeName() {
		return codeTypeName;
	}

	public void setCodeTypeName(String codeTypeName) {
		this.codeTypeName = codeTypeName;
	}

	public String getCodeTypeValue() {
		return codeTypeValue;
	}

	public void setCodeTypeValue(String codeTypeValue) {
		this.codeTypeValue = codeTypeValue;
	}

	public String getCodeValue() {
		return codeValue;
	}

	public void setCodeValue(String codeValue) {
		this.codeValue = codeValue;
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
		return "ManagerCodeEntity{" +
			"codeName=" + codeName +
			", codeTypeName=" + codeTypeName +
			", codeTypeValue=" + codeTypeValue +
			", codeValue=" + codeValue +
			", departmentId=" + departmentId +
			", fieldId=" + fieldId +
			", operatorId=" + operatorId +
			"}";
	}
}
