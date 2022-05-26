/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilprogrammet;

/**
 *
 * @author ERIK
 */
public class Car {
    private String make, model, plate;
    private int year;

    public Car(String make, String model, String plate, int year) {
        this.make = make;
        this.model = model;
        this.plate = plate;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getPlate() {
        return plate;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        String s = make +"\t"+year+"\t"+model+"\t"+plate;
        return s;
    }
    
}
