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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JTable;

/**
 *
 * @author pared
 */
public class DatosAlquilados extends javax.swing.JDialog {

    /**
     * Creates new form DatosAlquilados
     */
        String ruta;
        ObjectOutputStream salida;
        ArrayList<Autos> auto;
        static JTable t;
        int aux = 0;
        DateFormat df = DateFormat.getDateInstance();
    public DatosAlquilados(java.awt.Frame parent, boolean modal, JTable tabla) {
        super(parent, modal);
        initComponents();
        JButton botonesH[]={cmdBuscar, cmdCancelar};
        JButton botonesD[]={cmdGuardar, cmdSalir};
        
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
        t=tabla;
        ruta = "src/datos/autosAlquilados.txt";
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtAutomovil = new javax.swing.JTextField();
        txtHorasAlquilar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPrecioAlquilar = new javax.swing.JTextField();
        cmdFecha = new com.toedter.calendar.JDateChooser();
        cmdBuscar = new javax.swing.JButton();
        cmdGuardar = new javax.swing.JButton();
        cmdCancelar = new javax.swing.JButton();
        cmdSalir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Personales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel2.setText("Apellido:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel3.setText("Cedula:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, 20));

        jLabel4.setText("Automovil:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel5.setText("Fecha:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel6.setText("Horas a Alquilar:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 90, -1));
        jPanel2.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 90, -1));
        jPanel2.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 90, -1));

        txtAutomovil.setEditable(false);
        jPanel2.add(txtAutomovil, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 90, -1));
        jPanel2.add(txtHorasAlquilar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 90, -1));

        jLabel7.setText("Precio Alquilar:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        txtPrecioAlquilar.setEditable(false);
        jPanel2.add(txtPrecioAlquilar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 90, -1));
        jPanel2.add(cmdFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 90, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 350, 240));

        cmdBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmdBuscar.setText("Buscar");
        cmdBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 130, 40));

        cmdGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmdGuardar.setText("Guardar");
        cmdGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 130, 40));

        cmdCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmdCancelar.setText("Cancelar");
        cmdCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 130, 40));

        cmdSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmdSalir.setText("Salir");
        cmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalirActionPerformed(evt);
            }
        });
        jPanel1.add(cmdSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 130, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/6355918990223938941737718871_giphy.gif"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 500, 310));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/183903088.gif"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 110, 320));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 360));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed
        String nombre, apellido, cedula, automovil;
        int horasalquilar, precioalquilar;
        if(txtNombre.getText().trim().isEmpty())
            {
                Helper.mensaje(this, "Introduzca el nombre de la persona", 3);
                txtNombre.requestFocusInWindow();
            }
            else if (txtHorasAlquilar.getText().trim().isEmpty())
            {
                Helper.mensaje(this, "Introduzca el tipo de marca del vehiculo", 3);
                txtHorasAlquilar.requestFocusInWindow();
            }
            
            else if(txtApellido.getText().trim().isEmpty())
            {
                Helper.mensaje(this, "Introduzca el apellido de la persona", 3);
                txtApellido.requestFocusInWindow();
            }
            else if (txtCedula.getText().trim().isEmpty())
            {
                Helper.mensaje(this, "Introduzca la cedula de la persona", 3);
                txtCedula.requestFocusInWindow();
            }
            else {
        nombre = txtNombre.getText();
        apellido = txtApellido.getText();
        cedula = txtCedula.getText();
        automovil = txtAutomovil.getText();
        String fecha = df.format(cmdFecha.getDate());
        horasalquilar = Integer.parseInt(txtHorasAlquilar.getText());
        precioalquilar = Integer.parseInt(txtPrecioAlquilar.getText());
        ArrayList<Autos> autoModificado;
        
        if (aux == 0){
                 Autos a = new Autos (nombre, apellido, cedula, automovil, fecha, horasalquilar, precioalquilar);
                 a.Operacion();
            try {
                a.guardar(salida);
            } catch (IOException ex) {
                Logger.getLogger(CompradoresAutos.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            else {
                autoModificado = Helper.modificarAuto(ruta, cedula, nombre, apellido, automovil, fecha, horasalquilar, precioalquilar);
            try {
                salida = new ObjectOutputStream(new FileOutputStream(ruta));
            } catch (IOException ex) {
                Logger.getLogger(CompradoresAutos.class.getName()).log(Level.SEVERE, null, ex);
            }
                Helper.volcado(salida, autoModificado);
                aux=0;
                Helper.mensaje(this, "Persona Actualizada Correctamente!", 1);
            }
        
            Helper.llenarTablaAlquilar(t, ruta);
        
         txtNombre.setText("");
         txtApellido.setText("");
         txtCedula.setText("");
         txtAutomovil.setText("");
         cmdFecha.setDateFormatString("");
         txtHorasAlquilar.setText("");
         txtPrecioAlquilar.setText("");
         
         JButton botonesH[]={cmdBuscar,cmdCancelar};
         JButton botonesD[]={cmdGuardar};
        
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
            }
    }//GEN-LAST:event_cmdGuardarActionPerformed

    private void cmdBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBuscarActionPerformed
        String cedula;
        cedula = txtCedula.getText();
        Autos a;
        
        if (Helper.buscarAutoCedula(cedula, ruta)) {
            a = Helper.traerPersonaCedula(cedula, ruta);
            txtNombre.setText(a.getNombre());
            txtApellido.setText(a.getApellido());
            cmdFecha.setDateFormatString(a.getFecha());
            txtHorasAlquilar.setText("" + a.getHorasalquiladas());
            txtPrecioAlquilar.setText("" + a.getPrecioalquilada());
            txtAutomovil.setText(a.getMarca());
            aux = 1;
        } else {
            txtNombre.requestFocusInWindow();
            aux = 0;
        }
        
        JButton botonesH[]={cmdGuardar,cmdCancelar};
        JButton botonesD[]={cmdBuscar};
        
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdBuscarActionPerformed

    private void cmdCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancelarActionPerformed
        txtCedula.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtAutomovil.setText("");
        cmdFecha.setDateFormatString("");
        txtHorasAlquilar.setText("");
        txtPrecioAlquilar.setText("");
        txtHorasAlquilar.setText("");
        
        txtCedula.requestFocusInWindow();
        
        JButton botonesH[]={cmdBuscar,cmdCancelar};
        JButton botonesD[]={cmdGuardar};
        
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdCancelarActionPerformed

    private void cmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cmdSalirActionPerformed

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
            java.util.logging.Logger.getLogger(DatosAlquilados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatosAlquilados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatosAlquilados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatosAlquilados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DatosAlquilados dialog = new DatosAlquilados(new javax.swing.JFrame(), true,t);
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
    private javax.swing.JButton cmdBuscar;
    private javax.swing.JButton cmdCancelar;
    private com.toedter.calendar.JDateChooser cmdFecha;
    private javax.swing.JButton cmdGuardar;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtApellido;
    public static javax.swing.JTextField txtAutomovil;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtHorasAlquilar;
    private javax.swing.JTextField txtNombre;
    public static javax.swing.JTextField txtPrecioAlquilar;
    // End of variables declaration//GEN-END:variables
}
