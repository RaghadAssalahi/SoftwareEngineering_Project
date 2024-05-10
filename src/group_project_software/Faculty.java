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
  
    public Faculty(Date startDate, String salary, String previouseExperience, Course course, Course courseN, String userFNme, String userLNme, String userID, String userEmail, String userPass, String userSpecilization) {
        super(userFNme, userLNme, userID, userEmail, userPass, userSpecilization);
        this.startDate = startDate;
        this.salary = salary;
        this.previouseExperience = previouseExperience;
        this.course = course;
        this.courseN = courseN;
    }

   
    
    public void sendMessage(Student student, String messageContent) {
      String name = null;
        Message message = new Message(messageContent, name);
        student.receiveMessage(message);
    }
    

  

  
}
