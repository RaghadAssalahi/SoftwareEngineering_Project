/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group_project_software;

/**
 *
 * @author LAYAN
 */
public class Student extends User{
   private Course courseid;
   private Course courseNam;

    public Student(Course courseid, Course courseNam, String userFNme, String userLNme, String userID, String userEmail, String userPass, String userSpecilization) {
        super(userFNme, userLNme, userID, userEmail, userPass, userSpecilization);
        this.courseid = courseid;
        this.courseNam = courseNam;
    }
   
   
   
   
}
