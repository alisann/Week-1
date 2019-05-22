/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 *
 * @author sanna
 */
public class PartTimeStudent extends Student {
    
    //Number of credit hours
    private int noOfHours;

    public PartTimeStudent(int noOfHours, String stdId, String name) {
        super(stdId, name);
        this.noOfHours = noOfHours;
    }

    /**
     * @return the noOfHours
     */
    public int getNoOfHours() {
        return noOfHours;
    }

    /**
     * @param noOfHours the noOfHours to set
     */
    public void setNoOfHours(int noOfHours) {
        this.noOfHours = noOfHours;
    }
}
