package tn.esprit.SaberBarhoumi4SE4.Services;

import tn.esprit.SaberBarhoumi4SE4.entities.Instructor;

import java.util.List;
import java.util.Set;

public interface IInstructorServices {
    Instructor addInstructor(Instructor instructor);
    Instructor retrieveInstructor(Long numInstructor);
    List<Instructor> retrieveAllInstructors();
    void deleteInstructor(Long numInstructor);
    void updateInstructor(Instructor instructor);
    Instructor addAndAssignToCourse(Instructor ins, Set<Long> numCourses);
}
