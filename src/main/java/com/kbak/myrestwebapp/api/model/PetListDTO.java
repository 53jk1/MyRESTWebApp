package com.kbak.myrestwebapp.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * Created by Kacper Bąk on 03.12.2020
 */

@Data
@AllArgsConstructor
public class PetListDTO {

    private List<PetDTO> petList;
}
