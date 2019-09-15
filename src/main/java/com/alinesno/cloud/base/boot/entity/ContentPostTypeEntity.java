package com.alinesno.cloud.base.boot.entity;

import javax.persistence.Column;
import java.util.Date;
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
@Table(name="content_post_type")
public class ContentPostTypeEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

	@Column(name="type_add_time")
	private Date typeAddTime;
	@Column(name="type_name")
	private String typeName;
	@Column(name="type_status")
	private Integer typeStatus;
	private String pid;
	@Column(name="department_id")
	private String departmentId;
	@Column(name="field_id")
	private String fieldId;
	@Column(name="operator_id")
	private String operatorId;


	public Date getTypeAddTime() {
		return typeAddTime;
	}

	public void setTypeAddTime(Date typeAddTime) {
		this.typeAddTime = typeAddTime;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public Integer getTypeStatus() {
		return typeStatus;
	}

	public void setTypeStatus(Integer typeStatus) {
		this.typeStatus = typeStatus;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
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
		return "ContentPostTypeEntity{" +
			"typeAddTime=" + typeAddTime +
			", typeName=" + typeName +
			", typeStatus=" + typeStatus +
			", pid=" + pid +
			", departmentId=" + departmentId +
			", fieldId=" + fieldId +
			", operatorId=" + operatorId +
			"}";
	}
}
