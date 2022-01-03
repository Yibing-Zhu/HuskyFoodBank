/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprise.Enterprise;
import Business.Enterprise.FoodBankEnterprise;
import Business.Enterprise.FundingEnterprise;
import Business.Enterprise.ShelterEnteriprise;
import Business.Enterprise.VolunteerEnterprise;
import Business.Network.Network;
import Business.Organization.Foodbank.Data;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private Data data;

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<Network>();
        try {
            this.data = new Data(this);
        } catch (Exception e) {

        }
    }

    public void removeNetwork(Network network) {
        networkList.remove(network);
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    public Network getselectednetwork(Network w) {
        for (Network n : networkList) {
            if (n.equals(w)) {
                return n;
            }
        }
        return w;
    }

    public boolean checkIfUserIsUnique(String userName) {
        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
            return false;
        }
        for (Network network : networkList) {

        }
        return true;
    }

    public FoodBankEnterprise getfirstFoodBankEnterprise() {
        for (Enterprise e : this.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList()) {
            if (e.getEnterpriseType() == Enterprise.EnterpriseType.FoodBank) {
                return (FoodBankEnterprise) e;
            }
        }
        return null;
    }

    public ShelterEnteriprise getfirstShelterEnterprise() {
        for (Enterprise e : this.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList()) {
            if (e.getEnterpriseType() == Enterprise.EnterpriseType.Shelter) {
                return (ShelterEnteriprise) e;
            }
        }
        return null;
    }

    public VolunteerEnterprise getfirstVolunteerEnterprise() {
        for (Enterprise e : this.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList()) {
            if (e.getEnterpriseType() == Enterprise.EnterpriseType.Volunteer) {
                return (VolunteerEnterprise) e;
            }
        }
        return null;
    }

    public FundingEnterprise getfirstFundingEnterprise() {
        for (Enterprise e : this.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList()) {
            if (e.getEnterpriseType() == Enterprise.EnterpriseType.Funding) {
                return (FundingEnterprise) e;
            }
        }
        return null;
    }

}
