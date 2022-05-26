/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ERIK
 */
class PasswordException extends Exception {
    
    @Override
    public String getMessage() {
        return "Lösenordet måste innehålla en portal till en annan dimension";
    }
    
}
