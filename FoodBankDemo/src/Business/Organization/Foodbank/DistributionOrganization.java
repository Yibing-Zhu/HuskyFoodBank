/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Foodbank;

import Business.Organization.Organization;
import Business.Role.FoodBank.DistriRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author zhengfang
 */
public class DistributionOrganization extends Organization{

    public DistributionOrganization() {
        super(Organization.Type.DistriDepart.getValue());
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DistriRole());
        return roles;
    }
    
    
}
