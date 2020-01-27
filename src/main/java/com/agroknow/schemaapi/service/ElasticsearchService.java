package com.agroknow.schemaapi.service;


import com.agroknow.schemaapi.model.domain.base.Entity;

import java.util.Optional;

public interface ElasticsearchService {

    Iterable<?> saveAll(Iterable entities) throws Exception;

    Iterable<?> saveAllSmartScheme(Iterable entities) throws Exception;

    Entity save(Entity entity) throws Exception;

    void delete(Entity entity) throws Exception;

    Optional<?> findById(String id) throws Exception;
}
