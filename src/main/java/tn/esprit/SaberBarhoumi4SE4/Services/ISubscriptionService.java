package tn.esprit.SaberBarhoumi4SE4.Services;

import tn.esprit.SaberBarhoumi4SE4.entities.Subscription;
import tn.esprit.SaberBarhoumi4SE4.enums.TypeSubscription;

import java.util.List;
import java.util.Set;

public interface ISubscriptionService {
     Subscription addSubscription(Subscription subscription);
     Subscription retrieveSubscription(Long numSubscription);
     List<Subscription> retriveAllSubscriptions();
     void deleteSubscription(Long numSubscription);
     void updateSubscription(Subscription subscription);
     Set <Subscription> getSubscriptionsByType(TypeSubscription typeSubscription);
}
