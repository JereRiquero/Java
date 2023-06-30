
package Parte3;

public enum Continentes{
    AFRICA(54, "1.216 miles de millones"),
    EUROPA(46, "756.4 millones"),
    ASIA(51, "4.561 miles de millones"),
    AMERICA(35, "1.002 miles de millones"),
    OCEANIA(14, "44.0 millones");
    
    private final int paises;
    private String habitantes;
    
    Continentes(int paises, String habitantes){
        this.paises = paises;
        this.habitantes = habitantes;
    }
    public int getPaises(){
        return this.paises;
    }
    public String getHabitantes(){
        return this.habitantes;
    }
}
