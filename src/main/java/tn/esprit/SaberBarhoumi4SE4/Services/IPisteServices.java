package tn.esprit.SaberBarhoumi4SE4.Services;

import tn.esprit.SaberBarhoumi4SE4.entities.Piste;

import java.util.List;

public interface IPisteServices {
     Piste addPiste(Piste piste);
     Piste retrievePiste(Long numPiste);
     List <Piste> retrieveAllPistes();
     void deletePiste(Long numPiste);
     void updatePiste(Piste piste);


}
