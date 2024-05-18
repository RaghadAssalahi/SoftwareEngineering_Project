/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group_project_software;

import java.util.*;

/**
 *
 * 
 */
public class Manager extends User{
  private Date startDate; // Start date of the manager
    private String jobTitle; // Job title of the manager
    private String salary; // Salary of the manager
    private static int[] all_Manager_ID = new int[100]; // Static array to keep track of all manager IDs
    public static int i = 0; // Counter for manager IDs
  
   
    //Constructor to initialize a Manager object with all attributes.
    public Manager(Date startDate, String jobTitle, String salary, String userFNme, String userLNme, int userID, String userEmail, String userPass, String userSpecilization) {
        super(userFNme, userLNme, userID, userEmail, userPass, userSpecilization);
        this.startDate = startDate;
        this.jobTitle = jobTitle;
        this.salary = salary;
        addManager(userID);
    }
   
    //Constructor to initialize a Manager object with only name and ID.
    public Manager(String FName,int MID){
       super(FName,MID);
       addManager(MID);
    
    }
    
    //Static method to delete a faculty member.
   public static String deleteFaculity(int IDManager, int IDFaculty) {
    Arrays.sort(all_Manager_ID);
    Arrays.sort(Faculty.all_faculty_ID);

    // Check if the manager ID exists
    if (0 > (Arrays.binarySearch(getAll_Manager_ID(), IDManager))) {
        System.out.println("You don't have authorization to delete faculty");
        return "You don't have authorization to delete faculty";
    }
    // Check if the faculty ID exists
    else if (0 > Arrays.binarySearch(Faculty.all_faculty_ID, IDFaculty)) {
        System.out.println("There is no Instructor with this ID");
        return "There is no Instructor with this ID";
    } else {
        int index = Arrays.binarySearch(Faculty.all_faculty_ID, IDFaculty);
        // Ensure valid index before setting to -1
        if (index >= 0) {
            for (int i = index; i < Faculty.count - 1; i++) {
                Faculty.all_faculty_ID[i] = Faculty.all_faculty_ID[i + 1];
            }
            Faculty.all_faculty_ID[Faculty.count - 1] = -1; // Set last element to -1
            Faculty.count--; // Decrement the count
            System.out.println("The deletion process was completed successfully");
            return "The deletion process was completed successfully";
        }
        return "There is no Instructor with this ID";
    }
}

   
    /// Private static method to add a manager ID to the static array of all manager IDs.
     
    private static void addManager(int IDManager ){
         all_Manager_ID[i] = IDManager;
        i++;
  
  }
//Getter method for the static array of all manager IDs.
    public static int[] getAll_Manager_ID() {
        return all_Manager_ID;
    }
   
    
    
    
}

