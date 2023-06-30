package testParte1;

import Parte1.*;


public class testparte1 {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Jeremias", 10000);
        imprimir(empleado1);
        //System.out.println("Empleado1: " + empleado1.obtenerDetalles());
        Gerente gerente1 = new Gerente("Abel", 5000, "Sistemas");
        imprimir(gerente1); //poliformismo
        //System.out.println("Gerente1: " + gerente1.obtenerDetalles());
    }
    
    public static void imprimir(Empleado empleado){
        System.out.println("Empleado: " + empleado.obtenerDetalles());
    }
            
    
}
