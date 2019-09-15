package com.alinesno.cloud.base.boot.feign.facade;

import org.springframework.cloud.openfeign.FeignClient;
import com.alinesno.cloud.common.facade.feign.IBaseFeign;
import com.alinesno.cloud.base.boot.feign.dto.ContentPostsDto;

/**
 * <p>  请求客户端 </p>
 *
 * @author LuoAnDong
 * @since 2019-09-15 14:04:42
 */
@FeignClient(name="alinesno-cloud-base-boot" , path="contentPosts")
public interface ContentPostsFeigin extends IBaseFeign<ContentPostsDto> {

}
