package com.statisticalData.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.statisticalData.dao.StatisticalDataMapper;
import com.statisticalData.service.StatisticalDataService;

@Service
public class StatisticalDataServiceImpl implements StatisticalDataService {

	@Resource
	private StatisticalDataMapper statisticalDataMapper;

	@Override
	public JSONObject getStatisticalDatas() {
		JSONObject result = new JSONObject();
		int totalUser = statisticalDataMapper.totalUser();
		result.put("totalUser", totalUser);
		return result;
	} 
}
