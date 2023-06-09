/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import Clases.Funciones;
import Grafo.Grafo;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class ModGrafo extends javax.swing.JFrame {

    /**
     * Creates new form Ventana1
     */
    public ModGrafo() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        AgregarNodo = new javax.swing.JButton();
        BotonSalirMenu = new javax.swing.JButton();
        Destino = new javax.swing.JTextField();
        Peso = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Origen1 = new javax.swing.JTextField();
        BorrarNodo = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        AgregarNodo.setText("Agregar Nodo");
        AgregarNodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarNodoActionPerformed(evt);
            }
        });
        getContentPane().add(AgregarNodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, -1, -1));

        BotonSalirMenu.setBackground(new java.awt.Color(255, 51, 51));
        BotonSalirMenu.setText("X");
        BotonSalirMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirMenuActionPerformed(evt);
            }
        });
        getContentPane().add(BotonSalirMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 12, 40, -1));

        Destino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DestinoActionPerformed(evt);
            }
        });
        getContentPane().add(Destino, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 110, -1));
        getContentPane().add(Peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 110, -1));

        jLabel2.setText("Destino:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        jLabel3.setText("Tiempo:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        jLabel4.setText("Origen:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        Origen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Origen1ActionPerformed(evt);
            }
        });
        getContentPane().add(Origen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 110, -1));

        BorrarNodo.setText("Borrar Nodo");
        BorrarNodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarNodoActionPerformed(evt);
            }
        });
        getContentPane().add(BorrarNodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, -1, -1));

        jLabel1.setText("Inserta los datos para agregar o eliminar aristas y nodos ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel5.setText("Ingresa los datos y selecciona el boton Borrar o Agregar dependiendo la accion que quieras");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSalirMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirMenuActionPerformed
        this.dispose();
        VentanaMenu vm1 = new VentanaMenu();
        vm1.setVisible(true);
        vm1.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BotonSalirMenuActionPerformed

    private void AgregarNodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarNodoActionPerformed

        String o = Origen1.getText();
        String d = Destino.getText();
        String t = Peso.getText();
        Funciones.agregarAristaAlFinal("test\\Data\\usuarios.txt", o, d, t);
        JOptionPane.showMessageDialog(rootPane, "Nodo Agregado");
        VentanaMenu j = new VentanaMenu();
        j.setVisible(true);
        j.setLocationRelativeTo(null);
        this.dispose();
        Funciones.CargarGrafo();
        


    }//GEN-LAST:event_AgregarNodoActionPerformed

    private void DestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DestinoActionPerformed

    private void Origen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Origen1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Origen1ActionPerformed

    private void BorrarNodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarNodoActionPerformed
        Funciones.eliminarLineasConTresPalabras("test\\Data\\usuarios.txt", Origen1.getText(), Destino.getText(), Peso.getText());
        Funciones.CargarGrafo();
    }//GEN-LAST:event_BorrarNodoActionPerformed

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
            java.util.logging.Logger.getLogger(ModGrafo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModGrafo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModGrafo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModGrafo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModGrafo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarNodo;
    private javax.swing.JToggleButton BorrarNodo;
    private javax.swing.JButton BotonSalirMenu;
    private javax.swing.JTextField Destino;
    private javax.swing.JTextField Origen1;
    private javax.swing.JTextField Peso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
