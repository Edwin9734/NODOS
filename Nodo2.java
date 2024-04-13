package org.example;

public class Nodo2 {


    String dato;
    Nodo2 enlace;

    public  Nodo2(String x){
        dato = x;
        enlace = null;
    }
    public Nodo2(String x, Nodo2 n ){
        dato = x;
        enlace = n;

    }


    public Nodo2 getEnlace(){
        return enlace;
    }
    public void setEnlace(Nodo2 n){
        enlace = n;
    }




    @Override  //para obtener esto  se hace click derecho generate toString
    public String toString() {
        return "Nodo{" +
                "dato='" + dato + '\'' +
                ", enlace=" + enlace +
                '}';
    }

}
