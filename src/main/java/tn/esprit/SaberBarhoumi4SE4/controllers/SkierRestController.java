package tn.esprit.SaberBarhoumi4SE4.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.SaberBarhoumi4SE4.Services.ISkierServices;
import tn.esprit.SaberBarhoumi4SE4.entities.Skier;
import tn.esprit.SaberBarhoumi4SE4.enums.TypeSubscription;

import java.util.List;

@RestController
@RequestMapping("/skiers")
@AllArgsConstructor
public class SkierRestController {

    private final ISkierServices skierService;

    @PostMapping("/add")
    public Skier addSkier(@RequestBody Skier skier) {
        return skierService.addSkier(skier);
    }

    @GetMapping("/{numSkier}")
    public Skier retrieveSkier(@PathVariable Long numSkier) {
        return skierService.retrieveSkier(numSkier);
    }

    @GetMapping
    public List<Skier> retrieveAllSkiers() {
        return skierService.retrieveAllSkiers();
    }

    @DeleteMapping("/{numSkier}")
    public void deleteSkier(@PathVariable Long numSkier) {
        skierService.deleteSkier(numSkier);
    }

    @PutMapping
    public void updateSkier(@RequestBody Skier skier) {
        skierService.updateSkier(skier);
    }
    @PostMapping("/assign/{numSkier}/{numPiste}")
    public Skier assignSkierToPiste(@PathVariable Long numSkier, @PathVariable Long numPiste) {
        return skierService.assignSkierToPiste(numSkier, numPiste);
    }
    @PostMapping("/addAndAssignToCourse/{numCourse}")
    public Skier addSkierAndAssignToCourse(@RequestBody Skier skier, @PathVariable Long numCourse) {
        return skierService.addSkierAndAssignToCourse(skier, numCourse);
    }
    @GetMapping("/bySubscriptionType/{typeSubscription}")
    public List<Skier> retrieveSkierBySubscriptionType(@PathVariable TypeSubscription typeSubscription) {
        return skierService.retrieveSkierBySubscriptionType(typeSubscription);
    }
}
