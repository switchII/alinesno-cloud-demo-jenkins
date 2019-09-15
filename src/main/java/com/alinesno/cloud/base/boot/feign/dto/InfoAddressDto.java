package com.alinesno.cloud.base.boot.feign.dto;

import com.alinesno.cloud.common.facade.feign.BaseDto;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>区域表 传输对象</p>
 *
 * @author LuoAnDong
 * @since 2019-09-15 14:04:42
 */
@SuppressWarnings("serial")
public class InfoAddressDto extends BaseDto {

    /**
     * 父ID
     */
	private Long parentId;
	
    /**
     * 区域名称
     */
	private String districtName;
	
    /**
     * 简称
     */
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
	private Integer isDeleted;
	
    /**
     * 创建时间
     */
	private Date createTime;
	
	private String departmentId;
	
	private String fieldId;
	
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

}
