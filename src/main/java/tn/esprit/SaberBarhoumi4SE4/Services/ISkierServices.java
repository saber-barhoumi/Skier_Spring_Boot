package tn.esprit.SaberBarhoumi4SE4.Services;

import tn.esprit.SaberBarhoumi4SE4.entities.Skier;
import tn.esprit.SaberBarhoumi4SE4.enums.TypeSubscription;

import java.util.List;

public interface ISkierServices {
    Skier addSkier(Skier skier);
    Skier retrieveSkier(Long numSkier);
    List<Skier> retrieveAllSkiers();
    void deleteSkier(Long numSkier);
    void updateSkier(Skier skier);
    Skier assignSkierToPiste(Long numSkier, Long numPiste);
    Skier addSkierAndAssignToCourse(Skier skier, Long numCourse);
    List<Skier>retrieveSkierBySubscriptionType(TypeSubscription typeSubscription);
}
