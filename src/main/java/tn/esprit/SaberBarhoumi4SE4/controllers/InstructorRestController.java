package tn.esprit.SaberBarhoumi4SE4.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.SaberBarhoumi4SE4.Services.IInstructorServices;
import tn.esprit.SaberBarhoumi4SE4.entities.Instructor;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/instructors")
@AllArgsConstructor
public class InstructorRestController {

    private final IInstructorServices instructorService;

    @PostMapping
    public Instructor addInstructor(@RequestBody Instructor instructor) {
        return instructorService.addInstructor(instructor);
    }

    @GetMapping("/{id}")
    public Instructor retrieveInstructor(@PathVariable Long numInstructor) {
        return instructorService.retrieveInstructor(numInstructor);
    }

    @GetMapping
    public List<Instructor> retrieveAllInstructors() {
        return instructorService.retrieveAllInstructors();
    }

    @DeleteMapping("/{id}")
    public void deleteInstructor(@PathVariable Long numInstructor) {
        instructorService.deleteInstructor(numInstructor);
    }

    @PutMapping
    public void updateInstructor(@RequestBody Instructor instructor) {
        instructorService.updateInstructor(instructor);
    }
    @PostMapping("/assign/{numCourses}")
    public Instructor addAndAssignToCourse(@RequestBody Instructor ins, @PathVariable Set<Long> numCourses) {
        return instructorService.addAndAssignToCourse(ins, numCourses);
    }
}