package org.jorge.patrones.decorador2;

import org.jorge.patrones.decorador2.decoradores.ConCremaDecorador;

public class EjemploCafe {
    public static void main(String[] args) {
        Configurable cafe1 = new Cafe(10f,"Americano");
        ConCremaDecorador cafe1CC = new ConCremaDecorador(cafe1);
        System.out.println("cafe1CC.getIngredientes() = " + cafe1CC.getIngredientes());
        System.out.println("cafe1CC.getPrecioBase() = " + cafe1CC.getPrecioBase());
    }
}
