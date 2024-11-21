package tn.esprit.SaberBarhoumi4SE4.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.SaberBarhoumi4SE4.entities.Piste;
import tn.esprit.SaberBarhoumi4SE4.repositories.IPisteRepository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class PisteServiceImpl implements IPisteServices {
    private final IPisteRepository iPisteRepository;

    @Override
    public Piste addPiste(Piste piste) {
        return iPisteRepository.save(piste);
    }

    @Override
    public Piste retrievePiste(Long numPiste) {
        Optional<Piste> piste = iPisteRepository.findById(numPiste);
        return piste.orElse(null);
    }

    @Override
    public List<Piste> retrieveAllPistes() {
        return (List<Piste>) iPisteRepository.findAll();
    }

    @Override
    public void deletePiste(Long numPiste) {
        iPisteRepository.deleteById(numPiste);
    }

    @Override
    public void updatePiste(Piste piste) {
        iPisteRepository.save(piste);
    }
}
