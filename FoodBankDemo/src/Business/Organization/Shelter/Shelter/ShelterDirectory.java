/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Shelter;

import java.util.ArrayList;

/**
 *
 * @author yibing
 */
public class ShelterDirectory {

    private ArrayList<Shelter> shelterDirectory;

    public ShelterDirectory() {
        shelterDirectory = new ArrayList();
    }

    public ArrayList<Shelter> getShelterDirectory() {
        return shelterDirectory;
    }

    public void setShelterDirectory(ArrayList<Shelter> shelterDirectory) {
        this.shelterDirectory = shelterDirectory;
    }

    public Shelter newShelter(String name, String address, String mName, String firstname, String lastname, String phoneNumber, String email) {
        Shelter shelter = new Shelter(name, address, mName, firstname, lastname, phoneNumber, email);
        shelterDirectory.add(shelter);
        return shelter;
    }

    public void removeShelter(Shelter shelter) {
        shelterDirectory.remove(shelter);
    }

    public Shelter getShelter(String name) {
        for (Shelter r : shelterDirectory) {
            if (r.getShelterName().equals(name)) {
                return r;
            }
        }
        return null;
    }
}
