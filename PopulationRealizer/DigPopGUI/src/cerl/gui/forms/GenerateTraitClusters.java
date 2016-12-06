/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cerl.gui.forms;

import cerl.gui.standard.utilities.customTableCell;
import cerl.gui.standard.utilities.customTableCellRenderer;
import cerl.gui.standard.utilities.customTableModel;
import cerl.gui.standard.utilities.customTableModelListener;
import cerl.gui.utilities.DigPopGUIUtilityClass;
import cerl.gui.utilities.HelpFileScreenNames;
import java.awt.Dimension;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.TableColumn;

/**
 *
 * @author mrivera
 */
public class GenerateTraitClusters extends javax.swing.JFrame {
    private final customTableModel myTable;
    private final String SCREEN_NAME = HelpFileScreenNames.STEP_SIX_HELP_FILE_NAME.toString();
    
    /**
     * Creates new form GenerateTraitClusters
     */
    public GenerateTraitClusters() {
        //load table
        myTable = populateTableModel();
        initComponents();
        
        //sets up columns with new renderer, and clear buttons for the rows/columns
        for(int i=0; i<myTable.getColumnCount(); i++){
            TableColumn tableCol = jTable_TraitInformation.getColumnModel().getColumn(i);
            tableCol.setCellRenderer(new customTableCellRenderer());
        }
        
        //adds the listener for the cell calculations/validations
        jTable_TraitInformation.getModel().addTableModelListener(new customTableModelListener(jTable_TraitInformation));
    }

    private customTableModel populateTableModel(){
        ArrayList<String> columnNames = new ArrayList<>();
        //Census Value Names
        columnNames.addAll(Arrays.asList("Trait ID","Reduction","Distance"));

        //columns must be rows+1 because the header row is the -1th row.
        ArrayList<ArrayList<Object>> cellValues = new ArrayList<>();
        //Vector<ArrayList<Object>> cellValues = new Vector(3,3);
        
        //Add rows
        cellValues.add(0,new ArrayList<>());
        cellValues.add(1,new ArrayList<>());
        cellValues.add(2,new ArrayList<>());
        
        //Add Column - Trait ID's
        //cellValues[0][0] = new customTableCell("123", false, "Integer", false);
        cellValues.get(0).add(0, new customTableCell("123", false, "Integer", false));
        cellValues.get(1).add(0, new customTableCell("131", false, "Integer", false));
        cellValues.get(2).add(0, new customTableCell("136", false, "Integer", false));
        
        //Reduction
        cellValues.get(0).add(1, new customTableCell("", true, "Integer", false));
        cellValues.get(1).add(1, new customTableCell("", true, "Integer", false));
        cellValues.get(2).add(1, new customTableCell("", true, "Integer", false));
        
        //Distance
        cellValues.get(0).add(2, new customTableCell("", true, "Integer", false));
        cellValues.get(1).add(2, new customTableCell("", true, "Integer", false));
        cellValues.get(2).add(2, new customTableCell("", true, "Integer", false));
        
        //create table with customTableModel
        customTableModel myTableModel = new customTableModel(columnNames, cellValues);
        
        return myTableModel;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Header = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_TraitInformation = new javax.swing.JTable();
        jButton_NewCluster = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu_About = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Step Six");

        jLabel_Header.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Header.setText("Generate Trait Clusters");
        jLabel_Header.setName("Header"); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Trait Clusters");

        jTable_TraitInformation.setModel(myTable);
        jTable_TraitInformation.setMinimumSize(new java.awt.Dimension(100, 300));
        jTable_TraitInformation.setName("Trait Information"); // NOI18N
        jScrollPane1.setViewportView(jTable_TraitInformation);

        jButton_NewCluster.setText("Add New Cluster");
        jButton_NewCluster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NewClusterActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu_About.setText("About");
        jMenu_About.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu_AboutMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu_About);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_NewCluster)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Header)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_NewCluster)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_NewClusterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NewClusterActionPerformed
        //Open a new dialog, to have users provide the trait cluster information
        String returnVal = "";
        JPanel myPanel = new JPanel();
        //this.validationLabel = new JLabel();
        
        //Set up custom int formatter for the reduction/distance textboxes
        NumberFormat intFormat = NumberFormat.getNumberInstance();
        intFormat.setGroupingUsed(false);
        intFormat.setMaximumFractionDigits(0);
        
        //create the dropdown selector for Trait ID
        //Trait ID (List with descriptions)
        JFormattedTextField trait = new JFormattedTextField(intFormat);
        //create the reduction/distance textboxes
        JFormattedTextField reduction = new JFormattedTextField(intFormat);
        JFormattedTextField distance = new JFormattedTextField(intFormat);
        
        //set the dimensions for the min/max textboxes
        Dimension d = new Dimension();
        d.height=30;
        d.width=80;
        trait.setPreferredSize(d);
        reduction.setPreferredSize(d);
        distance.setPreferredSize(d);
        
        //setup validator for values entered 
        //StrictInputVerifier verifyDoubles = new StrictInputVerifier("Integer");
        //validate data entered into both the min and max textboxes
        //reduction.setInputVerifier(verifyDoubles);
        //distance.setInputVerifier(verifyDoubles);
        
        //Add textboxes and labels to the panel
        myPanel.add(new JLabel("Trait:"));
        myPanel.add(trait);
        myPanel.add(new JLabel("Reduction:"));
        myPanel.add(reduction);
        myPanel.add(new JLabel("Distance:"));
        myPanel.add(distance);
        //myPanel.add(validationLabel);
        myPanel.setPreferredSize(new Dimension(300,75));
        
        //create the popup
        int result = JOptionPane.showConfirmDialog(null, myPanel, "Please enter min and max values", JOptionPane.OK_CANCEL_OPTION);
        if(result == JOptionPane.OK_OPTION){
            //add to table
            ArrayList<Object> cellValues = new ArrayList<>();
            //populateRow
            cellValues.add(0, new customTableCell(trait.getText(), false, "Integer", false));
            cellValues.add(1, new customTableCell(reduction.getText(), true, "Integer", false));
            cellValues.add(2, new customTableCell(distance.getText(), true, "Integer", false));
            
            myTable.addRow(cellValues);            
        } else if(result == JOptionPane.CANCEL_OPTION){
            //do nothing
            //return null;
        }
                
        //save new trait cluster information back to the main jTable.
        //return returnVal;
    }//GEN-LAST:event_jButton_NewClusterActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        DigPopGUIUtilityClass.loadDefaultHelpGUIByScreenName(SCREEN_NAME);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu_AboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_AboutMouseClicked
        new About().setVisible(true);
    }//GEN-LAST:event_jMenu_AboutMouseClicked

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
            java.util.logging.Logger.getLogger(GenerateTraitClusters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenerateTraitClusters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenerateTraitClusters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenerateTraitClusters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenerateTraitClusters().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_NewCluster;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Header;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenu_About;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_TraitInformation;
    // End of variables declaration//GEN-END:variables
}