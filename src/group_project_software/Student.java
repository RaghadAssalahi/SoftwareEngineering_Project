/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group_project_software;

/**
 *
 * @author LAYAN
 */
public class Student extends User {
   private String name;
   private int userID;
   private Course courseid;
   private Course courseNam;
   

    public Student(Course courseid, Course courseNam, String userFNme, String userLNme, int userID, String userEmail, String userPass, String userSpecilization) {
        super(userFNme, userLNme, userID, userEmail, userPass, userSpecilization);
        this.courseid = courseid;
        this.courseNam = courseNam;
    }

    public Student(String name) {
        this.name=name;
    }
    
    public String getName(){
        return name;
    }
    
    public void sendMessage(Student student, String messageContent) {
        Message message = new Message(messageContent, name);
        student.receiveMessage(message);
    }

    void receiveMessage(Message message) {
     System.out.println("Message received by Student " + name + ": " + message.getContent() + " (from: " + message.getSender() + ")");

    }
   
    
    
}
