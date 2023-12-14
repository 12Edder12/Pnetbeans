/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import Controlador.Estudiante_Control;
import Modelo.Estudiante;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author henry
 */
public class JfrNuevo extends javax.swing.JInternalFrame {

    /**
     * Creates new form JfrNuevo
     */
    private DefaultTableModel modelo = new DefaultTableModel();
    private Estudiante_Control est_con = new Estudiante_Control();

    public JfrNuevo(JToggleButton a) {
        initComponents();
        addInternalFrameListener(new InternalFrameAdapter() {
            @Override
            public void internalFrameClosing(InternalFrameEvent e) {

                a.setSelected(false);

            }
        });
        cargarTabla();
    }

    public void cargarTabla() {

        modelo.setRowCount(0);
        String[] columnas = {"Cedula", "Nombre", "Apellido", "Direccion", "Telefono"};
        modelo.setColumnIdentifiers(columnas);

        ArrayList<Estudiante> registro = est_con.getEstudiantes();
        for (Estudiante est : registro) {
            Object[] lista ={est.getCedula(), est.getNombre(), est.getApellido(), est.getDireccion(), est.getCelular()};
            modelo.addRow(lista);
        }
        jtblEstudiantes.setModel(modelo);
        jtblEstudiantes.getTableHeader().setReorderingAllowed(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxtNom = new javax.swing.JTextField();
        jtxtApe = new javax.swing.JTextField();
        jtxtDir = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblEstudiantes = new javax.swing.JTable();
        JbtnGuardar = new javax.swing.JButton();
        jtxtCed = new eddercomponente.EdderComponente();
        jtxtTel = new eddercomponente.EdderComponente();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Nuevo Estudiante");

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cedula");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 72, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 78, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Apellido");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 78, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Direccion");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 80, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Telefono");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 78, -1));

        jtxtNom.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtxtNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtNomKeyTyped(evt);
            }
        });
        jPanel1.add(jtxtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 123, 150, 40));

        jtxtApe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtxtApe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtApeKeyTyped(evt);
            }
        });
        jPanel1.add(jtxtApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 123, 150, 40));

        jtxtDir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtDirKeyTyped(evt);
            }
        });
        jPanel1.add(jtxtDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 200, 150, 40));

        jtblEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtblEstudiantes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 295, 539, 204));

        JbtnGuardar.setText("Guardar");
        JbtnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(JbtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 46, 150, 43));
        jPanel1.add(jtxtCed, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 150, 40));
        jPanel1.add(jtxtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 140, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean vacio() {
        if (this.jtxtCed.getText().isBlank() || this.jtxtNom.getText().isBlank()
                || this.jtxtApe.getText().isBlank() || this.jtxtDir.getText().isBlank()
                || this.jtxtTel.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Espacios en blanco");
            return false;
        }

        return true;
    }

    private void guardar() {
        if (!this.vacio()) {
            return;
        }
        Estudiante est = new Estudiante(jtxtNom.getText(), jtxtCed.getText(), jtxtApe.getText(), jtxtDir.getText(), jtxtTel.getText());
        est_con.crearEstudiante(est);
        cargarTabla();
        eliminarCampos();
    }
    private void eliminarCampos(){
        this.jtxtCed.setText("");
        this.jtxtNom.setText("");
        this.jtxtApe.setText("");
        this.jtxtDir.setText("");
        this.jtxtTel.setText("");
        
    }
    private void JbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnGuardarActionPerformed
        guardar();
    }//GEN-LAST:event_JbtnGuardarActionPerformed

    private void jtxtNomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtNomKeyTyped
        char caracter = evt.getKeyChar();

                if (!Character.isLetter(caracter) || jtxtNom.getText().length() >=15) {
                    evt.consume();
                }
    }//GEN-LAST:event_jtxtNomKeyTyped

    private void jtxtApeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtApeKeyTyped
        char caracter = evt.getKeyChar();

                if (!Character.isLetter(caracter) || jtxtApe.getText().length() >=15) {
                    evt.consume();
                }
    }//GEN-LAST:event_jtxtApeKeyTyped

    private void jtxtDirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtDirKeyTyped
       char caracter = evt.getKeyChar();

                if (!Character.isLetter(caracter) || jtxtDir.getText().length() >=15) {
                    evt.consume();
                }
    }//GEN-LAST:event_jtxtDirKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbtnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtblEstudiantes;
    private javax.swing.JTextField jtxtApe;
    private eddercomponente.EdderComponente jtxtCed;
    private javax.swing.JTextField jtxtDir;
    private javax.swing.JTextField jtxtNom;
    private eddercomponente.EdderComponente jtxtTel;
    // End of variables declaration//GEN-END:variables
}
