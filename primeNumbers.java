/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pattern;

/**
 *
 * @author ICT5
 */
import java.util.*;

public class primeNumbers {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input Number = ");
        int n =in.nextInt();
        
      if(n % 2==0 || n % 3==0){
          System.out.println(n+ " is not a prime number");
      }else{
          System.out.println(n+ " is a prime number");
      }
    }
    
}
