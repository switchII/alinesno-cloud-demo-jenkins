package com.alinesno.cloud.base.boot.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import com.alinesno.cloud.common.core.constants.SpringInstanceScope;

import com.alinesno.cloud.base.boot.entity.ManagerCodeTypeEntity;
import com.alinesno.cloud.base.boot.service.IManagerCodeTypeService;
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
@RequestMapping("managerCodeType")
public class ManagerCodeTypeRestController extends BaseRestController<ManagerCodeTypeEntity , IManagerCodeTypeService> {

	//日志记录
	@SuppressWarnings("unused")
	private final static Logger log = LoggerFactory.getLogger(ManagerCodeTypeRestController.class);

}
