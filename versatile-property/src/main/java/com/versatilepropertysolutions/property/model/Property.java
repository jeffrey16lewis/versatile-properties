package com.versatilepropertysolutions.property.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Property{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int numberofbeds;
    private float numberofbaths;
    private String hometype;
    private Double price;
    private Double mortgagezestimate;
    private Double estimatedmortgage;
    private Double rentzestimate;
    private String addressline1;
    private String addressline2;
    private String city;
    private String state;
    private String zipcode;

}
