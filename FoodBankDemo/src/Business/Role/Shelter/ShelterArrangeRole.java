package Business.Role.Shelter;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.ShelterEnteriprise;
import Business.Organization.Organization;
import Business.Organization.Shelter.ArrangementOrganization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import ui.ShelterArrangerRole.ArrangeWorkAreaJPanel;

import javax.swing.*;

/**
 * @author Zheng Fang
 */

public class ShelterArrangeRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ArrangeWorkAreaJPanel (userProcessContainer, account, (ArrangementOrganization) organization, (ShelterEnteriprise)enterprise, business);
    }
}
