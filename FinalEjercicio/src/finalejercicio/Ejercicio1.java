/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalejercicio;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author maria
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */ 
    /*
    
    Escribir un programa que permita el ingreso de la cantidad de notas a cargar,
    luego, que permita ingresar cada una de las notas y mostrar por la pantalla:
    • Promedio de las notas ingresadas
    • Mensaje de "APROBADO" si el promedio es mayor o igual a 6.
    • Mensaje de "NO APROBADO" en caso de que el promedio sea menor a 6
    y que alguna de las notas cargadas sea menor o igual a 3.
    • Mensaje de "A RECUPERATORIO" en caso de que el promedio sea menor
    a 6 y que ninguna de las notas sea menor o igual a 3.

    */

    public static void main (String[] args){
    
    String resultado = resultadoFinal();
        System.out.println("El resultado final es: "+resultado);
    }
    
    public static String resultadoFinal(){
        
        double[] vector = crearVector();
       
        DecimalFormat df = new DecimalFormat("#.##");
        String promedioFormateado = df.format(promedio(vector));
        System.out.println("El promedio de las notas que ingresó es: "+promedioFormateado);
        
        if (promedio(vector) >= 6){
           return "APROBADO";
            
        } else if( promedio(vector) < 6 && menorIguala3(vector)==true){
           return "NO APROBADO";
             
        } else{
           return "RECUPERATORIO";
        } 
    }
    
    public static double[] crearVector(){
    
        Scanner tecla = new Scanner (System.in); 
        System.out.println("Ingrese la cantidad de notas del promedio a realizar y presione enter: ");
        
        int longitud = tecla.nextInt();
        double notas[] = new double[longitud];
         
        
        for (int i = 0; i < notas.length; i++){
            System.out.println("Ingrese nota y presione enter: ");
             notas[i] = tecla.nextDouble();
  
        }
        return notas;
    }
    
    
    public static double suma(double[] notas){     
        double suma = 0;
        for(double n : notas) suma+= n;
            return suma;
    }

    public static double promedio(double[] notas){
        double promedio = suma(notas)/notas.length;
        return promedio;
    }
    
    public static boolean menorIguala3(double[] notas)
    {
        for(double n:notas){
            if(n <= 3){
               return true;
            }
        }
        return false;
    }
}

        

