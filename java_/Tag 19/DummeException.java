package exceptions;

/**
 *
 * @author Murat Vatandas
 */
public class DummeException extends Exception{

    @Override
    public String getMessage(){
        return "  Ich überschreibe die Exception mit einer eigenen Message";
    }
}
