/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization.Foodbank;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;

/**
 *
 * @author zhengfang
 */
public class Data {
    private EcoSystem business;
    private Enterprise enterprise;
    private int numaccount;
    private int numpeople;
    private int numrequest;
    private int numvolunteer;
    private int funding;
    private int numorg;
    private int numemployee;

    public Data(EcoSystem business) {

        for(Enterprise i: business.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList()){
            this.numaccount = +i.getnumaccounts();
            this.numemployee = +i.getnumemployees();
            this.numorg = +i.getnumOrg();
        }

    }

    public Data(Enterprise enterprise) {

        this.funding = 0;
        this.numaccount = enterprise.getnumaccounts();
        this.numorg = enterprise.getnumOrg();
        this.numemployee = enterprise.getnumemployees();
                      
    }
    

    

    public EcoSystem getBusiness() {
        return business;
    }

    public void setBusiness(EcoSystem business) {
        this.business = business;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public int getNumaccount() {
        return numaccount;
    }

    public void setNumaccount(int numaccount) {
        this.numaccount = numaccount;
    }

    public int getNumpeople() {
        return numpeople;
    }

    public void setNumpeople(int numpeople) {
        this.numpeople = numpeople;
    }

    public int getNumrequest() {
        return numrequest;
    }

    public void setNumrequest(int numrequest) {
        this.numrequest = numrequest;
    }

    public int getNumvolunteer() {
        return numvolunteer;
    }

    public void setNumvolunteer(int numvolunteer) {
        this.numvolunteer = numvolunteer;
    }

    public int getFunding() {
        return funding;
    }

    public void setFunding(int funding) {
        this.funding = funding;
    }

    public int getNumorg() {
        return numorg;
    }

    public void setNumorg(int numorg) {
        this.numorg = numorg;
    }
    
    
    
    
    }
