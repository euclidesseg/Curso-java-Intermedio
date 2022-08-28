/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import conectarSQL.Conexion;
import java.awt.Toolkit;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.WindowConstants;

/**
 *
 * @author euder
 */
public class Administrador extends javax.swing.JFrame {

    String user = Login.user;
    public String nombre = "";
    public String apellido = "";

    public Administrador() {
        initComponents();
        this.setTitle("Administrador - Sesión de " + user);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);

        /*Aqui agregamos la imagen a la inerfaz de administrador */
        ImageIcon fondoInterfaz = new ImageIcon("src/imagenes/wallpaper1.jpg");
        Icon fondo = new ImageIcon(fondoInterfaz.getImage().getScaledInstance(lbl_wallpaper.getWidth(),
                lbl_wallpaper.getHeight(), Image.SCALE_DEFAULT));
        lbl_wallpaper.setIcon(fondo);

        /*
         * Desde aqui se comienza a poner las imagenes a cada uno de los botones de interfaz 
         * administrador */
        ImageIcon usuarios = new ImageIcon("src/imagenes/nueva-llegada.png");
        Icon icono = new ImageIcon(usuarios.getImage().getScaledInstance(nuevo_usuario.getWidth(),
                nuevo_usuario.getHeight(), Image.SCALE_DEFAULT));
        nuevo_usuario.setIcon(icono);
        
        ImageIcon gestionUsuarios = new ImageIcon("src/imagenes/gestion-usuarios.png");
        Icon gestion = new ImageIcon(gestionUsuarios.getImage().getScaledInstance(btn_gestionUsuarios.getWidth(),
                btn_gestionUsuarios.getHeight(), Image.SCALE_DEFAULT));
        btn_gestionUsuarios.setIcon(gestion);
        
        ImageIcon empleados = new ImageIcon("src/imagenes/agregar.png");
        Icon emplead = new ImageIcon(empleados.getImage().getScaledInstance(btn_nuevoEmpleado.getWidth(),
                btn_nuevoEmpleado.getHeight(), Image.SCALE_DEFAULT));
        btn_nuevoEmpleado.setIcon(emplead);

        ImageIcon botonasistencia = new ImageIcon("src/imagenes/lista-de-asistentes.png");
        Icon asistencia = new ImageIcon(botonasistencia.getImage().getScaledInstance(btn_asistencia.getWidth(),
                btn_asistencia.getHeight(), Image.SCALE_DEFAULT));
        btn_asistencia.setIcon(asistencia);

        ImageIcon botonGraficas = new ImageIcon("src/imagenes/informes.png");
        Icon informes = new ImageIcon(botonGraficas.getImage().getScaledInstance(btn_Informes.getWidth(),
                btn_Informes.getHeight(), Image.SCALE_DEFAULT));
        btn_Informes.setIcon(informes);

        ImageIcon botonInformes = new ImageIcon("src/imagenes/grafico.png");
        Icon graficas = new ImageIcon(botonInformes.getImage().getScaledInstance(btn_graficas.getWidth(),
                btn_graficas.getHeight(), Image.SCALE_DEFAULT));
        btn_graficas.setIcon(graficas);

        ImageIcon botonEmpleados = new ImageIcon("src/imagenes/empleado.png");
        Icon empleado = new ImageIcon(botonEmpleados.getImage().getScaledInstance(btn_empleados.getWidth(),
                btn_empleados.getHeight(), Image.SCALE_DEFAULT));
        btn_empleados.setIcon(empleado);

        ImageIcon botonGestionAsistencia = new ImageIcon("src/imagenes/pautas.png");
        Icon gAsistencia = new ImageIcon(botonGestionAsistencia.getImage().getScaledInstance(btn_GestionAsistencia.getWidth(),
                btn_GestionAsistencia.getHeight(), Image.SCALE_DEFAULT));
        btn_GestionAsistencia.setIcon(gAsistencia);

        ImageIcon botonAcerca = new ImageIcon("src/imagenes/informacion.png");
        Icon acerca = new ImageIcon(botonAcerca.getImage().getScaledInstance(btn_Acerca.getWidth(),
                btn_Acerca.getHeight(), Image.SCALE_DEFAULT));
        btn_Acerca.setIcon(acerca);
        this.repaint();

