package tn.esprit.SaberBarhoumi4SE4.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.SaberBarhoumi4SE4.Services.IRegistrationServices;
import tn.esprit.SaberBarhoumi4SE4.entities.Registration;

import java.util.List;

@RestController
@RequestMapping("/api/registrations")
@RequiredArgsConstructor
public class RegistrationRestController {

    private final IRegistrationServices registrationService;

    @PostMapping
    public Registration addRegistration(@RequestBody Registration registration) {
        return registrationService.addRegistration(registration);
    }

    @GetMapping("/{numRegistration}")
    public Registration retrieveRegistration(@PathVariable Long numRegistration) {
        return registrationService.retrieveRegistration(numRegistration);
    }

    @GetMapping
    public List<Registration> retrieveAllRegistrations() {
        return registrationService.retrieveAllRegistrations();
    }

    @DeleteMapping("/{numRegistration}")
    public void deleteRegistration(@PathVariable Long numRegistration) {
        registrationService.deleteRegistration(numRegistration);
    }

    @PutMapping
    public void updateRegistration(@RequestBody Registration registration) {
        registrationService.updateRegistration(registration);
    }
    @PostMapping("/assign-skier/{numSkier}")
    public Registration addAndAssignToSkier(@RequestBody Registration registration,@PathVariable Long numSkier) {
        return registrationService.addAndAssignToSkier(registration, numSkier);
    }
    @PutMapping("/{numRegistration}/{numCourse}")
    public Registration assignToCourse(
            @PathVariable("numRegistration") Long numRegistration,
            @PathVariable("numCourse") Long numCourse) {
       return registrationService.assignToCourse(numRegistration, numCourse);

    }
}
