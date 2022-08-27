package com.example.store.normal;

import com.example.store.base.Cat;
import com.example.store.base.Dog;
import com.example.store.base.Fish;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Pet {

    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @OneToOne
    @JoinColumn(name = "cat_id")
    private Cat cat;

    @OneToOne
    @JoinColumn(name = "dog_id")
    private Dog dog;

    @OneToOne
    @JoinColumn(name = "fish_id")
    private Fish fish;

}
