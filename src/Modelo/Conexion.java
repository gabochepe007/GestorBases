/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


import Vistas.Login;
import Vistas.Principal;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import javax.swing.JOptionPane;


public class Conexion {
    
    public static Connection getConexion(){
        Connection con = null;
        String URL = "jdbc:mysql://localhost:3306/mysql";
        String USER = "root";
        String CLAVE = "12345";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, CLAVE);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
    }
    public static Connection getConexionu(String USER, String CLAVE){
        Connection con = null;
       
        String URL = "jdbc:mysql://localhost:3306/mysql";
   
       
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, CLAVE);
           
           
                } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecto");
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
    }
    public static Connection getConexionB(String NombreBD){
        Connection con = null;
        String URL = "jdbc:mysql://localhost:3306/"+NombreBD;
        String USER = "root";
        String CLAVE = "12345";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, CLAVE);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
    }
}
