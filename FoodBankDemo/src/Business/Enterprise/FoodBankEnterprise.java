/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.OrganizationDirectory;
import Business.Profile.Volunteer;
import Business.Profile.VolunteerDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author zhengfang
 */
public class FoodBankEnterprise extends Enterprise{
    private VolunteerDirectory v;

    public FoodBankEnterprise(String name, EnterpriseType type) {
        super(name, type);
        v = new VolunteerDirectory();
    }
    
    public enum Type{
        Admin("Admin Organization"), 
        CommDepart("Communicaton Department"),
        DistriDepart("Distribution Dpartment");      
        
        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public VolunteerDirectory getV() {
        return v;
    }

    public void setV(VolunteerDirectory v) {
        this.v = v;
    }
    
    public int getNumberofVolunteer(){
        int n = 0;
        for(Volunteer i:v.getVolunteerDirectory()){
            n++;
        }
        return n;
    }

    

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;

    }
    
    
}
