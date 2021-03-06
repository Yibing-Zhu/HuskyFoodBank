/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.CommunicationRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.FundingEnterprise;
import Business.Enterprise.ShelterEnteriprise;
import Business.Network.Network;
import Business.Organization.Foodbank.CommunicationOrganization;
import Business.Organization.Foodbank.DistributionOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FoodbankToFundingWorkRequest;
import Business.WorkQueue.OrderDirectory;
import Business.WorkQueue.ShelterToFoodbankWorkRequest;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zhengfang
 */
public class CommWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private CommunicationOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Network network;
    private OrderDirectory orderDirectory;
    private EcoSystem business;

    /**
     * Creates new form CommWorkAreaJPanel
     */
    public CommWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, CommunicationOrganization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        this.network = business.getNetworkList().get(0);
        valueLabel.setText(enterprise.getName());
        populatefundingTable();
        populateRequestTable();
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
        ShelterRequestJTable = new javax.swing.JTable();
        processshelterrequestJButton = new javax.swing.JButton();
        refreshTestJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnsubmitfundingrequest = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnRefreshfundingrequest = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtamount = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        AssigntoDistributionJButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        rejecthelterrequestJButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        reasonTxt = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(233, 230, 225));

        ShelterRequestJTable.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        ShelterRequestJTable.setForeground(new java.awt.Color(43, 71, 92));
        ShelterRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "", "Item Name", "Quantity", "Unit", "Sender", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ShelterRequestJTable);
        if (ShelterRequestJTable.getColumnModel().getColumnCount() > 0) {
            ShelterRequestJTable.getColumnModel().getColumn(0).setMinWidth(0);
            ShelterRequestJTable.getColumnModel().getColumn(0).setPreferredWidth(0);
        }

        processshelterrequestJButton.setBackground(new java.awt.Color(94, 138, 117));
        processshelterrequestJButton.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        processshelterrequestJButton.setForeground(new java.awt.Color(43, 71, 92));
        processshelterrequestJButton.setText("Process");
        processshelterrequestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processshelterrequestJButtonActionPerformed(evt);
            }
        });

        refreshTestJButton.setBackground(new java.awt.Color(94, 138, 117));
        refreshTestJButton.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        refreshTestJButton.setForeground(new java.awt.Color(43, 71, 92));
        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(43, 71, 92));
        enterpriseLabel.setText("EnterPrise :");

        valueLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(43, 71, 92));
        valueLabel.setText("<value>");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(43, 71, 92));
        jLabel2.setText("Amount: ");

        btnsubmitfundingrequest.setBackground(new java.awt.Color(94, 138, 117));
        btnsubmitfundingrequest.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnsubmitfundingrequest.setForeground(new java.awt.Color(43, 71, 92));
        btnsubmitfundingrequest.setText("Submit");
        btnsubmitfundingrequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitfundingrequestActionPerformed(evt);
            }
        });

        btnupdate.setBackground(new java.awt.Color(94, 138, 117));
        btnupdate.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(43, 71, 92));
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btndelete.setBackground(new java.awt.Color(94, 138, 117));
        btndelete.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btndelete.setForeground(new java.awt.Color(43, 71, 92));
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        workRequestJTable.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        workRequestJTable.setForeground(new java.awt.Color(43, 71, 92));
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "", "Amount", "Receiver", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setMinWidth(0);
            workRequestJTable.getColumnModel().getColumn(0).setPreferredWidth(0);
            workRequestJTable.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(43, 71, 92));
        jLabel3.setText("Funding Request");

        btnRefreshfundingrequest.setBackground(new java.awt.Color(94, 138, 117));
        btnRefreshfundingrequest.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnRefreshfundingrequest.setForeground(new java.awt.Color(43, 71, 92));
        btnRefreshfundingrequest.setText("Refresh");
        btnRefreshfundingrequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshfundingrequestActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(43, 71, 92));
        jLabel1.setText("Request Form");

        txtamount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtamountActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(43, 71, 92));
        jLabel4.setText("Shelter Request");

        AssigntoDistributionJButton.setBackground(new java.awt.Color(94, 138, 117));
        AssigntoDistributionJButton.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        AssigntoDistributionJButton.setForeground(new java.awt.Color(43, 71, 92));
        AssigntoDistributionJButton.setText("Distribute");
        AssigntoDistributionJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssigntoDistributionJButtonActionPerformed(evt);
            }
        });

        rejecthelterrequestJButton.setBackground(new java.awt.Color(94, 138, 117));
        rejecthelterrequestJButton.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        rejecthelterrequestJButton.setForeground(new java.awt.Color(43, 71, 92));
        rejecthelterrequestJButton.setText("Reject");
        rejecthelterrequestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejecthelterrequestJButtonActionPerformed(evt);
            }
        });

        reasonTxt.setColumns(20);
        reasonTxt.setRows(5);
        jScrollPane3.setViewportView(reasonTxt);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(64, 64, 64)
                                            .addComponent(btnRefreshfundingrequest))
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(62, 62, 62)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel4)
                                            .addGap(49, 49, 49)
                                            .addComponent(refreshTestJButton))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rejecthelterrequestJButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(152, 152, 152)
                                        .addComponent(processshelterrequestJButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(AssigntoDistributionJButton))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(116, 116, 116))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnsubmitfundingrequest)
                                .addGap(87, 87, 87)
                                .addComponent(btnupdate)
                                .addGap(68, 68, 68)
                                .addComponent(btndelete))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtamount, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(61, 137, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane1, jScrollPane2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(refreshTestJButton))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(btnRefreshfundingrequest))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(processshelterrequestJButton)
                    .addComponent(AssigntoDistributionJButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rejecthelterrequestJButton)
                        .addGap(91, 91, 91)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btndelete)
                            .addComponent(btnupdate)
                            .addComponent(btnsubmitfundingrequest)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane1, jScrollPane2});

    }// </editor-fold>//GEN-END:initComponents

    private void processshelterrequestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processshelterrequestJButtonActionPerformed

        int selectedRow = ShelterRequestJTable.getSelectedRow();
        ShelterToFoodbankWorkRequest request = (ShelterToFoodbankWorkRequest) ShelterRequestJTable.getValueAt(selectedRow, 0);
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (request.getStatus().equals("Processing")) {
            JOptionPane.showMessageDialog(null, "Request is already being processed", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (request.getStatus().equals("Distributed")) {
            JOptionPane.showMessageDialog(null, "Status Not Able To Be Changed To Proccessing", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (request.getStatus().equals("Rejected")) {
            JOptionPane.showMessageDialog(null, "Request Has Been Rejected", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int reply = JOptionPane.showConfirmDialog(null, "Are You Sure To Process? Cannot Be Revert.", "Warning", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {

            request.setReceiver(userAccount);
            request.setStatus("Processing");
            request.setResolveDate(new Date());

            txtamount.setText("");

            populateRequestTable();

            JOptionPane.showMessageDialog(this, "Proccessed", "Warning", JOptionPane.WARNING_MESSAGE);

        } else {
            return;
        }

    }//GEN-LAST:event_processshelterrequestJButtonActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateRequestTable();

    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void btnsubmitfundingrequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitfundingrequestActionPerformed
        // TODO add your handling code here:
        String amount = txtamount.getText();

        FoodbankToFundingWorkRequest request = new FoodbankToFundingWorkRequest();
        request.setAmount(Integer.parseInt(amount));
        request.setSender(userAccount);
        request.setStatus("Sent");
        request.setRequestDate(new Date());

        organization.getWorkQueue().getFoodbankToFundingworkrequestlist().add(request);
        userAccount.getWorkQueue().getFoodbankToFundingworkrequestlist().add(request);

        for (Enterprise i : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (i instanceof FundingEnterprise) {
                i.getWorkQueue().getFoodbankToFundingworkrequestlist().add(request);

                break;
            }
        }

        txtamount.setText("");

        populatefundingTable();
    }//GEN-LAST:event_btnsubmitfundingrequestActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        try {
            int selectedRow = workRequestJTable.getSelectedRow();
            if (selectedRow < 0) {
                JOptionPane.showMessageDialog(null, "Please Select a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            FoodbankToFundingWorkRequest d = (FoodbankToFundingWorkRequest) workRequestJTable.getValueAt(selectedRow, 0);

            d.setAmount(Integer.parseInt(txtamount.getText()));

            txtamount.setText("");

            populatefundingTable();
            JOptionPane.showMessageDialog(this, "Amount Updated!", "Warning", JOptionPane.WARNING_MESSAGE);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Please Enter Update Amount!", "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnRefreshfundingrequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshfundingrequestActionPerformed
        // TODO add your handling code here:

        populatefundingTable();
    }//GEN-LAST:event_btnRefreshfundingrequestActionPerformed

    private void txtamountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtamountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtamountActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        try {
            int selectedRow = workRequestJTable.getSelectedRow();
            if (selectedRow < 0) {
                JOptionPane.showMessageDialog(null, "Please Select a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            FoodbankToFundingWorkRequest d = (FoodbankToFundingWorkRequest) workRequestJTable.getValueAt(selectedRow, 0);

            organization.getWorkQueue().getFoodbankToFundingworkrequestlist().remove(d);
            userAccount.getWorkQueue().getFoodbankToFundingworkrequestlist().remove(d);

            populatefundingTable();
            JOptionPane.showMessageDialog(this, "Record Deleted!", "Warning", JOptionPane.WARNING_MESSAGE);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Please Select a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btndeleteActionPerformed

    private void AssigntoDistributionJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssigntoDistributionJButtonActionPerformed
        int selectedRow = ShelterRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        ShelterToFoodbankWorkRequest sf = (ShelterToFoodbankWorkRequest) ShelterRequestJTable.getValueAt(selectedRow, 0);

        sf.setStatus("Distributed");

        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof DistributionOrganization) {
                org = organization;
                break;
            }
        }
        if (org != null) {
            org.getWorkQueue().getSheltertofoodbanklist().add(sf);
            userAccount.getWorkQueue().getSheltertofoodbanklist().add(sf);
        }

        String itemName = sf.getItemName();
        int quantity = sf.getQty();
        String unit = sf.getUnit();
        Random random = new Random();
        int randNumber = random.nextInt(200000 - 100000 + 1) + 100000;
        String id = String.valueOf(randNumber);

        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (enterprise instanceof ShelterEnteriprise) {
                ((ShelterEnteriprise) enterprise).getMenuDirectory().newItem(itemName, quantity, unit, id, organization.getName());
            }
        }

        JOptionPane.showMessageDialog(this, "Request Approved and Being Distributing", "Warning", JOptionPane.WARNING_MESSAGE);
        populateRequestTable();
    }//GEN-LAST:event_AssigntoDistributionJButtonActionPerformed

    private void rejecthelterrequestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejecthelterrequestJButtonActionPerformed
        int selectedRow = ShelterRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (reasonTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Leave Reason for Rejection", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        ShelterToFoodbankWorkRequest sf = (ShelterToFoodbankWorkRequest) ShelterRequestJTable.getValueAt(selectedRow, 0);

        sf.setStatus("Rejected");

        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof DistributionOrganization) {
                org = organization;
                break;
            }
        }
        if (org != null) {
            org.getWorkQueue().getSheltertofoodbanklist().add(sf);
            userAccount.getWorkQueue().getSheltertofoodbanklist().add(sf);
        }
        populateRequestTable();
        JOptionPane.showMessageDialog(this, "Request Rejected", "Warning", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_rejecthelterrequestJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AssigntoDistributionJButton;
    private javax.swing.JTable ShelterRequestJTable;
    private javax.swing.JButton btnRefreshfundingrequest;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnsubmitfundingrequest;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton processshelterrequestJButton;
    private javax.swing.JTextArea reasonTxt;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JButton rejecthelterrequestJButton;
    private javax.swing.JTextField txtamount;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables

    private void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) ShelterRequestJTable.getModel();

        model.setRowCount(0);
        for (ShelterToFoodbankWorkRequest request : organization.getWorkQueue().getSheltertofoodbanklist()) {
            Object[] row = new Object[6];
            row[0] = request;
            row[1] = request.getItemName();
            row[2] = request.getQty();
            row[3] = request.getUnit();
            row[4] = request.getSender();
            row[5] = request.getStatus();

            model.addRow(row);
        }

    }

    private void populatefundingTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);
        for (FoodbankToFundingWorkRequest request : userAccount.getWorkQueue().getFoodbankToFundingworkrequestlist()) {
            Object[] row = new Object[5];
            row[0] = request;
            row[1] = request.getAmount();
            row[2] = "Fudning department";
            row[3] = request.getStatus();
            row[4] = request.getMessage();

            model.addRow(row);
        }
    }
}
