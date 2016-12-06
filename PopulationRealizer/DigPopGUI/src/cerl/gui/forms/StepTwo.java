/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cerl.gui.forms;

import cerl.gui.standard.utilities.Result;
import cerl.gui.utilities.DigPopFileTypeEnum;
import cerl.gui.utilities.DigPopGUIUtilityClass;
import cerl.gui.utilities.HelpFileScreenNames;
//import cerl.gui.utilities.DigPopGUIFiles;
import cerl.gui.utilities.StepOneUtilityClass;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ajohnson
 */
public class StepTwo extends javax.swing.JFrame {
    
 //   private DigPopGUIFiles digPopGUIFiles; 
    private DefaultTableModel constraintMapsDataModel;
    private ArrayList<String> errors;
    private final String SCREEN_NAME = HelpFileScreenNames.STEP_TWO_HELP_FILE_NAME.toString();

    /**
     * Creates new form StepOne
     */
    public StepTwo() {
        initComponents();
   //     digPopGUIFiles = new DigPopGUIFiles();
        errors = new ArrayList<String>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mapRadioButtonGroup = new javax.swing.ButtonGroup();
        fileChooser = new javax.swing.JFileChooser();
        jPanelStepTwo = new javax.swing.JPanel();
        jPanelRegionMapCensusEnum = new javax.swing.JPanel();
        txtRegionMap = new javax.swing.JTextField();
        txtCensusEnumerations = new javax.swing.JTextField();
        lblRegionMap = new javax.swing.JLabel();
        lblCensusEnumerations = new javax.swing.JLabel();
        jPanelLandUseHouseholdMap = new javax.swing.JPanel();
        txtLandUseHouseholdMap = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanelHouseholdMicroData = new javax.swing.JPanel();
        txtHouseholdMicroData = new javax.swing.JTextField();
        lblHouseholdMicroData = new javax.swing.JLabel();
        jPanelPopulationMicroData = new javax.swing.JPanel();
        txtPopulationMicroData = new javax.swing.JTextField();
        lblPopulationMicroData = new javax.swing.JLabel();
        jPanelConstraintMap = new javax.swing.JPanel();
        lblConstraintMap = new javax.swing.JLabel();
        txtLandUseHouseholdMap1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanelConstraintMap1 = new javax.swing.JPanel();
        lblConstraintMap1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblConstraintMaps1 = new javax.swing.JTable();
        btnNextStep = new javax.swing.JButton();
        lblErrorMessages = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuItemExitApplication = new javax.swing.JMenuItem();
        menuHelp = new javax.swing.JMenu();
        jMenu_About = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Step Two");

        jPanelStepTwo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanelRegionMapCensusEnum.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtRegionMap.setEditable(false);

        txtCensusEnumerations.setEditable(false);

        lblRegionMap.setText("Selected Region Map:");

        lblCensusEnumerations.setText("Selected Census Enumerations:");

        javax.swing.GroupLayout jPanelRegionMapCensusEnumLayout = new javax.swing.GroupLayout(jPanelRegionMapCensusEnum);
        jPanelRegionMapCensusEnum.setLayout(jPanelRegionMapCensusEnumLayout);
        jPanelRegionMapCensusEnumLayout.setHorizontalGroup(
            jPanelRegionMapCensusEnumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegionMapCensusEnumLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRegionMapCensusEnumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegionMapCensusEnumLayout.createSequentialGroup()
                        .addComponent(lblCensusEnumerations)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCensusEnumerations))
                    .addGroup(jPanelRegionMapCensusEnumLayout.createSequentialGroup()
                        .addComponent(lblRegionMap)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRegionMap)))
                .addContainerGap())
        );
        jPanelRegionMapCensusEnumLayout.setVerticalGroup(
            jPanelRegionMapCensusEnumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegionMapCensusEnumLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRegionMapCensusEnumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRegionMap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRegionMap))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRegionMapCensusEnumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCensusEnumerations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCensusEnumerations))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanelLandUseHouseholdMap.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtLandUseHouseholdMap.setEditable(false);

        jLabel1.setText("Selected Household Density Map :");

        javax.swing.GroupLayout jPanelLandUseHouseholdMapLayout = new javax.swing.GroupLayout(jPanelLandUseHouseholdMap);
        jPanelLandUseHouseholdMap.setLayout(jPanelLandUseHouseholdMapLayout);
        jPanelLandUseHouseholdMapLayout.setHorizontalGroup(
            jPanelLandUseHouseholdMapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLandUseHouseholdMapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLandUseHouseholdMap)
                .addContainerGap())
        );
        jPanelLandUseHouseholdMapLayout.setVerticalGroup(
            jPanelLandUseHouseholdMapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLandUseHouseholdMapLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLandUseHouseholdMapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLandUseHouseholdMap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelHouseholdMicroData.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelHouseholdMicroData.setMinimumSize(new java.awt.Dimension(100, 100));

        txtHouseholdMicroData.setEditable(false);

        lblHouseholdMicroData.setText("Selected Household Micro-data:");

        javax.swing.GroupLayout jPanelHouseholdMicroDataLayout = new javax.swing.GroupLayout(jPanelHouseholdMicroData);
        jPanelHouseholdMicroData.setLayout(jPanelHouseholdMicroDataLayout);
        jPanelHouseholdMicroDataLayout.setHorizontalGroup(
            jPanelHouseholdMicroDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHouseholdMicroDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHouseholdMicroData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHouseholdMicroData)
                .addContainerGap())
        );
        jPanelHouseholdMicroDataLayout.setVerticalGroup(
            jPanelHouseholdMicroDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHouseholdMicroDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHouseholdMicroDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHouseholdMicroData)
                    .addComponent(txtHouseholdMicroData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelPopulationMicroData.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelPopulationMicroData.setMinimumSize(new java.awt.Dimension(100, 100));

        txtPopulationMicroData.setEditable(false);

        lblPopulationMicroData.setText("Selected Population Micro-data :");

        javax.swing.GroupLayout jPanelPopulationMicroDataLayout = new javax.swing.GroupLayout(jPanelPopulationMicroData);
        jPanelPopulationMicroData.setLayout(jPanelPopulationMicroDataLayout);
        jPanelPopulationMicroDataLayout.setHorizontalGroup(
            jPanelPopulationMicroDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPopulationMicroDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPopulationMicroData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPopulationMicroData)
                .addContainerGap())
        );
        jPanelPopulationMicroDataLayout.setVerticalGroup(
            jPanelPopulationMicroDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPopulationMicroDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPopulationMicroDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPopulationMicroData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPopulationMicroData))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelConstraintMap.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelConstraintMap.setMinimumSize(new java.awt.Dimension(100, 100));

        lblConstraintMap.setText("Selected Land Use Map:");

        txtLandUseHouseholdMap1.setEditable(false);

        jLabel2.setText("Vacent Classes: ");

        jTextField1.setText("jTextField1");

        jLabel3.setText("Vacent Class Description: ");

        jTextField2.setText("jTextField1");

        javax.swing.GroupLayout jPanelConstraintMapLayout = new javax.swing.GroupLayout(jPanelConstraintMap);
        jPanelConstraintMap.setLayout(jPanelConstraintMapLayout);
        jPanelConstraintMapLayout.setHorizontalGroup(
            jPanelConstraintMapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConstraintMapLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelConstraintMapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelConstraintMapLayout.createSequentialGroup()
                        .addComponent(lblConstraintMap)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelConstraintMapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelConstraintMapLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1))
                            .addComponent(txtLandUseHouseholdMap1)))
                    .addGroup(jPanelConstraintMapLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelConstraintMapLayout.setVerticalGroup(
            jPanelConstraintMapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConstraintMapLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelConstraintMapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConstraintMap)
                    .addComponent(txtLandUseHouseholdMap1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelConstraintMapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelConstraintMapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(114, Short.MAX_VALUE))
        );

        jPanelConstraintMap1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelConstraintMap1.setMinimumSize(new java.awt.Dimension(100, 100));

        lblConstraintMap1.setText("Selected Constraint Maps :");

        tblConstraintMaps1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "File Path"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblConstraintMaps1);

        javax.swing.GroupLayout jPanelConstraintMap1Layout = new javax.swing.GroupLayout(jPanelConstraintMap1);
        jPanelConstraintMap1.setLayout(jPanelConstraintMap1Layout);
        jPanelConstraintMap1Layout.setHorizontalGroup(
            jPanelConstraintMap1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConstraintMap1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelConstraintMap1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
                    .addGroup(jPanelConstraintMap1Layout.createSequentialGroup()
                        .addComponent(lblConstraintMap1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelConstraintMap1Layout.setVerticalGroup(
            jPanelConstraintMap1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConstraintMap1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblConstraintMap1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelStepTwoLayout = new javax.swing.GroupLayout(jPanelStepTwo);
        jPanelStepTwo.setLayout(jPanelStepTwoLayout);
        jPanelStepTwoLayout.setHorizontalGroup(
            jPanelStepTwoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStepTwoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelStepTwoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelLandUseHouseholdMap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelPopulationMicroData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelRegionMapCensusEnum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelHouseholdMicroData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelConstraintMap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanelStepTwoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelStepTwoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelConstraintMap1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanelStepTwoLayout.setVerticalGroup(
            jPanelStepTwoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStepTwoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelRegionMapCensusEnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPopulationMicroData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelHouseholdMicroData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelLandUseHouseholdMap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelConstraintMap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
            .addGroup(jPanelStepTwoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelStepTwoLayout.createSequentialGroup()
                    .addContainerGap(452, Short.MAX_VALUE)
                    .addComponent(jPanelConstraintMap1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(1, 1, 1)))
        );

        btnNextStep.setText("Next Step");

        lblErrorMessages.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblErrorMessages.setForeground(new java.awt.Color(255, 0, 0));

        menuFile.setText("File");

        menuItemExitApplication.setText("Exit Application");
        menuFile.add(menuItemExitApplication);

        jMenuBar.add(menuFile);

        menuHelp.setText("Help");
        menuHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuHelpMouseClicked(evt);
            }
        });
        jMenuBar.add(menuHelp);

        jMenu_About.setText("About");
        jMenu_About.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu_AboutMouseClicked(evt);
            }
        });
        jMenuBar.add(jMenu_About);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelStepTwo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNextStep)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrorMessages)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelStepTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNextStep)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrorMessages)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu_AboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_AboutMouseClicked
        new About().setVisible(true);
    }//GEN-LAST:event_jMenu_AboutMouseClicked

    private void menuHelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuHelpMouseClicked
        DigPopGUIUtilityClass.loadDefaultHelpGUIByScreenName(SCREEN_NAME);
    }//GEN-LAST:event_menuHelpMouseClicked

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
            java.util.logging.Logger.getLogger(StepTwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StepTwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StepTwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StepTwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StepTwo().setVisible(true);
            }
        });
    }

    private void getAndVerifyFile(DigPopFileTypeEnum fileType) {

        File file = getFileFromFileChooser();
        if (file != null) {
            Result result = StepOneUtilityClass.verifyFile(file, fileType);

            if (result.isSuccess()
                    && (boolean)result.getValue()) {

                switch (fileType) {
//                    case Land_Use_Household_Map:
//                        txtLandUseHouseholdMap.setText(file.getPath());
//                        digPopGUIFiles.setLandUseHouseholdMapFilePath(file.getPath());
//                        break;
                    case Region_Map:
                        txtRegionMap.setText(file.getPath());
                   //     digPopGUIFiles.setRegionMapFilePath(file.getPath());
                        break;
                    case Census_Enumerations:
                        txtCensusEnumerations.setText(file.getPath());
                      //  digPopGUIFiles.setCensusEnumerationsFilePath(file.getPath());
                        break;
                    case Constraint_Map:
                        /**
                         * TODO Need to figure out how I am displaying this
                         */
                        
                      //  digPopGUIFiles.addConstraintMapFilePath(file.getPath());
                        
                        AddItemToConstaintMapTable(file.getPath());
                                
            //            constraintMapsDataModel = new DefaultTableModel(digPopGUIFiles.getConstraintMapFilePaths().toArray(),0);
        
        //tblConstraintMaps.setModel((TableModel) digPopGUIFiles.getConstraintMapFilePaths());
                        
                        break;
                    case Population_Micro_Data:
                        txtPopulationMicroData.setText(file.getPath());
                     //   digPopGUIFiles.setPopulationMicroDataFilePath(file.getPath());
                        break;
                    case Household_Micro_Data:
                        txtHouseholdMicroData.setText(file.getPath());
                      //  digPopGUIFiles.setHouseholdMicroData(file.getPath());
                        break;
                }
             //   setIconImage(fileType, true);
            } else {
                errors.add(fileType + ":" +result.getErrorMessage());
                setErrorMessage();
            //    setIconImage(fileType, false);
                
            }
        }
    }

    private File getFileFromFileChooser() {
        File returnFile = null;

        int returnVal = fileChooser.showOpenDialog(this);

        /**
         * FileChooser will return APPROVE_OPTION if the user selected a file
         * from the dialog.
         */
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            returnFile = fileChooser.getSelectedFile();
        }

        return returnFile;
    }
    
    private void AddItemToConstaintMapTable(String value){
//        DefaultTableModel model = (DefaultTableModel)tblConstraintMaps.getModel();
//        Object[] obj = {value};
//        model.addRow(obj);
    }
    
    private void setErrorMessage()
    {
        String errorMessageText = "<html>";
        
        for(String error : errors)
        {
            if(errorMessageText.length()>6)
            {
                errorMessageText = String.format(
                        "%s<br>%s", 
                        errorMessageText, 
                        error);
            }else{
                errorMessageText = errorMessageText + error;
            }
        }
        
        lblErrorMessages.setText(errorMessageText);
        ((JFrame)lblErrorMessages.getTopLevelAncestor()).pack();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNextStep;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenu_About;
    private javax.swing.JPanel jPanelConstraintMap;
    private javax.swing.JPanel jPanelConstraintMap1;
    private javax.swing.JPanel jPanelHouseholdMicroData;
    private javax.swing.JPanel jPanelLandUseHouseholdMap;
    private javax.swing.JPanel jPanelPopulationMicroData;
    private javax.swing.JPanel jPanelRegionMapCensusEnum;
    private javax.swing.JPanel jPanelStepTwo;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblCensusEnumerations;
    private javax.swing.JLabel lblConstraintMap;
    private javax.swing.JLabel lblConstraintMap1;
    private javax.swing.JLabel lblErrorMessages;
    private javax.swing.JLabel lblHouseholdMicroData;
    private javax.swing.JLabel lblPopulationMicroData;
    private javax.swing.JLabel lblRegionMap;
    private javax.swing.ButtonGroup mapRadioButtonGroup;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenuItem menuItemExitApplication;
    private javax.swing.JTable tblConstraintMaps1;
    private javax.swing.JTextField txtCensusEnumerations;
    private javax.swing.JTextField txtHouseholdMicroData;
    private javax.swing.JTextField txtLandUseHouseholdMap;
    private javax.swing.JTextField txtLandUseHouseholdMap1;
    private javax.swing.JTextField txtPopulationMicroData;
    private javax.swing.JTextField txtRegionMap;
    // End of variables declaration//GEN-END:variables
}
