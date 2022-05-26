/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap8uppg1;

/**
 *
 * @author erik.sandlov
 */
public class User {

    private String name, language;
    private int age;

    public User(String name, String language, int age) {
        this.name = name;
        this.language = language;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ", " + age + ", " + language;
    }

}
