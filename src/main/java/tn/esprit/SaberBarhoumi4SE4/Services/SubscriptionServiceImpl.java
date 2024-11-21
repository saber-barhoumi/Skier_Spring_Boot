package tn.esprit.SaberBarhoumi4SE4.Services;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.SaberBarhoumi4SE4.entities.Subscription;
import tn.esprit.SaberBarhoumi4SE4.enums.TypeSubscription;
import tn.esprit.SaberBarhoumi4SE4.repositories.ICourseRepository;
import tn.esprit.SaberBarhoumi4SE4.repositories.ISkierRepository;
import tn.esprit.SaberBarhoumi4SE4.repositories.ISubscriptionRepository;

import java.util.*;

@RequiredArgsConstructor
@Service
public class SubscriptionServiceImpl implements ISubscriptionService {
    private final ISubscriptionRepository subscriptionRepository;
    private final ISkierRepository skierRepository;
    private final ICourseRepository courseRepository;

    @Override
    public Subscription addSubscription(Subscription subscription) {
        return subscriptionRepository.save(subscription);
    }

    @Override
    public Subscription retrieveSubscription(Long numSubscription) {
        Optional<Subscription> subscription = subscriptionRepository.findById(numSubscription);
        return subscription.orElse(null);
    }

    @Override
    public List<Subscription> retriveAllSubscriptions() {
        return (List<Subscription>) subscriptionRepository.findAll();
    }

    @Override
    public void deleteSubscription(Long numSubscription) {
        subscriptionRepository.deleteById(numSubscription);
    }

    @Override
    public void updateSubscription(Subscription subscription) {
        subscriptionRepository.save(subscription);
    }
    @Override
    public Set<Subscription> getSubscriptionsByType(TypeSubscription typeSubscription) {
        List<Subscription> subscriptions = subscriptionRepository.findByTypeSub(typeSubscription);
        subscriptions.sort(Comparator.comparing(Subscription::getStartDate));
        return new LinkedHashSet<>(subscriptions);
    }
}
