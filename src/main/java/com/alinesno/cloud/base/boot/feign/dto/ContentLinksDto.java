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
public class ContentLinksDto extends BaseDto {

	private String linkDescription;
	
	private String linkImage;
	
	private String linkName;
	
	private String linkNotes;
	
	private Long linkOwner;
	
	private Integer linkRating;
	
	private String linkTarget;
	
	private Date linkUpdated;
	
	private String linkUrl;
	
	private String linkVisible;
	
	private String departmentId;
	
	private String fieldId;
	
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

}
