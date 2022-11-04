package com.mystartupcompany.propertymanagement.service.impl;

import com.mystartupcompany.propertymanagement.DTOs.PropertyDTO;
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
        propertyRepository.save();
        return null;
    }
}
