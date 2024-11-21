package tn.esprit.SaberBarhoumi4SE4.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.SaberBarhoumi4SE4.entities.Course;
import tn.esprit.SaberBarhoumi4SE4.entities.Registration;
import tn.esprit.SaberBarhoumi4SE4.entities.Skier;
import tn.esprit.SaberBarhoumi4SE4.repositories.ICourseRepository;
import tn.esprit.SaberBarhoumi4SE4.repositories.IRegistrationRepository;
import tn.esprit.SaberBarhoumi4SE4.repositories.ISkierRepository;
import tn.esprit.SaberBarhoumi4SE4.repositories.ISubscriptionRepository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class RegistrationServiceImpl implements IRegistrationServices {
    private final IRegistrationRepository registrationRepository;
    private final ISkierRepository skierRepository;
    private final ICourseRepository courseRepository;
    private final ISubscriptionRepository subscriptionRepository;
    @Override
    public Registration addRegistration(Registration registration) {
        return registrationRepository.save(registration);
    }

    @Override
    public Registration retrieveRegistration(Long numRegistration) {
        Optional<Registration> registration = registrationRepository.findById(numRegistration);
        return registration.orElse(null);
    }

    @Override
    public List<Registration> retrieveAllRegistrations() {
        return (List<Registration>) registrationRepository.findAll();
    }

    @Override
    public void deleteRegistration(Long numRegistration) {
        registrationRepository.deleteById(numRegistration);
    }

    @Override
    public void updateRegistration(Registration registration) {
        registrationRepository.save(registration);
    }

        @Override
        public Registration addAndAssignToSkier(Registration registration, Long numSkier) {
            Skier skier = skierRepository.findById(numSkier).orElse(null);
            registration.setSkier(skier);
            return registrationRepository.save(registration);
        }


    @Override
    public Registration assignToCourse(Long numRegistration, Long numCourse) {
        Registration registration=registrationRepository.findById(numRegistration).orElse(null);
        Course course=courseRepository.findById(numCourse).orElse(null);
        registration.setCourse(course);
        return registrationRepository.save(registration);
    }

}
