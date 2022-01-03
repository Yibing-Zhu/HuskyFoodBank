/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.Shelter;

/**
 *
 * @author yibing
 */
public class Shelter {

    private String shelterName;
    private String address;
    private String adminName;
    private String adminfirstname;
    private String adminlastname;
    private String phoneNumber;
//    private MenuDirectory MenuDirectory;
    private String email;

    public Shelter(String shelterName, String address, String adminName, String adminfirstname, String adminlastname, String phoneNumber, String email) {
        this.shelterName = shelterName;
        this.address = address;
        this.adminName = adminfirstname + adminlastname;
        this.adminfirstname = adminfirstname;
        this.adminlastname = adminlastname;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getShelterName() {
        return shelterName;
    }

    public void setShelterName(String shelterName) {
        this.shelterName = shelterName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminfirstname() {
        return adminfirstname;
    }

    public void setAdminfirstname(String adminfirstname) {
        this.adminfirstname = adminfirstname;
    }

    public String getAdminlastname() {
        return adminlastname;
    }

    public void setAdminlastname(String adminlastname) {
        this.adminlastname = adminlastname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
