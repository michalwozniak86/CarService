package com.michalwozniak86.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    private String name;
    private String registrationNumber;
    private String color;
    private int carYear;
    private Date date;

}
