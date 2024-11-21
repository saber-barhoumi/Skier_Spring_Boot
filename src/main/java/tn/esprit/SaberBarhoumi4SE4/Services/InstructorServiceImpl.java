package tn.esprit.SaberBarhoumi4SE4.Services;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.SaberBarhoumi4SE4.entities.Course;
import tn.esprit.SaberBarhoumi4SE4.entities.Instructor;
import tn.esprit.SaberBarhoumi4SE4.repositories.ICourseRepository;
import tn.esprit.SaberBarhoumi4SE4.repositories.IInstructorRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@RequiredArgsConstructor
@Service
public class InstructorServiceImpl implements IInstructorServices {
    private final IInstructorRepository instructorRepository;
    private final ICourseRepository courseRepository;
    @Override
    public Instructor addInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    @Override
    public Instructor retrieveInstructor(Long numInstructor) {
        Optional<Instructor> instructor = instructorRepository.findById(numInstructor);
        return instructor.orElse(null);
    }

    @Override
    public List<Instructor> retrieveAllInstructors() {
        return (List<Instructor>) instructorRepository.findAll();
    }

    @Override
    public void deleteInstructor(Long numInstructor) {
        instructorRepository.deleteById(numInstructor);
    }

    @Override
    public void updateInstructor(Instructor instructor) {
        instructorRepository.save(instructor);
    }
    @Override
    public Instructor addAndAssignToCourse(Instructor ins, Set<Long> numCourses) {
        Set<Course> courses = new HashSet<>();
        for(Course course:courseRepository.findAllById(numCourses)) {
            courses.add(course);
        }
        ins.setCourses(courses);
        return instructorRepository.save(ins);
    }
}
