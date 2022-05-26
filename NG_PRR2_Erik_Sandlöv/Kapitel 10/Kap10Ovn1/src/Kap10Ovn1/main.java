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
public class main {

    public static void main(String[] args) {
        Student a1 = new Student("Erik", "Rakstaringen 14", "18");
        Student a2 = new Student("Göran", "Ghettot 3", "18");
        System.out.println(a1.toString());
        Kurs k1 = new Kurs("Matte 5");
        k1.addStudent(a1);
        System.out.println(k1.toString());
        a2.addKurs(k1);
        System.out.println(k1);
        k1.removeStudent(a2);
        System.out.println(k1);
        a1.removeKurs(k1);
        System.out.println(k1);

    }
}
