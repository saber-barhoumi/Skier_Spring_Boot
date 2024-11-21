package tn.esprit.SaberBarhoumi4SE4.Services;

import tn.esprit.SaberBarhoumi4SE4.entities.Course;
import tn.esprit.SaberBarhoumi4SE4.enums.Support;

import java.util.List;

public interface ICourseServices {
    Course addCourse(Course course);
    Course retrieveCourse(Long numCourse);
    List<Course> retrieveAllCourses();
    void deleteCourse(Long numCourse);
    void updateCourse(Course course);
    List <Course> getCourseBySupport(Support support);

}
