package com.alinesno.cloud.tmp.demo.path.2.feign.dto;

import com.alinesno.cloud.common.facade.feign.BaseDto;

/**
 * <p>客户信息表 传输对象</p>
 *
 * @author 罗小东
 * @since 2019-09-15 20:52:37
 */
@SuppressWarnings("serial")
public class CustomerInfoDto extends BaseDto {

    /**
     * 客户名称
     */
	private String customerName;
	
    /**
     * 所在公司
     */
	private String company;
	
    /**
     * 客户电话
     */
	private String phone;
	
    /**
     * 联系人职位
     */
	private String personPosition;
	
    /**
     * 电子邮箱
     */
	private String email;
	
	private String customerName;
	
	private String personPosition;
	


	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPersonPosition() {
		return personPosition;
	}

	public void setPersonPosition(String personPosition) {
		this.personPosition = personPosition;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPersonPosition() {
		return personPosition;
	}

	public void setPersonPosition(String personPosition) {
		this.personPosition = personPosition;
	}

}
