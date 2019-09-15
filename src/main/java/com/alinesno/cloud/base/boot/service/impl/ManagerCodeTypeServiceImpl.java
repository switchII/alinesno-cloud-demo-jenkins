package com.alinesno.cloud.base.boot.service.impl;

import com.alinesno.cloud.base.boot.entity.ManagerCodeTypeEntity;
import com.alinesno.cloud.base.boot.repository.ManagerCodeTypeRepository;
import com.alinesno.cloud.base.boot.service.IManagerCodeTypeService;
import com.alinesno.cloud.common.core.services.impl.IBaseServiceImpl;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>  服务实现类 </p>
 *
 * @author LuoAnDong
 * @since 2019-09-15 14:04:42
 */
@Service
public class ManagerCodeTypeServiceImpl extends IBaseServiceImpl<ManagerCodeTypeRepository, ManagerCodeTypeEntity, String> implements IManagerCodeTypeService {

	//日志记录
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(ManagerCodeTypeServiceImpl.class);

}
