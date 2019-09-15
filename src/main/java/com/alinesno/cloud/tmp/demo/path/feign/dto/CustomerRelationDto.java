package com.alinesno.cloud.tmp.demo.path.feign.dto;

import com.alinesno.cloud.common.facade.feign.BaseDto;

/**
 * <p>客户关系表 传输对象</p>
 *
 * @author 罗小东
 * @since 2019-09-15 20:25:00
 */
@SuppressWarnings("serial")
public class CustomerRelationDto extends BaseDto {

    /**
     * 所属客户
     */
	private String customerId;
	
    /**
     * 客户关系
     */
	private String customerRelation;
	
    /**
     * 关系人名称
     */
	private String relationPersonName;
	


	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerRelation() {
		return customerRelation;
	}

	public void setCustomerRelation(String customerRelation) {
		this.customerRelation = customerRelation;
	}

	public String getRelationPersonName() {
		return relationPersonName;
	}

	public void setRelationPersonName(String relationPersonName) {
		this.relationPersonName = relationPersonName;
	}

}
