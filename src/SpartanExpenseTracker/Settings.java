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
import javax.swing.JOptionPane;


/**
 *
 * @author royperlman
 */
public class Settings extends javax.swing.JFrame
{

    /**
     * Creates new form EatOut
     */
    public Settings()
    {
       initComponents();
        
       this.setLocationRelativeTo(null);
       
       Border SpartanEatsjLabel = BorderFactory.createMatteBorder(5,5,5,5, Color.black);
       EatPanel.setBorder(SpartanEatsjLabel);
       
       Border jBackButton = BorderFactory.createMatteBorder(5,5,5,5, Color.black);
       jPanel3.setBorder(jBackButton);
       
       Border ShowButton = BorderFactory.createMatteBorder(5,5,5,5, Color.black);
       jPanel4.setBorder(ShowButton);
       
       Border ChangeNameLabel = BorderFactory.createMatteBorder(3,3,3,3, Color.black);
       ChangeNamePanel.setBorder(ChangeNameLabel);
       
       Border FirstNameLabel = BorderFactory.createMatteBorder(1,1,1,1, Color.black);
       FirstNamePanel.setBorder(FirstNameLabel);
       
       Border MiddleNameLabel = BorderFactory.createMatteBorder(1,1,1,1, Color.black);
       MiddleNamePanel.setBorder(MiddleNameLabel);
       
       Border LastNameLabel = BorderFactory.createMatteBorder(1,1,1,1, Color.black);
       LastNamePanel.setBorder(LastNameLabel);
       
       Border ChangePasswordLabel = BorderFactory.createMatteBorder(3,3,3,3, Color.black);
       ChangePasswordPanel.setBorder(ChangePasswordLabel);
       
       Border oldPasswordLabel = BorderFactory.createMatteBorder(1,1,1,1, Color.black);
       CurrentPasswordPanel.setBorder(oldPasswordLabel);
       
       Border CreateNewPasswordLabel = BorderFactory.createMatteBorder(1,1,1,1, Color.black);
       CreateNewPasswordPanel.setBorder(CreateNewPasswordLabel);
       
       Border ConfirmNewPasswordLabel = BorderFactory.createMatteBorder(1,1,1,1, Color.black);
       ConfirmNewPasswordPanel.setBorder(ConfirmNewPasswordLabel);
       
       Border FirstNameTextFeild = BorderFactory.createMatteBorder(1,1,1,1, Color.black);
       jPanel12.setBorder(FirstNameTextFeild);
       
       Border MiddleNameTextFeild = BorderFactory.createMatteBorder(1,1,1,1, Color.black);
       jPanel13.setBorder(MiddleNameTextFeild);
       
       Border LastNameTextFeild = BorderFactory.createMatteBorder(1,1,1,1, Color.black);
       jPanel17.setBorder(LastNameTextFeild);
       
       Border OldPasswordField = BorderFactory.createMatteBorder(1,1,1,1, Color.black);
       jPanel14.setBorder(OldPasswordField);
       
       Border CreatePasswordField = BorderFactory.createMatteBorder(1,1,1,1, Color.black);
       jPanel15.setBorder(CreatePasswordField);
       
       Border ConfirmPasswordField = BorderFactory.createMatteBorder(1,1,1,1, Color.black);
       jPanel16.setBorder(ConfirmPasswordField);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        EatPanel = new javax.swing.JPanel();
        SpartanEatsjLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jBackButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        ChangeSettingsButton = new javax.swing.JButton();
        ChangeNamePanel = new javax.swing.JPanel();
        ChangeNameLabel = new javax.swing.JLabel();
        FirstNamePanel = new javax.swing.JPanel();
        FirstNameLabel = new javax.swing.JLabel();
        MiddleNamePanel = new javax.swing.JPanel();
        MiddleNameLabel = new javax.swing.JLabel();
        LastNamePanel = new javax.swing.JPanel();
        LastNameLabel = new javax.swing.JLabel();
        ChangePasswordPanel = new javax.swing.JPanel();
        ChangePasswordLabel = new javax.swing.JLabel();
        CurrentPasswordPanel = new javax.swing.JPanel();
        OldPasswordLabel = new javax.swing.JLabel();
        CreateNewPasswordPanel = new javax.swing.JPanel();
        CreateNewPasswordLabel = new javax.swing.JLabel();
        ConfirmNewPasswordPanel = new javax.swing.JPanel();
        ConfirmNewPasswordLabel = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        FirstNameTextField = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        MiddleNameTextField = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        OldPasswordField = new javax.swing.JPasswordField();
        jPanel15 = new javax.swing.JPanel();
        CreatePasswordField = new javax.swing.JPasswordField();
        jPanel16 = new javax.swing.JPanel();
        ConfirmPasswordField = new javax.swing.JPasswordField();
        jPanel17 = new javax.swing.JPanel();
        LastNameTextField = new javax.swing.JTextField();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        EatPanel.setBackground(new java.awt.Color(0, 102, 204));

        SpartanEatsjLabel.setFont(new java.awt.Font("Lucida Grande", 0, 49)); // NOI18N
        SpartanEatsjLabel.setForeground(new java.awt.Color(255, 204, 0));
        SpartanEatsjLabel.setText("Settings");

        javax.swing.GroupLayout EatPanelLayout = new javax.swing.GroupLayout(EatPanel);
        EatPanel.setLayout(EatPanelLayout);
        EatPanelLayout.setHorizontalGroup(
            EatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EatPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SpartanEatsjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(303, Short.MAX_VALUE))
        );
        EatPanelLayout.setVerticalGroup(
            EatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EatPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SpartanEatsjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        ChangeSettingsButton.setText("Change Settings");
        ChangeSettingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeSettingsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(ChangeSettingsButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(ChangeSettingsButton)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        ChangeNamePanel.setBackground(new java.awt.Color(255, 255, 0));
        ChangeNamePanel.setForeground(new java.awt.Color(255, 255, 0));

        ChangeNameLabel.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        ChangeNameLabel.setForeground(new java.awt.Color(255, 51, 0));
        ChangeNameLabel.setText("Change Student Name");

        javax.swing.GroupLayout ChangeNamePanelLayout = new javax.swing.GroupLayout(ChangeNamePanel);
        ChangeNamePanel.setLayout(ChangeNamePanelLayout);
        ChangeNamePanelLayout.setHorizontalGroup(
            ChangeNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChangeNamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ChangeNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ChangeNamePanelLayout.setVerticalGroup(
            ChangeNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChangeNamePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ChangeNameLabel)
                .addContainerGap())
        );

        FirstNameLabel.setText("First Name:");

        javax.swing.GroupLayout FirstNamePanelLayout = new javax.swing.GroupLayout(FirstNamePanel);
        FirstNamePanel.setLayout(FirstNamePanelLayout);
        FirstNamePanelLayout.setHorizontalGroup(
            FirstNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FirstNamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FirstNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        FirstNamePanelLayout.setVerticalGroup(
            FirstNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FirstNamePanelLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(FirstNameLabel)
                .addContainerGap())
        );

        MiddleNameLabel.setText("Middle Name:");

        javax.swing.GroupLayout MiddleNamePanelLayout = new javax.swing.GroupLayout(MiddleNamePanel);
        MiddleNamePanel.setLayout(MiddleNamePanelLayout);
        MiddleNamePanelLayout.setHorizontalGroup(
            MiddleNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MiddleNamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MiddleNameLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MiddleNamePanelLayout.setVerticalGroup(
            MiddleNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MiddleNamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MiddleNameLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LastNameLabel.setText("Last Name:");

        javax.swing.GroupLayout LastNamePanelLayout = new javax.swing.GroupLayout(LastNamePanel);
        LastNamePanel.setLayout(LastNamePanelLayout);
        LastNamePanelLayout.setHorizontalGroup(
            LastNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LastNamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LastNameLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LastNamePanelLayout.setVerticalGroup(
            LastNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LastNamePanelLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(LastNameLabel)
                .addContainerGap())
        );

        ChangePasswordPanel.setBackground(new java.awt.Color(255, 255, 0));

        ChangePasswordLabel.setBackground(new java.awt.Color(255, 51, 0));
        ChangePasswordLabel.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        ChangePasswordLabel.setForeground(new java.awt.Color(255, 0, 0));
        ChangePasswordLabel.setText("Change Password");

        javax.swing.GroupLayout ChangePasswordPanelLayout = new javax.swing.GroupLayout(ChangePasswordPanel);
        ChangePasswordPanel.setLayout(ChangePasswordPanelLayout);
        ChangePasswordPanelLayout.setHorizontalGroup(
            ChangePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChangePasswordPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ChangePasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ChangePasswordPanelLayout.setVerticalGroup(
            ChangePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChangePasswordPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ChangePasswordLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        OldPasswordLabel.setText("Current Password:");

        javax.swing.GroupLayout CurrentPasswordPanelLayout = new javax.swing.GroupLayout(CurrentPasswordPanel);
        CurrentPasswordPanel.setLayout(CurrentPasswordPanelLayout);
        CurrentPasswordPanelLayout.setHorizontalGroup(
            CurrentPasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CurrentPasswordPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OldPasswordLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CurrentPasswordPanelLayout.setVerticalGroup(
            CurrentPasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CurrentPasswordPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OldPasswordLabel)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        CreateNewPasswordLabel.setText("Create New Password:");

        javax.swing.GroupLayout CreateNewPasswordPanelLayout = new javax.swing.GroupLayout(CreateNewPasswordPanel);
        CreateNewPasswordPanel.setLayout(CreateNewPasswordPanelLayout);
        CreateNewPasswordPanelLayout.setHorizontalGroup(
            CreateNewPasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateNewPasswordPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CreateNewPasswordLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CreateNewPasswordPanelLayout.setVerticalGroup(
            CreateNewPasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateNewPasswordPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CreateNewPasswordLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ConfirmNewPasswordLabel.setText("Confirm New Passoword:");

        javax.swing.GroupLayout ConfirmNewPasswordPanelLayout = new javax.swing.GroupLayout(ConfirmNewPasswordPanel);
        ConfirmNewPasswordPanel.setLayout(ConfirmNewPasswordPanelLayout);
        ConfirmNewPasswordPanelLayout.setHorizontalGroup(
            ConfirmNewPasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConfirmNewPasswordPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ConfirmNewPasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ConfirmNewPasswordPanelLayout.setVerticalGroup(
            ConfirmNewPasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConfirmNewPasswordPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ConfirmNewPasswordLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(FirstNameTextField)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(FirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(MiddleNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(MiddleNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OldPasswordField)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(OldPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CreatePasswordField)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(CreatePasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(ConfirmPasswordField)
                .addGap(8, 8, 8))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(ConfirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(LastNameTextField)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(LastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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
                        .addComponent(EatPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ConfirmNewPasswordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(MiddleNamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ChangeNamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(FirstNamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(ChangePasswordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LastNamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CreateNewPasswordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CurrentPasswordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EatPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(ChangeNamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(FirstNamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MiddleNamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LastNamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(ChangePasswordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CurrentPasswordPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CreateNewPasswordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConfirmNewPasswordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ChangeSettingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeSettingsButtonActionPerformed
        
        //String EnterStudentId = JOptionPane.showInputDialog("Before make the Changes, please enter your current SJSU Student Id to confirm your changes.");

       // if(EnterStudentId)
       // {
            
            //UserData.currentUser.ID
        
            if(DataStorage.ChangeSettings(FirstNameTextField.getText(), MiddleNameTextField.getText(),LastNameTextField.getText(), 
             OldPasswordField.getText(), CreatePasswordField.getText(), ConfirmPasswordField.getText()))
            {
                DataStorage.SaveData();
          
                this.dispose();
            
                HomePage home = new HomePage();
            
                home.setVisible(true);    
            }
            else
            {
            
            }
       // }
       /* else
        {
            JOptionPane.showMessageDialog(null, "Invalid Student ID");
        }
       */
    }//GEN-LAST:event_ChangeSettingsButtonActionPerformed

    private void jBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBackButtonActionPerformed
        
        
        this.dispose();
        
        HomePage home = new HomePage();
        
        home.setVisible(true);
        
    }//GEN-LAST:event_jBackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run()
            {
                new Settings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ChangeNameLabel;
    private javax.swing.JPanel ChangeNamePanel;
    private javax.swing.JLabel ChangePasswordLabel;
    private javax.swing.JPanel ChangePasswordPanel;
    private javax.swing.JButton ChangeSettingsButton;
    private javax.swing.JLabel ConfirmNewPasswordLabel;
    private javax.swing.JPanel ConfirmNewPasswordPanel;
    private javax.swing.JPasswordField ConfirmPasswordField;
    private javax.swing.JLabel CreateNewPasswordLabel;
    private javax.swing.JPanel CreateNewPasswordPanel;
    private javax.swing.JPasswordField CreatePasswordField;
    private javax.swing.JPanel CurrentPasswordPanel;
    private javax.swing.JPanel EatPanel;
    private javax.swing.JLabel FirstNameLabel;
    private javax.swing.JPanel FirstNamePanel;
    private javax.swing.JTextField FirstNameTextField;
    private javax.swing.JLabel LastNameLabel;
    private javax.swing.JPanel LastNamePanel;
    private javax.swing.JTextField LastNameTextField;
    private javax.swing.JLabel MiddleNameLabel;
    private javax.swing.JPanel MiddleNamePanel;
    private javax.swing.JTextField MiddleNameTextField;
    private javax.swing.JPasswordField OldPasswordField;
    private javax.swing.JLabel OldPasswordLabel;
    private javax.swing.JLabel SpartanEatsjLabel;
    private javax.swing.JButton jBackButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
