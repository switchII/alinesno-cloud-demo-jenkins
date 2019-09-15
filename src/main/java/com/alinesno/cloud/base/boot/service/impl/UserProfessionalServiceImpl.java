package com.alinesno.cloud.base.boot.service.impl;

import com.alinesno.cloud.base.boot.entity.UserProfessionalEntity;
import com.alinesno.cloud.base.boot.repository.UserProfessionalRepository;
import com.alinesno.cloud.base.boot.service.IUserProfessionalService;
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
public class UserProfessionalServiceImpl extends IBaseServiceImpl<UserProfessionalRepository, UserProfessionalEntity, String> implements IUserProfessionalService {

	//日志记录
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(UserProfessionalServiceImpl.class);

}
