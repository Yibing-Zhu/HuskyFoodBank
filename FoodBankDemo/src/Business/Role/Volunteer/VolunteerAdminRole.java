/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.Volunteer;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.VolunteerEnterprise;
import Business.Organization.Organization;
import Business.Organization.Volunteer.VolunteerAdminOrganization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.VolunteerRole.VolunteerAdminWorkAreaJPanel;

/**
 *
 * @author zhengfang
 */
public class VolunteerAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new VolunteerAdminWorkAreaJPanel(userProcessContainer, account, (VolunteerAdminOrganization)organization, (VolunteerEnterprise) enterprise, business);
    }
    
    
}
