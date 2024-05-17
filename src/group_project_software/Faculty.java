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
public class Faculty extends User {
    private Date startDate; // Start date of the faculty member
    private String salary; // Salary of the faculty member
    private String previouseExperience; // Previous experience of the faculty member
    private Course course; // Course associated with the faculty member
    private Course courseN; // Additional course associated with the faculty member
    public static int[] all_faculty_ID = new int[100]; // Static array to keep track of all faculty IDs
    private static int count = 2; // Counter for faculty IDs
  
  
  //Constructor to initialize a Faculty object with all attributes.
    public Faculty(Date startDate, String salary, String previouseExperience, Course course, Course courseN, String userFNme, String userLNme, int userID, String userEmail, String userPass, String userSpecilization) {
        super(userFNme, userLNme, userID, userEmail, userPass, userSpecilization);
        this.startDate = startDate;
        this.salary = salary;
        this.previouseExperience = previouseExperience;
        this.course = course;
        this.courseN = courseN;
        addFaculty(userID);
        
    }
    
  //Constructor to initialize a Faculty object without courses.
   public Faculty(Date startDate, String salary, String previouseExperience, String userFNme, String userLNme, int userID, String userEmail, String userPass, String userSpecilization){
   
       super(userFNme, userLNme, userID, userEmail, userPass, userSpecilization);
        this.startDate = startDate;
        this.salary = salary;
        this.previouseExperience = previouseExperience;
   
        addFaculty(userID);
   
   
   
   }
   //Constructor to initialize a Faculty object with only name and ID.
   public Faculty(String Fname ,int ID ){
   
      super(Fname , ID);
      addFaculty(ID);
   
   }
   
    // Method for a faculty member to send a message to a student.
    public void sendMessage(Student student, String messageContent) {
      String name = null;
        Message message = new Message(messageContent, name);
        student.receiveMessage(message);
    }
    
//Private method to add a faculty ID to the static array of all faculty IDs.
  private static void addFaculty(int IDFaculty ){
         all_faculty_ID[0]=7756;
         all_faculty_ID[1]=7789;
         all_faculty_ID[count]= IDFaculty ;
         count++;
  
  }
//Getter method for the static array of all faculty IDs.
    public static int[] getAll_faculty_ID() {
        return all_faculty_ID;
    }

  
}
