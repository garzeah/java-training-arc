package com.pluralsight.conference.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "REGISTRATION")
@NamedQueries({
    @NamedQuery(name = Registration.REGISTRATION_REPORT, query = Registration.REGISTRATION_REPORT_JPQL)
})
public class Registration {

    // Named queries
    public static final String REGISTRATION_REPORT = "Registration.registrationReport";
    public static final String REGISTRATION_REPORT_JPQL =
        "Select new com.pluralsight.conference.model.RegistrationReport" +
        "(r.name, c.name, c.description) " +
        "from Registration r, Course c " +
        "where r.id = c.registration.id";


    @Id
    // Use the auto-incrementing ids in mysql to populate objs
    // Better when we try to cascade saves across multiple objs
    // and one to many mappings
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    private String name;

    // When we export this as Json don't cascade and keep trying to
    // repopulate the whole tree, grab it at one level and return
    @JsonManagedReference
    // This should tie to the name of the member variable in Course.java
    @OneToMany(mappedBy = "registration", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Course> courses = new ArrayList<>();

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
