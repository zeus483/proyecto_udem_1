/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_1_pe;


import java.util.Random;
import java.util.Scanner;
import java.util.Stack;


/**
 *
 * @author lucifer
 */
public class ControlLista {

    Stack pila = new Stack();
    Scanner scan = new Scanner(System.in);
    Random ran = new Random(System.currentTimeMillis());

    public int tamaño;
    public int lista1[];
    public int listaordenada[];
    public int busqueda;

    public ControlLista(int tamaño, int busqueda) {
        this.tamaño = tamaño;
        this.busqueda = busqueda;
    }

    public int getBusqueda() {
        return busqueda;
    }

    public void setBusqueda(int busqueda) {
        this.busqueda = busqueda;
    }

    

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

//    public void llenado(){
//         int c = 0;
//         System.out.println("Ingrese el tamaño de la lista - pila");
//        tamaño = scan.nextInt();
//        while (c <= (tamaño -1 )){
//            int dato = ran.nextInt();
//            pila.push(dato);
//            c += 1;
//        }
//    }
//    public void imprimir(){
//        while (pila.empty() == false){
//            System.out.println(pila.pop());
//        }
//    }
    public void llenado() {

        System.out.println("Ingrese el tamaño de la lista - pila");
        tamaño = scan.nextInt();
        lista1 = new int[tamaño];
        for (int i = 0; i < lista1.length; i++) {
            int dato = ran.nextInt();
            lista1[i] = dato;

        }
    }

    public void imprimir2() {
        for (int i = 0; i < lista1.length; i++) {
            System.out.println(lista1[i]);

        }
        System.out.println("-----------------------------------");
    }

    public void ordenar() {
        listaordenada = new int[tamaño];
        listaordenada = lista1;
        int j;
        int aux = 0;
        for (int i = 1; i < listaordenada.length; i++) {

            aux = listaordenada[i];

            j = i - 1;
            while ((j >= 0) && listaordenada[j] > aux) {
                listaordenada[j + 1] = listaordenada[j--];
                listaordenada[j + 1] = aux;
            }

        }
        for (int i = 0; i < listaordenada.length; i++) {
            System.out.println(listaordenada[i]);

        }
    }
    public void bucar_normal(){
        System.out.println("que dato desea buscar: ");
        busqueda = scan.nextInt();
       int c = 0 ;
        int res = 0;
        for (int i = 0; i < lista1.length; i++) {
            
            if (lista1[i] == busqueda){
                c = 1;
                res = i;
                break;
            }else {
                c = 2;
            }
            
        }
        if (c == 1){
            System.out.println("el dato que esta buscando esta en la posicion "+res);
        }else if(c == 2)
        {
            System.out.println("el dato no exciste");
        }
    }
    public void busquedabinaria(){
        System.out.println("que dato desea buscar: ");
        busqueda = scan.nextInt();
        int encontrado = 0;
        boolean rom = false;
        while (rom == false){
            
           
            
        int mitad = listaordenada[listaordenada.length / 2];
        
        if (mitad < busqueda){
            for (int i = 0; i < mitad; i++) {
                 
                if (listaordenada[i] == busqueda){
                    encontrado = i;
                     System.out.println("---------"+encontrado);
                    rom = true;
                    
                    
                }else {
                    encontrado = 0;
                     System.out.println("---------"+encontrado);
                    rom = true;
                    
                }
                
            }
            }else if (mitad >= busqueda){
            for (int i = mitad; i < lista1.length; i++) {
                 System.out.println("---------"+encontrado);
                if (listaordenada[1] == busqueda){
                    
                    encontrado = i;
                     System.out.println("---------"+encontrado);
                    rom = true;
                    
                }else{
                    encontrado = 0;
                     System.out.println("---------"+encontrado);
                    rom = true;
                    
                }
                
            }
        }   
    }
        if (encontrado == 0){
            System.out.println("el dato no se encontro");
        }else if (encontrado != 0){
            System.out.println("el dato esta en la posicion "+encontrado);
        }
    }
    }
