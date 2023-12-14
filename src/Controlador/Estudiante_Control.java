/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Estudiante;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author henry
 */
public class Estudiante_Control {
    public ArrayList<Estudiante> getEstudiantes() {
        Conector con = new Conector();
        con.setCon();
        ArrayList<Estudiante> listaEstudiantes = new ArrayList();
        String sql = "SELECT * FROM estudiantes;";
       
        try{
            Statement psd =con.getCon().createStatement();
            ResultSet rs = psd.executeQuery(sql);
            while (rs.next()){
                Estudiante est= new Estudiante();
                est.setCedula(rs.getString("est_cedula"));
                est.setNombre(rs.getString("est_nombre"));
                est.setApellido(rs.getString("est_apellido"));
                est.setDireccion(rs.getString("est_direccion"));
                est.setCelular(rs.getString("est_telefono"));
                listaEstudiantes.add(est);
            }
            con.getCon().close();
        }catch(SQLException e){
            System.out.println(e.toString());
        }
        return listaEstudiantes;
    }
    
    public void editarEstudiantes(Estudiante est){
        Conector con = new Conector();
        con.setCon();
        String sql = "UPDATE ESTUDIANTES SET est_nombre= ?, est_apellido = ?, est_direccion = ?, est_telefono= ? WHERE est_cedula = ?;";
        try{
            PreparedStatement psd = con.getCon().prepareStatement(sql);
            psd.setString(1, est.getNombre());
            psd.setString(2, est.getApellido());
            psd.setString(3, est.getDireccion());
            psd.setString(4, est.getCelular());
            psd.setString(5, est.getCedula());
            int anser= JOptionPane.showConfirmDialog(null, "Seguro que desea editar ese estudiante?");
            if (anser != 0) return;
            int i = psd.executeUpdate();
            if (i > 0) {
                JOptionPane.showMessageDialog(null, "SE GUARDO");
            }
            con.getCon().close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void eliminarEstudiante(Estudiante est){
        Conector con = new Conector();
        con.setCon();
        String sql = "DELETE FROM ESTUDIANTES WHERE est_cedula = '"+est.getCedula()+"'";
        try{
            PreparedStatement psd = con.getCon().prepareStatement(sql);
            int anser= JOptionPane.showConfirmDialog(null, "Seguro que desea borrar ese estudiante?");
            if (anser != 0) return;
            int i =psd.executeUpdate();
            if (i > 0) {
                JOptionPane.showMessageDialog(null, "SE ELIMINO");
            }
            con.getCon().close();
        }catch(SQLException e){
             JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void crearEstudiante(Estudiante est){
        Conector con = new Conector();
        con.setCon();
        String sql = "INSERT INTO ESTUDIANTES(est_cedula, est_nombre, est_apellido, est_direccion, est_telefono )"
                + " VALUES(?, ?, ?, ?, ?)";
        try {
            
            PreparedStatement psd = con.getCon().prepareStatement(sql);
            psd.setString(1, est.getCedula());
            psd.setString(2, est.getNombre());
            psd.setString(3, est.getApellido());
            psd.setString(4, est.getDireccion());
            psd.setString(5, est.getCelular());
            int i = psd.executeUpdate();
            if (i > 0) {
                JOptionPane.showMessageDialog(null, "SE GUARDO");
            }
            con.getCon().close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
}
