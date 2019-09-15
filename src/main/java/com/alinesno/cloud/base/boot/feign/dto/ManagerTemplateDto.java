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
public class ManagerTemplateDto extends BaseDto {

	private String resourceId;
	
	private Date templateAddtime;
	
	private String templateContent;
	
	private String templateData;
	
	private String templateName;
	
	private String templateOwner;
	
	private String templateStatus;
	
	private String departmentId;
	
	private String fieldId;
	
	private String operatorId;
	


	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public Date getTemplateAddtime() {
		return templateAddtime;
	}

	public void setTemplateAddtime(Date templateAddtime) {
		this.templateAddtime = templateAddtime;
	}

	public String getTemplateContent() {
		return templateContent;
	}

	public void setTemplateContent(String templateContent) {
		this.templateContent = templateContent;
	}

	public String getTemplateData() {
		return templateData;
	}

	public void setTemplateData(String templateData) {
		this.templateData = templateData;
	}

	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public String getTemplateOwner() {
		return templateOwner;
	}

	public void setTemplateOwner(String templateOwner) {
		this.templateOwner = templateOwner;
	}

	public String getTemplateStatus() {
		return templateStatus;
	}

	public void setTemplateStatus(String templateStatus) {
		this.templateStatus = templateStatus;
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
