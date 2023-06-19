/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.Bases;
import Vistas.Principal;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Gabo
 */
public class ModeloBases {
    private Bases controlador;
    
    public ModeloBases(){
       controlador = new Bases();
        
    }
    
    public ArrayList<Bases> getBases()
            
     {
         Connection con = Conexion.getConexion();
         Statement stmt;
         ResultSet rs; 
         
        ArrayList<Bases> listaBases = new ArrayList<>();
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery("SHOW DATABASES");
            
            while(rs.next()){
                
                Bases base = new Bases(); 
                base.setDatabase(rs.getString("Database"));
                listaBases.add(base);
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloBases.class.getName()).log(Level.SEVERE, null, ex);
        }
         return listaBases;
     }
    
    public void insertar(String NombreDB){
        PreparedStatement ps;
        String sql;
        controlador.setNombreDB(NombreDB);
       
       
        try{
             Connection con = Conexion.getConexion();
              
            sql = ("CREATE DATABASE "+NombreDB);
            
            ps = con.prepareStatement(sql);
           
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "La Base de Datos "+NombreDB+" se ha creado con exito ");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
        }
    }
    
    public ArrayList<Bases> getTablas(String NombreBD)
            
     {
         Connection con = Conexion.getConexion();
         Statement stmt;
         ResultSet rs; 
         
        ArrayList<Bases> listaTablas = new ArrayList<>();
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery("SHOW TABLES FROM "+NombreBD);
            
            while(rs.next()){
                
                Bases base = new Bases(); 
                base.setDatabase(rs.getString("Tables_in_"+NombreBD));
                listaTablas.add(base);
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloBases.class.getName()).log(Level.SEVERE, null, ex);
        }
         return listaTablas;
     }
    
    public void SelectB(String NombreDB){
        PreparedStatement ps;
        String sql;
        controlador.setNombreDB(NombreDB);
       
       
        try{
             Connection con = Conexion.getConexion();
              
            sql = ("use tienda");
            
            ps = con.prepareStatement(sql);
           
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Funcionara?");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
        }
    }
}
  