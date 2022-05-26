
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ERIK
 */
public class Account {

    private String username, password;

    public Account(String username, String password) throws PasswordException {
        int number = 0;
        int upper = 0;
        for (int i = 0; i < password.length(); i++) {
            Character c = password.charAt(i);

            if (Character.isDigit(i)) {
                number++;
            } else if (Character.isUpperCase(i)) {
                upper++;
            }
        }
        System.out.println(""+number);
        if (password.length() < 6 || number < 2 || upper < 1) {
            throw new PasswordException();}
        else {
            this.username = username;
            this.password = password;
        }
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Användarnamn=" + username + ", Lösenord=" + password;
    }

}
