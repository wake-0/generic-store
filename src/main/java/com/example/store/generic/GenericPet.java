package com.example.store.generic;

import lombok.Data;

import javax.persistence.Id;

@Data
public class GenericPet<T> {

    @Id
    private Long id;

    private T pet;

}
