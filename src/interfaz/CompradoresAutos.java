/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Autos;
import clases.Helper;
import static interfaz.DatosAlquilados.t;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JTable;

/**
 *
 * @author pared
 */
public class CompradoresAutos extends javax.swing.JDialog {

    /**
     * Creates new form CompradoresAutos
     */
        String ruta;
        ObjectOutputStream salida;
        ArrayList<Autos> auto;
        int aux = 0;
        static JTable t;
    public CompradoresAutos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ruta = "src/datos/autosComprados.txt";
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

        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cmdBuscar = new javax.swing.JButton();
        cmbGuardar = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        cmdSalir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Personales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel4.setText("Apellido:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel5.setText("Cedula:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 100, -1));
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 100, -1));
        jPanel1.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 100, -1));

        jLabel8.setText("Marca:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel9.setText("Modelo:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        txtModelo.setEditable(false);
        jPanel1.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 100, -1));

        txtMarca.setEditable(false);
        jPanel1.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 100, -1));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 280, 190));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("COMPRADORES");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 190, 40));

        cmdBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmdBuscar.setText("Buscar");
        cmdBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBuscarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 110, 40));

        cmbGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbGuardar.setText("Guardar");
        cmbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGuardarActionPerformed(evt);
            }
        });
        jPanel3.add(cmbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 110, 40));

        cmdLimpiar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 110, 40));

        cmdSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmdSalir.setText("Salir");
        jPanel3.add(cmdSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 110, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/183903088.gif"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 490, 330));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/183903088.gif"))); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 260, 220));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 770, 330));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGuardarActionPerformed

        String nombre, apellido, cedula, marca, modelo;
        if(txtApellido.getText().trim().isEmpty())
        {
           Helper.mensaje(this, "Ingrese el apellido correspondiente", 3);
           txtApellido.requestFocusInWindow();
        }
        else if (txtNombre.getText().trim().isEmpty())
        {
           Helper.mensaje(this, "Ingrese el nombre correspondiente", 3);
           txtNombre.requestFocusInWindow();
        }
        else if (txtCedula.getText().trim().isEmpty())
        {
           Helper.mensaje(this, "Ingrese la cedula correspondiente", 3);
           txtCedula.requestFocusInWindow();
        }
        else {
        nombre = txtNombre.getText();
        apellido = txtApellido.getText();
        cedula = txtCedula.getText();
        marca = txtMarca.getText();
        modelo = txtModelo.getText();
        ArrayList<Autos> autoModificado;
        
       
            if (aux == 0){
                 Autos a = new Autos (nombre, apellido, cedula, marca, modelo);

            try {
                a.guardar(salida);
            } catch (IOException ex) {
                Logger.getLogger(CompradoresAutos.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            else {
                autoModificado = Helper.modificarAuto(ruta, cedula, nombre, apellido);
            try {
                salida = new ObjectOutputStream(new FileOutputStream(ruta));
            } catch (IOException ex) {
                Logger.getLogger(CompradoresAutos.class.getName()).log(Level.SEVERE, null, ex);
            }
                Helper.volcado(salida, autoModificado);
                aux=0;
                Helper.mensaje(this, "Persona Actualizada Correctamente!", 1);
            }
            
        txtNombre.setText("");
        txtApellido.setText("");
        txtCedula.setText("");
        txtModelo.setText("");
        txtMarca.setText("");
        txtNombre.requestFocusInWindow();
        }
    }//GEN-LAST:event_cmbGuardarActionPerformed

    private void cmdBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBuscarActionPerformed
        String cedula;
        cedula = txtCedula.getText();
        Autos a;
        
        if (Helper.buscarAutoCedula(cedula, ruta)) {
            a = Helper.traerPersonaCedula(cedula, ruta);
            txtNombre.setText(a.getNombre());
            txtApellido.setText(a.getApellido());
            txtMarca.setText(a.getMarca());
            txtModelo.setText(a.getModelo());
            aux = 1;
        } else {
            txtNombre.requestFocusInWindow();
            aux = 0;
        }
    }//GEN-LAST:event_cmdBuscarActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        txtCedula.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtModelo.setText("");
        txtMarca.setText("");
        
        txtCedula.requestFocusInWindow();
    }//GEN-LAST:event_cmdLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(CompradoresAutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompradoresAutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompradoresAutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompradoresAutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CompradoresAutos dialog = new CompradoresAutos(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton cmdBuscar;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    public static javax.swing.JTextField txtMarca;
    public static javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}