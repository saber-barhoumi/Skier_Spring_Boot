package tn.esprit.SaberBarhoumi4SE4.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.esprit.SaberBarhoumi4SE4.enums.Color;

import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Piste implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long numPiste ;
     String namePiste;
    @Enumerated(EnumType.STRING)
     Color color;
     int length;
     int slope;
    @ManyToMany
     Set <Skier> skiers;

}
