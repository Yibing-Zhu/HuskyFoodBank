package Business.Role.Shelter;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.ShelterEnteriprise;
import Business.Organization.Organization;
import Business.Organization.Shelter.ShelterAdminOrganization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.*;
import ui.ShelterAdminRole.ShelterAdminWorkAreaJPanel;

/**
 * @author Zheng Fang
 */

public class ShelterAdminRole extends Role {

    public ShelterAdminRole() {
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ShelterAdminWorkAreaJPanel(userProcessContainer, account, (ShelterAdminOrganization) organization,(ShelterEnteriprise)enterprise, business);
    }
}
