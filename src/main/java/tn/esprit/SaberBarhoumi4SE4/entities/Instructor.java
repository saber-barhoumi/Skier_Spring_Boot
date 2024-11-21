package tn.esprit.SaberBarhoumi4SE4.entities;

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
public class Instructor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long numInstructor;
     String firstname;
     String lastname;
     LocalDate dateOfHire;
    @OneToMany(mappedBy = "instructor")
     Set <Course> courses;
}
