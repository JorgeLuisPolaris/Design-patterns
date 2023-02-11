package org.jorge.patrones.abstractFactory;

import org.jorge.patrones.abstractFactory.productos.PizzaProducto;

public class EjemploFactory {
    public static void main(String[] args) {
        PizzeriaZonaAbstractFactory pizzeria1 = new PizzeriaCaliforniaFactory();
        PizzaProducto pizza1= pizzeria1.ordernarPizza("vegetariana");

    }
}
