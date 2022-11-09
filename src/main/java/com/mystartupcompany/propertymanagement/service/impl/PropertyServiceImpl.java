package com.mystartupcompany.propertymanagement.service.impl;

import com.mystartupcompany.propertymanagement.DTOs.PropertyDTO;
import com.mystartupcompany.propertymanagement.entity.PropertyEntity;
import com.mystartupcompany.propertymanagement.repository.PropertyRepository;
import com.mystartupcompany.propertymanagement.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropertyServiceImpl implements PropertyService {

    @Autowired
    private PropertyRepository propertyRepository;
    @Override
    public PropertyDTO saveProperty(PropertyDTO propertyDTO) {

        PropertyEntity pe = new PropertyEntity();
        pe.setTitle(propertyDTO.getTitle());
        pe.setOwnersAddress(propertyDTO.getOwnersAddress());
        pe.setOwnersEmail(propertyDTO.getOwnersEmail());
        pe.setOwnersFirstName(propertyDTO.getOwnersFirstName());
        pe.setOwnersLastName(propertyDTO.getOwnersLastName());
        pe.setPrise(propertyDTO.getPrise());
        propertyRepository.save(pe);

        return null;
    }
}
