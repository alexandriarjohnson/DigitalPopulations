/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cerl.gui.forms;

import cerl.gui.standard.utilities.HelpFile;
import cerl.gui.standard.utilities.Instruction;
import cerl.gui.standard.utilities.Screen;
import java.awt.print.PrinterException;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        
        /**
         * This makes sure we are always seeing the top of 
         * the text box when the form is opened. 
         */
        txtDisplay.setCaretPosition(0);
        
        this.setAlwaysOnTop(true);
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
        txtDisplay = new javax.swing.JEditorPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        treeHelpFileSelect = new javax.swing.JTree();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Help");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtDisplay.setEditable(false);
        txtDisplay.setContentType("text/html"); // NOI18N
        jScrollPaneHelpFileDisplay.setViewportView(txtDisplay);

        treeHelpFileSelect.setMaximumSize(new java.awt.Dimension(100, 2147483647));
        treeHelpFileSelect.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                treeHelpFileSelectValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(treeHelpFileSelect);

        jMenu1.setText("File");

        jMenuItem2.setText("Print");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem1.setText("Exit");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPaneHelpFileDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneHelpFileDisplay, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE))
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

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        try {
            txtDisplay.print();
        } catch (PrinterException ex) {
            Logger.getLogger(HelpFileDisplay.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed
    
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
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPaneHelpFileDisplay;
    private javax.swing.JTree treeHelpFileSelect;
    private javax.swing.JEditorPane txtDisplay;
    // End of variables declaration//GEN-END:variables
}
