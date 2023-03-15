package com.michalwozniak86.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    private long id;
    private String name;
    private String registrationNumber;
    private String description;
    private String color;
    private int carYear;
    private boolean isFixed = false;

}
