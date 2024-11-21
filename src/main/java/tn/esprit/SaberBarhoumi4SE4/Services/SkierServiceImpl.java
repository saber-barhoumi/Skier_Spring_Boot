package tn.esprit.SaberBarhoumi4SE4.Services;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.SaberBarhoumi4SE4.entities.*;
import tn.esprit.SaberBarhoumi4SE4.enums.TypeSubscription;
import tn.esprit.SaberBarhoumi4SE4.repositories.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class SkierServiceImpl implements ISkierServices {
    private final ISkierRepository skierRepository;
    private final IPisteRepository pisteRepository;
    private final ISubscriptionRepository subscriptionRepository;
    private final ICourseRepository courseRepository;
    private final IRegistrationRepository registrationRepository;

    @Override
    public Skier addSkier(Skier skier) {
        return skierRepository.save(skier);
    }

    @Override
    public Skier retrieveSkier(Long numSkier) {
        Optional<Skier> skier = skierRepository.findById(numSkier);
        return skier.orElse(null);
    }

    @Override
    public List<Skier> retrieveAllSkiers() {
        return (List<Skier>) skierRepository.findAll();
    }

    @Override
    public void deleteSkier(Long numSkier) {
        skierRepository.deleteById(numSkier);
    }

    @Override
    public void updateSkier(Skier skier) {
        skierRepository.save(skier);
    }

    @Override
    public Skier assignSkierToPiste(Long numSkier, Long numPiste) {
        Skier skier = skierRepository.findById(numSkier).orElse(null);
        Piste piste = pisteRepository.findById(numPiste).orElse(null);
        piste.getSkiers().add(skier);
        pisteRepository.save(piste);
        return skier;
    }
    @Override
    public Skier addSkierAndAssignToCourse(Skier skier, Long numCourse){
        subscriptionRepository.save(skier.getSubscription());
        skierRepository.save(skier);
        Registration r = new Registration();
        r.setCourse(courseRepository.findById(numCourse).orElse(null));
        r.setSkier(skier);
        registrationRepository.save(r);

        return skier;
    }

    @Override
    public List<Skier>retrieveSkierBySubscriptionType(TypeSubscription typeSubscription){
        List<Subscription> subscriptions = subscriptionRepository.findByTypeSub(typeSubscription);
        List<Skier> skiers = new ArrayList<>();
        for (Subscription subscription : subscriptions) {
            skiers.add(skierRepository.findBySubscription(subscription));
        }
        return skiers;
    }
}
