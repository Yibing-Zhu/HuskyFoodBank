/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role.Volunteer;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.VolunteerEnterprise;
import Business.Organization.Organization;
import Business.Organization.Volunteer.VolunteerOrganization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.VolunteerRole.VolunteerWorkAreaJPanel;

/**
 *
 * @author zhengfang
 */
public class Volunteer extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new VolunteerWorkAreaJPanel(userProcessContainer, account, (VolunteerOrganization)organization, (VolunteerEnterprise) enterprise, business);
    }
    
}
