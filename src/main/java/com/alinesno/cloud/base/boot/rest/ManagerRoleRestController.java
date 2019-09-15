package com.alinesno.cloud.base.boot.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import com.alinesno.cloud.common.core.constants.SpringInstanceScope;

import com.alinesno.cloud.base.boot.entity.ManagerRoleEntity;
import com.alinesno.cloud.base.boot.service.IManagerRoleService;
import org.springframework.web.bind.annotation.RestController;
import com.alinesno.cloud.common.core.rest.BaseRestController;

/**
 * <p> 接口 </p>
 *
 * @author LuoAnDong
 * @since 2019-09-15 14:04:42
 */
@Scope(SpringInstanceScope.PROTOTYPE)
@RestController
@RequestMapping("managerRole")
public class ManagerRoleRestController extends BaseRestController<ManagerRoleEntity , IManagerRoleService> {

	//日志记录
	@SuppressWarnings("unused")
	private final static Logger log = LoggerFactory.getLogger(ManagerRoleRestController.class);

}
