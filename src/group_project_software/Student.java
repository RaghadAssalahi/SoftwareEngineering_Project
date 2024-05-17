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
    private String name; // Name of the student
    private int userID; // ID of the student (inherited from User)
    private Course courseid; // Course ID of the enrolled course
    private Course courseNam; // Course name of the enrolled course
    
//Constructor to initialize a Student object with all attributes.
    public Student(Course courseid, Course courseNam, String userFNme, String userLNme, int userID, String userEmail, String userPass, String userSpecilization) {
        super(userFNme, userLNme, userID, userEmail, userPass, userSpecilization);
        this.courseid = courseid;
        this.courseNam = courseNam;
    }
// Constructor to initialize a Student object with only the name.
    public Student(String name) {
        this.name=name;
    }
    //Getter for the name of the student.
    public String getName(){
        return name;
    }
    // Method to send a message to another student.
   public void sendMessage(Student student, String messageContent) {
        Message message = new Message(messageContent, this.name);
        student.receiveMessage(message);
    }

    // Method to receive a message.
    void receiveMessage(Message message) {
        System.out.println("Message received by Student " + name + ": " + message.getContent() + " (from: " + message.getSender() + ")");
    }
   
    
    
}
