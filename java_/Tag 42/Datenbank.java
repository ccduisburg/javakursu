/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datenbank;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Sanne
 */
public class Datenbank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String server = "jdbc:mysql://localhost:3306/kurs";//Info liefert RDBMS-Anbieter
        String user = "root";
        String pw = "";
        
        try (Connection con = DriverManager.getConnection(server, user, pw); Statement stm = con.createStatement()){
            //Schritt 1
            System.out.println("Connetion: " + con);
           //Schritt 2
            System.out.println("Statemet: " + stm);
            String sql = "SELECT * FROM teilnehmer LIMIT 20";
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("vorname") + " " + rs.getString("nachname");
                LocalDate datum = rs.getDate(4).toLocalDate();
                System.out.println("Der Teilnehmer " + name + " hat die ID: " + id + " und DAS Datum ist " + datum);
            }

            PreparedStatement ps = con.prepareStatement("INSERT INTO teilnehmer VALUES(NULL,?,?,?)");
            Scanner scan = new Scanner(System.in);
            System.out.println("Vorname?");
            String vorname = scan.nextLine();
            ps.setString(1, vorname);
            ps.setString(2, "mayer");
            ps.setDate(3, Date.valueOf(LocalDate.now()));
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Leider konnte die Datanbank nicht richtig verwendet werden: " + e);

        }
    }

}
