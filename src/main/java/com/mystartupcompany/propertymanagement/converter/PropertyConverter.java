package com.mystartupcompany.propertymanagement.converter;

import com.mystartupcompany.propertymanagement.DTOs.PropertyDTO;
import com.mystartupcompany.propertymanagement.entity.PropertyEntity;
import org.springframework.stereotype.Component;

@Component
public class PropertyConverter {

    public PropertyEntity convertDTOtoENTITY(PropertyDTO propertyDTO){

        PropertyEntity pe = new PropertyEntity();
        pe.setTitle(propertyDTO.getTitle());
        pe.setOwnersAddress(propertyDTO.getOwnersAddress());
        pe.setOwnersEmail(propertyDTO.getOwnersEmail());
        pe.setOwnersFirstName(propertyDTO.getOwnersFirstName());
        pe.setOwnersLastName(propertyDTO.getOwnersLastName());
        pe.setPrise(propertyDTO.getPrise());
        pe.setDescription(propertyDTO.getDescription());
        return pe;
    }
}
