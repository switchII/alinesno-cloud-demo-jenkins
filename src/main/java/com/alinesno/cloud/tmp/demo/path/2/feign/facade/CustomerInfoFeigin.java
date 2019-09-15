package com.alinesno.cloud.tmp.demo.path.2.feign.facade;

import org.springframework.cloud.openfeign.FeignClient;
import com.alinesno.cloud.common.facade.feign.IBaseFeign;
import com.alinesno.cloud.tmp.demo.path.2.feign.dto.CustomerInfoDto;

/**
 * <p> 客户信息表 请求客户端 </p>
 *
 * @author 罗小东
 * @since 2019-09-15 20:52:37
 */
@FeignClient(name="tmp-demo-path-2" , path="customerInfo")
public interface CustomerInfoFeigin extends IBaseFeign<CustomerInfoDto> {

}
