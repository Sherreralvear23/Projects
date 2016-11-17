/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaz;

import clases.Autos;
import clases.Helper;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import interfaz.AutosNuevos.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jparedes2
 */
public class AgregarCarrosNuevos extends javax.swing.JDialog {

    /**
     * Creates new form NewJDialog
     */
        String ruta;
        ObjectOutputStream salida;
        ArrayList<Autos> auto;
    public AgregarCarrosNuevos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ruta = "src/datos/autos.txt";
        try {
            auto = Helper.traerDatos(ruta);
            salida = new ObjectOutputStream(new FileOutputStream(ruta));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        Helper.volcado(salida, auto);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbMarca = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtTipoMarca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        cmbGuardar = new javax.swing.JButton();
        cmbGuardar2 = new javax.swing.JButton();
        cmbLimpiar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Marca:");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        cmbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chevrolet", "Ford", "Renault", "Nissan", "Mazda", "Audi", "Ferrari", "Lamborghini", " " }));
        jPanel4.add(cmbMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 110, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tipo de Marca:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        txtTipoMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoMarcaActionPerformed(evt);
            }
        });
        txtTipoMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTipoMarcaKeyTyped(evt);
            }
        });
        jPanel4.add(txtTipoMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 110, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Modelo:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });
        txtModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtModeloKeyTyped(evt);
            }
        });
        jPanel4.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 110, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Precio:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        jPanel4.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 110, 30));

        cmbGuardar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbGuardar.setText("Guardar");
        cmbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGuardarActionPerformed(evt);
            }
        });
        jPanel4.add(cmbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 90, 30));

        cmbGuardar2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbGuardar2.setText("Guardar [PILA]");
        cmbGuardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGuardar2ActionPerformed(evt);
            }
        });
        jPanel4.add(cmbGuardar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 150, 30));

        cmbLimpiar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbLimpiar.setText("Limpiar");
        cmbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLimpiarActionPerformed(evt);
            }
        });
        jPanel4.add(cmbLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 120, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("DATOS DEL AUTOMOVIL NUEVO");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/6355918990223938941737718871_giphy.gif"))); // NOI18N
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 510, 370));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtTipoMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoMarcaKeyTyped
        char c=evt.getKeyChar();
        if(Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtTipoMarcaKeyTyped

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed

    private void txtModeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModeloKeyTyped
        char c=evt.getKeyChar();
        if(!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtModeloKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        char c=evt.getKeyChar();
        if(!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void cmbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGuardarActionPerformed
        try{
            String tipoAutomovil, marca, modelo, tipoMarca, precio;
            if(txtPrecio.getText().trim().isEmpty())
            {
                Helper.mensaje(this, "Introduzca el precio del vehiculo", 3);
                txtPrecio.requestFocusInWindow();
            }
            else if (txtModelo.getText().trim().isEmpty())
            {
                Helper.mensaje(this, "Introduzca el modelo del vehiculo", 3);
            }
            else if (txtTipoMarca.getText().trim().isEmpty())
            {
                Helper.mensaje(this, "Introduzca el tipo de marca del vehiculo", 3);
            }
            else {

                marca = cmbMarca.getSelectedItem().toString();
                modelo = txtModelo.getText();
                tipoMarca = txtTipoMarca.getText();
                precio = txtPrecio.getText();

                Autos a = new Autos (modelo, marca,tipoMarca, precio);
                try {
                    a.guardar(salida);
                } catch (IOException ex) {
                    Logger.getLogger(AgregarCarrosNuevos.class.getName()).log(Level.SEVERE, null, ex);
                }

                cmbMarca.setSelectedIndex(0);
                txtModelo.setText("");
                txtTipoMarca.setText("");
                txtPrecio.setText("");
                txtTipoMarca.requestFocusInWindow();
            }
        }catch (NumberFormatException ex)
        {
            Helper.mensaje(this, "No puede Ingresar Signos", 3);
        }
    }//GEN-LAST:event_cmbGuardarActionPerformed

    private void cmbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLimpiarActionPerformed
        txtModelo.setText("");
        txtPrecio.setText("");
        txtTipoMarca.setText("");
        cmbMarca.setSelectedIndex(0);
        txtTipoMarca.requestFocusInWindow();
    }//GEN-LAST:event_cmbLimpiarActionPerformed

    private void cmbGuardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGuardar2ActionPerformed
        
    }//GEN-LAST:event_cmbGuardar2ActionPerformed

    private void txtTipoMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoMarcaActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarCarrosNuevos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarCarrosNuevos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarCarrosNuevos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarCarrosNuevos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AgregarCarrosNuevos dialog = new AgregarCarrosNuevos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmbGuardar;
    private javax.swing.JButton cmbGuardar2;
    private javax.swing.JButton cmbLimpiar;
    private javax.swing.JComboBox<String> cmbMarca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTipoMarca;
    // End of variables declaration//GEN-END:variables
}
