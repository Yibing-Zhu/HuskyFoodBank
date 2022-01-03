/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.Employee;
import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;

/**
 *
 * @author yibin
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter = 0;

    public enum Type{
        Admin("Admin Organization"), 
        CommDepart("Communicaton Department"),
        DistriDepart("Distribution Dpartment"),
        AnalyDepart("Analysis Department"),
        Account("Acconting Department"),
        VolunteerDepart("Volunteer Department"),
        ShelterAdmin("Shelter Adminstration"),
        ArraDepart("Arrangement Department"),
        RegisDepart("Registry");
        
        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public Organization() {

    }

    public abstract ArrayList<Role> getSupportedRole();

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public int getnumaccount(){
        int num = 0;
        for(UserAccount u :userAccountDirectory.getUserAccountList()){
            num++;
        }
        
        return num;
    }
    
    public int getnumemployee(){
        int num = 0;
        for (Employee e: employeeDirectory.getEmployeeList()){
            num++;
        }
        return num;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
