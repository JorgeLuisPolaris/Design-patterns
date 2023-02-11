package org.jorge.patrones.decorador2.decoradores;

import org.jorge.patrones.decorador2.Configurable;

abstract public class CafeDecorador implements Configurable {
    protected Configurable cafe;

    public CafeDecorador(Configurable cafe) {
        this.cafe = cafe;
    }
}
