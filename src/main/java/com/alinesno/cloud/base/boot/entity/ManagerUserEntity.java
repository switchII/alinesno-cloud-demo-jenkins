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
@Table(name="manager_user")
public class ManagerUserEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

	@Column(name="user_account")
	private String userAccount;
	@Column(name="user_addtime")
	private Date userAddtime;
	@Column(name="user_password")
	private String userPassword;
	@Column(name="user_role")
	private String userRole;
	@Column(name="user_salt")
	private String userSalt;
	@Column(name="user_status")
	private Boolean userStatus;
	@Column(name="user_title")
	private String userTitle;
	@Column(name="user_type")
	private Boolean userType;
	@Column(name="user_name")
	private String userName;
	@Column(name="department_id")
	private String departmentId;
	@Column(name="field_id")
	private String fieldId;
	@Column(name="operator_id")
	private String operatorId;


	public String getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	public Date getUserAddtime() {
		return userAddtime;
	}

	public void setUserAddtime(Date userAddtime) {
		this.userAddtime = userAddtime;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getUserSalt() {
		return userSalt;
	}

	public void setUserSalt(String userSalt) {
		this.userSalt = userSalt;
	}

	public Boolean isUserStatus() {
		return userStatus;
	}

	public void setUserStatus(Boolean userStatus) {
		this.userStatus = userStatus;
	}

	public String getUserTitle() {
		return userTitle;
	}

	public void setUserTitle(String userTitle) {
		this.userTitle = userTitle;
	}

	public Boolean isUserType() {
		return userType;
	}

	public void setUserType(Boolean userType) {
		this.userType = userType;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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
		return "ManagerUserEntity{" +
			"userAccount=" + userAccount +
			", userAddtime=" + userAddtime +
			", userPassword=" + userPassword +
			", userRole=" + userRole +
			", userSalt=" + userSalt +
			", userStatus=" + userStatus +
			", userTitle=" + userTitle +
			", userType=" + userType +
			", userName=" + userName +
			", departmentId=" + departmentId +
			", fieldId=" + fieldId +
			", operatorId=" + operatorId +
			"}";
	}
}
