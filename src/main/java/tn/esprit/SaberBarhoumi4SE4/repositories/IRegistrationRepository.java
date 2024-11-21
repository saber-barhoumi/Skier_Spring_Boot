package tn.esprit.SaberBarhoumi4SE4.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.SaberBarhoumi4SE4.entities.Registration;

public interface IRegistrationRepository extends CrudRepository<Registration, Long> {
}
