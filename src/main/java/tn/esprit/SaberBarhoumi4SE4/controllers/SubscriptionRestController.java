package tn.esprit.SaberBarhoumi4SE4.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.SaberBarhoumi4SE4.Services.ISubscriptionService;
import tn.esprit.SaberBarhoumi4SE4.entities.Subscription;
import tn.esprit.SaberBarhoumi4SE4.enums.TypeSubscription;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/subscriptions")
@AllArgsConstructor
public class SubscriptionRestController {

    private final ISubscriptionService subscriptionService;

    @PostMapping
    public Subscription addSubscription(@RequestBody Subscription subscription) {
        return subscriptionService.addSubscription(subscription);
    }

    @GetMapping("/{numSub}")
    public Subscription retrieveSubscription(@PathVariable Long numSub) {
        return subscriptionService.retrieveSubscription(numSub);
    }

    @GetMapping
    public List<Subscription> retrieveAllSubscriptions() {
        return subscriptionService.retriveAllSubscriptions();
    }

    @DeleteMapping("/{numSub}")
    public void deleteSubscription(@PathVariable Long numSub) {
        subscriptionService.deleteSubscription(numSub);
    }

    @PutMapping
    public void updateSubscription(@RequestBody Subscription subscription) {
        subscriptionService.updateSubscription(subscription);
    }
    @GetMapping("/subscriptions/type/{typeSubscription}")
    public Set<Subscription> getSubscriptionsByType(@PathVariable TypeSubscription typeSubscription) {
        return subscriptionService.getSubscriptionsByType(typeSubscription);
    }

}
