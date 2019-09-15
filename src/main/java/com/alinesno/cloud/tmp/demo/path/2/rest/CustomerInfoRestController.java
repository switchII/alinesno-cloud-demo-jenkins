package com.alinesno.cloud.tmp.demo.path.2.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import com.alinesno.cloud.common.core.constants.SpringInstanceScope;

import com.alinesno.cloud.tmp.demo.path.2.entity.CustomerInfoEntity;
import com.alinesno.cloud.tmp.demo.path.2.service.ICustomerInfoService;
import org.springframework.web.bind.annotation.RestController;
import com.alinesno.cloud.common.core.rest.BaseRestController;

/**
 * <p>客户信息表 接口 </p>
 *
 * @author 罗小东
 * @since 2019-09-15 20:52:37
 */
@Scope(SpringInstanceScope.PROTOTYPE)
@RestController
@RequestMapping("customerInfo")
public class CustomerInfoRestController extends BaseRestController<CustomerInfoEntity , ICustomerInfoService> {

	//日志记录
	@SuppressWarnings("unused")
	private final static Logger log = LoggerFactory.getLogger(CustomerInfoRestController.class);

}
