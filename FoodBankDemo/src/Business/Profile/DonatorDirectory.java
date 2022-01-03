/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profile;

import java.util.ArrayList;

/**
 *
 * @author zhengfang
 */
public class DonatorDirectory {
    private ArrayList<Donator> donatorlist;

    public DonatorDirectory() {
        this.donatorlist = new ArrayList<>();
    }

    public ArrayList<Donator> getDonatorlist() {
        return donatorlist;
    }

    public void setDonatorlist(ArrayList<Donator> donatorlist) {
        this.donatorlist = donatorlist;
    }
    
    public void addDonator(Donator donator){
        donatorlist.add(donator);
    }

    public void deleteDonator(Donator donator){
        donatorlist.remove(donator);
    }
    public int Totalamount(){
        int total =0;
        for (Donator d: donatorlist){
            total +=d.getAmount();
        }
        return total;
    }
}
