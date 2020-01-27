package com.agroknow.schemaapi.repository;

import com.agroknow.schemaapi.model.domain.base.Entity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface EntityRepository extends ElasticsearchRepository<Entity, String> {
}
