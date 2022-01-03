/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Foodbank;

import Business.Role.FoodBank.CommRole;
import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author zhengfang
 */
public class CommunicationOrganization extends Organization{

    public CommunicationOrganization() {
        super(Organization.Type.CommDepart.getValue());
    }
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CommRole());
        return roles;
    }
    
}
