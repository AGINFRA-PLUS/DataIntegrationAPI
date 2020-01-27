package com.agroknow.schemaapi.service;

import com.agroknow.schemaapi.model.domain.base.Entity;
import com.agroknow.schemaapi.repository.EntityRepository;
import com.agroknow.schemaapi.repository.SmartSchemeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ElasticsearchServiceImpl implements ElasticsearchService {

    @Autowired
    private EntityRepository repository;

    @Autowired
    private SmartSchemeRepository smartSchemeRepository;

    public Iterable<?> saveAll(Iterable entities) {
        return repository.saveAll(entities);
    }

    public Iterable<?> saveAllSmartScheme(Iterable entities) {
        return smartSchemeRepository.saveAll(entities);
    }

    public Entity save(Entity entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Entity entity) throws Exception {
        repository.delete(entity);
    }

    @Override
    public Optional<Entity> findById(String id) throws Exception {
        return repository.findById(id);
    }

}
