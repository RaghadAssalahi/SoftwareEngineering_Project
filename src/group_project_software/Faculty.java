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
  private Date startDate;
  private String salary;
  private String previouseExperience;
  private Course course;
  private Course courseN;
  public  static int [] all_faculty_ID ;
  private  static int count =0 ;
  
  
  
    public Faculty(Date startDate, String salary, String previouseExperience, Course course, Course courseN, String userFNme, String userLNme, int userID, String userEmail, String userPass, String userSpecilization) {
        super(userFNme, userLNme, userID, userEmail, userPass, userSpecilization);
        this.startDate = startDate;
        this.salary = salary;
        this.previouseExperience = previouseExperience;
        this.course = course;
        this.courseN = courseN;
        addFaculty(userID);
        
    }

   public Faculty(Date startDate, String salary, String previouseExperience, String userFNme, String userLNme, int userID, String userEmail, String userPass, String userSpecilization){
   
       super(userFNme, userLNme, userID, userEmail, userPass, userSpecilization);
        this.startDate = startDate;
        this.salary = salary;
        this.previouseExperience = previouseExperience;
   
        addFaculty(userID);
   
   
   
   }
   
    
    public void sendMessage(Student student, String messageContent) {
      String name = null;
        Message message = new Message(messageContent, name);
        student.receiveMessage(message);
    }
    

  private static void addFaculty(int IDFaculty ){
  
         all_faculty_ID[count]= IDFaculty ;
         count++;
  
  }

    public static int[] getAll_faculty_ID() {
        return all_faculty_ID;
    }

  
}
