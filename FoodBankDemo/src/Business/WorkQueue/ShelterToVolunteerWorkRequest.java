/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

/**
 *
 * @author zhengfang
 */
public class ShelterToVolunteerWorkRequest extends WorkRequest {

    private int headcount;

    public int getHeadcount() {
        return headcount;
    }

    public void setHeadcount(int headcount) {
        this.headcount = headcount;
    }

    @Override
    public String toString() {
        return String.valueOf(headcount);
    }

}
