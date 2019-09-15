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
@Table(name="user_pic")
public class UserPicEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

	@Column(name="is_use")
	private String isUse;
	private String owners;
	@Column(name="pic_name")
	private String picName;
	@Column(name="pic_path")
	private String picPath;
	@Column(name="use_end_time")
	private String useEndTime;
	@Column(name="use_start_time")
	private String useStartTime;
	@Column(name="user_id")
	private String userId;
	@Column(name="department_id")
	private String departmentId;
	@Column(name="field_id")
	private String fieldId;
	@Column(name="operator_id")
	private String operatorId;


	public String getIsUse() {
		return isUse;
	}

	public void setIsUse(String isUse) {
		this.isUse = isUse;
	}

	public String getOwners() {
		return owners;
	}

	public void setOwners(String owners) {
		this.owners = owners;
	}

	public String getPicName() {
		return picName;
	}

	public void setPicName(String picName) {
		this.picName = picName;
	}

	public String getPicPath() {
		return picPath;
	}

	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}

	public String getUseEndTime() {
		return useEndTime;
	}

	public void setUseEndTime(String useEndTime) {
		this.useEndTime = useEndTime;
	}

	public String getUseStartTime() {
		return useStartTime;
	}

	public void setUseStartTime(String useStartTime) {
		this.useStartTime = useStartTime;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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
		return "UserPicEntity{" +
			"isUse=" + isUse +
			", owners=" + owners +
			", picName=" + picName +
			", picPath=" + picPath +
			", useEndTime=" + useEndTime +
			", useStartTime=" + useStartTime +
			", userId=" + userId +
			", departmentId=" + departmentId +
			", fieldId=" + fieldId +
			", operatorId=" + operatorId +
			"}";
	}
}
