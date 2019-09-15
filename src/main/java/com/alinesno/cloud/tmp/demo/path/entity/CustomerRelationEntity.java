package com.alinesno.cloud.tmp.demo.path.entity;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Entity;
import com.alinesno.cloud.common.core.orm.entity.BaseEntity;


/**
 * <p>
 * 客户关系表
 * </p>
 *
 * @author 罗小东
 * @since 2019-09-15 20:25:00
 */
@Entity
@Table(name="customer_relation")
public class CustomerRelationEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 所属客户
     */
	@Column(name="customer_id")
	private String customerId;
    /**
     * 客户关系
     */
	@Column(name="customer_relation")
	private String customerRelation;
    /**
     * 关系人名称
     */
	@Column(name="relation_person_name")
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


	@Override
	public String toString() {
		return "CustomerRelationEntity{" +
			"customerId=" + customerId +
			", customerRelation=" + customerRelation +
			", relationPersonName=" + relationPersonName +
			"}";
	}
}
