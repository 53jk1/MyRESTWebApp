package com.kbak.myrestwebapp.controllers;

import com.kbak.myrestwebapp.api.model.PetDTO;
import com.kbak.myrestwebapp.api.model.PetListDTO;
import com.kbak.myrestwebapp.services.PetService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Kacper Bąk on 03.12.2020
 */

@Controller
@RequestMapping("/api/pet/")
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    @GetMapping("{id}")
    public ResponseEntity<PetDTO> getPetById(@PathVariable Long id) {
        return new ResponseEntity<PetDTO>(petService.getPetById(id), HttpStatus.OK);
    }


    @GetMapping("findByStatus")
    public ResponseEntity<PetListDTO> getPetsByStatus(@RequestParam String status) {
        return new ResponseEntity<PetListDTO>(
                new PetListDTO(petService.getPetByStatus(status)), HttpStatus.OK
        );
    }
}
