/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Profile.Donator;
import Business.Profile.DonatorDirectory;
import Business.Profile.Volunteer;
import Business.Profile.VolunteerDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author zhengfang
 */
public class FundingEnterprise extends Enterprise{
    
    private DonatorDirectory Dlist;
    private VolunteerDirectory v;

    public FundingEnterprise(String name, EnterpriseType type) {
        super(name, type);
        this.Dlist = new DonatorDirectory();
        v = new VolunteerDirectory();
    }

    public enum Type{

        Account("Acconting Department");

        
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

    
    
    public DonatorDirectory getDlist() {
        return Dlist;
    }

    public void setDlist(DonatorDirectory Dlist) {
        this.Dlist = Dlist;
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
