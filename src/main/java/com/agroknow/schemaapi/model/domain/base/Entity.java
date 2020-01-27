package com.agroknow.schemaapi.model.domain.base;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@JsonSerialize
public class Entity implements Serializable {

    private String id;

    private String title;

    private String description;

    private String entityType;

    private String createdOn;

    private String updatedOn;

    private String dataSource;

    private List<String> tags = new ArrayList<>();

    private boolean published;

    public Entity() {
    }

    public Entity(String id, String title, String description, String entityType, String createdOn, String updatedOn, String dataSource, List<String> tags, boolean published) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.entityType = entityType;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.dataSource = dataSource;
        this.tags = tags;
        this.published = published;

        generateId();
    }

    public Entity(Entity entity) {

        this.createdOn = entity.createdOn;
        this.dataSource = entity.dataSource;
        this.description = entity.description;
        this.entityType = entity.entityType;
        this.id = entity.id;
        this.tags = entity.tags;
        this.title = entity.title;
        this.updatedOn = entity.updatedOn;
        this.published = entity.published;

        generateId();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public String getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(String updatedOn) {
        this.updatedOn = updatedOn;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public boolean getPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public void generateId() {
        if (this.id == null) {
            id = this.dataSource.replace(" ", "_") + "_" + (this.hashCode() < 0 ? this.hashCode() * -1 : this.hashCode());
        }
    }
}
