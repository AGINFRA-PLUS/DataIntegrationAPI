package com.agroknow.schemaapi.repository;

import com.agroknow.schemaapi.model.domain.bucket.Bucket;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface SmartSchemeRepository extends ElasticsearchRepository<Bucket, String> {
}
