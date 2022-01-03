/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Coordinator;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CoordinatorDirectory {

    private ArrayList<Coordinator> coordinatorDirectory;

    public CoordinatorDirectory() {

        coordinatorDirectory = new ArrayList();

    }

    public ArrayList<Coordinator> getCoordinatorDirectory() {
        return coordinatorDirectory;
    }

    public void setCoordinatorDirectory(ArrayList<Coordinator> coordinatorDirectory) {
        this.coordinatorDirectory = coordinatorDirectory;
    }

    public Coordinator newCoordinator(String firstname, String lastname, String name, String email, String phoneNumber, String homeAddress, String id, String shelter) {
        Coordinator coordinator = new Coordinator(firstname, lastname, name, email, phoneNumber, homeAddress, id, shelter);
        coordinatorDirectory.add(coordinator);
        return coordinator;
    }

    public void removeCoordinator(Coordinator coordinator) {
        coordinatorDirectory.remove(coordinator);
    }

    public Coordinator getCoordinator(String name) {
        for (Coordinator coordinator : coordinatorDirectory) {
            if (coordinator.getName().equalsIgnoreCase(name)) {
                return coordinator;
            }
        }
        return null;
    }

}
