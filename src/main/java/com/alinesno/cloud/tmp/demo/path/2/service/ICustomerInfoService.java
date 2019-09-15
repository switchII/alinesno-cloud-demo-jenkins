package com.alinesno.cloud.tmp.demo.path.2.service;

import org.springframework.data.repository.NoRepositoryBean;
import com.alinesno.cloud.tmp.demo.path.2.entity.CustomerInfoEntity;
import com.alinesno.cloud.common.core.services.IBaseService;
import com.alinesno.cloud.tmp.demo.path.2.repository.CustomerInfoRepository;

/**
 * <p> 客户信息表 服务类 </p>
 *
 * @author 罗小东
 * @since 2019-09-15 20:52:37
 */
@NoRepositoryBean
public interface ICustomerInfoService extends IBaseService<CustomerInfoRepository, CustomerInfoEntity, String> {

}
