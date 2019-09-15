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
@Table(name="manager_account_role")
public class ManagerAccountRoleEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

	@Column(name="account_id")
	private String accountId;
	@Column(name="role_id")
	private String roleId;
	@Column(name="department_id")
	private String departmentId;
	@Column(name="field_id")
	private String fieldId;
	@Column(name="operator_id")
	private String operatorId;


	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
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
		return "ManagerAccountRoleEntity{" +
			"accountId=" + accountId +
			", roleId=" + roleId +
			", departmentId=" + departmentId +
			", fieldId=" + fieldId +
			", operatorId=" + operatorId +
			"}";
	}
}
