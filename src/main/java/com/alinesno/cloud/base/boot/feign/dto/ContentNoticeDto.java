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
public class ContentNoticeDto extends BaseDto {

	private String noticeAuthor;
	
	private String noticeContent;
	
	private Date noticeDate;
	
	private Date noticeModifield;
	
	private String noticeName;
	
	private String noticePassword;
	
	private Integer noticeStatus;
	
	private String noticeTitle;
	
	private String noticeType;
	
	private String departmentId;
	
	private String fieldId;
	
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

}
