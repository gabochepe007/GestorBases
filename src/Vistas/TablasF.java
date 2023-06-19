/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;


import Vistas.*;
import Controlador.Bases;
import Modelo.Conexion;
import Modelo.ModeloBases;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gabo
 */
public class TablasF extends javax.swing.JFrame {
     FondoPanel fondo = new FondoPanel();
    
     int xMouse, yMouse;
    private ArrayList<JTextField> camposNombre = new ArrayList<JTextField>();
    private ArrayList<JComboBox<String>> camposTipo = new ArrayList<JComboBox<String>>();
    private ArrayList<JTextField> camposLongitud = new ArrayList<JTextField>();
    private ArrayList<JCheckBox> camposPrimaryKey = new ArrayList<JCheckBox>();

    private JLabel etiquetaNombre = new JLabel("Nombre");
    private JLabel etiquetaTipo = new JLabel("Tipo");
    private JLabel etiquetaLongitud = new JLabel("Longitud");
    private JLabel etiquetaPrimaryKey = new JLabel("Clave Primaria");
    private JButton botonCrearTabla = new JButton("Crear Tabla");
    
   
    public TablasF(String nombre) {
       // this.setContentPane(fondo);
        initComponents();
        jLNombreBD.setText(nombre);
        PanelT.add(etiquetaNombre);
        PanelT.add(etiquetaTipo);
        PanelT.add(etiquetaLongitud);
        PanelT.add(etiquetaPrimaryKey);

        for (int i = 0; i < 2; i++) {
            JTextField campoNombre = new JTextField();
            JComboBox<String> campoTipo = new JComboBox<>(new String[] {"INT", "VARCHAR", "DATE","FLOAT","DOUBLE","BOOLEAN"});
            JTextField campoLongitud = new JTextField();
            JCheckBox campoPrimaryKey = new JCheckBox("PrimaryKey");

           camposNombre.add(campoNombre);
            camposTipo.add(campoTipo);
            camposLongitud.add(campoLongitud);
            camposPrimaryKey.add(campoPrimaryKey);

            PanelT.add(campoNombre);
            PanelT.add(campoTipo);
            PanelT.add(campoLongitud);
            PanelT.add(campoPrimaryKey);
        }

       
        
        
        //crearFilaComponentes();

      
      
    }

   
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jPanel1 = new FondoPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        minBtn = new javax.swing.JPanel();
        minTxt = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        PanelT = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        JLTabla = new javax.swing.JLabel();
        jLNombreBD = new javax.swing.JLabel();
        Jtabla = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu6.setText("jMenu6");

        jMenu2.setText("File");
        jMenuBar3.add(jMenu2);

        jMenu5.setText("Edit");
        jMenuBar3.add(jMenu5);

        jMenu7.setText("File");
        jMenuBar4.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar4.add(jMenu8);

        jMenu9.setText("File");
        jMenuBar5.add(jMenu9);

        jMenu10.setText("Edit");
        jMenuBar5.add(jMenu10);

