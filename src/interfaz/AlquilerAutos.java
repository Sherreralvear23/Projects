/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Helper;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author pared
 */
public class AlquilerAutos extends javax.swing.JDialog {

    /**
     * Creates new form AlquilerAutos
     * @param parent
     * @param modal
     */
    String ruta;
    public AlquilerAutos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ruta = "src/datos/autosAlquilados.txt";
        Helper.llenarTablaAlquilar(tblTablaAlquilar, ruta);
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
        jLabel2 = new javax.swing.JLabel();
        cmbAlquilar1 = new javax.swing.JButton();
        cmbAlquilar2 = new javax.swing.JButton();
        cmbAlquilar3 = new javax.swing.JButton();
        cmbAlquilar4 = new javax.swing.JButton();
        cmbAlquilar5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTablaAlquilar = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 100, 60));

        cmbAlquilar1.setText("Alquilar");
        cmbAlquilar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAlquilar1ActionPerformed(evt);
            }
        });
        jPanel1.add(cmbAlquilar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        cmbAlquilar2.setText("Alquilar");
        cmbAlquilar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAlquilar2ActionPerformed(evt);
            }
        });
        jPanel1.add(cmbAlquilar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, -1, -1));

        cmbAlquilar3.setText("Alquilar");
        cmbAlquilar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAlquilar3ActionPerformed(evt);
            }
        });
        jPanel1.add(cmbAlquilar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, -1, -1));

        cmbAlquilar4.setText("Alquilar");
        cmbAlquilar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAlquilar4ActionPerformed(evt);
            }
        });
        jPanel1.add(cmbAlquilar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, -1, -1));

        cmbAlquilar5.setText("Alquilar");
        cmbAlquilar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAlquilar5ActionPerformed(evt);
            }
        });
        jPanel1.add(cmbAlquilar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, -1, -1));

        tblTablaAlquilar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Cedula", "Automovil", "Fecha", "Horas Alquiladas", "Dinero a Pagar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTablaAlquilar);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 710, 170));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 200, 160));

        jButton1.setText("Ver imagen ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 200, 160));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 200, 160));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 200, 160));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 200, 160));

        jButton2.setText("Ver imagen ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, -1));

        jButton3.setText("Ver imagen ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, -1, -1));

        jButton4.setText("Ver imagen ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, -1, -1));

        jButton5.setText("Ver imagen ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbAlquilar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAlquilar1ActionPerformed
         
        DatosAlquilados a = new DatosAlquilados(null,true,tblTablaAlquilar);
        
        DatosAlquilados.txtAutomovil.setText("Chevrolet");
        DatosAlquilados.txtPrecioAlquilar.setText("200000");
        
        a.setVisible(true);
            
    }//GEN-LAST:event_cmbAlquilar1ActionPerformed

    private void cmbAlquilar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAlquilar2ActionPerformed
        DatosAlquilados a = new DatosAlquilados(null,true,tblTablaAlquilar);
        
        DatosAlquilados.txtAutomovil.setText("Renault");
        DatosAlquilados.txtPrecioAlquilar.setText("300000");
        
            a.setVisible(true);
    }//GEN-LAST:event_cmbAlquilar2ActionPerformed

    private void cmbAlquilar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAlquilar3ActionPerformed
        DatosAlquilados a = new DatosAlquilados(null,true,tblTablaAlquilar);
        
        DatosAlquilados.txtAutomovil.setText("Audi");
        DatosAlquilados.txtPrecioAlquilar.setText("400000");
        
            a.setVisible(true);
    }//GEN-LAST:event_cmbAlquilar3ActionPerformed

    private void cmbAlquilar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAlquilar4ActionPerformed
        DatosAlquilados a = new DatosAlquilados(null,true,tblTablaAlquilar);
        
        DatosAlquilados.txtAutomovil.setText("Ford");
        DatosAlquilados.txtPrecioAlquilar.setText("250000");
        
            a.setVisible(true);
    }//GEN-LAST:event_cmbAlquilar4ActionPerformed

    private void cmbAlquilar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAlquilar5ActionPerformed
        DatosAlquilados a = new DatosAlquilados(null,true,tblTablaAlquilar);
        
        DatosAlquilados.txtAutomovil.setText("BMW");
        DatosAlquilados.txtPrecioAlquilar.setText("500000");
        
        a.setVisible(true);
    }//GEN-LAST:event_cmbAlquilar5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ImageIcon image = new ImageIcon(getClass().getResource("/imagenes/Volkswagen-Gol-power-1.4.jpg"));
        ImageIcon icono = new ImageIcon(image.getImage().getScaledInstance(jLabel8.getWidth(), jLabel8.getHeight(), Image.SCALE_DEFAULT));
        jLabel8.setIcon(icono);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ImageIcon renault = new ImageIcon(getClass().getResource("/imagenes/renault-logan-2008-03.jpg"));
        ImageIcon icono = new ImageIcon(renault.getImage().getScaledInstance(jLabel9.getWidth(), jLabel9.getHeight(), Image.SCALE_DEFAULT));
        jLabel9.setIcon(icono);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ImageIcon image = new ImageIcon(getClass().getResource("/imagenes/images.jpg"));
        ImageIcon icono = new ImageIcon(image.getImage().getScaledInstance(jLabel10.getWidth(), jLabel10.getHeight(), Image.SCALE_DEFAULT));
        jLabel10.setIcon(icono);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ImageIcon siena = new ImageIcon(getClass().getResource("/imagenes/siena-frente-md.jpg"));
        ImageIcon icono = new ImageIcon(siena.getImage().getScaledInstance(jLabel11.getWidth(), jLabel11.getHeight(), Image.SCALE_DEFAULT));
        jLabel11.setIcon(icono);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ImageIcon livina = new ImageIcon(getClass().getResource("/imagenes/livina_1.jpg"));
        ImageIcon icono = new ImageIcon(livina.getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_DEFAULT));
        jLabel7.setIcon(icono);
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(AlquilerAutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlquilerAutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlquilerAutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlquilerAutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AlquilerAutos dialog = new AlquilerAutos(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton cmbAlquilar1;
    private javax.swing.JButton cmbAlquilar2;
    private javax.swing.JButton cmbAlquilar3;
    private javax.swing.JButton cmbAlquilar4;
    private javax.swing.JButton cmbAlquilar5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTablaAlquilar;
    // End of variables declaration//GEN-END:variables
}
