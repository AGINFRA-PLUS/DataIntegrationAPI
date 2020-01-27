package com.agroknow.schemaapi.model.domain;

public class MultiLingualLabel {

    private String label;

    private String language;

    public MultiLingualLabel() {
    }

    public MultiLingualLabel(String label, String language) {
        this.label = label.toLowerCase();
        this.language = language;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
