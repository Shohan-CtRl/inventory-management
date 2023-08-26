package com.interview.interviewassessment.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Product{
    // Auto increments the ID
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    // Stores product name
    private String name;
    // Stores product Description
    private String description;
    // Stores product stock quantity
    private int currentStockLevel;
    // Stores Minimum stock level before re orders have to be made. Helps trigger warnins in FE.
    private int reorderPoint;
    // Stores total units sold
    private int totalUnitsSold;

}
