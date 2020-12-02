package com.kbak.myrestwebapp.api.model;

import lombok.Data;

/**
 * Created by Kacper Bąk on 01/12/2020
 */

@Data
public class PetDTO {
    Long id;
    String name;
    String status;
}
