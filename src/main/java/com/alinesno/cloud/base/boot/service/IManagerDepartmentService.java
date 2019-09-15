package com.alinesno.cloud.base.boot.service;

import org.springframework.data.repository.NoRepositoryBean;
import com.alinesno.cloud.base.boot.entity.ManagerDepartmentEntity;
import com.alinesno.cloud.common.core.services.IBaseService;
import com.alinesno.cloud.base.boot.repository.ManagerDepartmentRepository;

/**
 * <p>  服务类 </p>
 *
 * @author LuoAnDong
 * @since 2019-09-15 14:04:42
 */
@NoRepositoryBean
public interface IManagerDepartmentService extends IBaseService<ManagerDepartmentRepository, ManagerDepartmentEntity, String> {

}
