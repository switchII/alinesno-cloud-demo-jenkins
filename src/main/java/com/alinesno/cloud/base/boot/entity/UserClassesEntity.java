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
@Table(name="user_classes")
public class UserClassesEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

	private String classes;
	@Column(name="collge_name")
	private String collgeName;
	private String education;
	@Column(name="is_use")
	private String isUse;
	private String owners;
	@Column(name="professional_name")
	private String professionalName;
	@Column(name="school_end_time")
	private Date schoolEndTime;
	@Column(name="school_id")
	private String schoolId;
	@Column(name="school_name")
	private String schoolName;
	@Column(name="school_num")
	private String schoolNum;
	@Column(name="school_start_time")
	private Date schoolStartTime;
	@Column(name="shool_job")
	private String shoolJob;
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


	public String getClasses() {
		return classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}

	public String getCollgeName() {
		return collgeName;
	}

	public void setCollgeName(String collgeName) {
		this.collgeName = collgeName;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

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

	public String getProfessionalName() {
		return professionalName;
	}

	public void setProfessionalName(String professionalName) {
		this.professionalName = professionalName;
	}

	public Date getSchoolEndTime() {
		return schoolEndTime;
	}

	public void setSchoolEndTime(Date schoolEndTime) {
		this.schoolEndTime = schoolEndTime;
	}

	public String getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolNum() {
		return schoolNum;
	}

	public void setSchoolNum(String schoolNum) {
		this.schoolNum = schoolNum;
	}

	public Date getSchoolStartTime() {
		return schoolStartTime;
	}

	public void setSchoolStartTime(Date schoolStartTime) {
		this.schoolStartTime = schoolStartTime;
	}

	public String getShoolJob() {
		return shoolJob;
	}

	public void setShoolJob(String shoolJob) {
		this.shoolJob = shoolJob;
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
		return "UserClassesEntity{" +
			"classes=" + classes +
			", collgeName=" + collgeName +
			", education=" + education +
			", isUse=" + isUse +
			", owners=" + owners +
			", professionalName=" + professionalName +
			", schoolEndTime=" + schoolEndTime +
			", schoolId=" + schoolId +
			", schoolName=" + schoolName +
			", schoolNum=" + schoolNum +
			", schoolStartTime=" + schoolStartTime +
			", shoolJob=" + shoolJob +
			", useEndTime=" + useEndTime +
			", useStartTime=" + useStartTime +
			", userId=" + userId +
			", departmentId=" + departmentId +
			", fieldId=" + fieldId +
			", operatorId=" + operatorId +
			"}";
	}
}
