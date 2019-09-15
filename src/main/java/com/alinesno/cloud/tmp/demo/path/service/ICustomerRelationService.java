package com.alinesno.cloud.tmp.demo.path.service;

import org.springframework.data.repository.NoRepositoryBean;
import com.alinesno.cloud.tmp.demo.path.entity.CustomerRelationEntity;
import com.alinesno.cloud.common.core.services.IBaseService;
import com.alinesno.cloud.tmp.demo.path.repository.CustomerRelationRepository;

/**
 * <p> 客户关系表 服务类 </p>
 *
 * @author 罗小东
 * @since 2019-09-15 20:25:00
 */
@NoRepositoryBean
public interface ICustomerRelationService extends IBaseService<CustomerRelationRepository, CustomerRelationEntity, String> {

}
