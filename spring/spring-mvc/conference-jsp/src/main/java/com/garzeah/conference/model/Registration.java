package com.garzeah.conference.model;

import org.hibernate.validator.constraints.NotEmpty;

public class Registration {

    @NotEmpty // Validates that it's not empty
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
