/*
Project: CarDealership Project
Course: IST 242
Author: Team 6
Date Developed: 6/21/2020
Revision: 1
*/
package edu.psu.abington.jzl6344.ist242;

import java.util.ArrayList;


public class SalesLeader {
    private int Id;
    private String Name;
    private String Date;
    private String phoneNUmber;
    private String interest;

    public SalesLeader(){
        this.Id = -1;
        this.Name = "";
        this.Date = "";
        this.phoneNUmber = "";
        this.interest = "";
    }
    /**
     * This Constructor method keep the SalesLeader information
     *
     * @param Id        SalesLeader Id
     * @param name      SalesLeader Name
     * @param date      SalesLeader Join date
     * @param phone     SalesLeader Phone number
     * @param interest  SalerLeader Interest in
     * @author          Team 6
     * @version         Final
     * @since           2020/06/25
     */

    public SalesLeader(int Id, String name, String date, String phone, String interest){
        this.Id = Id;
        this.Name = name;
        this.Date = date;
        this.phoneNUmber = phone;
        this.interest = interest;
    }

    /**
     * This is the setter and getter method .
     *
     * @author          Team 6
     * @version         Final
     * @since           2020/06/25
     */
    public int getId() { return Id; }
    public void setId(int id) { Id = id; }

    public String getName() { return Name; }
    public void setName(String name) { Name = name; }

    public String getDate() { return Date; }
    public void setDate(String date) { Date = date; }

    public String getPhoneNUmber() { return phoneNUmber; }
    public void setPhoneNUmber(String phoneNUmber) { this.phoneNUmber = phoneNUmber; }

    public String getInterest() { return interest; }
    public void setInterest(String interest) { this.interest = interest; }

    public static void listSaleLead(ArrayList<SalesLeader> leadList) {
        for (SalesLeader lead : leadList) {
            System.out.println("Sale Lead Id: " + lead.getId());
            System.out.println("Sale Lead Name: " + lead.getName());
            System.out.println("Sale Lead join Date: " + lead.getDate());
            System.out.println("Sale Lead Phone NUmber: " + lead.getPhoneNUmber());
            System.out.println("Sale Lead interest in: " + lead.getInterest());
        }
    }
}
