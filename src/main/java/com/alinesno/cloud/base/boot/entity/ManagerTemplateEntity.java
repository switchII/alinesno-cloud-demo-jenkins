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
@Table(name="manager_template")
public class ManagerTemplateEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

	@Column(name="resource_id")
	private String resourceId;
	@Column(name="template_addtime")
	private Date templateAddtime;
	@Column(name="template_content")
	private String templateContent;
	@Column(name="template_data")
	private String templateData;
	@Column(name="template_name")
	private String templateName;
	@Column(name="template_owner")
	private String templateOwner;
	@Column(name="template_status")
	private String templateStatus;
	@Column(name="department_id")
	private String departmentId;
	@Column(name="field_id")
	private String fieldId;
	@Column(name="operator_id")
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


	@Override
	public String toString() {
		return "ManagerTemplateEntity{" +
			"resourceId=" + resourceId +
			", templateAddtime=" + templateAddtime +
			", templateContent=" + templateContent +
			", templateData=" + templateData +
			", templateName=" + templateName +
			", templateOwner=" + templateOwner +
			", templateStatus=" + templateStatus +
			", departmentId=" + departmentId +
			", fieldId=" + fieldId +
			", operatorId=" + operatorId +
			"}";
	}
}
