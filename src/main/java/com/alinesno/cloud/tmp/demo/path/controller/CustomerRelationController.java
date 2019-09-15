package com.alinesno.cloud.tmp.demo.path.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alinesno.cloud.tmp.demo.path.feign.dto.CustomerRelationDto ;
import com.alinesno.cloud.tmp.demo.path.feign.facade.CustomerRelationFeigin ;

import com.alinesno.cloud.common.core.constants.SpringInstanceScope;
import com.alinesno.cloud.common.web.base.advice.TranslateCode;
import com.alinesno.cloud.common.web.base.bean.DatatablesPageBean;
import com.alinesno.cloud.common.web.base.controller.FeignMethodController;

import org.springframework.stereotype.Controller;

/**
 * <p>客户关系表 前端控制器 </p>
 *
 * @author 罗小东
 * @since 2019-09-15 20:25:00
 */
@Controller
@Scope(SpringInstanceScope.PROTOTYPE)
@RequestMapping("tmp/demo/path/customerRelation")
public class CustomerRelationController extends FeignMethodController<CustomerRelationDto, CustomerRelationFeigin> {

	//日志记录
	private static final Logger log = LoggerFactory.getLogger(CustomerRelationController.class);

	@TranslateCode(value="[{hasStatus:has_status}]")
	@ResponseBody
	@PostMapping("/datatables")
    public DatatablesPageBean datatables(HttpServletRequest request , Model model ,  DatatablesPageBean page){
		log.debug("page = {}" , ToStringBuilder.reflectionToString(page));
		return this.toPage(model, feign , page) ;
    }


}


























