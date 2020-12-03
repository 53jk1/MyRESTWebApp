package com.kbak.myrestwebapp.api.mapper;

import com.kbak.myrestwebapp.api.model.PetDTO;
import com.kbak.myrestwebapp.domain.Pet;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PetMapper {

    PetMapper INSTANCE = Mappers.getMapper(PetMapper.class);

    PetDTO petToPetDTO(Pet pet);
}
