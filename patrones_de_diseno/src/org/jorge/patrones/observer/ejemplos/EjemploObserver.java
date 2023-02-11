package org.jorge.patrones.observer.ejemplos;

import org.jorge.patrones.observer.Corporacion;

public class EjemploObserver {
    public static void main(String[] args) {
        Corporacion google = new Corporacion("Google",1000);
        google.addObserver(observable -> {
            System.out.println("John: " + ((Corporacion)observable).getNombre() + " Nuevo precio: " +((Corporacion)observable).getPrecio());
        });

        google.addObserver(observable -> {
            System.out.println("Andrés: " + ((Corporacion)observable).getNombre() + " Nuevo precio: " +((Corporacion)observable).getPrecio());
        });

        google.addObserver(observable -> {
            System.out.println("Maria: " + ((Corporacion)observable).getNombre() + " Nuevo precio: " +((Corporacion)observable).getPrecio());
        });


        google.modificarPrecio(3200);
    }
}
