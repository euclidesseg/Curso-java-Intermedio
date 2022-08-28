/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import conectarSQL.Conexion;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class RegisterUser extends javax.swing.JFrame {

    String usuario = Login.user;

    public RegisterUser() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setTitle("Nuevo usuario - Sesión de " + usuario);

        ImageIcon fondoInterfaz = new ImageIcon("src/imagenes/wallpaper1.jpg");
        Icon fondo = new ImageIcon(fondoInterfaz.getImage().getScaledInstance(lbl_wallpaper.getWidth(),
                lbl_wallpaper.getHeight(), Image.SCALE_DEFAULT));
        lbl_wallpaper.setIcon(fondo);

        ImageIcon botonRegistrar = new ImageIcon("src/imagenes/nueva-llegada.png");
        Icon boton = new ImageIcon(botonRegistrar.getImage().getScaledInstance(btn_register.getWidth(),
                btn_register.getHeight(), Image.SCALE_DEFAULT));
        btn_register.setIcon(boton);
        this.repaint();

    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/Administrador.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_dni = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_usuario = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        cmb_permisos = new javax.swing.JComboBox<>();
        btn_register = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        lbl_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Clave");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Permisos de ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, -1, -1));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Apellido");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 70, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Dni de usuario");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 140, -1));

        txt_dni.setBackground(new java.awt.Color(153, 204, 255));
        txt_dni.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_dni.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 210, 30));

        txt_apellido.setBackground(new java.awt.Color(153, 204, 255));
        txt_apellido.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_apellido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 210, 30));

        txt_usuario.setBackground(new java.awt.Color(153, 204, 255));
        txt_usuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_usuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 210, 30));

        txt_nombre.setBackground(new java.awt.Color(153, 204, 255));
        txt_nombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_nombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 210, 30));

        txt_password.setBackground(new java.awt.Color(153, 204, 255));
        txt_password.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_password.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 210, 30));

        cmb_permisos.setBackground(new java.awt.Color(153, 204, 255));
        cmb_permisos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cmb_permisos.setForeground(new java.awt.Color(0, 0, 0));
        cmb_permisos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Superusuario", "Administrador" }));
        cmb_permisos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(cmb_permisos, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 140, 30));

        btn_register.setBackground(new java.awt.Color(153, 204, 255));
        btn_register.setIcon(btn_register.getIcon());
        btn_register.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });
        getContentPane().add(btn_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 110, 90));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Realizado por Euclides Perez ©");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 530, 260, -1));
        getContentPane().add(lbl_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed
        int validacion = 0;
        String nombre = txt_nombre.getText().trim();
        String apellido = txt_apellido.getText().trim();
        String dniUsuario = txt_dni.getText().trim();
        String userName = txt_usuario.getText().trim();
        String password = txt_password.getText().trim();
        String permisos = cmb_permisos.getSelectedItem().toString();
        String registrado_por;
            
        if (nombre.equals("")) {
            txt_nombre.setBackground(Color.red);
            validacion++;
        }
        if (apellido.equals("")) {
            txt_apellido.setBackground(Color.red);
            validacion++;
        }
        if (dniUsuario.equals("")) {
            txt_dni.setBackground(Color.red);
            validacion++;
        }
        if (userName.equals("")) {
            txt_usuario.setBackground(Color.red);
            validacion++;
        }
        if (password.equals("")) {
            txt_password.setBackground(Color.red);
            validacion++;
        }
        try {
            Conexion cnx = new Conexion();
            PreparedStatement pst = cnx.getConnection().prepareStatement("SELECT USERNAME FROM USUARIOS WHERE USERNAME = '" + userName + "'");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Este usuario se encuetra ocupado");
                txt_usuario.setBackground(Color.red);
                pst.close();
                rs.close();
            } else {
                pst.close();
                rs.close();
                try {
                    
                    Conexion cnx2 = new Conexion();
                    PreparedStatement pst2 = cnx2.getConnection().prepareStatement("SELECT DNI_USUARIO FROM USUARIOS WHERE DNI_USUARIO = " + Integer.parseInt(dniUsuario));
                    ResultSet rs2 = pst2.executeQuery();
                    if (rs2.next()) {
                        int dnisql = rs2.getInt("DNI_USUARIO");
                        if (dnisql == Integer.parseInt(dniUsuario)) {
                            JOptionPane.showMessageDialog(null, "Ya existe un usuario registrado con este DNI");
                            txt_dni.setBackground(Color.red);
                        }
                        pst2.close();
                        rs2.close();
                    } else {
                        pst2.close();
                        rs2.close();
                        if (validacion == 0) {//Significa que no ubo ningun campo de texto vacio
                            try {
                                Conexion cnx3 = new Conexion();
                                PreparedStatement pst3 = cnx3.getConnection().prepareStatement("INSERT INTO USUARIOS VALUES(?,?,?,?,?,?,?,?)");

                                pst3.setInt(1, Integer.parseInt(dniUsuario)); 
                                pst3.setString(2, nombre);
                                pst3.setString(3, apellido);
                                pst3.setString(4, userName);
                                pst3.setString(5, password);
                                pst3.setString(6, permisos);
                                pst3.setString(7, "TRUE");
                                pst3.setString(8, "EUCLIDES");

                                pst3.executeUpdate();
                            } catch (SQLException err) {
                                JOptionPane.showMessageDialog(null, "Error al crear este ususario, contacte al administrador");
                            }
                        }
                    }
                } catch (Exception err) {
                    JOptionPane.showMessageDialog(null, "El campo dni debe ser numerico");
                    txt_dni.setBackground(Color.red);
                }

            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Error inesperado,contacte al Administrador");
        }
    }//GEN-LAST:event_btn_registerActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_register;
    private javax.swing.JComboBox<String> cmb_permisos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbl_wallpaper;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_dni;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
