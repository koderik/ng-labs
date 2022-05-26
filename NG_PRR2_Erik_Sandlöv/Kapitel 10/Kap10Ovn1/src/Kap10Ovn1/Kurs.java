/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap10Ovn1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author erik.sandlov
 */
class Kurs {

    private String namn;
    private List<Student> studentList = new ArrayList<>();

    public Kurs(String namn) {
        this.namn = namn;
    }

    public void addStudent(Student s) {
        if (!studentList.contains(s)) {
            studentList.add(s);

        }
        if (!s.getKursList().contains(this)) {
            s.addKurs(this);
        }
    }

    public void removeStudent(Student s) {
        if (studentList.contains(s)) {
            studentList.remove(s);

        }
        if (s.getKursList().contains(this)) {
            s.removeKurs(this);
        }
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    @Override
    public String toString() {
        String s = namn + " innehåller eleverna: \n";
        for (Student a : studentList) {
            s += a.getName() + " ";
        }
        return s;
    }

}
