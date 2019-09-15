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
@Table(name="manager_department")
public class ManagerDepartmentEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 父部门id
     */
	private Long pid;
    /**
     * 父级ids
     */
	private String pids;
    /**
     * 简称
     */
	@Column(name="simple_name")
	private String simpleName;
    /**
     * 全称
     */
	@Column(name="full_name")
	private String fullName;
    /**
     * 描述
     */
	private String description;
    /**
     * 版本（乐观锁保留字段）
     */
	private Integer versions;
    /**
     * 排序
     */
	private Integer sort;
	@Column(name="department_id")
	private String departmentId;
	@Column(name="field_id")
	private String fieldId;
	@Column(name="operator_id")
	private String operatorId;


	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getPids() {
		return pids;
	}

	public void setPids(String pids) {
		this.pids = pids;
	}

	public String getSimpleName() {
		return simpleName;
	}

	public void setSimpleName(String simpleName) {
		this.simpleName = simpleName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getVersions() {
		return versions;
	}

	public void setVersions(Integer versions) {
		this.versions = versions;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
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
		return "ManagerDepartmentEntity{" +
			"pid=" + pid +
			", pids=" + pids +
			", simpleName=" + simpleName +
			", fullName=" + fullName +
			", description=" + description +
			", versions=" + versions +
			", sort=" + sort +
			", departmentId=" + departmentId +
			", fieldId=" + fieldId +
			", operatorId=" + operatorId +
			"}";
	}
}
