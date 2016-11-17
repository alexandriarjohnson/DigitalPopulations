/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cerl.gui.forms;

import java.util.*;
import cerl.gui.standard.utilities.MarkovTableModel;
import cerl.gui.standard.utilities.customTableCellRenderer;
import cerl.gui.standard.utilities.jTableButtonMouseListener;
import cerl.gui.standard.utilities.markovTableModelListener;
import cerl.gui.utilities.MarkovTableCell;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

/**
 * Allows the user to set up a new Markov Chain. 
 * Depends on the MarkovTableModel and MarkovTable Cell
 * @author mrivera
 */
public class MarkovChainMatrix extends javax.swing.JFrame {
    private String markovName;
    private final MarkovTableModel myTable;
            
    /**
     * Creates new form MarkovChainMatrix
     * 
     * TO DO: Pull from Survey/Census data files, Write out to CSV files
     */
    public MarkovChainMatrix() {
        myTable = populateMarkovTableModel();
       
        initComponents();
        
        //sets up columns with new renderer, and clear buttons for the rows/columns
        for(int i=0; i<myTable.getColumnCount(); i++){
            TableColumn tableCol = jTable_MarkovMatrix.getColumnModel().getColumn(i);
            tableCol.setCellRenderer(new customTableCellRenderer());
        }
        //adds the mouse listener for the buttons to work in the jTable
        jTable_MarkovMatrix.addMouseListener(new jTableButtonMouseListener(jTable_MarkovMatrix));
        
        //adds the listener for the cell calculations
        jTable_MarkovMatrix.getModel().addTableModelListener(new markovTableModelListener(jTable_MarkovMatrix));
    }

    private MarkovTableModel populateMarkovTableModel(){
        ArrayList<String> columnNames = new ArrayList<>();
        //Census Value Names
        columnNames.addAll(Arrays.asList("","Value","Yes Electricity","No Electricity","N/A","Amount Left",""));

        //columns must be rows+1 because the header row is the -1th row.
        MarkovTableCell[][] cellValues = new MarkovTableCell[6][7];
        //MarkovTableCell(int row, int column, Object value, boolean calculated, boolean error, boolean editable)
        cellValues[0][0] = new MarkovTableCell(0, 0, "Value", false, false, false);
        cellValues[4][0] = new MarkovTableCell(4, 0, "Amount Left", false, false, false);
        cellValues[5][0] = new MarkovTableCell(5, 0, "", false, false, false);
        cellValues[0][1] = new MarkovTableCell(0, 1, "Proportion", false, false, false);
        cellValues[0][6] = new MarkovTableCell(5, 0, "", false, false, false);
              
        //Survey Values
        cellValues[1][0] = new MarkovTableCell(1, 1, "Yes Electricity", false, false, false);
        cellValues[2][0] = new MarkovTableCell(2, 1, "No Electricity", false, false, false);
        cellValues[3][0] = new MarkovTableCell(3, 1, "N/A", false, false, false);
        
        //load proportions
        //census
        cellValues[0][2] = new MarkovTableCell(0, 2, 0.6965, false, false, false);
        cellValues[0][3] = new MarkovTableCell(0, 3, 0.3035, false, false, false);
        cellValues[0][4] = new MarkovTableCell(0, 4, 0.0, false, false, false);
        //survey
        cellValues[1][1] = new MarkovTableCell(1, 1, 0.6037, false, false, false);
        cellValues[2][1] = new MarkovTableCell(2, 1, 0.3963, false, false, false);
        cellValues[3][1] = new MarkovTableCell(3, 1, 0.0, false, false, false);
        
        //load calculations
        //census calcs
        cellValues[0][5] = new MarkovTableCell(0,5, sumRow(1.0,0,0,cellValues), true, false, false);
        //survey calcs
        cellValues[4][1] = new MarkovTableCell(4, 1, sumColumn(1.0,1,0,cellValues), true, false, false);
        
        cellValues = calculateAmountLeft(cellValues,0,1,4,5);
        
        //create table with custom MarkovTableModel
        MarkovTableModel mtmTable = new MarkovTableModel(columnNames, cellValues);
        
        return mtmTable;
    }
    
    private double sumRow(double total, int row, int startCol, MarkovTableCell[][] thisTable){
        for(int c=startCol;c<thisTable[row].length;c++){
            if((thisTable[row][c] != null) && (thisTable[row][c].getValue().getClass() == Double.class)){
                total -= (double)thisTable[row][c].getValue();
            }
        }
        return total;
    }
    
    private double sumColumn(double total, int col, int startRow, MarkovTableCell[][] thisTable){
        for(int r=startRow;r<thisTable.length;r++){
            if((thisTable[r][col] != null) && (thisTable[r][col].getValue().getClass() == Double.class)){
                total -= (double)thisTable[r][col].getValue();
            }
        }
        return total;
    }
        
