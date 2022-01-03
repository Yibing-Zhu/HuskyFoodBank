/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.CoordinatorRole;

import Business.Coordinator.Coordinator;
import Business.Coordinator.CoordinatorDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Enterprise.ShelterEnteriprise;
import Business.Menu.Item;
import Business.Menu.Menu;
import Business.Menu.MenuDirectory;
import Business.Organization.Shelter.RegistrationOrganization;
import Business.Profile.Profile;
import Business.Profile.ProfileDirectory;
import Business.Shelter.Shelter;
import Business.Shelter.ShelterDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.Order;
import Business.WorkQueue.OrderDirectory;
import com.db4o.collections.ActivatableArrayList;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yibin
 */
public class CoordinatorAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount account;
    private RegistrationOrganization organization;
    private ShelterEnteriprise enterprise;
    private CoordinatorDirectory coordinatorDirectory;
    private ShelterDirectory shelterDirectory;
    private DeliveryManDirectory deliveryManDirectory;
    private ProfileDirectory profileDirectory;
    private OrderDirectory orderDirectory;
    private static int count = 1;
    private MenuDirectory menuDirectory;

    ArrayList<Item> itemList = new ActivatableArrayList<>();

    public CoordinatorAreaJPanel(JPanel userProcessContainer, UserAccount account, RegistrationOrganization organization, ShelterEnteriprise enterprise, EcoSystem business) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.business = business;
        this.organization = organization;
        this.enterprise = enterprise;
        this.coordinatorDirectory = enterprise.getCoordinatorDirectory();
        this.shelterDirectory = enterprise.getShelterDirectory();
        this.profileDirectory = enterprise.getProfileDirectory();
        this.deliveryManDirectory = enterprise.getDeliveryManDirectory();
        this.orderDirectory = enterprise.getOrderDirectory();
        this.menuDirectory = enterprise.getMenuDirectory();

        valueLabel.setText(account.getEmployee().getName());
        populateApplicationTable();
        populateShelterCombo();

    }

    public void populatePersonTable() {

        DefaultTableModel dtm = (DefaultTableModel) tblPerson.getModel();
        dtm.setRowCount(0);
        String shelterName = dropboxShelter.getSelectedItem().toString();
        Shelter shelter = shelterDirectory.getShelter(shelterName);
        for (Profile profile : profileDirectory.getProfileDirectory()) {
            if (shelter.getShelterName().equals(profile.getShelterName())) {
                Object[] row = new Object[9];
                row[0] = profile;
                row[1] = profile.getId();
                row[2] = profile.getFirstname();
                row[3] = profile.getLastname();
                row[4] = profile.getGender();
                row[5] = profile.getBirth();
                row[6] = profile.getPhone();
                row[7] = profile.getAddress();
                row[8] = profile.getEmail();
                dtm.addRow(row);
            }
        }
    }

    public void populateItemTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblItem.getModel();
        dtm.setRowCount(0);
        String shelterName = dropboxShelter.getSelectedItem().toString();
        Shelter shelter;
        shelter = shelterDirectory.getShelter(shelterName);
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

    public void populateShelterCombo() {
        dropboxShelter.removeAllItems();
        dropboxShelter.addItem("  ");
        for (Shelter res : shelterDirectory.getShelterDirectory()) {
            dropboxShelter.addItem(res.getShelterName());
        }
    }

    void populateApplicationTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblApplication.getModel();
        dtm.setRowCount(0);
        for (Item item : itemList) {
            Object[] row = new Object[5];
            row[0] = item;
            row[1] = item.getId();
            row[2] = item.getItemname();
            row[3] = item.getUnit();
            row[4] = item.getQty();

            dtm.addRow(row);
        }
    }

    private void calTotalPrice() {
        int total = 0;
        for (Item item : itemList) {
            total = item.getQty() + total;
            txtTotal.setText(String.valueOf(total));
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

        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPerson = new javax.swing.JTable();
        dropboxShelter = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();
        btnMenuShow = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblApplication = new javax.swing.JTable();
        btnSelect = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        orderHistoryJButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblItem = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lblPerson = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(233, 230, 225));
        setForeground(new java.awt.Color(43, 71, 92));

        enterpriseLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(43, 71, 92));
        enterpriseLabel.setText("Coordinator:");

        valueLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(43, 71, 92));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tblPerson.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tblPerson.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "ID", "First Name", "Last Name", "Gender", "Birth Day", "Phone", "Address", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblPerson);
        if (tblPerson.getColumnModel().getColumnCount() > 0) {
            tblPerson.getColumnModel().getColumn(0).setMinWidth(0);
            tblPerson.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblPerson.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        dropboxShelter.setBackground(new java.awt.Color(94, 138, 117));
        dropboxShelter.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        dropboxShelter.setForeground(new java.awt.Color(43, 71, 92));
        dropboxShelter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        dropboxShelter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropboxShelterActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(94, 138, 117));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(43, 71, 92));
        jLabel1.setText("Quantity");

        btnSend.setBackground(new java.awt.Color(94, 138, 117));
        btnSend.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnSend.setForeground(new java.awt.Color(43, 71, 92));
        btnSend.setText("Send Application");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        btnMenuShow.setBackground(new java.awt.Color(94, 138, 117));
        btnMenuShow.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnMenuShow.setForeground(new java.awt.Color(43, 71, 92));
        btnMenuShow.setText("Show Person List & Item List");
        btnMenuShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuShowActionPerformed(evt);
            }
        });

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tblApplication.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tblApplication.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null}
            },
            new String [] {
                "", "Item ID", "Item Name", "Unit", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblApplication);
        if (tblApplication.getColumnModel().getColumnCount() > 0) {
            tblApplication.getColumnModel().getColumn(0).setMinWidth(0);
            tblApplication.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblApplication.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        btnSelect.setBackground(new java.awt.Color(94, 138, 117));
        btnSelect.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnSelect.setForeground(new java.awt.Color(43, 71, 92));
        btnSelect.setText("Select");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(94, 138, 117));
        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(43, 71, 92));
        jLabel3.setText("Total");

        txtTotal.setEditable(false);

        jLabel4.setBackground(new java.awt.Color(94, 138, 117));
        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(43, 71, 92));
        jLabel4.setText("Application List For:");

        orderHistoryJButton.setBackground(new java.awt.Color(94, 138, 117));
        orderHistoryJButton.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        orderHistoryJButton.setForeground(new java.awt.Color(43, 71, 92));
        orderHistoryJButton.setText("View Application History");
        orderHistoryJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderHistoryJButtonActionPerformed(evt);
            }
        });

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tblItem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tblItem.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null}
            },
            new String [] {
                "", "ID", "Item Name", "Unit", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblItem);
        if (tblItem.getColumnModel().getColumnCount() > 0) {
            tblItem.getColumnModel().getColumn(0).setMinWidth(0);
            tblItem.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblItem.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jLabel2.setBackground(new java.awt.Color(94, 138, 117));
        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(43, 71, 92));
        jLabel2.setText("Person List");

        jLabel5.setBackground(new java.awt.Color(94, 138, 117));
        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(43, 71, 92));
        jLabel5.setText("Item List");

        btnAdd.setBackground(new java.awt.Color(94, 138, 117));
        btnAdd.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(43, 71, 92));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        lblPerson.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lblPerson.setForeground(new java.awt.Color(43, 71, 92));

        jLabel6.setBackground(new java.awt.Color(94, 138, 117));
        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(43, 71, 92));
        jLabel6.setText("items");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(enterpriseLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dropboxShelter, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMenuShow))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnSelect)
                                .addGap(29, 29, 29)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(btnSend))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addComponent(orderHistoryJButton)))
                .addContainerGap(46, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valueLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dropboxShelter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenuShow))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSelect)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAdd)
                        .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderHistoryJButton))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSend)
                    .addComponent(jLabel3)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAdd, btnMenuShow, btnSelect, btnSend, dropboxShelter, jLabel1, jLabel3, orderHistoryJButton, txtQuantity, txtTotal});

    }// </editor-fold>//GEN-END:initComponents

    private void dropboxShelterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropboxShelterActionPerformed

    }//GEN-LAST:event_dropboxShelterActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        int reply = JOptionPane.showConfirmDialog(null, "Are You Sure To Send Application? Application Sent Cannot Be Canceled.", "Warning", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            Random random = new Random();
            int randNumber = random.nextInt(200000 - 100000 + 1) + 100000;
            int rowcount = tblApplication.getRowCount();
            if (rowcount > 0) {
                String shelterName = dropboxShelter.getSelectedItem().toString();
                Shelter shelter = shelterDirectory.getShelter(shelterName);
                Coordinator coordinator = coordinatorDirectory.getCoordinator(account.getEmployee().getName());
                String status = "Sent";

                int selectedRow = tblPerson.getSelectedRow();
                if (selectedRow < 0) {
                    JOptionPane.showMessageDialog(null, "Please Select a row from Person table first", "warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                Profile profile = (Profile) tblPerson.getValueAt(selectedRow, 0);
                Order order = orderDirectory.newOrder();

                order.setCoordinator(coordinator);
                order.setProfile(profile);
                order.setOrderId(String.valueOf(randNumber));
                order.setShelter(shelter);
                order.setOrderStatus(status);
                order.setAssign(false);

                int totalQty = 0;

                StringBuilder applicationItems = new StringBuilder();
                for (Item item : itemList) {
                    totalQty = item.getQty() + totalQty;
                    applicationItems.append(" " + item.getItemname() + " : " + item.getQty() + " " + item.getUnit() + ";");
                }
                order.setTotalQty(totalQty);
                order.setApplicationItems(applicationItems.toString());

                JOptionPane.showMessageDialog(null, "Application Sent!");

                DefaultTableModel cartModel = (DefaultTableModel) tblApplication.getModel();
                cartModel.setRowCount(0);
                txtTotal.setText("");
                itemList = new ActivatableArrayList<>();

            } else {
                JOptionPane.showMessageDialog(null, "Your list is empty", "warning", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            return;
        }

    }//GEN-LAST:event_btnSendActionPerformed

    private void btnMenuShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuShowActionPerformed
        if (dropboxShelter.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Please select a shelter");
            return;
        }
        populatePersonTable();
        populateItemTable();
    }//GEN-LAST:event_btnMenuShowActionPerformed

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        int selectedRow = tblPerson.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a row from Person table first", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Profile profile = (Profile) tblPerson.getValueAt(selectedRow, 0);
        String selectedPerson = profile.getId() + " " + profile.getFirstname() + " " + profile.getLastname() + " " + profile.getBirth();
        lblPerson.setText(selectedPerson);

    }//GEN-LAST:event_btnSelectActionPerformed

    private void orderHistoryJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderHistoryJButtonActionPerformed

        CoordinatorApplicationListJPanel ccjp = new CoordinatorApplicationListJPanel(userProcessContainer, account,
                enterprise, business);

        JFrame window = new JFrame("CoordinatorApplicationDetailFrame");

        //new panel
        window.add(ccjp);
        window.setResizable(true);
        window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        window.pack();
        window.setVisible(true);

    }//GEN-LAST:event_orderHistoryJButtonActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        int selectedRowPerson = tblPerson.getSelectedRow();
        if (selectedRowPerson < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a row from Person table first", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int selectedRow = tblItem.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a row from Item table first", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (txtQuantity.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter quantity");
            return;
        }

        if (!txtQuantity.getText().matches("^[0-9]+$")) {
            JOptionPane.showMessageDialog(null, "Please enter digits only");
            return;
        }

        int quantity = Integer.parseInt(txtQuantity.getText());

        if (quantity > 0) {
            Menu menu = (Menu) tblItem.getValueAt(selectedRow, 0);
            int qty = Integer.parseInt(txtQuantity.getText());
            Item item = new Item(menu.getItemName(), qty, menu.getUnit(), menu.getId());
            itemList.add(item);
            menu.setQty(menu.getQty() - qty);
            populateItemTable();
            populateApplicationTable();
            calTotalPrice();
        }
        txtQuantity.setText("");
    }//GEN-LAST:event_btnAddActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnMenuShow;
    private javax.swing.JButton btnSelect;
    private javax.swing.JButton btnSend;
    private javax.swing.JComboBox<String> dropboxShelter;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblPerson;
    private javax.swing.JButton orderHistoryJButton;
    private javax.swing.JTable tblApplication;
    private javax.swing.JTable tblItem;
    private javax.swing.JTable tblPerson;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables

}
