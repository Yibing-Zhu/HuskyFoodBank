/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.AnalysisRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import java.awt.Color;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author zhengfang
 */
public class FoodBankAnalysisJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FoodBankAnalysisJPanel
     */
    public FoodBankAnalysisJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, EcoSystem business) {
        initComponents();
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        dataset.setValue(80,"Marks","Student1");
        dataset.setValue(55,"Marks","Student1");
        dataset.setValue(33,"Marks","Student1");
        dataset.setValue(22,"Marks","Student1");
        dataset.setValue(11,"Marks","Student1");
        dataset.setValue(55,"Marks","Student1");
        
        JFreeChart chart = ChartFactory.createBarChart("Student score", "Student name", "Marks", dataset, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot p=chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.black);
        
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Barchart = new javax.swing.JButton();

        Barchart.setText("Bar chart");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(660, Short.MAX_VALUE)
                .addComponent(Barchart)
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(593, Short.MAX_VALUE)
                .addComponent(Barchart)
                .addGap(84, 84, 84))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Barchart;
    // End of variables declaration//GEN-END:variables
}
