
package Parte2;

public class AutoboxingUnboxing {
    public static void main(String[] args) {
        // Primitivo
        int num = 10;
        System.out.println("num = " + num);
        // Wrapper 
        Integer enteroWR = 10;
        System.out.println ("enteroWR: " + enteroWR.doubleValue()); // Autoboxing
        int numeroUN = enteroWR; // Unboxing
        System.out.println("numeroUN = " + numeroUN); 
        
        // Wrappers de todos los tipos primitivos
        /*
        int = Integer 
        long = Long
        float = Float
        double = Double
        boolean = Boolean 
        byte = Byte
        char = Character
        short = Short
        */
    }
    
    
    
}
