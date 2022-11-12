package com.mystartupcompany.propertymanagement.service.impl;

import com.mystartupcompany.propertymanagement.DTOs.PropertyDTO;
import com.mystartupcompany.propertymanagement.converter.PropertyConverter;
import com.mystartupcompany.propertymanagement.entity.PropertyEntity;
import com.mystartupcompany.propertymanagement.repository.PropertyRepository;
import com.mystartupcompany.propertymanagement.service.PropertyService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropertyServiceImpl implements PropertyService {


    @Autowired
    private  PropertyRepository propertyRepository;

    @Autowired
    private PropertyConverter propertyConverter;
    @Override
    public PropertyDTO saveProperty(PropertyDTO propertyDTO) {

        PropertyEntity pe = propertyConverter.convertDTOtoENTITY(propertyDTO);
        PropertyEntity property = propertyRepository.save(pe);
        return null;
    }
}
