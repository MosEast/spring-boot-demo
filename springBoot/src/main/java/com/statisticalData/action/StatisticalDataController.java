package com.statisticalData.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.statisticalData.service.StatisticalDataService;

@RestController
@RequestMapping({ "/" })
public class StatisticalDataController {
	@Resource
	private StatisticalDataService statisticalDataService;

	@RequestMapping(value = { "/statisticalData" }, method = { RequestMethod.GET })
	public JSONObject recycleMyPackage(HttpServletRequest request) {
		JSONObject result = new JSONObject();
		try {
			result = statisticalDataService.getStatisticalDatas();
			result.put("success", Boolean.valueOf(true));
			result.put("message", "查询成功！");
		} catch (Exception e) {
			result.put("success", Boolean.valueOf(false));
			result.put("message", "获取数据失败！!");
			e.getMessage();
		}
		return result;
	}

}
