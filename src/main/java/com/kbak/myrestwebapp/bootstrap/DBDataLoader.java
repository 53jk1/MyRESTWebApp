package com.kbak.myrestwebapp.bootstrap;

import com.kbak.myrestwebapp.domain.Pet;
import com.kbak.myrestwebapp.repositories.PetRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Kacper Bąk on 01/12/2020
 */
@Component
public class DBDataLoader implements CommandLineRunner {

    PetRepository petRepository;

    public DBDataLoader(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    /**
     * Callbak used to run the bean.
     *
     * @param args incoming main method arguments
     * @throws Exception on error
     */

    @Override
    public void run(String... args) throws Exception {

        Pet dog = new Pet();
        dog.setName("Dog");
        dog.setStatus("available");

        Pet cat = new Pet();
        cat.setName("Cat");
        cat.setStatus("available");

        Pet parrot = new Pet();
        parrot.setName("Parrot");
        parrot.setStatus("available");

        Pet cow = new Pet();
        cow.setName("Cow");
        cow.setStatus("available");

        Pet horse = new Pet();
        horse.setName("Horse");
        horse.setStatus("available");

        petRepository.save(dog);
        petRepository.save(cat);
        petRepository.save(parrot);
        petRepository.save(cow);
        petRepository.save(horse);

        System.out.println("Data loaded to DB!");

    }
}