        /* Creamos una consulta para traer el nombre compledo del Usuario que inicia sesion */
        try {
            Conexion cnx = new Conexion();
            PreparedStatement pst = cnx.getConnection().prepareStatement("select NOMBRE,APELLIDO FROM USUARIOS WHERE USERNAME = '" + user + "'");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                nombre = rs.getString("NOMBRE");
                apellido = rs.getString("APELLIDO");
                lbl_nombreUsuario.setText("BIENVENIDO " + nombre + " " + apellido);
            }
        } catch (SQLException err) {

        }
    }
    /* este metodo nos permite agregar una imagen al icono principal de la interfaz*/
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/Administrador.png"));
        return retValue;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_nombreUsuario = new javax.swing.JLabel();
        btn_asistencia = new javax.swing.JButton();
        btn_graficas = new javax.swing.JButton();
        btn_Informes = new javax.swing.JButton();
        nuevo_usuario = new javax.swing.JButton();
        btn_GestionAsistencia = new javax.swing.JButton();
        btn_Acerca = new javax.swing.JButton();
        btn_nuevoEmpleado = new javax.swing.JButton();
        btn_empleados = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        btn_gestionUsuarios = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        lbl_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_nombreUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_nombreUsuario.setForeground(new java.awt.Color(204, 255, 255));
        getContentPane().add(lbl_nombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 30));

        btn_asistencia.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(btn_asistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 140, 100));

        btn_graficas.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(btn_graficas, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 290, 140, 100));

        btn_Informes.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(btn_Informes, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 90, 140, 100));

        nuevo_usuario.setBackground(new java.awt.Color(0, 0, 0));
        nuevo_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevo_usuarioActionPerformed(evt);
            }
        });
        getContentPane().add(nuevo_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 140, 100));

        btn_GestionAsistencia.setBackground(new java.awt.Color(0, 0, 0));
        btn_GestionAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GestionAsistenciaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_GestionAsistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 140, 100));

        btn_Acerca.setBackground(new java.awt.Color(0, 0, 0));
        btn_Acerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AcercaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Acerca, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 140, 100));

        btn_nuevoEmpleado.setBackground(new java.awt.Color(0, 0, 0));
        btn_nuevoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoEmpleadoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_nuevoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 140, 100));

        btn_empleados.setBackground(new java.awt.Color(0, 0, 0));
        btn_empleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_empleadosActionPerformed(evt);
            }
        });
        getContentPane().add(btn_empleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 140, 100));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Asistensia");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 90, 20));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mis graficas");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 400, 100, 20));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mis informes");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 200, 100, 20));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gestion de empleado");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 160, 20));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Gestion de entrada");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 400, 140, 20));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Acerca de");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 580, 80, 20));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nuevo  usuario");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 120, 20));

        jLabel7.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Realizado  por Euclides Perez ©");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 650, 240, 20));

        jSeparator1.setForeground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 32, 330, 10));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nuevo empleado");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 120, -1));

        btn_gestionUsuarios.setBackground(new java.awt.Color(0, 0, 0));
        btn_gestionUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gestionUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(btn_gestionUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 140, 100));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Gestion de usuarios");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, -1, -1));

        lbl_wallpaper.setForeground(new java.awt.Color(37, 139, 193));
        lbl_wallpaper.setIcon(lbl_wallpaper.getIcon());
        getContentPane().add(lbl_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevo_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevo_usuarioActionPerformed
        new RegisterUser().setVisible(true);
    }//GEN-LAST:event_nuevo_usuarioActionPerformed

    private void btn_GestionAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GestionAsistenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_GestionAsistenciaActionPerformed

    private void btn_AcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AcercaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_AcercaActionPerformed

    private void btn_empleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_empleadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_empleadosActionPerformed

    private void btn_nuevoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_nuevoEmpleadoActionPerformed

    private void btn_gestionUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gestionUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_gestionUsuariosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Acerca;
    private javax.swing.JButton btn_GestionAsistencia;
    private javax.swing.JButton btn_Informes;
    private javax.swing.JButton btn_asistencia;
    private javax.swing.JButton btn_empleados;
    private javax.swing.JButton btn_gestionUsuarios;
    private javax.swing.JButton btn_graficas;
    private javax.swing.JButton btn_nuevoEmpleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_nombreUsuario;
    private javax.swing.JLabel lbl_wallpaper;
    private javax.swing.JButton nuevo_usuario;
    // End of variables declaration//GEN-END:variables
}
