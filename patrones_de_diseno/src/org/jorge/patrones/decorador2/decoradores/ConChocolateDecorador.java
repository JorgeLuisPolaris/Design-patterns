package org.jorge.patrones.decorador2.decoradores;

import org.jorge.patrones.decorador2.Configurable;

public class ConChocolateDecorador extends CafeDecorador{
    public ConChocolateDecorador(Configurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecioBase() {
        return cafe.getPrecioBase()+5f;
    }

    @Override
    public String getIngredientes() {
        return cafe.getIngredientes().concat(" con chocolate");
    }
}
