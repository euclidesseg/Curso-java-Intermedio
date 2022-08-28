package ventanas;

import conectarSQL.Conexion;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class Login extends javax.swing.JFrame {

    public static String user = "";
    public static String password = "";

    public Login() {
        initComponents();
        this.setTitle("LOGIN");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Acceso al sistemas");

        /*de esta forma agregamos un imagen escalable a un jlabel es decir que modifique su tamaño si el label lo hace*/
        ImageIcon wallpaper = new ImageIcon("src/imagenes/zyro-image.png");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_wallpaper.getWidth(),
                jLabel_wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_wallpaper.setIcon(icono);
        this.repaint();
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/user.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_pasword = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        btn_continuar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 1133, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/USEER-removebg-preview.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/USEER-re.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, 50));

        txt_user.setBackground(new java.awt.Color(0, 153, 255));
        txt_user.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        txt_user.setForeground(new java.awt.Color(0, 0, 0));
        txt_user.setText("Ingresar Usuario");
        txt_user.setBorder(null);
        txt_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_userMouseClicked(evt);
            }
        });
        jPanel2.add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 140, 20));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("USUARIO");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 90, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("CLAVE");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 70, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/VECTOR-CANDADO.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 50, 40));

        txt_pasword.setBackground(new java.awt.Color(0, 153, 255));
        txt_pasword.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_pasword.setForeground(new java.awt.Color(0, 0, 0));
        txt_pasword.setText("Ingresar clave");
        txt_pasword.setBorder(null);
        txt_pasword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_paswordMouseClicked(evt);
            }
        });
        jPanel2.add(txt_pasword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 140, 20));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 170, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 180, 10));

        btn_continuar.setBackground(new java.awt.Color(0, 0, 0));
        btn_continuar.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btn_continuar.setForeground(new java.awt.Color(0, 153, 255));
        btn_continuar.setText("Continuar");
        btn_continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_continuarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_continuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 110, 30));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 255));
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 110, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 380, 570));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Realizado por Euclides Perez ©");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 260, -1));

        jLabel_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/zyro-image.png"))); // NOI18N
        jPanel1.add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 300, 170));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_userMouseClicked
        this.txt_user.setText("");
    }//GEN-LAST:event_txt_userMouseClicked

    private void txt_paswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_paswordMouseClicked
        this.txt_pasword.setText("");
    }//GEN-LAST:event_txt_paswordMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_continuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_continuarActionPerformed
        user = txt_user.getText().trim();
        password = txt_pasword.getText().trim();

        if (password.equals("") || user.equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese todos los datos");
        } else {
            /* si el usuario ingreso algo a los campos vendra a y ejecutara el metodo de la conbexion si encuentra algo ira a 
             * ota condicion */
            try {
                Conexion cnx = new Conexion();
                PreparedStatement pst = cnx.getConnection().prepareStatement(
                        "SELECT ESTADO,PERMISOS,USERNAME,CLAVE FROM USUARIOS WHERE USERNAME = '" + user + "'AND CLAVE = '" + password + "'");

                ResultSet rs = pst.executeQuery();

                if (rs.next()) {      
                    String userSql = rs.getString("USERNAME");
                    String passwordSql = rs.getString("CLAVE");
                    String estado = rs.getString("ESTADO");
                    String permisos = rs.getString("PERMISOS");
                    if (user.equals(userSql) && password.equals(passwordSql)) {
                        /* Si se encuentra un resultado con los campos espesificados vendra a esta condicion a validar si 
                         * los campo clave y usuario son exsactamente iguall que los de la base de datos teniendo en cuenta las mayusculas y minusculas*/
                        if (!"TRUE".equals(estado)) {
                            JOptionPane.showMessageDialog(null, "Usuario bloqueado contacte al Administrador");
                        } else {
                            if (permisos.equals("Administrador")) {
                                dispose(); // ESTE METODO DESTRUYE LA INTERFAZ ACTUAL, ES DECIR, CIERRA LA ACTUAL VENTANA 
                                new Administrador().setVisible(true); // Y DE ESTA FORMA HACEMOS EL LLAMADO DE OTRA INTERFAZ 
                            } else if (permisos.equals("Superusuario")) {
                                dispose();
                                new Superusuario().setVisible(true);
                            } else if (permisos.equals("Usuario")) {
                                dispose();
                                new Usuario().setVisible(true);
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
                        txt_user.setText("");
                        txt_pasword.setText("");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
                    txt_user.setText("");
                    txt_pasword.setText("");
                }

            } catch (HeadlessException | SQLException err) {
                JOptionPane.showMessageDialog(null, "Error en el boton contacte al administrador");
            }
        }
    }//GEN-LAST:event_btn_continuarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_continuar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_wallpaper;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPasswordField txt_pasword;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
