/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.FoodBank;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.FoodBankEnterprise;
import Business.Organization.Foodbank.AnalysisOrganization;
import Business.Organization.Foodbank.Data;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.AnalysisRole.AnalyWorkAreaJPanel;

/**
 *
 * @author zhengfang
 */
public class AnalyRole extends Role{

    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new AnalyWorkAreaJPanel(userProcessContainer, account, (AnalysisOrganization)organization, (FoodBankEnterprise)enterprise, business);
    }
    
    
}
