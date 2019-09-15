package com.alinesno.cloud.base.boot.entity;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Entity;
import com.alinesno.cloud.common.core.orm.entity.BaseEntity;


/**
 * <p>
 * 参数配置表
 * </p>
 *
 * @author LuoAnDong
 * @since 2019-09-15 14:04:42
 */
@Entity
@Table(name="manager_settings")
public class ManagerSettingsEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 参数名称
     */
	@Column(name="config_name")
	private String configName;
    /**
     * 参数键名
     */
	@Column(name="config_key")
	private String configKey;
    /**
     * 参数键值
     */
	@Column(name="config_value")
	private String configValue;
    /**
     * 系统内置（Y是 N否）
     */
	@Column(name="config_type")
	private String configType;
    /**
     * 备注
     */
	@Column(name="config_remark")
	private String configRemark;
	@Column(name="department_id")
	private String departmentId;
	@Column(name="field_id")
	private String fieldId;
	@Column(name="operator_id")
	private String operatorId;


	public String getConfigName() {
		return configName;
	}

	public void setConfigName(String configName) {
		this.configName = configName;
	}

	public String getConfigKey() {
		return configKey;
	}

	public void setConfigKey(String configKey) {
		this.configKey = configKey;
	}

	public String getConfigValue() {
		return configValue;
	}

	public void setConfigValue(String configValue) {
		this.configValue = configValue;
	}

	public String getConfigType() {
		return configType;
	}

	public void setConfigType(String configType) {
		this.configType = configType;
	}

	public String getConfigRemark() {
		return configRemark;
	}

	public void setConfigRemark(String configRemark) {
		this.configRemark = configRemark;
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
		return "ManagerSettingsEntity{" +
			"configName=" + configName +
			", configKey=" + configKey +
			", configValue=" + configValue +
			", configType=" + configType +
			", configRemark=" + configRemark +
			", departmentId=" + departmentId +
			", fieldId=" + fieldId +
			", operatorId=" + operatorId +
			"}";
	}
}
