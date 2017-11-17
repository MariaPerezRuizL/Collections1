/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Collections {

    private int arregloInt[]={1,2,3,4,5,6};
    private double arregloDouble[]={8.4, 9.3, 0.2, 7.9, 3.4};
    private int arregloIntLleno[], copiaArregloInt[];
    
    //Constructor arreglos: los inicializa
    public Collections()
    {
        arregloIntLleno=new int[10]; //creo un arreglo int de 10 elementos
        copiaArregloInt=new int[arregloIntLleno.length];//creo un arreglo de la misma dim
        
        //Utilizo los métodos de rellenar y ordenar de la clase ARRAYS
        Arrays.fill(arregloIntLleno, 7); //Lo relleno con 7'2
        Arrays.sort(arregloDouble);
       
    }
    
    //Método para imprimir arreglos
    public void imprimirArreglos()
    {
        System.out.println("ARRAY DE DOUBLE: ");
        for(double valorDouble: arregloDouble)
        {
            //Imprimo con formato
            System.out.printf("%.1f\n",valorDouble);
        }
        System.out.println("\nARRAY DE ENTEROS");
        for(int valorEntero:arregloInt)
        {
            System.out.printf("%d\n", valorEntero);
        }

    }
    
    public int buscarArreglo(int valor)
    {
        int resultado;
        resultado=Arrays.binarySearch(arregloInt, valor);
        return resultado;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello world");
        
        //Creo un objeto de colección
        Collections col=new Collections();
        col.imprimirArreglos();
        //Método buscar
        int posicion=col.buscarArreglo(4);
        //Manipulamos el resultado de buscar en el array
        System.out.println(posicion);
        if(posicion>=0)
            System.out.println("Posición: "+(posicion+1));
            
           
        else
            System.out.println("NO SE HA ENCONTRADO");
         
        
        System.out.print(col.buscarArreglo(10));
         
        
       
    }
    
}
