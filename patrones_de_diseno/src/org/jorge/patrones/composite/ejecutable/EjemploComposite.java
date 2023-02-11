package org.jorge.patrones.composite.ejecutable;

import org.jorge.patrones.composite.Archivo;
import org.jorge.patrones.composite.Directorio;

public class EjemploComposite {
    public static void main(String[] args) {
        Directorio doc = new Directorio("Documentos");
        Directorio java = new Directorio("Java");
        java.addComponente(new Archivo("Patron-composite.doc"));
        java.addComponente(new Archivo("doc.java"));
        Directorio stream = new Directorio("Api stream");
        stream.addComponente(new Archivo("ApiStream.java"));
        doc.addComponente(stream);
        doc.addComponente(java);
        System.out.println(doc.mostrar(0));
        boolean encontrado = doc.buscar("doc.java");
        System.out.println("encontrado = " + encontrado);
    }
}
