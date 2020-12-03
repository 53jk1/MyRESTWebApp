package com.kbak.myrestwebapp.repositories;

import com.kbak.myrestwebapp.domain.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PetRepository extends JpaRepository<Pet, Long> {

    List<Pet> getByStatus(String status);
}
