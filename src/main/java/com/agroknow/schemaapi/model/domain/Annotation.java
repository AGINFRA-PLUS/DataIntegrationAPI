package com.agroknow.schemaapi.model.domain;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class Annotation {

    private String value;

    private Double confidence;

    private String ontology;

    private String uri;

    private String annotatedBy;

    public Annotation() {
    }

    public Annotation(String value, Double confidence, String ontology, String uri, String annotatedBy) {
        this.value = value;
        this.confidence = confidence;
        this.ontology = ontology;
        this.uri = uri;
        this.annotatedBy = annotatedBy;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Double getConfidence() {
        return confidence;
    }

    public void setConfidence(Double confidence) {
        this.confidence = confidence;
    }

    public String getOntology() {
        return ontology;
    }

    public void setOntology(String ontology) {
        this.ontology = ontology;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getAnnotatedBy() {
        return annotatedBy;
    }

    public void setAnnotatedBy(String annotatedBy) {
        this.annotatedBy = annotatedBy;
    }
}
