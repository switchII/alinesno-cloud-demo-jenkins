package com.alinesno.cloud.base.boot.service;

import org.springframework.data.repository.NoRepositoryBean;
import com.alinesno.cloud.base.boot.entity.ContentLinksEntity;
import com.alinesno.cloud.common.core.services.IBaseService;
import com.alinesno.cloud.base.boot.repository.ContentLinksRepository;

/**
 * <p>  服务类 </p>
 *
 * @author LuoAnDong
 * @since 2019-09-15 14:04:42
 */
@NoRepositoryBean
public interface IContentLinksService extends IBaseService<ContentLinksRepository, ContentLinksEntity, String> {

}
