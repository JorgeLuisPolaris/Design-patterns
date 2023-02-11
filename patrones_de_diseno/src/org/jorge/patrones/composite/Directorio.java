package org.jorge.patrones.composite;

import java.util.ArrayList;
import java.util.List;

public class Directorio extends Componente{
    private List<Componente> hijos;


    public Directorio(String nombre) {

        super(nombre);
        this.hijos = new ArrayList<>();
    }
    public Componente addComponente(Componente c){
        this.hijos.add(c);
        return this;
    }
    public void removeComponente(Componente c){
        this.hijos.remove(c);
    }
    @Override
    public String mostrar(int nivel) {
        StringBuilder sb = new StringBuilder("\t".repeat(nivel));
        sb.append(nombre)
                .append("/")
                .append("\n");
        for (Componente hijo:hijos) {
            sb.append(hijo.mostrar(nivel+1)).append("\n");
        }
        return sb.toString();
    }

    @Override
    public boolean buscar(String nombre) {
        if(this.nombre.equalsIgnoreCase(nombre)){
            return true;
        }
        /*for (Componente hijo:hijos){
            if (hijo.buscar(nombre)){
                return true;
            }
        }*/

        return hijos.stream().anyMatch(hijo -> hijo.buscar(nombre));
    }
}
