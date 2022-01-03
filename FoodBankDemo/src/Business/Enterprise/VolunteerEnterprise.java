/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.EcoSystem;
import Business.Profile.VolunteerDirectory;
import Business.Role.Role;
import Business.Role.Volunteer.Volunteer;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author zhengfang
 */
public class VolunteerEnterprise extends Enterprise {
    private static EcoSystem business;
    private VolunteerDirectory volunteerdirectory;

    public VolunteerEnterprise(String name, EnterpriseType type) {
        super(name, type);
        
        this.volunteerdirectory = new VolunteerDirectory();
        
    }
public enum Type{

        VolunteerDepart("Volunteer Department"),
        Volunteer("Volunteer");
        
        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


    

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Volunteer());
        return roles;       
        
    }

    public static EcoSystem getBusiness() {
        return business;
    }

    public static void setBusiness(EcoSystem business) {
        VolunteerEnterprise.business = business;
    }

    public VolunteerDirectory getVolunteerdirectory() {
        return volunteerdirectory;
    }

    public void setVolunteerdirectory(VolunteerDirectory volunteerdirectory) {
        this.volunteerdirectory = volunteerdirectory;
    }

    public void addVolunteeraccount(String username,String password,Role role){
        this.getUserAccountDirectory().createVolunteerUserAccount(username, password, role);
  
    }
    
    
}
