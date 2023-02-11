package org.jorge.patrones.abstractFactory.productos;

public class PizzaNewYorkPeperoni extends PizzaProducto{

    public PizzaNewYorkPeperoni() {
        super();
        nombre = "Pizza peperoni New York";
        masa = "Masa a la piedra";
        salsa = "Salsa de tomate estandar";
        ingredientes.add("Queso mozarella");
        ingredientes.add("Peperoni");
        ingredientes.add("Aceituna");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 40 min a 90° C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas triangulares.");
    }
}
