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
@Table(name="user_info")
public class UserInfoEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

	@Column(name="account_id")
	private String accountId;
	@Column(name="avatar_head")
	private String avatarHead;
	private Date birthday;
	private String classes;
	@Column(name="collge_name")
	private String collgeName;
	@Column(name="company_dept")
	private String companyDept;
	@Column(name="company_name")
	private String companyName;
	private String education;
	private String email;
	@Column(name="english_name")
	private String englishName;
	private String facsimile;
	@Column(name="group_name")
	private String groupName;
	@Column(name="home_address")
	private String homeAddress;
	@Column(name="home_city")
	private String homeCity;
	@Column(name="job_name")
	private String jobName;
	@Column(name="living_adress")
	private String livingAdress;
	@Column(name="living_city")
	private String livingCity;
	@Column(name="main_connection")
	private String mainConnection;
	private String mobile;
	@Column(name="native_address")
	private String nativeAddress;
	private String owners;
	@Column(name="parent_father")
	private String parentFather;
	@Column(name="parent_mother")
	private String parentMother;
	private String phone;
	@Column(name="professional_name")
	private String professionalName;
	private String qq;
	@Column(name="really_name")
	private String reallyName;
	@Column(name="regist_ip")
	private String registIp;
	@Column(name="regist_source")
	private String registSource;
	private String remark;
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
	private Integer sex;
	@Column(name="shool_job")
	private String shoolJob;
	@Column(name="user_code")
	private String userCode;
	@Column(name="user_height")
	private String userHeight;
	@Column(name="user_name")
	private String userName;
	@Column(name="user_status")
	private String userStatus;
	private String wechat;
	private String weibo;
	@Column(name="department_id")
	private String departmentId;
	@Column(name="field_id")
	private String fieldId;
	@Column(name="operator_id")
	private String operatorId;


	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAvatarHead() {
		return avatarHead;
	}

	public void setAvatarHead(String avatarHead) {
		this.avatarHead = avatarHead;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

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

	public String getCompanyDept() {
		return companyDept;
	}

	public void setCompanyDept(String companyDept) {
		this.companyDept = companyDept;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEnglishName() {
		return englishName;
	}

	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}

	public String getFacsimile() {
		return facsimile;
	}

	public void setFacsimile(String facsimile) {
		this.facsimile = facsimile;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public String getHomeCity() {
		return homeCity;
	}

	public void setHomeCity(String homeCity) {
		this.homeCity = homeCity;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getLivingAdress() {
		return livingAdress;
	}

	public void setLivingAdress(String livingAdress) {
		this.livingAdress = livingAdress;
	}

	public String getLivingCity() {
		return livingCity;
	}

	public void setLivingCity(String livingCity) {
		this.livingCity = livingCity;
	}

	public String getMainConnection() {
		return mainConnection;
	}

	public void setMainConnection(String mainConnection) {
		this.mainConnection = mainConnection;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getNativeAddress() {
		return nativeAddress;
	}

	public void setNativeAddress(String nativeAddress) {
		this.nativeAddress = nativeAddress;
	}

	public String getOwners() {
		return owners;
	}

	public void setOwners(String owners) {
		this.owners = owners;
	}

	public String getParentFather() {
		return parentFather;
	}

	public void setParentFather(String parentFather) {
		this.parentFather = parentFather;
	}

	public String getParentMother() {
		return parentMother;
	}

	public void setParentMother(String parentMother) {
		this.parentMother = parentMother;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getProfessionalName() {
		return professionalName;
	}

	public void setProfessionalName(String professionalName) {
		this.professionalName = professionalName;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getReallyName() {
		return reallyName;
	}

	public void setReallyName(String reallyName) {
		this.reallyName = reallyName;
	}

	public String getRegistIp() {
		return registIp;
	}

	public void setRegistIp(String registIp) {
		this.registIp = registIp;
	}

	public String getRegistSource() {
		return registSource;
	}

	public void setRegistSource(String registSource) {
		this.registSource = registSource;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getShoolJob() {
		return shoolJob;
	}

	public void setShoolJob(String shoolJob) {
		this.shoolJob = shoolJob;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getUserHeight() {
		return userHeight;
	}

	public void setUserHeight(String userHeight) {
		this.userHeight = userHeight;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public String getWechat() {
		return wechat;
	}

	public void setWechat(String wechat) {
		this.wechat = wechat;
	}

	public String getWeibo() {
		return weibo;
	}

	public void setWeibo(String weibo) {
		this.weibo = weibo;
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
		return "UserInfoEntity{" +
			"accountId=" + accountId +
			", avatarHead=" + avatarHead +
			", birthday=" + birthday +
			", classes=" + classes +
			", collgeName=" + collgeName +
			", companyDept=" + companyDept +
			", companyName=" + companyName +
			", education=" + education +
			", email=" + email +
			", englishName=" + englishName +
			", facsimile=" + facsimile +
			", groupName=" + groupName +
			", homeAddress=" + homeAddress +
			", homeCity=" + homeCity +
			", jobName=" + jobName +
			", livingAdress=" + livingAdress +
			", livingCity=" + livingCity +
			", mainConnection=" + mainConnection +
			", mobile=" + mobile +
			", nativeAddress=" + nativeAddress +
			", owners=" + owners +
			", parentFather=" + parentFather +
			", parentMother=" + parentMother +
			", phone=" + phone +
			", professionalName=" + professionalName +
			", qq=" + qq +
			", reallyName=" + reallyName +
			", registIp=" + registIp +
			", registSource=" + registSource +
			", remark=" + remark +
			", schoolEndTime=" + schoolEndTime +
			", schoolId=" + schoolId +
			", schoolName=" + schoolName +
			", schoolNum=" + schoolNum +
			", schoolStartTime=" + schoolStartTime +
			", sex=" + sex +
			", shoolJob=" + shoolJob +
			", userCode=" + userCode +
			", userHeight=" + userHeight +
			", userName=" + userName +
			", userStatus=" + userStatus +
			", wechat=" + wechat +
			", weibo=" + weibo +
			", departmentId=" + departmentId +
			", fieldId=" + fieldId +
			", operatorId=" + operatorId +
			"}";
	}
}
