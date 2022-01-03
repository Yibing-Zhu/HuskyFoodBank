/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Volunteer;

import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.Volunteer.VolunteerAdminRole;
import java.util.ArrayList;

/**
 *
 * @author zhengfang
 */
public class VolunteerAdminOrganization extends Organization{

    public VolunteerAdminOrganization() {
        super(Organization.Type.VolunteerDepart.getValue());
    }
    
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new VolunteerAdminRole());
        return roles;
    }
    
    
}
