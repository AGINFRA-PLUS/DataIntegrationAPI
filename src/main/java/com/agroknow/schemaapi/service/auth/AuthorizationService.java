package com.agroknow.schemaapi.service.auth;

import com.agroknow.schemaapi.model.domain.auth.ApiUser;
import org.elasticsearch.index.query.BoolQueryBuilder;

public interface AuthorizationService {

    default ApiUser authorize(String apikey) throws Exception {
        return null;
    }

    default BoolQueryBuilder appendFilters(ApiUser user) throws Exception {
        return null;
    }

}
