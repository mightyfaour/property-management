package com.mystartupcompany.propertymanagement.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name="PROPERTY_TABLE")
@Getter
@Setter
@NoArgsConstructor
public class PropertyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="PROPERTY_TITLE", nullable = false)
    private String title;
    @Column(name="PROPERTY_DESCRIPTION", nullable = false, length = 100)
    private String description;
    @Column(name="OWNER_FIRST_NAME", nullable = false,length = 40)
    private String ownersFirstName;
    @Column(name="OWNER_LAST_NAME", nullable = false,length = 40)
    private String ownersLastName;
    @Column(name="OWNER_pHONE_NO:", nullable = false,length = 11)
    private String ownersPhoneNo;
    @Column(name="OWNER_EMAIL", nullable = false)
    private String ownersEmail;
    @Column(name="OWNER_ADDRESS", nullable = false)
    private String ownersAddress;
    @Column(name="PRISE", nullable = false)
    private BigInteger prise;
}
