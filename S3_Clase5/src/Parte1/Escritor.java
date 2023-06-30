/*
Laboratorio III
Jeremias Riquero
 */
package Parte1;

public class Escritor extends Empleado{
    final TipoEscritura tipoEscritura;
            
    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura){
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }
    
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles() + "\nTipo Escritura: " + tipoEscritura.getDescripcion();   
    }
    
    @Override
    public String toString() {
        return "Escritor{" + "tipoEscritura: " + tipoEscritura + '}'+ "\n"+ super.toString();
    }

    public TipoEscritura getTipoEscritura() {
        return tipoEscritura;
    }

}
