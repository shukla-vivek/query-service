package com.queryservice.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.queryservice.entity.DataDocument;
import com.queryservice.repository.DataRepository;
import com.queryservice.service.DataService;


@Service
public class DataServiceImpl implements DataService {

    private static final Logger LOGGER = LoggerFactory.getLogger(DataServiceImpl.class);

    
    
    @Autowired
    DataRepository dataRepository;


  

	@Override
	public List<DataDocument> getDesman(List<String> idList) {
		try {
            LOGGER.debug("ConsumptionDataServiceImpl|getProductResponse|IN| idList{}", idList);
            Iterable<DataDocument> consumptionDtaDocumentIterable= dataRepository.findAllById(idList);
            List<DataDocument> consumptionDataDocumentList = StreamSupport.stream(consumptionDtaDocumentIterable.spliterator(),false).collect(Collectors.toList());
          
            LOGGER.debug("ConsumptionDataServiceImpl|getProductResponse|OUT|");
            return consumptionDataDocumentList;
        } catch (Exception e) {
            LOGGER.error("ConsumptionDataServiceImpl|getProductResponse|Exception|", e);
            throw e;
        }
	}
}
