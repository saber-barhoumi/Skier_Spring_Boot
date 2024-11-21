package tn.esprit.SaberBarhoumi4SE4.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.SaberBarhoumi4SE4.entities.Instructor;

public interface IInstructorRepository extends CrudRepository<Instructor, Long> {
}
