
package model;

import java.util.HashMap;
import java.util.Map;


public class Cases{
    
    private String hersteller;
        private String typ;
        private String format;
        private int anzahlAufLager;

    public Cases(String hersteller, String typ, String format, int anzahlAufLager) {
        this.hersteller = hersteller;
        this.typ = typ;
        this.format = format;
        this.anzahlAufLager = anzahlAufLager;
    }
   
}
