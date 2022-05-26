/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romb;

/**
 *
 * @author ERIK
 */
public class Romb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 45;
        for(int i = 1; i<=n; i++){
            if (i%15==0) {
                System.out.println("FizzBuzz");
            }
            else if(i%3 == 0){
                System.out.println("Fizz");
            }
            else if (i%5==0) {
               System.out.println("Buzz");
                    
                }
            else{
                System.out.println(i);
                
            }
            
        }
    }
    }
    


    
    /**
     * Metod som ritar en romb med lutning
     * @param höjd tar in hur många rader hög man vill att romben ska vara
     */
   
    

