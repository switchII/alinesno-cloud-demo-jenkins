package com.alinesno.cloud.base.boot.service.impl;

import com.alinesno.cloud.base.boot.entity.ManagerSearchEntity;
import com.alinesno.cloud.base.boot.repository.ManagerSearchRepository;
import com.alinesno.cloud.base.boot.service.IManagerSearchService;
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
public class ManagerSearchServiceImpl extends IBaseServiceImpl<ManagerSearchRepository, ManagerSearchEntity, String> implements IManagerSearchService {

	//日志记录
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(ManagerSearchServiceImpl.class);

}
