package org.globant.repositories;

import org.globant.domain.entities.Patient;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;

/**
 * PatientRepository
 */
@ApplicationScoped
public class PatientRepository implements PanacheMongoRepository<Patient> {

    public Patient getPatientByDocument(String id) {
        return find("document", id).firstResult();
    }

    public void deletePatientByDocument(String id) {
        delete("document", id);
    }

    public boolean existsPatientByDocument(String id) {
        return count("document", id) > 0;
    }

}
