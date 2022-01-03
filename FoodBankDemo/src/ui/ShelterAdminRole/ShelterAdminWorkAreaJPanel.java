/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.ShelterAdminRole;

import Business.Coordinator.Coordinator;
import Business.Coordinator.CoordinatorDirectory;
import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Enterprise.ShelterEnteriprise;
import Business.Organization.Shelter.ShelterAdminOrganization;
import Business.Shelter.Shelter;
import Business.Shelter.ShelterDirectory;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author yibin
 */
public class ShelterAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ShelterAdminWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private ShelterEnteriprise enterprise;
    private CoordinatorDirectory coordinatorDirectory;
    private ShelterDirectory shelterDirectory;
    private DeliveryManDirectory deliveryManDirectory;
    private UserAccountDirectory userAccountDirectory;

    public ShelterAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, ShelterAdminOrganization organization, ShelterEnteriprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.enterprise = enterprise;
        this.coordinatorDirectory = enterprise.getCoordinatorDirectory();
        this.deliveryManDirectory = enterprise.getDeliveryManDirectory();
        this.shelterDirectory = enterprise.getShelterDirectory();
        this.userAccountDirectory = enterprise.getUserAccountDirectory();
        populateTree();
        System.out.println(enterprise.getUserAccountDirectory().getUserAccountList());

    }

    public void populateTree() {
        DefaultTreeModel model = (DefaultTreeModel) jTree.getModel();

        // Add the code for draw your system structure shown by JTree
        DefaultMutableTreeNode networks = new DefaultMutableTreeNode("ShelterAdmin");
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
        root.removeAllChildren();
        root.insert(networks, 0);

        ArrayList<Coordinator> coordinatorList = coordinatorDirectory.getCoordinatorDirectory();
        ArrayList<DeliveryMan> deliveryList = deliveryManDirectory.getDeliveryManDirectory();
        ArrayList<Shelter> shelterList = shelterDirectory.getShelterDirectory();

        Coordinator coordinator;
        DeliveryMan deliveryMan;
        Shelter shelter;

        DefaultMutableTreeNode coordinatorListNode = new DefaultMutableTreeNode("Coordinator");
//        DefaultMutableTreeNode deliveryManListNode = new DefaultMutableTreeNode("Delivery");
        DefaultMutableTreeNode shelterListNode = new DefaultMutableTreeNode("Arranger");
        networks.insert(shelterListNode, 0);
        networks.insert(coordinatorListNode, 1);
//        networks.insert(deliveryManListNode, 1);

        DefaultMutableTreeNode networkNode;
        DefaultMutableTreeNode enterpriseNode;
        DefaultMutableTreeNode organizationNode;

        for (int i = 0; i < coordinatorList.size(); i++) {
            coordinator = coordinatorList.get(i);
            networkNode = new DefaultMutableTreeNode(coordinator.getName());
            coordinatorListNode.insert(networkNode, i);

        }
//        for (int j = 0; j < deliveryList.size(); j++) {
//            deliveryMan = deliveryList.get(j);
//            enterpriseNode = new DefaultMutableTreeNode(deliveryMan.getName());
//            deliveryManListNode.insert(enterpriseNode, j);
//        }

        for (int k = 0; k < shelterList.size(); k++) {
            shelter = shelterList.get(k);
            organizationNode = new DefaultMutableTreeNode(shelter.getShelterName());
            shelterListNode.insert(organizationNode, k);
        }

        model.reload();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree = new javax.swing.JTree();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblSelectedNode = new javax.swing.JLabel();
        btnCoordinator = new javax.swing.JButton();
        btnShelter = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jSplitPane.setDividerLocation(200);
        jSplitPane.setDividerSize(1);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jTree.setBackground(new java.awt.Color(233, 230, 225));
        jTree.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTree.setForeground(new java.awt.Color(255, 255, 255));
        jTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTree);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
        );

        jSplitPane.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(233, 230, 225));

        jLabel1.setBackground(new java.awt.Color(94, 138, 117));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(43, 71, 92));
        jLabel1.setText("Selected Node:");

        lblSelectedNode.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSelectedNode.setForeground(new java.awt.Color(43, 71, 92));

        btnCoordinator.setBackground(new java.awt.Color(94, 138, 117));
        btnCoordinator.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnCoordinator.setForeground(new java.awt.Color(43, 71, 92));
        btnCoordinator.setText("Manage Coordinators");
        btnCoordinator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCoordinatorActionPerformed(evt);
            }
        });

        btnShelter.setBackground(new java.awt.Color(94, 138, 117));
        btnShelter.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnShelter.setForeground(new java.awt.Color(43, 71, 92));
        btnShelter.setText("Manage Shelter");
        btnShelter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShelterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSelectedNode, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnShelter, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCoordinator))))
                .addContainerGap(302, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCoordinator, btnShelter});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSelectedNode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnShelter)
                .addGap(30, 30, 30)
                .addComponent(btnCoordinator)
                .addContainerGap(247, Short.MAX_VALUE))
        );

        jSplitPane.setRightComponent(jPanel2);

        add(jSplitPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCoordinatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCoordinatorActionPerformed

        ManageCoordinatorJPanel mcjp = new ManageCoordinatorJPanel(userProcessContainer, enterprise, coordinatorDirectory, userAccountDirectory);
        userProcessContainer.add(mcjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCoordinatorActionPerformed

    private void btnShelterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShelterActionPerformed
        ManageShelterJPanel mrjp = new ManageShelterJPanel(userProcessContainer, enterprise, shelterDirectory, userAccountDirectory);
        userProcessContainer.add(mrjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnShelterActionPerformed

    private void jTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTreeValueChanged

        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jTree.getLastSelectedPathComponent();
        if (selectedNode != null) {
            lblSelectedNode.setText(selectedNode.toString());
        }
    }//GEN-LAST:event_jTreeValueChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCoordinator;
    private javax.swing.JButton btnShelter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JTree jTree;
    private javax.swing.JLabel lblSelectedNode;
    // End of variables declaration//GEN-END:variables
}
