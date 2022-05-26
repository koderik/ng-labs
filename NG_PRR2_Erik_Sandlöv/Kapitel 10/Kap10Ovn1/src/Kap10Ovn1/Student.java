/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap10Ovn1;

import java.util.ArrayList;

/**
 *
 * @author erik.sandlov
 */
public class Student extends Person {

    private ArrayList<Kurs> kursList = new ArrayList<>();

    public Student(String name, String adress, String age) {
        super(name, adress, age);
    }

    public void addKurs(Kurs k) {
        if (!kursList.contains(k)) {
            kursList.add(k);
            k.addStudent(this);

        } else {
            System.out.println(this.getName() + " deltar redan i " + k.getNamn());
        }

    }

    public void removeKurs(Kurs k) {
        if (kursList.contains(k)) {

            kursList.remove(k);
            k.removeStudent(this);
        } else {
            System.out.println(this.getName() + " deltar inte i " + k.getNamn());
        }
    }

    @Override
    public String toString() {
        String s = super.toString();
        for (Kurs k : kursList) {
            s += ", " + k.getNamn();
        }
        return s;
    }

    public ArrayList<Kurs> getKursList() {
        return kursList;
    }

}
