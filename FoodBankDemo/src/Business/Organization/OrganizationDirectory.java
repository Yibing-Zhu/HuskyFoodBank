/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Foodbank.AnalysisOrganization;
import Business.Organization.Foodbank.CommunicationOrganization;
import Business.Organization.Foodbank.DistributionOrganization;
import Business.Organization.Funding.AccountOrganization;
import Business.Organization.Organization.Type;
import Business.Organization.Shelter.ArrangementOrganization;
import Business.Organization.Shelter.RegistrationOrganization;
import Business.Organization.Shelter.ShelterAdminOrganization;
import Business.Organization.Volunteer.VolunteerAdminOrganization;
import Business.Organization.Volunteer.VolunteerOrganization;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public void removeOrganiation(Organization org) {
        organizationList.remove(org);
    }

    public Organization createOrganization(Type type) {
        Organization organization = null;
        if (type.getValue().equals(Type.CommDepart.getValue())) {
            organization = new CommunicationOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.AnalyDepart.getValue())) {
            organization = new AnalysisOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.DistriDepart.getValue())) {
            organization = new DistributionOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Account.getValue())) {
            organization = new AccountOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.ArraDepart.getValue())) {
            organization = new ArrangementOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.RegisDepart.getValue())) {
            organization = new RegistrationOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.ShelterAdmin.getValue())) {
            organization = new ShelterAdminOrganization();
            organizationList.add(organization);

        }else if (type.getValue().equals(Type.VolunteerDepart.getValue())){
            organization = new VolunteerAdminOrganization();
            organizationList.add(organization);

        } 
        return organization;
    }
}
