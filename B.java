/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b;

import java.util.Scanner;

/**
 *
 * @author Anita
 */
public class B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input =  new Scanner(System.in); 
    
    double w=0;
    double BMI;
    int h=0;
    
    
    
    
    String name; // used for storing name of the user
    System.out.print("Enter your name:");
    name = input.nextLine();
    int result;  // used for storing result user will type in
    System.out.print("Enter your height(inches)");
    h = input.nextInt();
    
    
    System.out.print("Enter your weight in lbs");
    w= input.nextDouble();
    
    System.out.println("Name:" + name);
    System.out.println( h/12 + " ft, "+ h%12 + " in ");
    System.out.println("weight:"+w);
    
   
  
   BMI = w/(h*h*703);
   if(BMI  <= 18.5)
        System.out.println("Your BMI is underweight");
   else if(BMI >=18.5 && BMI <=24.9)
       System.out.println("Your BMI is Normal weight");
   else if(BMI>=25 && BMI <=29.9)
       System.out.println("Your BMI is overweight");
   else if(BMI>=30)
       System.out.println("Your BMI is obesity");
       
    
    
    
        
        
        
        
                
        
    }
    
}
