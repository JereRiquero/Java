
package testParte1;

import Parte1.*;


public class testParte1 {
    public static void main(String[] args) {
        Empleado empleado;
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);  
        //System.out.println("empleado = " + empleado);
        //System.out.println(empleado.obtenerDetalles());
        
        //DOWNCASTING
        //((Escritor)empleado).getTipoEscritura(); //Forma 1
        Escritor escritor = (Escritor)empleado; //Forma 2
        escritor.getTipoEscritura();
        
        //UPCASTING
        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles());
         
    }
    
}
