package com.alinesno.cloud.base.boot.entity;

import javax.persistence.Column;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Table;
import javax.persistence.Entity;
import com.alinesno.cloud.common.core.orm.entity.BaseEntity;


/**
 * <p>
 * 区域表
 * </p>
 *
 * @author LuoAnDong
 * @since 2019-09-15 14:04:42
 */
@Entity
@Table(name="info_address")
public class InfoAddressEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 父ID
     */
	@Column(name="parent_id")
	private Long parentId;
    /**
     * 区域名称
     */
	@Column(name="district_name")
	private String districtName;
    /**
     * 简称
     */
	@Column(name="short_name")
	private String shortName;
    /**
     * 经度
     */
	private BigDecimal longitude;
    /**
     * 维度
     */
	private BigDecimal latitude;
    /**
     * 等级
     */
	private Integer level;
    /**
     * 排序
     */
	private Integer sort;
    /**
     * 删除标志: 0未删除，1已删除
     */
	@Column(name="is_deleted")
	private Integer isDeleted;
    /**
     * 创建时间
     */
	@Column(name="create_time")
	private Date createTime;
	@Column(name="department_id")
	private String departmentId;
	@Column(name="field_id")
	private String fieldId;
	@Column(name="operator_id")
	private String operatorId;


	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public BigDecimal getLongitude() {
		return longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	public BigDecimal getLatitude() {
		return latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Integer getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Integer isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
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
		return "InfoAddressEntity{" +
			"parentId=" + parentId +
			", districtName=" + districtName +
			", shortName=" + shortName +
			", longitude=" + longitude +
			", latitude=" + latitude +
			", level=" + level +
			", sort=" + sort +
			", isDeleted=" + isDeleted +
			", createTime=" + createTime +
			", departmentId=" + departmentId +
			", fieldId=" + fieldId +
			", operatorId=" + operatorId +
			"}";
	}
}
