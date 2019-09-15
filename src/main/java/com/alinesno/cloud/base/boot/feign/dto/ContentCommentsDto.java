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
public class ContentCommentsDto extends BaseDto {

	private String commentAuthor;
	
	private String commentAuthorEmail;
	
	private String commentAuthorIp;
	
	private String commentAuthorUrl;
	
	private String commentContent;
	
	private Date commentDate;
	
	private Date commentDateGmt;
	
	private Long commentPostId;
	
	private Long userId;
	
	private String departmentId;
	
	private String fieldId;
	
	private String operatorId;
	


	public String getCommentAuthor() {
		return commentAuthor;
	}

	public void setCommentAuthor(String commentAuthor) {
		this.commentAuthor = commentAuthor;
	}

	public String getCommentAuthorEmail() {
		return commentAuthorEmail;
	}

	public void setCommentAuthorEmail(String commentAuthorEmail) {
		this.commentAuthorEmail = commentAuthorEmail;
	}

	public String getCommentAuthorIp() {
		return commentAuthorIp;
	}

	public void setCommentAuthorIp(String commentAuthorIp) {
		this.commentAuthorIp = commentAuthorIp;
	}

	public String getCommentAuthorUrl() {
		return commentAuthorUrl;
	}

	public void setCommentAuthorUrl(String commentAuthorUrl) {
		this.commentAuthorUrl = commentAuthorUrl;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public Date getCommentDate() {
		return commentDate;
	}

	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}

	public Date getCommentDateGmt() {
		return commentDateGmt;
	}

	public void setCommentDateGmt(Date commentDateGmt) {
		this.commentDateGmt = commentDateGmt;
	}

	public Long getCommentPostId() {
		return commentPostId;
	}

	public void setCommentPostId(Long commentPostId) {
		this.commentPostId = commentPostId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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
