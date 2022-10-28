package com.mystartupcompany.propertymanagement.DTOs;

import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

@Getter
@Setter
public class PropertyDTO {
    private String title;
    private String description;
    private String ownersFirstName;
    private String ownersLastName;
    private String ownersPhoneNo;
    private String ownersEmail;
    private String ownersAddress;
    private BigInteger prise;
}
