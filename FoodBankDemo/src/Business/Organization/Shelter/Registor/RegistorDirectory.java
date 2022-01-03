/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Registor;

import java.util.ArrayList;

/**
 *
 * @author yibing
 */
public class RegistorDirectory {

    private ArrayList<Registor> registorDirectory;

    public RegistorDirectory() {
        registorDirectory = new ArrayList();
    }

    public ArrayList<Registor> getRegistorDirectory() {
        return registorDirectory;
    }

    public void setRegistorDirectory(ArrayList<Registor> registorDirectory) {
        this.registorDirectory = registorDirectory;
    }

    public Registor newRegistor(String name, String firstname, String lastname, String address, String email, String phoneNumber) {
        Registor registor = new Registor(name, firstname, lastname, address, email, phoneNumber);
        registorDirectory.add(registor);
        return registor;
    }

    public void removeRegistor(Registor registor) {
        registorDirectory.remove(registor);
    }
}
