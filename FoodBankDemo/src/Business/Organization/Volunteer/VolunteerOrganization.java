/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization.Volunteer;

import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.Volunteer.Volunteer;
import java.util.ArrayList;

/**
 *
 * @author zhengfang
 */
public class VolunteerOrganization extends Organization {

    public VolunteerOrganization() {
        super();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Volunteer());
        return roles;
    }

}
