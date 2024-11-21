package tn.esprit.SaberBarhoumi4SE4.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.SaberBarhoumi4SE4.Services.IPisteServices;
import tn.esprit.SaberBarhoumi4SE4.entities.Piste;

import java.util.List;

@RestController
@RequestMapping("/piste")
@RequiredArgsConstructor

public class PisteRestController {

    private final IPisteServices pisteService;

    @PostMapping
    public Piste addPiste(@RequestBody Piste piste) {
        return pisteService.addPiste(piste);
    }

    @GetMapping("get/{numPiste}")
    public Piste retrievePiste(@PathVariable Long numPiste) {
        return pisteService.retrievePiste(numPiste);
    }

    @GetMapping("/getall")
    public List<Piste> retrieveAllPistes() {
        return pisteService.retrieveAllPistes();
    }

    @DeleteMapping("/delete/{numPiste}")
    public void deletePiste(@PathVariable Long numPiste) {
        pisteService.deletePiste(numPiste);
    }

    @PutMapping("/update")
    public void updatePiste(@RequestBody Piste piste) {
        pisteService.updatePiste(piste);
    }
}