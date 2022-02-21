package com.pluralsight.conference.repository;

import com.pluralsight.conference.model.Registration;
import com.pluralsight.conference.model.RegistrationReport;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class RegistrationRepositoryImpl implements RegistrationRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Registration save(Registration registration) {
        entityManager.persist(registration);
        return registration;
    }

    @Override
    public List<Registration> findAll() {
        // Using JPQL to retrieve data
        List<Registration> registrations = entityManager
            .createQuery("Select r from Registration r") // Referring to the object not table in db
            .getResultList();


        return registrations;
    }

    @Override
    public List<RegistrationReport> findAllReports() {
        // Using namedQueries, JPQL and projection to retrieve data
        List<RegistrationReport> registrationReports = entityManager
            .createNamedQuery(Registration.REGISTRATION_REPORT) // Referring to the object not table in db
            .getResultList();

        return registrationReports;
    }

}
