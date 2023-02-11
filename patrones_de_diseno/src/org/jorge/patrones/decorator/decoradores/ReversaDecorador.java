package org.jorge.patrones.decorator.decoradores;

import org.jorge.patrones.decorator.Formateable;

public class ReversaDecorador extends TextoDecorador{
    @Override
    public String darFormato() {
        StringBuilder sb = new StringBuilder(texto.darFormato());
        return sb.reverse().toString();
    }

    public ReversaDecorador(Formateable texto) {
        super(texto);
    }
}
