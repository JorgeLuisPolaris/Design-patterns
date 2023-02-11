package org.jorge.patrones.decorator;

import org.jorge.patrones.decorator.decoradores.MayusculaDecorador;
import org.jorge.patrones.decorator.decoradores.ReversaDecorador;
import org.jorge.patrones.decorator.decoradores.SubrayadoDecorador;

public class EjemploDecorador {
    public static void main(String[] args) {
        Formateable texto = new Texto("Hola como estas");
        MayusculaDecorador mayuscula = new MayusculaDecorador(texto);
        ReversaDecorador reversaDecorador = new ReversaDecorador(mayuscula);
        SubrayadoDecorador subrayar = new SubrayadoDecorador(reversaDecorador);
        System.out.println("subrayar.darFormato() = " + subrayar.darFormato());
    }
}
