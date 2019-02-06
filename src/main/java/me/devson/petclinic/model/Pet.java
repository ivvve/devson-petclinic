package me.devson.petclinic.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@Getter
public class Pet {
    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;
}
