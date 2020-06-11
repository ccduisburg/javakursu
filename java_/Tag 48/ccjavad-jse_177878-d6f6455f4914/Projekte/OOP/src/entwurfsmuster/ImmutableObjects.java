package entwurfsmuster;

public class ImmutableObjects {

    // Wenn die Klasse so gestaltet wurde, dass die damit erzeugten 
    // Objekte nicht geändert werden können, realisiert die Klasse
    // den Entwurfsmuster 'immutable Object'
    
    public static void main(String[] args) {
        
        String s = "Java ist toll";
        s.toUpperCase();
        System.out.println(s); // Java ist toll
        
        
        
    }
    
}
