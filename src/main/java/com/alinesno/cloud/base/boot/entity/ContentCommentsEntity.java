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
@Table(name="content_comments")
public class ContentCommentsEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

	@Column(name="comment_author")
	private String commentAuthor;
	@Column(name="comment_author_email")
	private String commentAuthorEmail;
	@Column(name="comment_author_ip")
	private String commentAuthorIp;
	@Column(name="comment_author_url")
	private String commentAuthorUrl;
	@Column(name="comment_content")
	private String commentContent;
	@Column(name="comment_date")
	private Date commentDate;
	@Column(name="comment_date_gmt")
	private Date commentDateGmt;
	@Column(name="comment_post_id")
	private Long commentPostId;
	@Column(name="user_id")
	private Long userId;
	@Column(name="department_id")
	private String departmentId;
	@Column(name="field_id")
	private String fieldId;
	@Column(name="operator_id")
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


	@Override
	public String toString() {
		return "ContentCommentsEntity{" +
			"commentAuthor=" + commentAuthor +
			", commentAuthorEmail=" + commentAuthorEmail +
			", commentAuthorIp=" + commentAuthorIp +
			", commentAuthorUrl=" + commentAuthorUrl +
			", commentContent=" + commentContent +
			", commentDate=" + commentDate +
			", commentDateGmt=" + commentDateGmt +
			", commentPostId=" + commentPostId +
			", userId=" + userId +
			", departmentId=" + departmentId +
			", fieldId=" + fieldId +
			", operatorId=" + operatorId +
			"}";
	}
}
