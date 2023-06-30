package Parte1;


public class testForEach {
    public static void main(String[] args) {
        
        int edades[] = {5,6,7,8};
        
        for(int edad: edades){
            System.out.println("edad = " + edad);
        }
        
        CicloForEach personas[] = {new CicloForEach("Abel"), new CicloForEach("Jere"),new CicloForEach("Lucas")};
        
        for(CicloForEach persona: personas){
            System.out.println("persona = " + persona);
        }
    }
    
}
