package com.kbak.myrestwebapp.services;

import com.kbak.myrestwebapp.api.model.PetDTO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Kacper Bąk on 03.12.2020
 */

@Service
public interface PetService {

    List<PetDTO> getAllPets();

    PetDTO getPetById(Long id);

    List<PetDTO> getPetByStatus(String status);

}
