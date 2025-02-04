package org.lessons.java.utils;

public class CalcoliHelper {
    
    //Costruttore privato
    private CalcoliHelper(){
    
    }

    //Somma interi
    public static int somma(int a, int b){
        return a + b;
    }

    //Somma double
    public static double somma(double a, double b){
        return a + b;
    }
    
    //Differenza interi
    public static int differenza(int a, int b){
        return a - b;
    }

    //Differenza double
    public static double differenza(double a, double b){
        return a - b;
    }

    // Moltiplicazione interi
    public static int moltiplicazione(int a, int b) {
        return a * b;
    }

    // Moltiplicazione double
    public static double moltiplicazione(double a, double b) {
        return a * b;
    }

    // Valore assoluto di un numero intero
    public static int valoreAssoluto(int a) {
        return Math.abs(a);
    }

    // Valore assoluto di un numero double
    public static double valoreAssoluto(double a) {
        return Math.abs(a);
    }
}

