package com.alinesno.cloud.tmp.demo.path.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import com.alinesno.cloud.common.core.constants.SpringInstanceScope;

import com.alinesno.cloud.tmp.demo.path.entity.CustomerRelationEntity;
import com.alinesno.cloud.tmp.demo.path.service.ICustomerRelationService;
import org.springframework.web.bind.annotation.RestController;
import com.alinesno.cloud.common.core.rest.BaseRestController;

/**
 * <p>客户关系表 接口 </p>
 *
 * @author 罗小东
 * @since 2019-09-15 20:25:00
 */
@Scope(SpringInstanceScope.PROTOTYPE)
@RestController
@RequestMapping("customerRelation")
public class CustomerRelationRestController extends BaseRestController<CustomerRelationEntity , ICustomerRelationService> {

	//日志记录
	@SuppressWarnings("unused")
	private final static Logger log = LoggerFactory.getLogger(CustomerRelationRestController.class);

}
