/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalejercicio;

import java.util.Scanner;

/**
 *
 * @author maria
 */

/*
Escribir un programa que gestione el cobro de una máquina expendedora de
golosinas.
El programa que se pide consiste en que se puedan ingresar dos valores. Uno es el
precio del producto y el otro es la cantidad de dinero que ingresa el usuario.
El programa deberá calcular el vuelto, teniendo en cuenta que se trata de dar la
menor cantidad posible de billetes. Ejemplo, si hay que devolver $60, lo ideal sería
devolver primero $50 y después $10 (NO 6 billetes de $10 ni 3 billetes de $20).
Para poder representarlo, indicar cuáles y cuántos billetes se deben dar para
entregar un vuelto. Tendremos en cuenta para este ejercicio que se utilizarán
billetes de $100, $50, $20, $10, $5, $2 y $1.
*/


public class Ejercicio2 {
    
    
    public static void main (String[] args){ 
    
    Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto elegido: ");
    int precioProducto = teclado.nextInt();
    
        System.out.println("Ingrese el monto de dinero con el que paga el producto: ");
    int pagoDelProducto = teclado.nextInt();
    
    int vuelto = pagoDelProducto - precioProducto;
        System.out.println("Su vuelto es: "+vuelto);       
        
        
    
    int valorDeLosBilletes[] = {100, 50, 20, 10, 5, 2, 1};
    int cantidadDeBilletes[] = new int[valorDeLosBilletes.length];
    // {0,0,0,0,0,0,0}
    //vuelto = 90
     
    
    for (int i = 0; i < valorDeLosBilletes.length; i ++){
        
        cantidadDeBilletes[i] = vuelto / valorDeLosBilletes[i];
        vuelto %= valorDeLosBilletes[i];
    }
     //      {0,1,2,0,0,0,0}
    for(int i=0;i<cantidadDeBilletes.length;i++)
    {
        if(cantidadDeBilletes[i]>0)
        {
            System.out.println("La cantidad de billetes de "+valorDeLosBilletes[i]+" es de: "+cantidadDeBilletes[i]);
        }
    }
        
    }
    
}
    
    