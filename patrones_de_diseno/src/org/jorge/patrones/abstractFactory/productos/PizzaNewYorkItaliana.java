package org.jorge.patrones.abstractFactory.productos;

public class PizzaNewYorkItaliana extends PizzaProducto{

    public PizzaNewYorkItaliana() {
        super();
        nombre = "Pizza Italiana New York";
        masa = "Masa gruesa";
        salsa = "Salsa de tomate Italiano";
        ingredientes.add("Queso mozarella");
        ingredientes.add("Jamón");
        ingredientes.add("Aceituna");
        ingredientes.add("Chorizo");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 30 min a 120° C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas triangulares grandes.");
    }
}
