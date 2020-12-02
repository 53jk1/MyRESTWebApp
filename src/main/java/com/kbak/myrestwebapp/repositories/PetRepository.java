package com.kbak.myrestwebapp.repositories;

import com.kbak.myrestwebapp.domain.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> {
}
