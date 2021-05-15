package com.versatilepropertysolutions.property.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PropertyController {

    @GetMapping("/properties")
    public List<PropertyEntity> getProperties() {
        List<PropertyEntity> properties = new ArrayList<>();
        var property = new PropertyEntity();
        property.setAddressLine1("105 Blan St.");
        property.setCity("Columbus");
        property.setState("GA");
        property.setZipCode("31907");

        properties.add(property);
        return properties;
    }
}
