package com.alinesno.cloud.tmp.demo.path.repository;

import com.alinesno.cloud.tmp.demo.path.entity.CustomerInfoEntity;
import com.alinesno.cloud.common.core.orm.repository.IBaseJpaRepository;

/**
 * <p>
  * 客户信息表 持久层接口
 * </p>
 *
 * @author 罗小东
 * @since 2019-09-15 20:25:00
 */
public interface CustomerInfoRepository extends IBaseJpaRepository<CustomerInfoEntity, String> {

}
