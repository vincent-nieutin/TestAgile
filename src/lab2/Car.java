package lab2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vincentnieutin
 */
public class Car {
    
    String model;
    int seats;
    
    
    public Car(){
        model = "Jaguar";
        seats = 4;
    }
    
    public Car(String model, int seats){
        this.model = model;
        this.seats = seats;
    }
    
    public void getCar(){
        System.out.println("The car is a " + model + " and has " + seats + " seats.");
    }
}