        jMenu11.setText("jMenu11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 153));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 670, 1040, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/casa.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 60, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoP.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setMaximumSize(new java.awt.Dimension(335, 800));
        jLabel2.setMinimumSize(new java.awt.Dimension(335, 800));
        jLabel2.setPreferredSize(new java.awt.Dimension(335, 800));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 690));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));

        exitTxt.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitTxt.setPreferredSize(new java.awt.Dimension(40, 40));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        minBtn.setBackground(new java.awt.Color(255, 255, 255));

        minTxt.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        minTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minTxt.setText("_");
        minTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minTxt.setPreferredSize(new java.awt.Dimension(40, 40));
        minTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout minBtnLayout = new javax.swing.GroupLayout(minBtn);
        minBtn.setLayout(minBtnLayout);
        minBtnLayout.setHorizontalGroup(
            minBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, minBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(minTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        minBtnLayout.setVerticalGroup(
            minBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, minBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(minTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap(1204, Short.MAX_VALUE)
                .addComponent(minBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(minBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        PanelT.setLayout(new java.awt.GridLayout(0, 4));
        jScrollPane2.setViewportView(PanelT);

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        JLTabla.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        JLTabla.setText("Nombre de la Tabla");

        jLNombreBD.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N

        Jtabla.setForeground(new java.awt.Color(204, 204, 204));
        Jtabla.setText("Ingresa el nombre de a tabla");
        Jtabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JtablaMousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        jLabel4.setText("Base de Datos");

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Columnas");

        jButton3.setText("Agregar Tabla");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLNombreBD, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(JLTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(Jtabla, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(47, 47, 47)
                        .addComponent(jButton2)
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(167, 167, 167))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(49, 49, 49))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1006, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Jtabla, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(JLTabla))
                        .addComponent(jLNombreBD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(107, 107, 107)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jButton3)
                .addGap(57, 57, 57))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 1050, 630));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 690));
        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(Color.white);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked

    private void minTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minTxtMouseClicked
     this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minTxtMouseClicked

    private void minTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minTxtMouseEntered
      minBtn.setBackground(new java.awt.Color(0, 153, 0));
        minTxt.setForeground(Color.white);
    }//GEN-LAST:event_minTxtMouseEntered

    private void minTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minTxtMouseExited
      minBtn.setBackground(Color.white);
        minTxt.setForeground(Color.black);  
    }//GEN-LAST:event_minTxtMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       milagro();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JtablaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtablaMousePressed
    if (Jtabla.getText().equals("Ingresa el nombre de a tabla")) {
            Jtabla.setText("");
            Jtabla.setForeground(Color.black);
        }        
    }//GEN-LAST:event_JtablaMousePressed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
            finalizar();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
      int filaE=4;
        while(filaE>0){ 
        Component[] components = PanelT.getComponents();
        if (components.length > 0) {
        Component lastComponent = components[components.length - 1];
        PanelT.remove(lastComponent);
        PanelT.revalidate();
        PanelT.repaint();
        filaE--;
        
           } 
        }
        camposNombre.remove(camposNombre.size()-1);
        camposTipo.remove(camposTipo.size()-1);
        camposLongitud.remove(camposTipo.size()-1);
        camposPrimaryKey.remove(camposTipo.size()-1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
         String NombreBD = jLNombreBD.getText();
         String NombreT = Jtabla.getText();
    
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.getConexionB(NombreBD);
            Statement statement = con.createStatement();

//                 for (int i = 0; i < camposNombre.size(); i++) {
//                JOptionPane.showMessageDialog(this,camposNombre.get(i).getText());
//                JOptionPane.showMessageDialog(this,camposTipo.get(i).getSelectedItem());
//               JOptionPane.showMessageDialog(this,camposLongitud.get(i).getText());
//                   }
                 //en este parte estaba haciendo prueba de que los campos ingresados fueran leidos
            
                 String sql = "CREATE TABLE "+NombreT+" (";
               
                for (int i = 0; i < camposNombre.size(); i++) {
                    sql += camposNombre.get(i).getText() + " " + camposTipo.get(i).getSelectedItem() + "(" + camposLongitud.get(i).getText() + ")";

                    if (camposPrimaryKey.get(i).isSelected()) {
                        sql += " PRIMARY KEY";
                    }

                    if (i < camposNombre.size() - 1) {
                        sql += ", ";
                    }
                }

                sql += ");";
                
                 statement.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "Tabla creada correctamente");
                
                finalizar();
                } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error al crear la tabla: " + ex.getMessage());
            }
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new TablasF(String nombre).setVisible(true);
//            }
//        });
//    }


        private void milagro() {
          JTextField campoNombre = new JTextField();
            JComboBox<String> campoTipo = new JComboBox<>(new String[] {"INT", "VARCHAR", "DATE","FLOAT","DOUBLE","BOOLEAN"});
            JTextField campoLongitud = new JTextField();
            JCheckBox campoPrimaryKey = new JCheckBox("PrimaryKey");

            camposNombre.add(campoNombre);
            camposTipo.add(campoTipo);
            camposLongitud.add(campoLongitud);
            camposPrimaryKey.add(campoPrimaryKey);

            PanelT.add(campoNombre);
            PanelT.add(campoTipo);
            PanelT.add(campoLongitud);
            PanelT.add(campoPrimaryKey);
    }

    private void finalizar() {
      String NombreBD = jLNombreBD.getText();  
            this.setVisible(false);
            Principal newFrame = new Principal();
            newFrame.setVisible(true);
            newFrame.selecB(NombreBD);
    }


   
   


    
    class FondoPanel extends JPanel
    {
        private Image imagen;
        
        @Override
        public void paint(Graphics g)
        {
           
            
            g.drawImage(imagen,0, 0, getWidth(), getHeight(),this);
            
            setOpaque(false);
            
            super.paint(g);
        }
    }
    
 
   
 
       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLTabla;
    private javax.swing.JTextField Jtabla;
    private javax.swing.JPanel PanelT;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JPanel header;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLNombreBD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel minBtn;
    private javax.swing.JLabel minTxt;
    // End of variables declaration//GEN-END:variables
}
