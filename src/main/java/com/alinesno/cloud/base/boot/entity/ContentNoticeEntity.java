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
@Table(name="content_notice")
public class ContentNoticeEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

	@Column(name="notice_author")
	private String noticeAuthor;
	@Column(name="notice_content")
	private String noticeContent;
	@Column(name="notice_date")
	private Date noticeDate;
	@Column(name="notice_modifield")
	private Date noticeModifield;
	@Column(name="notice_name")
	private String noticeName;
	@Column(name="notice_password")
	private String noticePassword;
	@Column(name="notice_status")
	private Integer noticeStatus;
	@Column(name="notice_title")
	private String noticeTitle;
	@Column(name="notice_type")
	private String noticeType;
	@Column(name="department_id")
	private String departmentId;
	@Column(name="field_id")
	private String fieldId;
	@Column(name="operator_id")
	private String operatorId;


	public String getNoticeAuthor() {
		return noticeAuthor;
	}

	public void setNoticeAuthor(String noticeAuthor) {
		this.noticeAuthor = noticeAuthor;
	}

	public String getNoticeContent() {
		return noticeContent;
	}

	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}

	public Date getNoticeDate() {
		return noticeDate;
	}

	public void setNoticeDate(Date noticeDate) {
		this.noticeDate = noticeDate;
	}

	public Date getNoticeModifield() {
		return noticeModifield;
	}

	public void setNoticeModifield(Date noticeModifield) {
		this.noticeModifield = noticeModifield;
	}

	public String getNoticeName() {
		return noticeName;
	}

	public void setNoticeName(String noticeName) {
		this.noticeName = noticeName;
	}

	public String getNoticePassword() {
		return noticePassword;
	}

	public void setNoticePassword(String noticePassword) {
		this.noticePassword = noticePassword;
	}

	public Integer getNoticeStatus() {
		return noticeStatus;
	}

	public void setNoticeStatus(Integer noticeStatus) {
		this.noticeStatus = noticeStatus;
	}

	public String getNoticeTitle() {
		return noticeTitle;
	}

	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}

	public String getNoticeType() {
		return noticeType;
	}

	public void setNoticeType(String noticeType) {
		this.noticeType = noticeType;
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
		return "ContentNoticeEntity{" +
			"noticeAuthor=" + noticeAuthor +
			", noticeContent=" + noticeContent +
			", noticeDate=" + noticeDate +
			", noticeModifield=" + noticeModifield +
			", noticeName=" + noticeName +
			", noticePassword=" + noticePassword +
			", noticeStatus=" + noticeStatus +
			", noticeTitle=" + noticeTitle +
			", noticeType=" + noticeType +
			", departmentId=" + departmentId +
			", fieldId=" + fieldId +
			", operatorId=" + operatorId +
			"}";
	}
}
