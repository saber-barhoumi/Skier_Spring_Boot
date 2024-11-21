package tn.esprit.SaberBarhoumi4SE4.repositories;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.SaberBarhoumi4SE4.entities.Course;
import tn.esprit.SaberBarhoumi4SE4.enums.Support;

import java.util.List;


public interface ICourseRepository extends CrudRepository<Course, Long> {
    List<Course> findBySupport(Support support);

}
