package org.jorge.patrones.abstractFactory;

import org.jorge.patrones.abstractFactory.productos.PizzaNewYorkItaliana;
import org.jorge.patrones.abstractFactory.productos.PizzaNewYorkPeperoni;
import org.jorge.patrones.abstractFactory.productos.PizzaNewYorkVegetariana;
import org.jorge.patrones.abstractFactory.productos.PizzaProducto;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory{
    @Override
    PizzaProducto crearPizza(String tipo) {
        return switch (tipo) {
            case "vegetariana" -> new PizzaNewYorkVegetariana();
            case "peperoni" -> new PizzaNewYorkPeperoni();
            case "italiana" -> new PizzaNewYorkItaliana();
            default -> null;
        };
    }
}
