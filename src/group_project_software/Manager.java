/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group_project_software;

import java.util.Date;

/**
 *
 * @author LAYAN
 */
public class Manager extends User{
   private Date startDate;
   private String jobTitle;
   private String salary;

    public Manager(Date startDate, String jobTitle, String salary, String userFNme, String userLNme, String userID, String userEmail, String userPass, String userSpecilization) {
        super(userFNme, userLNme, userID, userEmail, userPass, userSpecilization);
        this.startDate = startDate;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
   
   
}
