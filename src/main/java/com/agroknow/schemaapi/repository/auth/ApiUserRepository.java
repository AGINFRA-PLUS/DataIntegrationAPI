package com.agroknow.schemaapi.repository.auth;

import com.agroknow.schemaapi.model.domain.auth.ApiUser;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ApiUserRepository extends ElasticsearchRepository<ApiUser, String> {

    Optional<ApiUser> findAllByApiKey(String apiKey);

    Optional<ApiUser> findAllByUsernameAndPasswordAndRegisteredFor(String username, String password, String registedFor);

}
