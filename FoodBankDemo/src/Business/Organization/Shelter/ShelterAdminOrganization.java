/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization.Shelter;

import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.Shelter.ShelterAdminRole;
import java.util.ArrayList;

/**
 *
 * @author zhengfang
 */
public class ShelterAdminOrganization extends Organization{
    
    public ShelterAdminOrganization() {
        super(Organization.Type.ShelterAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ShelterAdminRole());
        return roles;
    }
    
}
