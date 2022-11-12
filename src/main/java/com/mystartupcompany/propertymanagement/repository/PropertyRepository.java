package com.mystartupcompany.propertymanagement.repository;

import com.mystartupcompany.propertymanagement.entity.PropertyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyRepository extends JpaRepository<PropertyEntity, Long> {
}
