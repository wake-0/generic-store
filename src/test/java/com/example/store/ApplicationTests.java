package com.example.store;

import com.example.store.base.Fish;
import com.example.store.generic.GenericPet;
import com.example.store.generic.GenericPetRepository;
import com.example.store.normal.FishRepository;
import com.example.store.normal.Pet;
import com.example.store.normal.PetRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ApplicationTests {

    @Autowired
    private PetRepository petRepository;
    @Autowired
    private FishRepository fishRepository;
    @Autowired
    private GenericPetRepository genericPetRepository;

    @Test
    void storePet() {
        Fish fish = new Fish();
        fish.setId(1L);
        fish.setName("Fish");

        fish = this.fishRepository.save(fish);

        Pet pet = new Pet();
        pet.setId(1L);
        pet.setFish(fish);

        this.petRepository.save(pet);

        final List<Pet> pets = this.petRepository.findAll();
        assertThat(pets).hasSize(1);
    }

    @Test
    void storeGenericPet() {
        final Fish fish = new Fish();
        fish.setId(1L);
        fish.setName("Fish");

        final GenericPet<Fish> pet = new GenericPet<>();
        pet.setId(1L);
        pet.setPet(fish);

        this.genericPetRepository.storeGenericPet(pet);

        final List<GenericPet<Fish>> allFishes = this.genericPetRepository.getAllFishes();
        assertThat(allFishes).hasSize(1);
    }
}
