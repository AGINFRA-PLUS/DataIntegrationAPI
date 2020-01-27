package com.agroknow.schemaapi.model.domain.base;

import com.agroknow.schemaapi.model.domain.Annotation;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.ArrayList;
import java.util.List;

@JsonSerialize
public class Term {

    private String value;

    private String uri;

    private String id;

    private String type;

    private List<String> altLabels;

    private String vocabulary;

    private List<Term> hierarchy = new ArrayList<>();

    private List<Annotation> annotated = new ArrayList<>();

    public Term() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getAltLabels() {
        return altLabels;
    }

    public void setAltLabels(List<String> altLabels) {
        this.altLabels = altLabels;
    }

    public String getVocabulary() {
        return vocabulary;
    }

    public void setVocabulary(String vocabulary) {
        this.vocabulary = vocabulary;
    }

    public List<Term> getHierarchy() {
        return hierarchy;
    }

    public void setHierarchy(List<Term> hierarchy) {
        this.hierarchy = hierarchy;
    }

    public List<Annotation> getAnnotated() {
        return annotated;
    }

    public void setAnnotated(List<Annotation> annotated) {
        this.annotated = annotated;
    }
}
