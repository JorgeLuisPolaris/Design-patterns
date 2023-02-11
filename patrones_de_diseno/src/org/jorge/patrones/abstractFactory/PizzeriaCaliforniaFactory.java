package org.jorge.patrones.abstractFactory;

import org.jorge.patrones.abstractFactory.productos.*;

public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory{

    @Override
    PizzaProducto crearPizza(String tipo) {
        return switch (tipo) {
            case "vegetariana" -> new PizzaCaliforniaVegetariana();
            case "queso" -> new PizzaCaliforniaQueso();
            default -> null;
        };
    }
}
