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
@Table(name="manager_resource_action")
public class ManagerResourceActionEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

	@Column(name="resource_action_icon")
	private String resourceActionIcon;
	@Column(name="resource_action_method")
	private String resourceActionMethod;
	@Column(name="resource_action_name")
	private String resourceActionName;
	@Column(name="resource_action_order")
	private Integer resourceActionOrder;
	@Column(name="resource_action_status")
	private Boolean resourceActionStatus;
	@Column(name="resource_id")
	private String resourceId;
	@Column(name="department_id")
	private String departmentId;
	@Column(name="field_id")
	private String fieldId;
	@Column(name="operator_id")
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


	@Override
	public String toString() {
		return "ManagerResourceActionEntity{" +
			"resourceActionIcon=" + resourceActionIcon +
			", resourceActionMethod=" + resourceActionMethod +
			", resourceActionName=" + resourceActionName +
			", resourceActionOrder=" + resourceActionOrder +
			", resourceActionStatus=" + resourceActionStatus +
			", resourceId=" + resourceId +
			", departmentId=" + departmentId +
			", fieldId=" + fieldId +
			", operatorId=" + operatorId +
			"}";
	}
}
