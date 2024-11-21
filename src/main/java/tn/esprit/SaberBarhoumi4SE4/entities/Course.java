package tn.esprit.SaberBarhoumi4SE4.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.esprit.SaberBarhoumi4SE4.enums.Support;
import tn.esprit.SaberBarhoumi4SE4.enums.TypeCourse;

import java.io.Serializable;
import java.util.Set;


@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@Entity
public class Course implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long numCourse;
     int level;
    @Enumerated(EnumType.STRING)
     TypeCourse typeCourse;
    @Enumerated(EnumType.STRING)
     Support support;
     float price ;
     int timeSloat  ;
    @OneToMany(mappedBy = "course")
    Set <Registration> registrations;
    @ManyToOne
    Instructor instructor;


}
