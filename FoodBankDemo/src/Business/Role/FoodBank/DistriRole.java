/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.FoodBank;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.FoodBankEnterprise;
import Business.Organization.Foodbank.DistributionOrganization;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.DistributionRole.DistriWorkAreaJPanel;

/**
 *
 * @author zhengfang
 */
public class DistriRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new DistriWorkAreaJPanel(userProcessContainer, account, (DistributionOrganization) organization, (FoodBankEnterprise) enterprise, business);
    }

}
