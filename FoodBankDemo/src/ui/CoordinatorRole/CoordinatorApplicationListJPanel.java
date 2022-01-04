/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.CoordinatorRole;

import Business.Coordinator.CoordinatorDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Enterprise.ShelterEnteriprise;
import Business.Menu.Item;
import Business.Menu.MenuDirectory;
import Business.Profile.ProfileDirectory;
import Business.Shelter.ShelterDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.Order;
import Business.WorkQueue.OrderDirectory;
import com.db4o.collections.ActivatableArrayList;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author yibin
 */
public class CoordinatorApplicationListJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount account;
    private CoordinatorDirectory coordinatorDirectory;
    private ShelterDirectory shelterDirectory;
    private DeliveryManDirectory deliveryManDirectory;
    private ProfileDirectory profileDirectory;
    private OrderDirectory orderDirectory;
    private MenuDirectory menuDirectory;
    private static int count = 1;

    ArrayList<Item> arrayListItems = new ActivatableArrayList<>();

    public CoordinatorApplicationListJPanel(JPanel userProcessContainer, UserAccount account, ShelterEnteriprise enterprise, EcoSystem business) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.business = business;
        this.coordinatorDirectory = enterprise.getCoordinatorDirectory();
        this.shelterDirectory = enterprise.getShelterDirectory();
        this.profileDirectory = enterprise.getProfileDirectory();
        this.deliveryManDirectory = enterprise.getDeliveryManDirectory();
        this.orderDirectory = enterprise.getOrderDirectory();
        valueLabel.setText(account.getEmployee().getName());

        populateRequestTable();

    }

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) tblOrder.getModel();
        model.setRowCount(0);
        tblOrder.setDefaultRenderer(Object.class, new TableCellRenderer() {
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
                    if (value.toString().equals("Application Rejected")) {//Here `OK` is the value of row

                        c.setBackground(LIGHT_RED);
                    } else if (value.toString().equals("Application Approved")) {
                        c.setBackground(LIGHT_GREEN);
                    }
                }
                return c;
            }

        });

        for (Order order : orderDirectory.getOrderDirectory()) {
            if (account.getEmployee().getName().equals(order.getCoordinator().getName())) {
                Object[] row = new Object[10];
                row[0] = order;
                row[1] = order.getShelter().getShelterName();
                row[2] = order.getProfile().getId();
                row[3] = order.getProfile().getFirstname();
                row[4] = order.getProfile().getLastname();
                row[5] = order.getApplicationItems();
                row[6] = order.getOrderStatus();
                row[7] = order.getRequestDate();
                row[8] = order.getResolveDate();
                row[9] = order.getMessage();

                model.addRow(row);
            }
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
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(233, 230, 225));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tblOrder.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        tblOrder.setForeground(new java.awt.Color(43, 71, 92));
        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Application ID", "Shelter", "Applicant ID", "Applicant First Name", "Applicant Last Name", "Items", "Application Status", "Order Request Date", "Order Complete Date", "Comment"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrder);
        if (tblOrder.getColumnModel().getColumnCount() > 0) {
            tblOrder.getColumnModel().getColumn(5).setPreferredWidth(100);
        }

        enterpriseLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(43, 71, 92));
        enterpriseLabel.setText("Coordinator:");

        valueLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(43, 71, 92));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterpriseLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1404, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valueLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblOrder;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables

}