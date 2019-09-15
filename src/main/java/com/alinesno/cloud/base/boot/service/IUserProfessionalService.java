package com.alinesno.cloud.base.boot.service;

import org.springframework.data.repository.NoRepositoryBean;
import com.alinesno.cloud.base.boot.entity.UserProfessionalEntity;
import com.alinesno.cloud.common.core.services.IBaseService;
import com.alinesno.cloud.base.boot.repository.UserProfessionalRepository;

/**
 * <p>  服务类 </p>
 *
 * @author LuoAnDong
 * @since 2019-09-15 14:04:42
 */
@NoRepositoryBean
public interface IUserProfessionalService extends IBaseService<UserProfessionalRepository, UserProfessionalEntity, String> {

}
