package com.versatilepropertysolutions.property;

import com.versatilepropertysolutions.property.model.Property;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyRepository extends JpaRepository<Property, Long> {
}
