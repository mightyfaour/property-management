package com.mystartupcompany.propertymanagement.Controllers;


import com.mystartupcompany.propertymanagement.DTOs.PropertyDTO;
import com.mystartupcompany.propertymanagement.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/property")
public class PropertyController {
    @Autowired
    private PropertyService propertyService;

    @PostMapping("/save-properties")
    public PropertyDTO saveProperty(@RequestBody PropertyDTO propertyDTO){
        return propertyDTO;

    }

}
