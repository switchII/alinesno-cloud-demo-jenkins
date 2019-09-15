package com.alinesno.cloud.tmp.demo.path.service.impl;

import com.alinesno.cloud.tmp.demo.path.entity.CustomerInfoEntity;
import com.alinesno.cloud.tmp.demo.path.repository.CustomerInfoRepository;
import com.alinesno.cloud.tmp.demo.path.service.ICustomerInfoService;
import com.alinesno.cloud.common.core.services.impl.IBaseServiceImpl;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p> 客户信息表 服务实现类 </p>
 *
 * @author 罗小东
 * @since 2019-09-15 20:25:00
 */
@Service
public class CustomerInfoServiceImpl extends IBaseServiceImpl<CustomerInfoRepository, CustomerInfoEntity, String> implements ICustomerInfoService {

	//日志记录
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(CustomerInfoServiceImpl.class);

}
