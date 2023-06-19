/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controlador.Bases;
import Modelo.Conexion;
import Modelo.ModeloBases;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gabo
 */
public class Principal extends javax.swing.JFrame {
     FondoPanel fondo = new FondoPanel();
     
     int xMouse, yMouse;
     
    /**
     * Creates new form Principal
     */
    public Principal() {
       // this.setContentPane(fondo);
        initComponents();
      LlenaBases();
      ocultar();
      
      
      
      
    }

   private void LlenaBases(){
       
       ModeloBases modBases = new ModeloBases();
       ArrayList<Bases> listaBases = modBases.getBases();
       cbxBases.removeAllItems();
       
       for (int i=0; i< listaBases.size(); i++){
           cbxBases.addItem(listaBases.get(i).getDatabase());
       }
       
 }
   
   private void LlenarTablas(String NombreBD){
       
       ModeloBases modBases = new ModeloBases();
       ArrayList<Bases> listaBases = modBases.getTablas(NombreBD);
       CombTablas.removeAllItems();
      
       
    if(listaBases.size()>0) {
       for (int i=0; i< listaBases.size(); i++){
           CombTablas.addItem(listaBases.get(i).getDatabase());
    } 
          
       }
    else{
                String BTablas = "No hay tablas";    
               CombTablas.addItem(BTablas);    
    }
       
       
       
       
       
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoPanel();
        jButton4 = new javax.swing.JButton();
        cbxBases = new javax.swing.JComboBox<>();
        txtNombre = new javax.swing.JTextField();
        jlnombreb = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        EnBtn = new javax.swing.JPanel();
        NuevaBtnTxt2 = new javax.swing.JLabel();
        EnBtnA = new javax.swing.JPanel();
        NuevaBtnTxt3 = new javax.swing.JLabel();
        EnBtnC = new javax.swing.JPanel();
        NuevaBtnTxt = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        minBtn = new javax.swing.JPanel();
        minTxt = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProdC = new javax.swing.JTable();
        btnCargar = new javax.swing.JButton();
        jLBD = new javax.swing.JLabel();
        CombTablas = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLBN = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 153));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setText("Consola");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 620, -1, -1));

        cbxBases.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cbxBases.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbxBases, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 360, 220, 30));

        jlnombreb.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jlnombreb.setText("Nombre de la base ");
        jPanel1.add(jlnombreb, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        jButton2.setText("Seleccionar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 99, -1));

        jButton5.setText("Eliminar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 670, 1040, 20));

        EnBtn.setBackground(new java.awt.Color(0, 102, 204));

        NuevaBtnTxt2.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        NuevaBtnTxt2.setForeground(new java.awt.Color(255, 255, 255));
        NuevaBtnTxt2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NuevaBtnTxt2.setText("Nueva base");
        NuevaBtnTxt2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        NuevaBtnTxt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NuevaBtnTxt2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout EnBtnLayout = new javax.swing.GroupLayout(EnBtn);
        EnBtn.setLayout(EnBtnLayout);
        EnBtnLayout.setHorizontalGroup(
            EnBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EnBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(NuevaBtnTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        EnBtnLayout.setVerticalGroup(
            EnBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EnBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(NuevaBtnTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(EnBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 160, 40));

        EnBtnA.setBackground(new java.awt.Color(0, 102, 204));

        NuevaBtnTxt3.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        NuevaBtnTxt3.setForeground(new java.awt.Color(255, 255, 255));
        NuevaBtnTxt3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NuevaBtnTxt3.setText("Agregar");
        NuevaBtnTxt3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        NuevaBtnTxt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NuevaBtnTxt3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout EnBtnALayout = new javax.swing.GroupLayout(EnBtnA);
        EnBtnA.setLayout(EnBtnALayout);
        EnBtnALayout.setHorizontalGroup(
            EnBtnALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EnBtnALayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(NuevaBtnTxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        EnBtnALayout.setVerticalGroup(
            EnBtnALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EnBtnALayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(NuevaBtnTxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(EnBtnA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        EnBtnC.setBackground(new java.awt.Color(0, 102, 204));

        NuevaBtnTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        NuevaBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        NuevaBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NuevaBtnTxt.setText("Cancelar");
        NuevaBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        NuevaBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NuevaBtnTxtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout EnBtnCLayout = new javax.swing.GroupLayout(EnBtnC);
        EnBtnC.setLayout(EnBtnCLayout);
        EnBtnCLayout.setHorizontalGroup(
            EnBtnCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EnBtnCLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(NuevaBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        EnBtnCLayout.setVerticalGroup(
            EnBtnCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EnBtnCLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(NuevaBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(EnBtnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, -1, -1));

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
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        minTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        jtProdC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtProdC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtProdCMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtProdC);

        btnCargar.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnCargar.setText("Cargar");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        jLBD.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLBD.setText("Base de Datos:");

        CombTablas.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        CombTablas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No se ha seleccionado una base" }));
        CombTablas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CombTablasActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel3.setText("Tablas");

        jLBN.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N

        jButton1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jButton1.setText("Nueva Tabla");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jButton3.setText("Ingresar Datos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jButton6.setText("Eliminar Tabla");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Generar Nuevos");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 954, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(CombTablas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCargar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLBD)
                        .addGap(18, 18, 18)
                        .addComponent(jLBN, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7)
                        .addGap(27, 27, 27))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1012, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLBD)
                            .addComponent(jLBN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jButton7)))
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CombTablas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCargar)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jButton6))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 1040, 630));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 690));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    selecB();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void NuevaBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuevaBtnTxtMouseClicked
         txtNombre.setText("");
        ocultar();        // TODO add your handling code here:

    }//GEN-LAST:event_NuevaBtnTxtMouseClicked

    private void NuevaBtnTxt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuevaBtnTxt2MouseClicked
    EnBtn.setBackground(new Color(0,102,255));
              mostrar();        // TODO add your handling code here:
    }//GEN-LAST:event_NuevaBtnTxt2MouseClicked

    private void NuevaBtnTxt3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuevaBtnTxt3MouseClicked
    String mensaje = "";
        String nombreBD = txtNombre.getText();
        ModeloBases control = new ModeloBases();
        control.insertar(nombreBD);
        LlenaBases();
        txtNombre.setText("");
        ocultar();
            
            
                
    }//GEN-LAST:event_NuevaBtnTxt3MouseClicked

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

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        String NombreBD = jLBN.getText();
        String jCBases = (String) CombTablas.getSelectedItem();

        datos();

    }//GEN-LAST:event_btnCargarActionPerformed

    private void jtProdCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProdCMouseClicked
    
    }//GEN-LAST:event_jtProdCMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         this.setVisible(false);
             TablasF newFrame = new TablasF(jLBN.getText());
              newFrame.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       this.setVisible(false);
       String NombreT = (String) CombTablas.getSelectedItem();
             TablasD newFrame = new TablasD(jLBN.getText(),NombreT);
            
              newFrame.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String selectedBD = cbxBases.getSelectedItem().toString();
            
            int confirmacion = JOptionPane.showConfirmDialog(this, "¿Está seguro de que desea eliminar la base de datos " + selectedBD + "?", "Confirmación", JOptionPane.YES_NO_OPTION);
            
            if (confirmacion == JOptionPane.YES_OPTION) {
                try {
                Conexion conn = new Conexion();
                Connection con = conn.getConexionB("mysql");
                Statement statement = con.createStatement();
                
                    
                String sql ="DROP DATABASE " + selectedBD;
                statement.executeUpdate(sql);
                    JOptionPane.showMessageDialog(this, "Base de Datos eliminada correctamente");
                    LlenaBases();
                   
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
             Consola newFrame = new Consola();
              newFrame.setVisible(true);
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       String selectedT = CombTablas.getSelectedItem().toString();
       String selectedB = cbxBases.getSelectedItem().toString();
            
            int confirmacion = JOptionPane.showConfirmDialog(this, "¿Está seguro de que desea eliminar la tabla " + selectedT + "?", "Confirmación", JOptionPane.YES_NO_OPTION);
            
            if (confirmacion == JOptionPane.YES_OPTION) {
                try {
                Conexion conn = new Conexion();
                Connection con = conn.getConexionB(selectedB);
                Statement statement = con.createStatement();
                
                    
                String sql ="DROP TABLE " + selectedT;
                statement.executeUpdate(sql);
                    JOptionPane.showMessageDialog(this, "la tabla se ha eliminada correctamente");
                    LlenarTablas(selectedB);
                   
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void CombTablasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CombTablasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CombTablasActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
            this.setVisible(false);
            RegistrosA newFrame = new RegistrosA();
            newFrame.setVisible(true);        
        
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Principal().setVisible(true);
//            }
//        });
//    }

   

    private void datos() {
            String jCTablas = (String) CombTablas.getSelectedItem();
            String NombreBD = jLBN.getText();
            
           try {
            DefaultTableModel modeloC = new DefaultTableModel();
            jtProdC.setModel(modeloC);
            PreparedStatement psC = null;
            ResultSet rsC = null;
            PreparedStatement ps = null;
            ResultSet rs = null;
            
            Conexion conn = new Conexion();
            Connection con = conn.getConexionB(NombreBD);

            String sql = "SELECT * FROM "+jCTablas;
            String sqlC = "SHOW COLUMNS FROM "+jCTablas;
            psC = con.prepareStatement(sqlC);
            rsC = psC.executeQuery();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            while (rsC.next()) {
                modeloC.addColumn(rsC.getString("Field"));
                
            }

           

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modeloC.addRow(filas);
            }

        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
        
        
        
        
    }

    public void selecB() {
    String NombreBD = (String) cbxBases.getSelectedItem();
    LlenarTablas(NombreBD);
    jLBN.setText(NombreBD);
    }
    
     public void selecB(String Base) {
    LlenarTablas(Base);
    jLBN.setText(Base);
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
    
   public void  ocultar(){
       
       EnBtnA.setVisible(false);
       NuevaBtnTxt3.setVisible(false);
       EnBtnC.setVisible(false); 
       NuevaBtnTxt.setVisible(false);
       jlnombreb.setVisible(false);
       txtNombre.setVisible(false);
        
  }
   
   
      public void  mostrar(){
       
       EnBtnA.setVisible(true);
       NuevaBtnTxt3.setVisible(true);
       EnBtnC.setVisible(true); 
       NuevaBtnTxt.setVisible(true);
        jlnombreb.setVisible(true);
       txtNombre.setVisible(true);
        
  }
       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CombTablas;
    private javax.swing.JPanel EnBtn;
    private javax.swing.JPanel EnBtnA;
    private javax.swing.JPanel EnBtnC;
    private javax.swing.JLabel NuevaBtnTxt;
    private javax.swing.JLabel NuevaBtnTxt2;
    private javax.swing.JLabel NuevaBtnTxt3;
    private javax.swing.JButton btnCargar;
    private javax.swing.JComboBox<String> cbxBases;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JPanel header;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLBD;
    private javax.swing.JLabel jLBN;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlnombreb;
    private javax.swing.JTable jtProdC;
    private javax.swing.JPanel minBtn;
    private javax.swing.JLabel minTxt;
    public javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
