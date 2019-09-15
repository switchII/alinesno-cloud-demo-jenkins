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
@Table(name="manager_tenant_log")
public class ManagerTenantLogEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

	@Column(name="action_type")
	private String actionType;
	@Column(name="end_time")
	private Date endTime;
	@Column(name="log_business_id")
	private String logBusinessId;
	@Column(name="log_channel")
	private String logChannel;
	@Column(name="log_content")
	private String logContent;
	@Column(name="log_ip")
	private String logIp;
	@Column(name="log_machine")
	private String logMachine;
	@Column(name="department_id")
	private String departmentId;
	@Column(name="field_id")
	private String fieldId;
	@Column(name="operator_id")
	private String operatorId;


	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getLogBusinessId() {
		return logBusinessId;
	}

	public void setLogBusinessId(String logBusinessId) {
		this.logBusinessId = logBusinessId;
	}

	public String getLogChannel() {
		return logChannel;
	}

	public void setLogChannel(String logChannel) {
		this.logChannel = logChannel;
	}

	public String getLogContent() {
		return logContent;
	}

	public void setLogContent(String logContent) {
		this.logContent = logContent;
	}

	public String getLogIp() {
		return logIp;
	}

	public void setLogIp(String logIp) {
		this.logIp = logIp;
	}

	public String getLogMachine() {
		return logMachine;
	}

	public void setLogMachine(String logMachine) {
		this.logMachine = logMachine;
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
		return "ManagerTenantLogEntity{" +
			"actionType=" + actionType +
			", endTime=" + endTime +
			", logBusinessId=" + logBusinessId +
			", logChannel=" + logChannel +
			", logContent=" + logContent +
			", logIp=" + logIp +
			", logMachine=" + logMachine +
			", departmentId=" + departmentId +
			", fieldId=" + fieldId +
			", operatorId=" + operatorId +
			"}";
	}
}
