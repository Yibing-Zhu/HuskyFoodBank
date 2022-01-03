/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Foodbank;

import Business.Organization.Organization;
import Business.Role.FoodBank.AnalyRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author zhengfang
 */
public class AnalysisOrganization extends Organization{

    public AnalysisOrganization() {
        super(Organization.Type. AnalyDepart.getValue());
    }



    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AnalyRole());
        return roles;
    }
    
}
