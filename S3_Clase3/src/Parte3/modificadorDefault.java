
package Parte3;

public class modificadorDefault extends modificadorPublic{
    String atributoDefault = "Valor de Atributo Default";
    
    //modificadorDefault(){
    //    super("default");
    //    System.out.println("Constructor Default");
    //}
    public modificadorDefault(){
        super("default");
        this.atributoDefault = "Modificacion del atributo default";
        System.out.println("atributoDefault = " + this.atributoDefault);
        //this.metodoDefault();
    }
    void metodoDefault(){
        System.out.println("Metodo Default");
    }
}
