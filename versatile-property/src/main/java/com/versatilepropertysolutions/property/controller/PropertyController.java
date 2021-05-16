package com.versatilepropertysolutions.property.controller;

import com.versatilepropertysolutions.property.PropertyRepository;
import com.versatilepropertysolutions.property.model.Property;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequiredArgsConstructor
public class PropertyController {
    private final PropertyRepository propertyRepository;

    @GetMapping("/properties")
    public List<Property> getProperties() {
        return propertyRepository.findAll();
    }

    @PostMapping("/create-property")
    public void createProperty(@RequestBody Property property) {
        propertyRepository.save(property);
    }
}
