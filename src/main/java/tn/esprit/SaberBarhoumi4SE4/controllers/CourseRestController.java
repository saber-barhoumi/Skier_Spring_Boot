package tn.esprit.SaberBarhoumi4SE4.controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.SaberBarhoumi4SE4.Services.ICourseServices;
import tn.esprit.SaberBarhoumi4SE4.entities.Course;
import tn.esprit.SaberBarhoumi4SE4.enums.Support;

import java.util.List;

@RequiredArgsConstructor

@RequestMapping("/api/courses")
@RestController
public class CourseRestController {

    private final ICourseServices courseService;

    @PostMapping
    public Course addCourse(@RequestBody Course course) {
        return courseService.addCourse(course);
    }

    @GetMapping("/{numCourse}")
    public Course retrieveCourse(@PathVariable Long numCourse) {
        return courseService.retrieveCourse(numCourse);
    }

    @GetMapping
    public List<Course> retrieveAllCourses() {
        return courseService.retrieveAllCourses();
    }

    @DeleteMapping("/{numCourse}")
    public void deleteCourse(@PathVariable Long numCourse) {
        courseService.deleteCourse(numCourse);
    }

    @PutMapping
    public void updateCourse(@RequestBody Course course) {
        courseService.updateCourse(course);
    }
    @GetMapping("/support/{support}")
    public List<Course> getCoursesBySupport(@PathVariable Support support) {
        return courseService.getCourseBySupport(support);
    }


}