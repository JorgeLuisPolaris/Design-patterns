package org.jorge.patrones.abstractFactory.productos;

public class PizzaCaliforniaQueso extends PizzaProducto{

    public PizzaCaliforniaQueso() {
        super();
        nombre = "Pizza queso California";
        masa = "Masa a la piedra";
        salsa = "Salsa de tomate premium";
        ingredientes.add("Extra queso");
        ingredientes.add("Tomate");
        ingredientes.add("Cebolla");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 35 min a 100° C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas cuadradas.");
    }
}
