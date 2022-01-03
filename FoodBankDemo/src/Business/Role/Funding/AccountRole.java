/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.Funding;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.FundingEnterprise;
import Business.Organization.Funding.AccountOrganization;
import Business.Organization.Organization;
import Business.Profile.DonatorDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.AccountRole.AccountWorkAreaJPanel;

/**
 *
 * @author zhengfang
 */
public class AccountRole extends Role{
    

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new AccountWorkAreaJPanel(userProcessContainer, account, (AccountOrganization)organization, (FundingEnterprise)enterprise);
    }
    
    
}
