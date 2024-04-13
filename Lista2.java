package org.example;

import java.util.Scanner;

public class Lista2 {


    public Nodo2 primero;
    public Lista2(){
        primero = null;
    }

    private String leerEntero()
    {
        System.out.println("ingrese valor , -1  para terminar");
        return  (new Scanner(System.in).nextLine());
    }

    public Lista2 crearLista(){


        String x;
        primero = null;
        for( int i=0;i<5;i++){
            x=leerEntero();
                primero =new Nodo2(x,primero);

        }
        return this;






    }


    public Lista2 insertearCabezaLista(String entrada){
        Nodo2 nuevo;
        nuevo= new Nodo2(entrada);
        nuevo.enlace=primero;
        primero=nuevo;
        return this;



    }

    public void visualizar(){
        Nodo2 n;
        int k= 0;
        n=primero;
        while (n!=null){
            System.out.println(n.dato);
            n=n.enlace;
            k++;
            //cada 15 elementos hace un salto de linea para imprimir
            System.out.print((k%15!=0?"":""));
        }

    }



//
//    String x;
//    primero = null;
//        do {
//        x=leerEntero();
//        if (Integer.parseInt(x)!=1){ //el inge tenia -1
//            x=leerEntero();
//            primero =new Nodo2(x,primero);
//        }
//    }while (x.equalsIgnoreCase("exit"));
//        return this;








}

