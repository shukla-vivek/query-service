package com.queryservice.repository;


import org.springframework.data.couchbase.repository.CouchbasePagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.queryservice.entity.DataDocument;


@Repository
public interface DataRepository extends CouchbasePagingAndSortingRepository<DataDocument, String> {


}
