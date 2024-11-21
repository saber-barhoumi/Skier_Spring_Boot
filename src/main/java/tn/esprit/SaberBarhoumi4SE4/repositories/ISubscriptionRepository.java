package tn.esprit.SaberBarhoumi4SE4.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.SaberBarhoumi4SE4.entities.Subscription;
import tn.esprit.SaberBarhoumi4SE4.enums.TypeSubscription;

import java.util.List;

public interface ISubscriptionRepository extends CrudRepository <Subscription, Long> {
    List<Subscription> findByTypeSub(TypeSubscription typeSubscription);

}
