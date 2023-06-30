
package Parte3;


public class modificadorDeaultHija extends modificadorDefault{
    public modificadorDeaultHija(){
        super();
        this.atributoDefault = "Modificacion del atributo del atrbuto Default2";
        System.out.println("atributoDefault = " + this.atributoDefault);
        this.metodoDefault();
    }
    
}
