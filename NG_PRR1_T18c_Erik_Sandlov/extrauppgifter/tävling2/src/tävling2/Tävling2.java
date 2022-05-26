/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tävling2;

import java.util.Scanner;

/**
 *
 * @author erik.sandlov
 */
public class Tävling2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int[] height= {0,1,0,2,1,0,1,3,2,1,2,1};
        int rain = 0;
        for(int i = 1; i<height.length; i++){
            for(int j = i; j<height.length-1; j++){
            if(height[i-1]>height[i] && height[j+1]>height[i]){
                rain++;
                break;
            }}
        }
            
        System.out.println(rain);  
    }    
    }
        
        
    



   

 
    

