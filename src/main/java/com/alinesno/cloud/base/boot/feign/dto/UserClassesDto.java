package com.alinesno.cloud.base.boot.feign.dto;

import com.alinesno.cloud.common.facade.feign.BaseDto;
import java.util.Date;

/**
 * <p> 传输对象</p>
 *
 * @author LuoAnDong
 * @since 2019-09-15 14:04:42
 */
@SuppressWarnings("serial")
public class UserClassesDto extends BaseDto {

	private String classes;
	
	private String collgeName;
	
	private String education;
	
	private String isUse;
	
	private String owners;
	
	private String professionalName;
	
	private Date schoolEndTime;
	
	private String schoolId;
	
	private String schoolName;
	
	private String schoolNum;
	
	private Date schoolStartTime;
	
	private String shoolJob;
	
	private String useEndTime;
	
	private String useStartTime;
	
	private String userId;
	
	private String departmentId;
	
	private String fieldId;
	
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

}
