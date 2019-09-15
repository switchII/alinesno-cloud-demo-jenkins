package com.alinesno.cloud.tmp.demo.path.2.service;

import org.springframework.data.repository.NoRepositoryBean;
import com.alinesno.cloud.tmp.demo.path.2.entity.CustomerRelationEntity;
import com.alinesno.cloud.common.core.services.IBaseService;
import com.alinesno.cloud.tmp.demo.path.2.repository.CustomerRelationRepository;

/**
 * <p> 客户关系表 服务类 </p>
 *
 * @author 罗小东
 * @since 2019-09-15 20:52:37
 */
@NoRepositoryBean
public interface ICustomerRelationService extends IBaseService<CustomerRelationRepository, CustomerRelationEntity, String> {

}
