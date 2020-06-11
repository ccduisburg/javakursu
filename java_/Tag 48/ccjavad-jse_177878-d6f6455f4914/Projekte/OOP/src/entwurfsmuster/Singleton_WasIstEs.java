package entwurfsmuster;

/**
   Aufgabenstellung
   
   - Nur ein Objekt darf in der Anwendung existieren
   - Das Objekt soll einfach zu erreichen sein

 */


/**
   enum ist auch eine Singleton-Realisierung
 
    public enum AppSettings {
        INSTANCE
    }
 */

/**
    public class AppSettings {
        public static final AppSettings INSTANCE = new AppSettings();
        private AppSettings() {}
    }
 */


/*
    Erweiterte Aufgabestellung:

    - Lazy-Bildung mit der Möglichkeit interne Realisierung zu ändern

    (hier wird keine Threadsicherheit garantiert)
*/

/* public */ class AppSettings {
   
    private static AppSettings INSTANCE;
    private AppSettings() {}
    
    public static AppSettings getInstance() {
        if(INSTANCE==null) {
            INSTANCE = new AppSettings();
        }
        
        return INSTANCE;
    }
}

public class Singleton_WasIstEs {

    public static void main(String[] args) {

        // new AppSettings(); // Compilerfehler soll es geben
        
        // Das Objekt soll einfach zu erreichen sein:
        System.out.println(AppSettings.getInstance());
    }
    
}
