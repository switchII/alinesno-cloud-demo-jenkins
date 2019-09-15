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
@Table(name="manager_tenant")
public class ManagerTenantEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

	@Column(name="city_id")
	private String cityId;
	@Column(name="end_time")
	private Date endTime;
	@Column(name="province_id")
	private String provinceId;
	@Column(name="start_time")
	private Date startTime;
	@Column(name="tenant_account")
	private String tenantAccount;
	@Column(name="tenant_address")
	private String tenantAddress;
	@Column(name="tenant_cost")
	private Integer tenantCost;
	@Column(name="tenant_name")
	private String tenantName;
	@Column(name="tenant_phone")
	private String tenantPhone;
	@Column(name="tenant_status")
	private String tenantStatus;
	@Column(name="department_id")
	private String departmentId;
	@Column(name="field_id")
	private String fieldId;
	@Column(name="operator_id")
	private String operatorId;


	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getTenantAccount() {
		return tenantAccount;
	}

	public void setTenantAccount(String tenantAccount) {
		this.tenantAccount = tenantAccount;
	}

	public String getTenantAddress() {
		return tenantAddress;
	}

	public void setTenantAddress(String tenantAddress) {
		this.tenantAddress = tenantAddress;
	}

	public Integer getTenantCost() {
		return tenantCost;
	}

	public void setTenantCost(Integer tenantCost) {
		this.tenantCost = tenantCost;
	}

	public String getTenantName() {
		return tenantName;
	}

	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}

	public String getTenantPhone() {
		return tenantPhone;
	}

	public void setTenantPhone(String tenantPhone) {
		this.tenantPhone = tenantPhone;
	}

	public String getTenantStatus() {
		return tenantStatus;
	}

	public void setTenantStatus(String tenantStatus) {
		this.tenantStatus = tenantStatus;
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
		return "ManagerTenantEntity{" +
			"cityId=" + cityId +
			", endTime=" + endTime +
			", provinceId=" + provinceId +
			", startTime=" + startTime +
			", tenantAccount=" + tenantAccount +
			", tenantAddress=" + tenantAddress +
			", tenantCost=" + tenantCost +
			", tenantName=" + tenantName +
			", tenantPhone=" + tenantPhone +
			", tenantStatus=" + tenantStatus +
			", departmentId=" + departmentId +
			", fieldId=" + fieldId +
			", operatorId=" + operatorId +
			"}";
	}
}
