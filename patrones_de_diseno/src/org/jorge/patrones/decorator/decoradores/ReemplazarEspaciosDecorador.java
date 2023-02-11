package org.jorge.patrones.decorator.decoradores;

import org.jorge.patrones.decorator.Formateable;

public class ReemplazarEspaciosDecorador extends TextoDecorador{
    public ReemplazarEspaciosDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
            return texto.darFormato().replace(" ","-");
    }
}
