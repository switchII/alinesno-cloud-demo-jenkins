package com.alinesno.cloud.tmp.demo.path.service;

import org.springframework.data.repository.NoRepositoryBean;
import com.alinesno.cloud.tmp.demo.path.entity.CustomerInfoEntity;
import com.alinesno.cloud.common.core.services.IBaseService;
import com.alinesno.cloud.tmp.demo.path.repository.CustomerInfoRepository;

/**
 * <p> 客户信息表 服务类 </p>
 *
 * @author 罗小东
 * @since 2019-09-15 20:25:00
 */
@NoRepositoryBean
public interface ICustomerInfoService extends IBaseService<CustomerInfoRepository, CustomerInfoEntity, String> {

}
