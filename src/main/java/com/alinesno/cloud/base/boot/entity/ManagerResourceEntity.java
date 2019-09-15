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
@Table(name="manager_resource")
public class ManagerResourceEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

	@Column(name="menu_type")
	private Integer menuType;
	@Column(name="resource_icon")
	private String resourceIcon;
	@Column(name="resource_link")
	private String resourceLink;
	@Column(name="resource_name")
	private String resourceName;
	@Column(name="resource_order")
	private Integer resourceOrder;
	@Column(name="resource_parent")
	private String resourceParent;
	@Column(name="department_id")
	private String departmentId;
	@Column(name="field_id")
	private String fieldId;
	@Column(name="operator_id")
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


	@Override
	public String toString() {
		return "ManagerResourceEntity{" +
			"menuType=" + menuType +
			", resourceIcon=" + resourceIcon +
			", resourceLink=" + resourceLink +
			", resourceName=" + resourceName +
			", resourceOrder=" + resourceOrder +
			", resourceParent=" + resourceParent +
			", departmentId=" + departmentId +
			", fieldId=" + fieldId +
			", operatorId=" + operatorId +
			"}";
	}
}
