 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Foodbank.Data;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author MyPC1
 */
public abstract class Enterprise extends Organization{
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private Data data;

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    public enum EnterpriseType{
        
        
        FoodBank("FoodBank"),
        Shelter("Shelter"),
        Volunteer("Volunteer"),
        Funding("Funding");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
        this.data = new Data(this);
    }
    public int getnumOrg(){
        int num = 0;
        for(Organization i:organizationDirectory.getOrganizationList()){
            num++;
        }
        return num;
    }
    public int getnumaccounts(){
        int num = 0;
        for(Organization i:organizationDirectory.getOrganizationList()){
            num = num+i.getnumaccount();
        }
        return num;
        
    }
    public int getnumemployees(){
        int num = 0;
        for(Organization i: organizationDirectory.getOrganizationList()){
            num = num + i.getnumemployee();
        }
        return num;
    }
}
