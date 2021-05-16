package com.versatilepropertysolutions.property.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
public class Property{

    @Id
    @GeneratedValue
    private Long id;
    private Address address;
    private int numberOfBeds;
    private float numberOfBaths;
    private String homeType;
    private Double price;
    private Double mortgageZestimate;
    private Double estimatedMortgage;
    private Double rentZestimate;

}
