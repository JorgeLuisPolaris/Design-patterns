package org.jorge.patrones.abstractFactory.productos;

public class PizzaCaliforniaVegetariana extends PizzaProducto{

    public PizzaCaliforniaVegetariana() {
        super();
        nombre = "Pizza vegetariana California";
        masa = "Masa vegana";
        salsa = "Salsa de tomate vegana";
        ingredientes.add("Queso vegano");
        ingredientes.add("Tomate");
        ingredientes.add("Aceituna");
        ingredientes.add("Espinaca");
        ingredientes.add("Berenjenas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 20 min a 150° C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas rectangulares.");
    }
}
