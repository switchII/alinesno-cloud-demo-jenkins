package com.alinesno.cloud.tmp.demo.path.service.impl;

import com.alinesno.cloud.tmp.demo.path.entity.CustomerRelationEntity;
import com.alinesno.cloud.tmp.demo.path.repository.CustomerRelationRepository;
import com.alinesno.cloud.tmp.demo.path.service.ICustomerRelationService;
import com.alinesno.cloud.common.core.services.impl.IBaseServiceImpl;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p> 客户关系表 服务实现类 </p>
 *
 * @author 罗小东
 * @since 2019-09-15 20:25:00
 */
@Service
public class CustomerRelationServiceImpl extends IBaseServiceImpl<CustomerRelationRepository, CustomerRelationEntity, String> implements ICustomerRelationService {

	//日志记录
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(CustomerRelationServiceImpl.class);

}