    private MarkovTableCell[][] calculateAmountLeft(MarkovTableCell[][] thisTable, int startValRow, int startValCol, int sumRow, int sumCol){
        double colProportion = -1.0;
        double rowProportion = -5.0;
        
        //calculate all columns
        for(int c=startValCol+1;c<thisTable[startValRow].length-1;c++){
            colProportion = sumColumn((double)thisTable[startValRow][c].getValue(), c, startValRow+1, thisTable);
            
            //set column total
            if(thisTable[sumRow][c] == null){
                thisTable[sumRow][c] = new MarkovTableCell(sumRow, c, colProportion, true, false, false);
            } else{
                thisTable[sumRow][c].setValue(colProportion);
            }
        }
        
        //calculate all rows
        for(int r=startValRow+1;r<thisTable.length-1;r++){
            rowProportion = sumRow((double)thisTable[r][startValCol].getValue(),r,startValCol+1, thisTable);
                    
            if(thisTable[r][sumCol] == null){
                thisTable[r][sumCol] = new MarkovTableCell(r, sumCol, rowProportion, true, false, false);
            }
        }
        return thisTable;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_MarkovMatrix = new javax.swing.JTable();
        jButton_Back = new javax.swing.JButton();
        jButton_Cancel = new javax.swing.JButton();
        jButton_Save = new javax.swing.JButton();
        jButton_Clear = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(840, 500));

        jTextField1.setToolTipText("Please enter the name of the Markov Chain for saving and reuse later.");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Markov Chain Name:");

        jTable_MarkovMatrix.setModel(myTable);
        jTable_MarkovMatrix.setAlignmentY(0.0F);
        jTable_MarkovMatrix.setCellEditor(jTable_MarkovMatrix.getCellEditor());
        jTable_MarkovMatrix.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable_MarkovMatrix.setFillsViewportHeight(true);
        jTable_MarkovMatrix.setMinimumSize(new java.awt.Dimension(100, 300));
        jTable_MarkovMatrix.setName("Markov Chain Matrix"); // NOI18N
        jTable_MarkovMatrix.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable_MarkovMatrix);
        jTable_MarkovMatrix.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jButton_Back.setText("Back to Definitions");
        jButton_Back.setToolTipText("Go back to the previous step");
        jButton_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BackActionPerformed(evt);
            }
        });

        jButton_Cancel.setText("Cancel Creation of New Markov Chain Matrix");
        jButton_Cancel.setToolTipText("Cancel the creation of a new Markov Chain matrix");
        jButton_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CancelActionPerformed(evt);
            }
        });

        jButton_Save.setText("Save New Markov Chain");
        jButton_Save.setToolTipText("Saves the current matrix as a new Markov Chain");
        jButton_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SaveActionPerformed(evt);
            }
        });

        jButton_Clear.setText("Clear All Inputs");
        jButton_Clear.setName("ClearButton"); // NOI18N
        jButton_Clear.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ClearActionPerformed(evt);
            }
        });

        jMenuBar1.setName("Markov Chain Matrix"); // NOI18N

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);
        jMenuBar1.getAccessibleContext().setAccessibleName("Markov Chain Matrix");
        jMenuBar1.getAccessibleContext().setAccessibleDescription("Add a new Markov Chain Matrix");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jButton_Back)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_Cancel)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_Save))
                            .addComponent(jButton_Clear))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Clear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Back)
                    .addComponent(jButton_Cancel)
                    .addComponent(jButton_Save))
                .addContainerGap())
        );

        jButton_Clear.getAccessibleContext().setAccessibleDescription("Clear all user entered data from the table.");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Sends the user back to the previous step
     * @param evt 
     */
    private void jButton_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_BackActionPerformed

    /**
     * Cancels creation of the current Markov chain.
     * @param evt 
     */
    private void jButton_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_CancelActionPerformed

    /**
     * Clears the data entered by the user
     * @param evt 
     */
    private void jButton_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ClearActionPerformed
        //Clear all user entered inputs from the grid.
        myTable.clear(1, 1, 2, 1);
    }//GEN-LAST:event_jButton_ClearActionPerformed

    /**
     * Sets the name of the Markov when the user updates the name
     * @param evt 
     */
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        //Save name of Markov
        markovName = jTextField1.getText();
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     * Saves the current Markov chain
     * @param evt 
     */
    private void jButton_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SaveActionPerformed
        // TODO add your handling code here:
        // TODO: save markovName to XML with full populated table object.
    }//GEN-LAST:event_jButton_SaveActionPerformed

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
            java.util.logging.Logger.getLogger(MarkovChainMatrix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarkovChainMatrix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarkovChainMatrix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarkovChainMatrix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
                        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarkovChainMatrix().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Back;
    private javax.swing.JButton jButton_Cancel;
    private javax.swing.JButton jButton_Clear;
    private javax.swing.JButton jButton_Save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_MarkovMatrix;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
