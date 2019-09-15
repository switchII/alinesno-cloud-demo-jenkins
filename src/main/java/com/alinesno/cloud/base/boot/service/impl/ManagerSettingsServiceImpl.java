package com.alinesno.cloud.base.boot.service.impl;

import com.alinesno.cloud.base.boot.entity.ManagerSettingsEntity;
import com.alinesno.cloud.base.boot.repository.ManagerSettingsRepository;
import com.alinesno.cloud.base.boot.service.IManagerSettingsService;
import com.alinesno.cloud.common.core.services.impl.IBaseServiceImpl;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p> 参数配置表 服务实现类 </p>
 *
 * @author LuoAnDong
 * @since 2019-09-15 14:04:42
 */
@Service
public class ManagerSettingsServiceImpl extends IBaseServiceImpl<ManagerSettingsRepository, ManagerSettingsEntity, String> implements IManagerSettingsService {

	//日志记录
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(ManagerSettingsServiceImpl.class);

}
