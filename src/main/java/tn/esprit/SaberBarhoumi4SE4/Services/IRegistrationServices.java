package tn.esprit.SaberBarhoumi4SE4.Services;

import tn.esprit.SaberBarhoumi4SE4.entities.Registration;

import java.util.List;

public interface IRegistrationServices {
    Registration addRegistration(Registration registration);
    Registration retrieveRegistration(Long numRegistration);
    List<Registration> retrieveAllRegistrations();
    void deleteRegistration(Long numRegistration);
    void updateRegistration(Registration registration);
    Registration addAndAssignToSkier (Registration registration, Long numSkier);
    Registration assignToCourse (Long numRegistration, Long numCourse);

}
