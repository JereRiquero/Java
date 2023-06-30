
package Parte2;


////public class OperacionException extends Exception {
//    public OperacionException(String mensaje){
//        super(mensaje);
//    }
//}
public class OperacionException extends RuntimeException {
    public OperacionException(String mensaje){
        super(mensaje);
    }
}
