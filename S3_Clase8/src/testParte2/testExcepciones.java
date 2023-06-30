
package testParte2;

import Parte2.*;

public class testExcepciones {
    public static void main(String[] args) {
        //int resultado = 10/0;
        //System.out.println("resultado = " + resultado);
        int resultado = 0;
        try{
            resultado = Aridmetica.division(10, 0);
        }catch(OperacionException e){
            System.out.println("Ocurrio un error de tipo OperacionException");
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println("Ocurrio un error");
            e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Se reviso la division entre 0");
        }
        System.out.println("La variable tiene de valor: " + resultado);
    }
    
}
