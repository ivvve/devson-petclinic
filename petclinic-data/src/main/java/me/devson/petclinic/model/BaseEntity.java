package me.devson.petclinic.model;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class BaseEntity implements Serializable {

    private Long id;
}
