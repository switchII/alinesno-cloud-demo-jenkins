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
@Table(name="content_posts")
public class ContentPostsEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

	@Column(name="comment_count")
	private Integer commentCount;
	@Column(name="post_author")
	private String postAuthor;
	@Column(name="post_content")
	private String postContent;
	@Column(name="post_date")
	private Date postDate;
	@Column(name="post_mime_type")
	private String postMimeType;
	@Column(name="post_modifield")
	private Date postModifield;
	@Column(name="post_name")
	private String postName;
	@Column(name="post_password")
	private String postPassword;
	@Column(name="post_status")
	private Integer postStatus;
	@Column(name="post_title")
	private String postTitle;
	@Column(name="post_type")
	private String postType;
	@Column(name="to_ping")
	private String toPing;
	@Column(name="department_id")
	private String departmentId;
	@Column(name="field_id")
	private String fieldId;
	@Column(name="operator_id")
	private String operatorId;


	public Integer getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(Integer commentCount) {
		this.commentCount = commentCount;
	}

	public String getPostAuthor() {
		return postAuthor;
	}

	public void setPostAuthor(String postAuthor) {
		this.postAuthor = postAuthor;
	}

	public String getPostContent() {
		return postContent;
	}

	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}

	public Date getPostDate() {
		return postDate;
	}

	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}

	public String getPostMimeType() {
		return postMimeType;
	}

	public void setPostMimeType(String postMimeType) {
		this.postMimeType = postMimeType;
	}

	public Date getPostModifield() {
		return postModifield;
	}

	public void setPostModifield(Date postModifield) {
		this.postModifield = postModifield;
	}

	public String getPostName() {
		return postName;
	}

	public void setPostName(String postName) {
		this.postName = postName;
	}

	public String getPostPassword() {
		return postPassword;
	}

	public void setPostPassword(String postPassword) {
		this.postPassword = postPassword;
	}

	public Integer getPostStatus() {
		return postStatus;
	}

	public void setPostStatus(Integer postStatus) {
		this.postStatus = postStatus;
	}

	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	public String getPostType() {
		return postType;
	}

	public void setPostType(String postType) {
		this.postType = postType;
	}

	public String getToPing() {
		return toPing;
	}

	public void setToPing(String toPing) {
		this.toPing = toPing;
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
		return "ContentPostsEntity{" +
			"commentCount=" + commentCount +
			", postAuthor=" + postAuthor +
			", postContent=" + postContent +
			", postDate=" + postDate +
			", postMimeType=" + postMimeType +
			", postModifield=" + postModifield +
			", postName=" + postName +
			", postPassword=" + postPassword +
			", postStatus=" + postStatus +
			", postTitle=" + postTitle +
			", postType=" + postType +
			", toPing=" + toPing +
			", departmentId=" + departmentId +
			", fieldId=" + fieldId +
			", operatorId=" + operatorId +
			"}";
	}
}
