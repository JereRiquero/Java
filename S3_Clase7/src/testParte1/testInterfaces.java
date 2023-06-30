
package testParte1;

import parte1.*;

public class testInterfaces {
    public static void main(String[] args) {
        IAccesoDatos datos = new ImplementacionMySql(); 
        //datos.listar();
        //imprimir(datos);
        datos = new ImplementacionOracle();
        //datos.listar();
        imprimir(datos);
    }
    
    public static void imprimir(IAccesoDatos datos){
        datos.listar();
    }
}
