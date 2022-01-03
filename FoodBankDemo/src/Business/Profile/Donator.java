/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profile;

import java.util.Date;

/**
 *
 * @author zhengfang
 */
public class Donator {
    private String fname;
    private String lname;
    private int phone;
    private int amount;
    private Date date;

    public Donator(int amount) {
        this.fname = "";
        this.lname = "";
        this.phone = 0;
        this.amount = amount;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }



    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    

    @Override
    public String toString() {
        return fname;
    }
    
    
}
