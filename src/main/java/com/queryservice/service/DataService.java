package com.queryservice.service;


import java.util.List;

import com.queryservice.entity.DataDocument;

public interface DataService {

    

	List<DataDocument> getDesman(List<String> idList);

}
