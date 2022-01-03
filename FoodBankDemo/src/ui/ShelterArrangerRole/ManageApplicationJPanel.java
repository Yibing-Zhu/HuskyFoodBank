/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.ShelterArrangerRole;

import Business.Enterprise.ShelterEnteriprise;
import Business.Profile.ProfileDirectory;
import Business.Shelter.ShelterDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.Order;
import Business.WorkQueue.OrderDirectory;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
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
public class ManageApplicationJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
//    private EcoSystem ecosystem;
    private ShelterEnteriprise enterprise;
    private ShelterDirectory shelterDirectory;
    private ProfileDirectory profileDirectory;
    private OrderDirectory orderDirectory;

    /**
     * Creates new form ManageOrderJPanel
     */
    public ManageApplicationJPanel(JPanel userProcessContainer, UserAccount account, ShelterEnteriprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account = account;
        this.shelterDirectory = enterprise.getShelterDirectory();
        this.profileDirectory = enterprise.getProfileDirectory();
        this.orderDirectory = enterprise.getOrderDirectory();
        populateTable();

    }

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblOrder.getModel();
        dtm.setRowCount(0);
        tblOrder.setDefaultRenderer(Object.class, new TableCellRenderer() {
            private DefaultTableCellRenderer DEFAULT_RENDERER = new DefaultTableCellRenderer();
            public final Color VERY_LIGHT_RED = new Color(255, 204, 204);
            public final Color LIGHT_BLUE = new Color(135, 206, 250);
            public final Color VERY_LIGHT_GREEN = new Color(204, 255, 204);

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
                    if (value.toString().equals("Application Rejected")) {//Here `OK` is the value of row

                        c.setBackground(VERY_LIGHT_RED);
                    } else if (value.toString().equals("Application Approved")) {
                        c.setBackground(VERY_LIGHT_GREEN);
                    }
                }
                return c;
            }

        });

        for (Order order : enterprise.getOrderDirectory().getOrderDirectory()) {
            if (account.getEmployee().getName().equals(order.getShelter().getShelterName())) {
                Object[] row = new Object[14];
                row[0] = order;
                row[1] = order.getOrderStatus();
                row[2] = order.getApplicationItems();
                row[3] = order.getTotalQty();
                row[4] = order.getMessage();
                row[5] = order.getProfile().getId();
                row[6] = order.getProfile().getFirstname();
                row[7] = order.getProfile().getLastname();
                row[8] = order.getProfile().getGender();
                row[9] = order.getProfile().getAge();
                row[10] = order.getShelter().getShelterName();
                row[11] = order.getCoordinator().getName();
                row[12] = order.getCoordinator().getPhoneNumber();
                row[13] = order.getCoordinator().getEmail();

                dtm.addRow(row);
            }
        }
    }

    class ColumnColorRenderer extends DefaultTableCellRenderer {

        Color backgroundColor, foregroundColor;

        public ColumnColorRenderer(Color backgroundColor, Color foregroundColor) {
            super();
            this.backgroundColor = backgroundColor;
            this.foregroundColor = foregroundColor;
        }

        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            cell.setBackground(backgroundColor);
            cell.setForeground(foregroundColor);
            return cell;
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
        tblOrder = new javax.swing.JTable();
        btnCompleted = new javax.swing.JButton();
        btnProcess = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnRejct = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtComment = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(233, 230, 225));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tblOrder.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Application ID", "Application Status", "Application Items", "Application Item Qty", "Message", "Applicant ID", "Applicant First Name", "Applicant Last Name", "Applicant Gender", "Applicant Age", "Applicant Shelter Name", "Coordinator Name", "Coordinator Phone Number", "Coordinator Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrder);

        btnCompleted.setBackground(new java.awt.Color(94, 138, 117));
        btnCompleted.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnCompleted.setForeground(new java.awt.Color(43, 71, 92));
        btnCompleted.setText("Approved");
        btnCompleted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompletedActionPerformed(evt);
            }
        });

        btnProcess.setBackground(new java.awt.Color(94, 138, 117));
        btnProcess.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnProcess.setForeground(new java.awt.Color(43, 71, 92));
        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(94, 138, 117));
        btnBack.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(43, 71, 92));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnRejct.setBackground(new java.awt.Color(94, 138, 117));
        btnRejct.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnRejct.setForeground(new java.awt.Color(43, 71, 92));
        btnRejct.setText("Reject");
        btnRejct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejctActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(43, 71, 92));
        jLabel2.setText("Comment:");

        txtComment.setColumns(20);
        txtComment.setRows(5);
        jScrollPane3.setViewportView(txtComment);

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(43, 71, 92));
        jLabel1.setText("Manage Applications");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnProcess)
                        .addGap(18, 18, 18)
                        .addComponent(btnRejct, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCompleted)
                        .addGap(106, 106, 106)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(551, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(543, 543, 543)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnProcess)
                        .addComponent(btnRejct)
                        .addComponent(btnCompleted)))
                .addGap(24, 24, 24)
                .addComponent(btnBack)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCompletedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompletedActionPerformed
        int selectedRow = tblOrder.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a row from table first", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Order order = (Order) tblOrder.getValueAt(selectedRow, 0);
        if (order.getOrderStatus().equals("Under Review")) {
            order.setOrderStatus("Application Approved");
            order.setAssign(true);
        } else if (order.getOrderStatus().equals("Sent")) {
            JOptionPane.showMessageDialog(null, "Application Need To Be Reviewed First");
            return;
        } else if (order.getOrderStatus().equals("Rejected")) {
            JOptionPane.showMessageDialog(null, "Application Has Been Rejected");
            return;
        } else {
            JOptionPane.showMessageDialog(null, "Application Is Approved");
            return;
        }

        populateTable();
        txtComment.setText("");
    }//GEN-LAST:event_btnCompletedActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        int selectedRow = tblOrder.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a row from table first", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Order order = (Order) tblOrder.getValueAt(selectedRow, 0);
        if (order.getOrderStatus().equals("Sent")) {
            order.setOrderStatus("Under Review");
        } else if (order.getOrderStatus().equals("Rejected")) {
            JOptionPane.showMessageDialog(null, "Application Has Been Rejected.");
            return;
        } else {
            JOptionPane.showMessageDialog(null, "Application Status Not Processable.");
            return;
        }

        populateTable();
        txtComment.setText("");

    }//GEN-LAST:event_btnProcessActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRejctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejctActionPerformed
        String comment = txtComment.getText();
        if (comment.isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "Please Leave A Message Explaining Reasons Of Rejection.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int selectedRow = tblOrder.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            int reply = JOptionPane.showConfirmDialog(null, "Are You Sure To Reject? Application Cannot Be Restored After Reject.", "Warning", JOptionPane.YES_NO_OPTION);

            if (reply == JOptionPane.YES_OPTION) {

                Order order = (Order) tblOrder.getValueAt(selectedRow, 0);
                if (order.getOrderStatus().equals("Sent")) {
                    JOptionPane.showMessageDialog(null, "Application Need To Be Reviewed First");
                    return;
                } else if (order.getOrderStatus().equals("Rejected")) {
                    JOptionPane.showMessageDialog(null, "Application Has Been Rejected");
                    return;
                } else if (order.getOrderStatus().equals("Approved")) {
                    JOptionPane.showMessageDialog(null, "Application Has Been Approved");
                    return;
                } else if (order.getOrderStatus().equals("Under Review")) {
                    order.setOrderStatus("Application Rejected");
                    order.setMessage(comment);
                    order.setAssign(true);
                }

                JOptionPane.showMessageDialog(null, "Application Rejected");
                populateTable();
            } else {
                return;
            }

        }
        txtComment.setText("");

    }//GEN-LAST:event_btnRejctActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCompleted;
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnRejct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblOrder;
    private javax.swing.JTextArea txtComment;
    // End of variables declaration//GEN-END:variables

}
