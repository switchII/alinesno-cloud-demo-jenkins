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
@Table(name="manager_application")
public class ManagerApplicationEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

	@Column(name="application_desc")
	private String applicationDesc;
	@Column(name="application_icons")
	private String applicationIcons;
	@Column(name="application_name")
	private String applicationName;
	private String pid;
	@Column(name="application_link")
	private String applicationLink;
	@Column(name="department_id")
	private String departmentId;
	@Column(name="field_id")
	private String fieldId;
	@Column(name="operator_id")
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


	@Override
	public String toString() {
		return "ManagerApplicationEntity{" +
			"applicationDesc=" + applicationDesc +
			", applicationIcons=" + applicationIcons +
			", applicationName=" + applicationName +
			", pid=" + pid +
			", applicationLink=" + applicationLink +
			", departmentId=" + departmentId +
			", fieldId=" + fieldId +
			", operatorId=" + operatorId +
			"}";
	}
}
