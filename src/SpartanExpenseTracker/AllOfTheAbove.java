/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpartanExpenseTracker;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author royperlman
 */
public class AllOfTheAbove extends javax.swing.JFrame
{

    /**
     * Creates new form EatOut
     */
    public AllOfTheAbove()
    {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        Border AllLabel = BorderFactory.createMatteBorder(5,5,5,5, Color.black);
        AllPanel.setBorder(AllLabel);
        
        Border ShowButton = BorderFactory.createMatteBorder(5,5,5,5, Color.black);
        jPanel4.setBorder(ShowButton);
        
        Border jBackButton =  BorderFactory.createMatteBorder(5,5,5,5, Color.black);
        jPanel3.setBorder(jBackButton);   
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AllPanel = new javax.swing.JPanel();
        AllLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jBackButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        ShowButton = new javax.swing.JButton();
        RefreshButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AllTheAboveTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        AllPanel.setBackground(new java.awt.Color(0, 102, 204));

        AllLabel.setFont(new java.awt.Font("Lucida Grande", 0, 49)); // NOI18N
        AllLabel.setForeground(new java.awt.Color(255, 204, 0));
        AllLabel.setText("All");

        javax.swing.GroupLayout AllPanelLayout = new javax.swing.GroupLayout(AllPanel);
        AllPanel.setLayout(AllPanelLayout);
        AllPanelLayout.setHorizontalGroup(
            AllPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AllPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AllLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(303, Short.MAX_VALUE))
        );
        AllPanelLayout.setVerticalGroup(
            AllPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AllPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AllLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 204));

        jBackButton.setText("Back");
        jBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jBackButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 204, 51));

        ShowButton.setText("Show");
        ShowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowButtonActionPerformed(evt);
            }
        });

        RefreshButton.setText("Delete All");
        RefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(ShowButton)
                .addGap(18, 18, 18)
                .addComponent(RefreshButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ShowButton)
                    .addComponent(RefreshButton))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        AllTheAboveTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(AllTheAboveTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AllPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(AllPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 31, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ShowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowButtonActionPerformed
        
        String[] Titles = {"Product","Classes","Price","Place"};
        String[][] all = new String[UserData.currentUser.AllTheAbove.size()][4];
        all =  UserData.currentUser.AllTheAbove.toArray(all);
                
        
        DefaultTableModel theModel = (DefaultTableModel) AllTheAboveTable.getModel();
   
        theModel.setDataVector(all, Titles);  
        
        System.out.println(UserData.currentUser.AllTheAbove.size());
        
    }//GEN-LAST:event_ShowButtonActionPerformed

    private void jBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBackButtonActionPerformed
        
        
        this.dispose();
        
        HomePage home = new HomePage();
        
        home.setVisible(true);
        
    }//GEN-LAST:event_jBackButtonActionPerformed

    private void RefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshButtonActionPerformed
        
        
        UserData.currentUser.AllTheAbove.clear();
        
        String[] Titles = {"Product","Classes","Price","Place"};
        String[][] all = new String[UserData.currentUser.AllTheAbove.size()][4];
        all =  UserData.currentUser.AllTheAbove.toArray(all);
               
        
        DefaultTableModel theModel = (DefaultTableModel) AllTheAboveTable.getModel();        
                
        theModel.setDataVector(all, Titles);  
        
        DataStorage.SaveData();   
    }//GEN-LAST:event_RefreshButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(AllOfTheAbove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllOfTheAbove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllOfTheAbove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllOfTheAbove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run()
            {
                new AllOfTheAbove().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AllLabel;
    private javax.swing.JPanel AllPanel;
    private javax.swing.JTable AllTheAboveTable;
    private javax.swing.JButton RefreshButton;
    private javax.swing.JButton ShowButton;
    private javax.swing.JButton jBackButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}