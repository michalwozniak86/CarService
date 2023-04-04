package com.michalwozniak86.service;

import com.michalwozniak86.model.Car;

import java.io.IOException;


public interface CarInterface {

    Car get() throws IOException;
    void addCar(Car car) throws IOException;
}

