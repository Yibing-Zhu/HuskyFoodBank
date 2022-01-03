/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.ShelterArrangerRole;

import Business.EcoSystem;
import Business.Enterprise.ShelterEnteriprise;
import Business.Menu.Menu;
import Business.Menu.MenuDirectory;
import Business.Network.Network;
import Business.Organization.Foodbank.CommunicationOrganization;
import Business.Organization.Organization;
import Business.Organization.Shelter.ArrangementOrganization;
import Business.Shelter.Shelter;
import Business.Shelter.ShelterDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ShelterToFoodbankWorkRequest;
import Business.WorkQueue.ShelterToVolunteerWorkRequest;
import Business.WorkQueue.WorkQueue;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author yibin
 */
public class ManageResourceJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private EcoSystem ecosystem;
    private ShelterEnteriprise enterprise;
    private ShelterDirectory shelterDirectory;
    private MenuDirectory menuDirectory;
    private Shelter shelter;
    private ArrangementOrganization arrangeorganization;
    private CommunicationOrganization commuorganization;
    private Network network;
    private Organization organization;
    private WorkQueue workqueue;

    public ManageResourceJPanel(JPanel userProcessContainer, UserAccount account, ShelterEnteriprise enterprise, EcoSystem ecosystem) {

        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.enterprise = enterprise;
        this.shelterDirectory = enterprise.getShelterDirectory();
        this.menuDirectory = enterprise.getMenuDirectory();
        this.ecosystem = ecosystem;

        try {
            populateItemApplicationTable();
            populateResourceTable();
            populateVolunteerApplicationTable();

        } catch (Exception e) {
        }
    }

    public void populateItemApplicationTable() {
        DefaultTableModel model = (DefaultTableModel) tblItemApplication.getModel();
        model.setRowCount(0);
        tblItemApplication.setDefaultRenderer(Object.class, new TableCellRenderer() {
            private DefaultTableCellRenderer DEFAULT_RENDERER = new DefaultTableCellRenderer();
            public final Color LIGHT_RED = new Color(255, 204, 204);
            public final Color LIGHT_BLUE = new Color(135, 206, 250);
            public final Color LIGHT_GREEN = new Color(204, 255, 204);

            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = DEFAULT_RENDERER.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (isSelected) {
                    c.setBackground(LIGHT_BLUE);
                } else {
                    if (row % 2 == 0) {
                        c.setBackground(Color.WHITE);

                    } else {
                        c.setBackground(Color.LIGHT_GRAY);
                    }
                }
                //Add below code here
                if (table.getColumnModel().getColumn(column).getIdentifier().equals("Application Status")) {//Here `Status` is column name
                    if (value.toString().equals("Rejected")) {//Here `OK` is the value of row
                        c.setBackground(LIGHT_RED);
                    } else if (value.toString().equals("Approved") || value.toString().equals("Distributing")) {
                        c.setBackground(LIGHT_GREEN);
                    }
                }
                return c;
            }

        });
        for (Organization org : ecosystem.getfirstFoodBankEnterprise().getOrganizationDirectory().getOrganizationList()) {
            if (org instanceof CommunicationOrganization) {
                for (ShelterToFoodbankWorkRequest request : org.getWorkQueue().getSheltertofoodbanklist()) {
                    Object[] row = new Object[7];
                    row[0] = request;
                    row[1] = request.getItemName();
                    row[2] = request.getQty();
                    row[3] = request.getUnit();
                    row[4] = request.getStatus();
                    row[5] = request.getRequestDate();
                    row[6] = request.getResolveDate();

                    model.addRow(row);
                }
            }
        }

    }

    public void populateVolunteerApplicationTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblVolunteerApplication.getModel();
        dtm.setRowCount(0);

        for (ShelterToVolunteerWorkRequest request : ecosystem.getfirstVolunteerEnterprise().getWorkQueue().getSheltertovolunteerlist()) {
            Object[] row = new Object[6];
            row[0] = request;
            row[1] = request.getHeadcount();
            row[2] = request.getReceiver();
            row[3] = request.getStatus();
            row[4] = request.getRequestDate();
            row[5] = request.getResolveDate();

            dtm.addRow(row);
        }
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
        tblItemApplication = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtItemName = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        btnApplyFoodbank = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtUnit = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblStock = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtHeadcount = new javax.swing.JTextField();
        btnApplyVolunteer = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblVolunteerApplication = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(233, 230, 225));

        tblItemApplication.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        tblItemApplication.setForeground(new java.awt.Color(43, 71, 92));
        tblItemApplication.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "", "Item Name", "Qty", "Unit", "Application Status", "Request Date", "Resolved Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblItemApplication);
        if (tblItemApplication.getColumnModel().getColumnCount() > 0) {
            tblItemApplication.getColumnModel().getColumn(0).setMinWidth(0);
            tblItemApplication.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblItemApplication.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(43, 71, 92));
        jLabel1.setText("Apply Resource");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(43, 71, 92));
        jLabel3.setText("Item Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(43, 71, 92));
        jLabel4.setText("Quantity:");

        txtItemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemNameActionPerformed(evt);
            }
        });

        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });

        btnApplyFoodbank.setBackground(new java.awt.Color(94, 138, 117));
        btnApplyFoodbank.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnApplyFoodbank.setForeground(new java.awt.Color(43, 71, 92));
        btnApplyFoodbank.setText("Apply From Foodbank");
        btnApplyFoodbank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplyFoodbankActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(94, 138, 117));
        btnBack.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(43, 71, 92));
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(43, 71, 92));
        jLabel5.setText("Unit:");

        txtUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnitActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(43, 71, 92));
        jLabel6.setText("Item Application List");

        tblStock.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        tblStock.setForeground(new java.awt.Color(43, 71, 92));
        tblStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "", "ID", "Item Name", "Unit", "Stock/Availability"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblStock);
        if (tblStock.getColumnModel().getColumnCount() > 0) {
            tblStock.getColumnModel().getColumn(0).setMinWidth(0);
            tblStock.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblStock.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(43, 71, 92));
        jLabel7.setText("Number of Volunteers:");

        btnApplyVolunteer.setBackground(new java.awt.Color(94, 138, 117));
        btnApplyVolunteer.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnApplyVolunteer.setForeground(new java.awt.Color(43, 71, 92));
        btnApplyVolunteer.setText("Apply From Volunteer");
        btnApplyVolunteer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplyVolunteerActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(43, 71, 92));
        jLabel8.setText("Volunteer Application List");

        tblVolunteerApplication.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        tblVolunteerApplication.setForeground(new java.awt.Color(43, 71, 92));
        tblVolunteerApplication.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "", "Application Status", "ID", "Item Name", "Unit", "Stock/Availability"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblVolunteerApplication);
        if (tblVolunteerApplication.getColumnModel().getColumnCount() > 0) {
            tblVolunteerApplication.getColumnModel().getColumn(0).setMinWidth(0);
            tblVolunteerApplication.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblVolunteerApplication.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(43, 71, 92));
        jLabel9.setText("Item Stock List");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(30, 30, 30)
                                    .addComponent(txtUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3))
                                    .addGap(30, 30, 30)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtQuantity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtHeadcount))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(btnApplyFoodbank))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(btnApplyVolunteer))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(313, 313, 313)
                                .addComponent(jLabel8)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(375, 375, 375)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(387, 387, 387)
                                .addComponent(jLabel9)))
                        .addContainerGap(346, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(10, 10, 10)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(btnApplyFoodbank)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtHeadcount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnApplyVolunteer)
                        .addGap(78, 78, 78)
                        .addComponent(btnBack))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(137, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtItemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItemNameActionPerformed

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityActionPerformed

    private void btnApplyFoodbankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplyFoodbankActionPerformed
        if (txtItemName.getText().isEmpty() || txtQuantity.getText().isEmpty() || txtUnit.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fields cannot be empty", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Date requestDate = new Date();

        String itemName = txtItemName.getText();
        int quantity;
        try {
            quantity = Integer.parseInt(txtQuantity.getText());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Quantity must be integer value", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String shelter = account.getEmployee().getName();
        String unit = txtUnit.getText();
        Random random = new Random();
        int randNumber = random.nextInt(200000 - 100000 + 1) + 100000;
        String id = String.valueOf(randNumber);

        ShelterToFoodbankWorkRequest request = new ShelterToFoodbankWorkRequest();
        request.setItemName(itemName);
        request.setQty(quantity);
        request.setUnit(unit);
        request.setStatus("Application Sent");
        request.setRequestDate(requestDate);
        request.setSender(account);

        for (Organization org : ecosystem.getfirstFoodBankEnterprise().getOrganizationDirectory().getOrganizationList()) {
            if (org instanceof CommunicationOrganization) {
                org.getWorkQueue().getSheltertofoodbanklist().add(request);
                account.getWorkQueue().getSheltertofoodbanklist().add(request);
                break;
            }

            break;
        }
        JOptionPane.showMessageDialog(null, "Application Sent!", "Warning", JOptionPane.WARNING_MESSAGE);

        populateItemApplicationTable();

        txtItemName.setText("");
        txtUnit.setText("");
        txtQuantity.setText("");
    }//GEN-LAST:event_btnApplyFoodbankActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnitActionPerformed

    private void btnApplyVolunteerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplyVolunteerActionPerformed
        if (txtHeadcount.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fields cannot be empty", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Date requestDate = new Date();

        int headcount;
        try {
            headcount = Integer.parseInt(txtHeadcount.getText());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Headcount must be integer value", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String shelter = account.getEmployee().getName();

        ShelterToVolunteerWorkRequest request = new ShelterToVolunteerWorkRequest();
        request.setHeadcount(headcount);
        request.setStatus("Application Sent");
        request.setRequestDate(requestDate);
        request.setSender(account);

        ecosystem.getfirstVolunteerEnterprise().getWorkQueue().getSheltertovolunteerlist().add(request);
        account.getWorkQueue().getSheltertovolunteerlist().add(request);

        JOptionPane.showMessageDialog(null, "Application Sent!", "Warning", JOptionPane.WARNING_MESSAGE);

        populateVolunteerApplicationTable();

        txtHeadcount.setText("");

    }//GEN-LAST:event_btnApplyVolunteerActionPerformed

    public void populateResourceTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblStock.getModel();
        dtm.setRowCount(0);
        for (Menu menu : menuDirectory.getMenuDirectory()) {

            Object[] row = new Object[5];
            row[0] = menu;
            row[1] = menu.getId();
            row[2] = menu.getItemName();
            row[3] = menu.getUnit();
            row[4] = menu.getQty();
            dtm.addRow(row);

        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApplyFoodbank;
    private javax.swing.JButton btnApplyVolunteer;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblItemApplication;
    private javax.swing.JTable tblStock;
    private javax.swing.JTable tblVolunteerApplication;
    private javax.swing.JTextField txtHeadcount;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtUnit;
    // End of variables declaration//GEN-END:variables
}
