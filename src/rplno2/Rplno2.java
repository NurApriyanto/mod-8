/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rplno2;

import java.util.Scanner;

/**
 *
 * @author USER PC
 */
public class Rplno2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	System.out.print("mauskan angka = ");
        Scanner scaner = new Scanner(System.in); 
        int i; 
        int n = scaner.nextInt(); 
 
        for (i = 0; i < (2 * n) + 1; i++) { 
 
            for (int j = 0; j < (2 * n) + 1; j++) { 
 
                if (i < n) { 
                    if ((j > n - i) && (j < n + i)) { 
                        System.out.print("*"); 
                    } else { 
                        System.out.print("0"); 
                    } 
                } else { 
 
                    if ((j > i - n) && (j < 3*n-i)) { 
                        System.out.print("*"); 
                    } else { 
                        System.out.print("0"); 
                    } 
 
                } 
            } 
            System.out.println(); 
 
        } 
    } 
    }