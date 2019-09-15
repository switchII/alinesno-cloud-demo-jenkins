package com.alinesno.cloud.tmp.demo.path.2.service.impl;

import com.alinesno.cloud.tmp.demo.path.2.entity.CustomerInfoEntity;
import com.alinesno.cloud.tmp.demo.path.2.repository.CustomerInfoRepository;
import com.alinesno.cloud.tmp.demo.path.2.service.ICustomerInfoService;
import com.alinesno.cloud.common.core.services.impl.IBaseServiceImpl;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p> 客户信息表 服务实现类 </p>
 *
 * @author 罗小东
 * @since 2019-09-15 20:52:37
 */
@Service
public class CustomerInfoServiceImpl extends IBaseServiceImpl<CustomerInfoRepository, CustomerInfoEntity, String> implements ICustomerInfoService {

	//日志记录
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(CustomerInfoServiceImpl.class);

}
