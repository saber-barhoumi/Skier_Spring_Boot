package tn.esprit.SaberBarhoumi4SE4.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Skier implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long numSkier;
     String firstname;
     String lastname;
     @Column(nullable = false)
     LocalDate birthDate;
     int age;
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
     Subscription subscription;
    @JsonIgnore
    @OneToMany(mappedBy = "skier", fetch = FetchType.EAGER)
     Set <Registration> registrations;
    @JsonIgnore
    @ManyToMany(mappedBy = "skiers", fetch = FetchType.EAGER)
     Set <Piste> pistes;


}
