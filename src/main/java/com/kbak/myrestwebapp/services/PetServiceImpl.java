package com.kbak.myrestwebapp.services;

import com.kbak.myrestwebapp.api.mapper.PetMapper;
import com.kbak.myrestwebapp.api.model.PetDTO;
import com.kbak.myrestwebapp.repositories.PetRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Kacper Bąk on 03.12.2020
 */

@Service
public class PetServiceImpl implements PetService {

    PetRepository petRepository;
    PetMapper petMapper;

    public PetServiceImpl(PetRepository petRepository, PetMapper petMapper) {
        this.petRepository = petRepository;
        this.petMapper = petMapper;
    }

    @Override
    public List<PetDTO> getAllPets() {
        return petRepository.findAll()
                .stream()
                .map(petMapper::petToPetDTO)
                .collect(Collectors.toList());
    }

    @Override
    public PetDTO getPetById(Long id) {
        return petMapper.petToPetDTO(petRepository.findById(id).get());
    }

    @Override
    public List<PetDTO> getPetByStatus(String status) {
        return petRepository.getByStatus(status)
                .stream()
                .map(petMapper::petToPetDTO)
                .collect(Collectors.toList());
    }
}
