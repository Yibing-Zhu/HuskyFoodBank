/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Shelter;

import Business.Organization.Organization;
import Business.Role.Shelter.CoordinatorRole;
    import Business.Role.Role;
import Business.Role.Shelter.ShelterArrangeRole;
import java.util.ArrayList;

/**
 *
 * @author yibing
 */
public class ArrangementOrganization extends Organization {

    public ArrangementOrganization() {
        super(Organization.Type.ArraDepart.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ShelterArrangeRole());
        return roles;
    }
}
