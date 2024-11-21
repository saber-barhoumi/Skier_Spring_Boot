package tn.esprit.SaberBarhoumi4SE4.Services;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.SaberBarhoumi4SE4.entities.Course;
import tn.esprit.SaberBarhoumi4SE4.enums.Support;
import tn.esprit.SaberBarhoumi4SE4.repositories.ICourseRepository;


import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class CourseServiceImpl implements ICourseServices{


    private final ICourseRepository iCourseRepository;
    @Override
    public Course addCourse(Course course) {
        return iCourseRepository.save(course);
    }

    @Override
    public Course retrieveCourse(Long numCourse) {
        Optional<Course> course = iCourseRepository.findById(numCourse);
        return course.orElse(null);
    }

    @Override
    public List<Course> retrieveAllCourses() {
        return (List<Course>) iCourseRepository.findAll();
    }

    @Override
    public void deleteCourse(Long numCourse) {
        iCourseRepository.deleteById(numCourse);
    }

    @Override
    public void updateCourse(Course course) {
        iCourseRepository.save(course);
    }
    @Override
    public List <Course> getCourseBySupport(Support support){
        return iCourseRepository.findBySupport(support);
    }

}
