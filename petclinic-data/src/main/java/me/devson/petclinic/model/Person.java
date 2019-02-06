package me.devson.petclinic.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class Person extends BaseEntity {
    private String firstName;
    private String lastName;
}
