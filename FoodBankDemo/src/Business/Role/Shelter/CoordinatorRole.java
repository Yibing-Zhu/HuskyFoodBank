/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.Shelter;


import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.ShelterEnteriprise;
import Business.Organization.Organization;
import Business.Organization.Shelter.ArrangementOrganization;
import Business.Organization.Shelter.RegistrationOrganization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.CoordinatorRole.CoordinatorAreaJPanel;

/**
 *
 * @author yibin
 */
public class CoordinatorRole extends Role {

    /**
     *
     * @param userProcessContainer
     * @param account
     * @param organization
     * @param enterprise
     * @param business
     * @return
     */
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
       return new CoordinatorAreaJPanel(userProcessContainer, account, (RegistrationOrganization)organization, (ShelterEnteriprise)enterprise, business);
       
    }
//    @Override
//    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
//       return new CoordinatorAreaJPanel(userProcessContainer, account, (RegistrationOrganization)organization, enterprise);
//       
//    }
//    public JPanel createCoordinatorWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business, CoordinatorDirectory coordinatorDirectory, ShelterDirectory shelterDirectory, DeliveryManDirectory deliveryManDirectory, ProfileDirectory profileDirectory, OrderDirectory orderDirectory, UserAccountDirectory userAccountDirectory, MenuDirectory menuDirectory) {
//        return new CoordinatorAreaJPanel(userProcessContainer, account, business, coordinatorDirectory, shelterDirectory, deliveryManDirectory, profileDirectory, orderDirectory, menuDirectory);
//    }

}
