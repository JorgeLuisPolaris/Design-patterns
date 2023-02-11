package org.jorge.patrones.singleton;

public class ConexionBDSingleton {
    //al trabajar ocn singleton solo puede existir una instancia de esta clase, por ello
    //hacemos que el contrusctor sea privado
    //crear un atributo estático que nos devuelva la instancia única

    private static ConexionBDSingleton instancia;

    private ConexionBDSingleton(){
        System.out.println("Conectandose a la bd");
    }

    public static   ConexionBDSingleton getInstance(){
        if (!(instancia instanceof ConexionBDSingleton)){
            instancia = new ConexionBDSingleton();
        }
        return instancia;
    }

}
