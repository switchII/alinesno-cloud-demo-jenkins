package com.alinesno.cloud.base.boot.feign.dto;

import com.alinesno.cloud.common.facade.feign.BaseDto;

/**
 * <p>参数配置表 传输对象</p>
 *
 * @author LuoAnDong
 * @since 2019-09-15 14:04:42
 */
@SuppressWarnings("serial")
public class ManagerSettingsDto extends BaseDto {

    /**
     * 参数名称
     */
	private String configName;
	
    /**
     * 参数键名
     */
	private String configKey;
	
    /**
     * 参数键值
     */
	private String configValue;
	
    /**
     * 系统内置（Y是 N否）
     */
	private String configType;
	
    /**
     * 备注
     */
	private String configRemark;
	
	private String departmentId;
	
	private String fieldId;
	
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

}
