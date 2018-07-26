package com.queryservice.controller;

import java.util.Calendar;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.queryservice.entity.DataDocument;
import com.queryservice.service.DataService;

@RestController
@RequestMapping(path = "/api")
public class TestController {

	@Autowired
	DataService consumptionDataService;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

	@GetMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<DataDocument> getConsumtionData(@RequestParam List<String> idList) {
		long startTime = Calendar.getInstance().getTimeInMillis();
		LOGGER.info("TestController|getConsumtionData|IN |  Ids{}", idList);
		List<DataDocument> list = null;
		try {			
			list = consumptionDataService.getDesman(idList);
		} catch (Exception e) {
			LOGGER.error("TestController|getConsumtionData|Exception| {}", e.getMessage());
			throw e;
		}
		
		
		LOGGER.info("TestController|getConsumtionData|OUT |Response Size{} Response Time {} ms",
				list.size(), Calendar.getInstance().getTimeInMillis() - startTime);
		return list;
	}

	

}
