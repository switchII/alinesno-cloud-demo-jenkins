package com.alinesno.cloud.base.boot.feign.dto;

import com.alinesno.cloud.common.facade.feign.BaseDto;

/**
 * <p> 传输对象</p>
 *
 * @author LuoAnDong
 * @since 2019-09-15 14:04:42
 */
@SuppressWarnings("serial")
public class ManagerDepartmentDto extends BaseDto {

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
	private String simpleName;
	
    /**
     * 全称
     */
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
	
	private String departmentId;
	
	private String fieldId;
	
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

}
