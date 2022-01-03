/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.FoodBank;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Foodbank.CommunicationOrganization;
import Business.Organization.Foodbank.CommunicationOrganization;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.CommunicationRole.CommWorkAreaJPanel;

/**
 *
 * @author zhengfang
 */
public class CommRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new CommWorkAreaJPanel(userProcessContainer, account, (CommunicationOrganization)organization, enterprise, business); 
    }
 
}
