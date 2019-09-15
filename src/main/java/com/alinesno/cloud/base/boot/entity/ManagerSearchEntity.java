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
@Table(name="manager_search")
public class ManagerSearchEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

	@Column(name="default_value")
	private String defaultValue;
	@Column(name="has_date")
	private String hasDate;
	private String label;
	private String name;
	@Column(name="option_json")
	private String optionJson;
	@Column(name="resource_id")
	private String resourceId;
	@Column(name="search_type")
	private String searchType;
	@Column(name="department_id")
	private String departmentId;
	@Column(name="field_id")
	private String fieldId;
	@Column(name="operator_id")
	private String operatorId;


	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public String getHasDate() {
		return hasDate;
	}

	public void setHasDate(String hasDate) {
		this.hasDate = hasDate;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOptionJson() {
		return optionJson;
	}

	public void setOptionJson(String optionJson) {
		this.optionJson = optionJson;
	}

	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public String getSearchType() {
		return searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
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
		return "ManagerSearchEntity{" +
			"defaultValue=" + defaultValue +
			", hasDate=" + hasDate +
			", label=" + label +
			", name=" + name +
			", optionJson=" + optionJson +
			", resourceId=" + resourceId +
			", searchType=" + searchType +
			", departmentId=" + departmentId +
			", fieldId=" + fieldId +
			", operatorId=" + operatorId +
			"}";
	}
}
