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
@Table(name="content_links")
public class ContentLinksEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

	@Column(name="link_description")
	private String linkDescription;
	@Column(name="link_image")
	private String linkImage;
	@Column(name="link_name")
	private String linkName;
	@Column(name="link_notes")
	private String linkNotes;
	@Column(name="link_owner")
	private Long linkOwner;
	@Column(name="link_rating")
	private Integer linkRating;
	@Column(name="link_target")
	private String linkTarget;
	@Column(name="link_updated")
	private Date linkUpdated;
	@Column(name="link_url")
	private String linkUrl;
	@Column(name="link_visible")
	private String linkVisible;
	@Column(name="department_id")
	private String departmentId;
	@Column(name="field_id")
	private String fieldId;
	@Column(name="operator_id")
	private String operatorId;


	public String getLinkDescription() {
		return linkDescription;
	}

	public void setLinkDescription(String linkDescription) {
		this.linkDescription = linkDescription;
	}

	public String getLinkImage() {
		return linkImage;
	}

	public void setLinkImage(String linkImage) {
		this.linkImage = linkImage;
	}

	public String getLinkName() {
		return linkName;
	}

	public void setLinkName(String linkName) {
		this.linkName = linkName;
	}

	public String getLinkNotes() {
		return linkNotes;
	}

	public void setLinkNotes(String linkNotes) {
		this.linkNotes = linkNotes;
	}

	public Long getLinkOwner() {
		return linkOwner;
	}

	public void setLinkOwner(Long linkOwner) {
		this.linkOwner = linkOwner;
	}

	public Integer getLinkRating() {
		return linkRating;
	}

	public void setLinkRating(Integer linkRating) {
		this.linkRating = linkRating;
	}

	public String getLinkTarget() {
		return linkTarget;
	}

	public void setLinkTarget(String linkTarget) {
		this.linkTarget = linkTarget;
	}

	public Date getLinkUpdated() {
		return linkUpdated;
	}

	public void setLinkUpdated(Date linkUpdated) {
		this.linkUpdated = linkUpdated;
	}

	public String getLinkUrl() {
		return linkUrl;
	}

	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

	public String getLinkVisible() {
		return linkVisible;
	}

	public void setLinkVisible(String linkVisible) {
		this.linkVisible = linkVisible;
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
		return "ContentLinksEntity{" +
			"linkDescription=" + linkDescription +
			", linkImage=" + linkImage +
			", linkName=" + linkName +
			", linkNotes=" + linkNotes +
			", linkOwner=" + linkOwner +
			", linkRating=" + linkRating +
			", linkTarget=" + linkTarget +
			", linkUpdated=" + linkUpdated +
			", linkUrl=" + linkUrl +
			", linkVisible=" + linkVisible +
			", departmentId=" + departmentId +
			", fieldId=" + fieldId +
			", operatorId=" + operatorId +
			"}";
	}
}
