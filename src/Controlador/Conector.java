/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author henry
 */
public class Conector {
    private Connection con;

    public Connection setCon() {
        try {
            this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/universidad", "root", "");
            System.out.println("Se conecto");
        } catch ( SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
          
        }
        return this.con;

    }

    public Connection getCon() {
        return this.con;
    }
}
