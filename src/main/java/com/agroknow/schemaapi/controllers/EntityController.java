package com.agroknow.schemaapi.controllers;
//import com.agroknow.schemaapi.repository.ontology.TermRepository;

import com.agroknow.schemaapi.model.domain.VocabularyTerm;
import com.agroknow.schemaapi.model.domain.auth.ApiUser;
import com.agroknow.schemaapi.model.domain.bucket.Bucket;
import com.agroknow.schemaapi.model.responses.Response;
import com.agroknow.schemaapi.service.ElasticsearchService;
import com.agroknow.schemaapi.service.auth.AuthorizationService;
import com.agroknow.schemaapi.utils.ResponseGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entity")
@CrossOrigin(origins = "*")
public class EntityController {

    @Autowired
    private ElasticsearchService service;

    @Autowired
    private AuthorizationService authorizationService;

    @RequestMapping(value = "/smart-scheme/import",
            method = {RequestMethod.PUT},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> massCreateBucket(String apikey, @RequestBody List<Bucket> misc) throws Exception {

        ApiUser user = authorizationService.authorize(apikey);
        Response response = new Response();

        try {
            service.saveAllSmartScheme(misc);

            response.setStatus(HttpStatus.OK);
            ResponseGenerator.generateValidResponse(response, null);

        } catch (Exception e) {
            ResponseGenerator.generateErrorMessage(response, HttpStatus.BAD_REQUEST,
                    e.getClass().getName(), e.getMessage());
        }

        return ResponseEntity.status(response.getStatus()).body(response.getBody());
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/semantic-resource/import", produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<String> genericPopulate(@RequestBody List<VocabularyTerm> terms) throws Exception {

        Response response = new Response();
        response.setStatus(HttpStatus.OK);

        service.saveAll(terms);

        ResponseGenerator.generateValidResponse(response, terms);
        return ResponseEntity.status(response.getStatus()).body(response.getBody());
    }
}
