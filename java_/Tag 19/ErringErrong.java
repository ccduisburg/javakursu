package errorgames;

/**
 *
 * @author awiechens
 */
public class ErringErrong {
    
    static int counterPlayer1;
    static int counterPlayer2;
    
    public static void main(String[] args) {
        
        startGame();
    }
    
    public String showResult() {
        return "Das aktuelle Ergebnis: " + counterPlayer1 + " " + counterPlayer2;
    }
    
    public static void startGame(){
        
        int zufallszahl =  (int)((Math.random()) * 2 + 1); 
        System.out.println("Spieler " + zufallszahl + " beginnt!");
        switch(zufallszahl) {
            case 1: 
                new ErringErrong().one();
                break;
            case 2:
                new ErringErrong().two();
                break;
            default:
                System.out.println("Mache das Fenster kleiner.");
        }               
    }
    
    public void one() {
        try {
            counterPlayer1++;
            startGame();
        } catch (PlayerOneException e) {
            throw new PlayerTwoException("One");
        }
        finally {
            System.out.println(":");
            throw new PlayerOneException("One");
        } 
    }
    
    public void two() {
        try {
            counterPlayer2++;  
             startGame();
        } catch (PlayerTwoException e) {
            throw new PlayerOneException("Two");
        } finally {
            throw new PlayerTwoException("Two");
        } 
    }   
}

class PlayerOneException extends ClassCastException{    
    String spielstand;
    public PlayerOneException(String spielstand) {        
        spielstand = new ErringErrong().showResult();
        System.out.println(spielstand);
    }       
}

class PlayerTwoException extends NullPointerException{
    String spielstand;
    public PlayerTwoException(String msg) {        
        spielstand = new ErringErrong().showResult();
        System.out.println(spielstand);
    }    
}