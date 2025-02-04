package org.lessons.java.utils;
public class CalcoliTest {
    public static void main(String[] args) throws Exception { 
            
        // Somma interi
        System.out.println("Somma interi: " + CalcoliHelper.somma(3, 5));
    
        // Somma double
        System.out.println("Somma double: " + CalcoliHelper.somma(3.5, 5.5));
    
        // Differenza interi
        System.out.println("Differenza interi: " + CalcoliHelper.differenza(10, 3));
    
        // Differenza double
        System.out.println("Differenza double: " + CalcoliHelper.differenza(10.5, 3.2));
    
        // Moltiplicazione interi
        System.out.println("Moltiplicazione interi: " + CalcoliHelper.moltiplicazione(4, 7));
    
        // Moltiplicazione double
        System.out.println("Moltiplicazione double: " + CalcoliHelper.moltiplicazione(4.5, 7.2));
    
        // Valore assoluto intero
        System.out.println("Valore assoluto intero: " + CalcoliHelper.valoreAssoluto(-10));
    
        // Valore assoluto double
        System.out.println("Valore assoluto double: " + CalcoliHelper.valoreAssoluto(-10.5));
    
        // Minimo interi
        System.out.println("Minimo interi: " + CalcoliHelper.minimo(3, 5));
    
        // Minimo double
        System.out.println("Minimo double: " + CalcoliHelper.minimo(3.5, 5.5));
    
        // Massimo interi
        System.out.println("Massimo interi: " + CalcoliHelper.massimo(10, 7));
    
        // Massimo double
        System.out.println("Massimo double: " + CalcoliHelper.massimo(10.5, 7.2));
    
        // Elevamento a potenza
        System.out.println("Elevamento a potenza (2^3): " + CalcoliHelper.elevamentoPotenza(2, 3));
        System.out.println("Elevamento a potenza (0^0): " + CalcoliHelper.elevamentoPotenza(0, 0));
    }
}
