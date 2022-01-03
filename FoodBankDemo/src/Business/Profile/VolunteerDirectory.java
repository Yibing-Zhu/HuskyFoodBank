/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profile;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author zhengfang
 */
public class VolunteerDirectory {
    private ArrayList<Volunteer> volunteerDirectory;

    public VolunteerDirectory() {
        this.volunteerDirectory = new ArrayList<Volunteer>();
    }

    public ArrayList<Volunteer> getVolunteerDirectory() {
        return volunteerDirectory;
    }

    public void setVolunteerDirectory(ArrayList<Volunteer> volunteerDirectory) {
        this.volunteerDirectory = volunteerDirectory;
    }
    
    public Volunteer newItem(String id, String firstname, String lastname, String gender, int age, String phone, String birth, String address, String email, String comment, String imagePath,String username, String password, Role role) {
        Volunteer profile = new Volunteer(id, firstname, lastname, gender, age, phone, birth, address, email, comment, imagePath, username, password, role);
        volunteerDirectory.add(profile);
        return profile;
    }

    public void removeProfile(Volunteer profile) {
        volunteerDirectory.remove(profile);
    }    
    
    
}
