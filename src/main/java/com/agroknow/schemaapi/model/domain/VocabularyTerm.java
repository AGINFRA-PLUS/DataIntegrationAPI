package com.agroknow.schemaapi.model.domain;

import com.agroknow.schemaapi.model.domain.base.Entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class VocabularyTerm extends Entity {

    private String internalId;

    private String label;

    private List<String> synonym = new ArrayList<>();

    private String code;

    private String language;

    private List<String> children;

    private List<String> parent;

    private String uri;

    private String vocabulary;

    private List<MultiLingualLabel> multiLingualLabel;

    public VocabularyTerm() {
    }

    public VocabularyTerm(String id) {
        this.internalId = internalId;
    }

    public VocabularyTerm(String id, String label, String code, String language, String vocabulary) {
        this.internalId = internalId;
        this.label = label;
        this.code = code;
        this.language = language;
        this.vocabulary = vocabulary;
    }

    public String getId() {
        return internalId;
    }

    public void setId(String internalId) {
        this.internalId = internalId;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<String> getSynonym() {
        return synonym;
    }

    public void setSynonym(List<String> synonym) {
        this.synonym = synonym;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public List<MultiLingualLabel> getMultiLingualLabel() {
        return multiLingualLabel;
    }

    public void setMultiLingualLabel(List<MultiLingualLabel> multiLingualLabel) {
        this.multiLingualLabel = multiLingualLabel;
    }

    public String getVocabulary() {
        return vocabulary;
    }

    public void setVocabulary(String vocabulary) {
        this.vocabulary = vocabulary;
    }

    public List<String> getChildren() {
        return children;
    }

    public void setChildren(List<String> children) {
        this.children = children;
    }

    public List<String> getParent() {
        return parent;
    }

    public void setParent(List<String> parent) {
        this.parent = parent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VocabularyTerm term = (VocabularyTerm) o;
        return internalId.equals(term.internalId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(internalId);
    }


}
