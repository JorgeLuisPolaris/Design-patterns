package org.jorge.patrones.abstractFactory;

import org.jorge.patrones.abstractFactory.productos.PizzaProducto;

abstract public class PizzeriaZonaAbstractFactory {
    public PizzaProducto ordernarPizza(String tipo){
        PizzaProducto pizza = crearPizza(tipo);
        System.out.println("Fabricando la pizza " + pizza.getNombre());
        pizza.preparar();
        pizza.cocinar();
        pizza.cortar();
        pizza.empaquetar();
        return pizza;
    }

    abstract PizzaProducto crearPizza(String tipo);
}
