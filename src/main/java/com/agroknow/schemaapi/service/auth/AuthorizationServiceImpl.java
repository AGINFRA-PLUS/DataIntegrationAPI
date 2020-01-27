package com.agroknow.schemaapi.service.auth;


import com.agroknow.schemaapi.model.domain.auth.ApiUser;
import com.agroknow.schemaapi.repository.auth.ApiUserRepository;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AuthorizationServiceImpl implements AuthorizationService {

    private final ApiUserRepository repository;

    @Value("${hourly-limit.default}")
    private Long defaultHourlyLimit;

    public AuthorizationServiceImpl(ApiUserRepository repository) {
        this.repository = repository;
    }

    @Override
    public ApiUser authorize(String apikey) throws Exception {

        /*
         * Logic goes here
         * */
        return null;
    }

    @Override
    public BoolQueryBuilder appendFilters(ApiUser user) throws Exception {

        /*
         * Logic goes here
         * */
        return null;
    }

}
