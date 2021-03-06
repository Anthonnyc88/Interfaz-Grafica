/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerinterfazgraficayerlinperez;

import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author estudiante
 */
public class JTree extends javax.swing.JDialog {

    DefaultMutableTreeNode Titulo = null;
    DefaultTreeModel modelo = null;

    /**
     * Creates new form JTree
     */
    public JTree(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Jtree1.setModel(cargarArbol());
    }

    public DefaultTreeModel cargarArbol() {

        DefaultMutableTreeNode categorias = null;
        DefaultMutableTreeNode subcategoria = null;
        Titulo = new DefaultMutableTreeNode("Centro de Administracion");
        modelo = new DefaultTreeModel(Titulo);
        categorias = new DefaultMutableTreeNode("Adm.Redes");
        subcategoria = new DefaultMutableTreeNode("Dept. de planificacion");
        modelo.insertNodeInto(categorias, Titulo, 0);
        categorias = new DefaultMutableTreeNode("Adm de laboratorios");
        subcategoria = new DefaultMutableTreeNode("Dept de tecnologia");
        modelo.insertNodeInto(categorias, Titulo, 1);
        modelo.insertNodeInto(subcategoria, Titulo, 0);
        categorias = new DefaultMutableTreeNode("Dept. de Investigacion");
        subcategoria = new DefaultMutableTreeNode("Dept.A");
        modelo.insertNodeInto(categorias, Titulo, 2);
        modelo.insertNodeInto(subcategoria, categorias, 0);
        return modelo;
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
        Jtree1 = new javax.swing.JTree();
        btnAgregar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnInformacion = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane1.setViewportView(Jtree1);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnInformacion.setText("Informacion");
        btnInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacionActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInformacion)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar)))
                .addGap(0, 26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(btnInformacion)
                    .addComponent(btnRemover)
                    .addComponent(btnAgregar))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String cadena = JOptionPane.showInputDialog(this, "Igrese un Departamento");
        DefaultMutableTreeNode parentNodo = null;
        TreePath parentPath = Jtree1.getSelectionPath();
        if (parentPath == null) {

        } else {
            parentNodo = (DefaultMutableTreeNode) parentPath.getLastPathComponent();

        }

        DefaultMutableTreeNode child = new DefaultMutableTreeNode(cadena);
        modelo.insertNodeInto(child, parentNodo, parentNodo.getChildCount());
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        DefaultMutableTreeNode pareNode = null;
        TreePath currentSeleccion = Jtree1.getSelectionPath();
        if (currentSeleccion != null) {
            pareNode = (DefaultMutableTreeNode) currentSeleccion.getLastPathComponent();
            DefaultTreeModel modelo = ((DefaultTreeModel) Jtree1.getModel());
            modelo.removeNodeFromParent(pareNode);

        }


    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacionActionPerformed

        DefaultMutableTreeNode node = (DefaultMutableTreeNode) Jtree1.getLastSelectedPathComponent();
        if (node == null) {// nada selecionado
            return;

        }
        Object nodeInfo = node.getUserObject();
        JOptionPane.showMessageDialog(this, nodeInfo.toString());

    }//GEN-LAST:event_btnInformacionActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) Jtree1.getLastSelectedPathComponent();
        if (node == null) {// nada selecionado
            return;

        }
          Object nodeInfo = node.getUserObject();
       String cadena= JOptionPane.showInputDialog(this,"Ingrese el nuevo nombre" , nodeInfo.toString());
       TreePath currentSeleccion = Jtree1.getSelectionPath();
       if (currentSeleccion != null) {
       node = (DefaultMutableTreeNode)currentSeleccion.getLastPathComponent();
       node .setUserObject(cadena);
          DefaultTreeModel model = ((DefaultTreeModel) Jtree1.getModel());
       model.nodeChanged(node);
       
       }
           
       
    }//GEN-LAST:event_btnModificarActionPerformed

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
            java.util.logging.Logger.getLogger(JTree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JTree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JTree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JTree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JTree dialog = new JTree(new javax.swing.JFrame(), true);
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
    private javax.swing.JTree Jtree1;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnInformacion;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
