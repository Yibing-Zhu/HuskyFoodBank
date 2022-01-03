/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Profile;

import java.util.ArrayList;

/**
 *
 * @author yibin
 */
public class ProfileDirectory {

    private ArrayList<Profile> profileDirectory;

    public ProfileDirectory() {
        profileDirectory = new ArrayList();
    }

    public ArrayList<Profile> getProfileDirectory() {
        return profileDirectory;
    }

    public void setProfileDirectory(ArrayList<Profile> profileDirectory) {
        this.profileDirectory = profileDirectory;
    }

    public Profile newItem(String id, String firstname, String lastname, String gender, int age, String phone, String birth, String address, String email, String comment, String imagePath, String shelter) {
        Profile profile = new Profile(id, firstname, lastname, gender, age, phone, birth, address, email, comment, imagePath, shelter);
        profileDirectory.add(profile);
        return profile;
    }

    public void removeProfile(Profile profile) {
        profileDirectory.remove(profile);
    }
}
