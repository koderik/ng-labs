/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap10Ovn1;

/**
 *
 * @author erik.sandlov
 */
public class Person {

    private String name, adress, age;

    public Person(String name, String adress, String age) {
        this.name = name;
        this.adress = adress;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public String getAge() {
        return age;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", adress=" + adress + ", age=" + age + '}';
    }

}
