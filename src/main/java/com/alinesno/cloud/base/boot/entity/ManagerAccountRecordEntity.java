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
@Table(name="manager_account_record")
public class ManagerAccountRecordEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

	@Column(name="account_id")
	private String accountId;
	@Column(name="account_name")
	private String accountName;
	private String agent;
	@Column(name="create_time")
	private Date createTime;
	private String ip;
	@Column(name="login_name")
	private String loginName;
	private String method;
	@Column(name="method_desc")
	private String methodDesc;
	@Column(name="method_time")
	private Long methodTime;
	private String operation;
	private String params;
	@Column(name="role_power")
	private String rolePower;
	private String url;
	@Column(name="record_type")
	private String recordType;
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

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAgent() {
		return agent;
	}

	public void setAgent(String agent) {
		this.agent = agent;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getMethodDesc() {
		return methodDesc;
	}

	public void setMethodDesc(String methodDesc) {
		this.methodDesc = methodDesc;
	}

	public Long getMethodTime() {
		return methodTime;
	}

	public void setMethodTime(Long methodTime) {
		this.methodTime = methodTime;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getParams() {
		return params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public String getRolePower() {
		return rolePower;
	}

	public void setRolePower(String rolePower) {
		this.rolePower = rolePower;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getRecordType() {
		return recordType;
	}

	public void setRecordType(String recordType) {
		this.recordType = recordType;
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
		return "ManagerAccountRecordEntity{" +
			"accountId=" + accountId +
			", accountName=" + accountName +
			", agent=" + agent +
			", createTime=" + createTime +
			", ip=" + ip +
			", loginName=" + loginName +
			", method=" + method +
			", methodDesc=" + methodDesc +
			", methodTime=" + methodTime +
			", operation=" + operation +
			", params=" + params +
			", rolePower=" + rolePower +
			", url=" + url +
			", recordType=" + recordType +
			", departmentId=" + departmentId +
			", fieldId=" + fieldId +
			", operatorId=" + operatorId +
			"}";
	}
}
