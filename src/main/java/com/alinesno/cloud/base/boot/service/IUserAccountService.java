package com.alinesno.cloud.base.boot.service;

import org.springframework.data.repository.NoRepositoryBean;
import com.alinesno.cloud.base.boot.entity.UserAccountEntity;
import com.alinesno.cloud.common.core.services.IBaseService;
import com.alinesno.cloud.base.boot.repository.UserAccountRepository;

/**
 * <p>  服务类 </p>
 *
 * @author LuoAnDong
 * @since 2019-09-15 14:04:42
 */
@NoRepositoryBean
public interface IUserAccountService extends IBaseService<UserAccountRepository, UserAccountEntity, String> {

}
