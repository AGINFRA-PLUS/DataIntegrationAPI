package com.agroknow.schemaapi.model.domain.bucket;


import com.agroknow.schemaapi.model.domain.base.Entity;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.HashMap;
import java.util.Map;

@JsonSerialize
public class Bucket extends Entity {

    private Map<String, ?> information = new HashMap<>();

    public Bucket() {
    }

    public Bucket(Entity entity, Map<String, ?> information) {
        super(entity);
        this.information = information;
    }

    public Map<String, ?> getInformation() {
        return information;
    }

    public void setInformation(Map<String, ?> information) {
        this.information = information;
    }
}
