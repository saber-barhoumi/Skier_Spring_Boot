    package tn.esprit.SaberBarhoumi4SE4.repositories;
    import org.springframework.data.repository.CrudRepository;
    import tn.esprit.SaberBarhoumi4SE4.entities.Skier;
    import tn.esprit.SaberBarhoumi4SE4.entities.Subscription;

    public interface ISkierRepository extends CrudRepository <Skier, Long> {
        Skier findBySubscription(Subscription subscription);

    }
