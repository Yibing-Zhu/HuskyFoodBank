/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Shelter;

import Business.Organization.Organization;
import Business.Role.Shelter.CoordinatorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author yibing
 */
public class RegistrationOrganization extends Organization {

    public RegistrationOrganization() {
        super(Organization.Type.RegisDepart.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CoordinatorRole());
        return roles;
    }
}
