package com.kbak.myrestwebapp.controllers;

import com.kbak.myrestwebapp.api.model.PetDTO;
import com.kbak.myrestwebapp.api.model.PetListDTO;
import com.kbak.myrestwebapp.services.PetService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Kacper Bąk on 03.12.2020
 */

@RestController
@RequestMapping("/api/pet/")
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public PetDTO getPetById(@PathVariable Long id) {
        return petService.getPetById(id);
    }


    @GetMapping("findByStatus/{status}")
    public ResponseEntity<PetListDTO> getPetsByStatus(@PathVariable String status) {
        return new ResponseEntity<PetListDTO>(
                new PetListDTO(petService.getPetByStatus(status)), HttpStatus.OK
        );
    }

    @PostMapping
    public ResponseEntity<PetDTO> createNewPet(@RequestBody PetDTO petDTO) {
        return new ResponseEntity<PetDTO>(petService.createNewPet(petDTO), HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public ResponseEntity<PetDTO> updatePet(@PathVariable Long id, @RequestBody PetDTO petDTO) {
        return new ResponseEntity<PetDTO>(petService.updatePet(id, petDTO), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deletePet(@PathVariable Long id) {

        petService.deletePetById(id);

        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}
