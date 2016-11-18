/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cerl.gui.forms;

import cerl.gui.standard.utilities.HelpFile;
import cerl.gui.standard.utilities.Instruction;
import cerl.gui.standard.utilities.Screen;
import java.util.Enumeration;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

/**
 *
 * @author ajohnson
 */
public class HelpFileDisplay extends javax.swing.JFrame {
    
    private final HelpFile helpFile;

    /**
     * Creates new form HelpFileDisplay
     * @param defaultSelected
     * @param helpFile
     */
    public HelpFileDisplay(Object defaultSelected, HelpFile helpFile) {
        
        this.helpFile = helpFile;
        
        initComponents();
        LoadTree();
        
        if(defaultSelected == null)
        {
            defaultSelected = helpFile;
        }
        
        setSelected(defaultSelected);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneHelpFileDisplay = new javax.swing.JScrollPane();
        txtDisplay = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        treeHelpFileSelect = new javax.swing.JTree();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPaneHelpFileDisplay.setViewportView(txtDisplay);

        treeHelpFileSelect.setMaximumSize(new java.awt.Dimension(100, 2147483647));
        treeHelpFileSelect.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                treeHelpFileSelectValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(treeHelpFileSelect);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPaneHelpFileDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneHelpFileDisplay, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void treeHelpFileSelectValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_treeHelpFileSelectValueChanged
        
        DefaultMutableTreeNode node = (DefaultMutableTreeNode)
                           treeHelpFileSelect.getLastSelectedPathComponent();

        if (node == null) return;

        Object nodeInfo = node.getUserObject();
        
        System.out.println(nodeInfo.getClass().getName());
        
        switch(nodeInfo.getClass().getName()){
            case "cerl.gui.standard.utilities.HelpFile":
                HelpFile helpFileSelected = (HelpFile)nodeInfo;
                txtDisplay.setText(helpFileSelected.getDisplayText());
                break;
            case "cerl.gui.standard.utilities.Screen":
                Screen screenSelected = (Screen)nodeInfo;
                txtDisplay.setText(screenSelected.getDisplayText());
                break;
            case "cerl.gui.standard.utilities.Instruction":
                Instruction instructionSelected = (Instruction)nodeInfo;
                txtDisplay.setText(instructionSelected.getDisplayText());
                break;
        }
    }//GEN-LAST:event_treeHelpFileSelectValueChanged

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(HelpFileDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(HelpFileDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(HelpFileDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(HelpFileDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                
//                HelpFile newHelpFile = DigPopGUIUtilityClass.getDefaultHelpFile();
//                
//                new HelpFileDisplay(newHelpFile.getScreen().get(5), newHelpFile).setVisible(true);
//            }
//        });
//        
//        
//    }
    
    private void LoadTree()
    {
        treeHelpFileSelect.setModel(helpFile.getAsDefaultTreeModel());
    }
    
    private void setSelected(Object selectedNodeObject)
    {
        TreePath path = getTreePath(selectedNodeObject);
        
        treeHelpFileSelect.setSelectionPath(path);
    }
    
    private TreePath getTreePath(Object selectedNodeObject) {
        DefaultMutableTreeNode node = null;
        Enumeration e = helpFile.getRoot().breadthFirstEnumeration();
        while (e.hasMoreElements()) {
          node = (DefaultMutableTreeNode) e.nextElement();
          if (selectedNodeObject.equals(node.getUserObject())) {
            return new TreePath(node.getPath());
          }
        }
        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPaneHelpFileDisplay;
    private javax.swing.JTree treeHelpFileSelect;
    private javax.swing.JTextPane txtDisplay;
    // End of variables declaration//GEN-END:variables
}