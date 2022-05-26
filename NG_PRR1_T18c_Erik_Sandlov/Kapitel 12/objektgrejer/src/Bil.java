/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author erik.sandlov
 */
public class Bil {
    //attribut
    private String manu;
    private String model;
    private int year;
    private String cartype;
    private String fuel;
    private int power;
    private double mileage;
    
    
    //konstruktor
    public Bil(String a, String b, int c){
        manu = a;
        model = b;
        year = c;
        
    }
    public void setMotor(String a, int b, double c){
        fuel = a;
        power = b;
        mileage = c;
    }

    public String getManu() {
        return manu;
    }

    public void setManu(String manu) {
        this.manu = manu;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCartype() {
        return cartype;
    }

    public String getFuel() {
        return fuel;
    }

    public int getPower() {
        return power;
    }

    public double getMileage() {
        return mileage;
    }

    @Override
    public String toString() {
        return "Bil{" + "Tillverkare= " + manu + ", Modell= " + model + ", År= " + year + ", Type= " + cartype + ", Bränsle= " + fuel + ", Effekt= " + power + "kw , Miltal= " + mileage + "mil}";
    }
    
}
