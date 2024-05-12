/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package group_project_software;

import java.time.LocalDate;

/**
 *
 * @author Ragy
 */
public class Group_Project_Software {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Faculty f1 =new Faculty("wejdan",123456);
        Faculty f2 =new Faculty("nada",123789);
        Manager M1 = new Manager("rehab",1357);
        
        Student student = new Student("Alice");
        LocalDate deadline = LocalDate.parse("2024-05-20");// Parse the deadline string to LocalDate
        String submission ="2024-05-19";
        
        Assignment assignment = new Assignment("Java Assignment", "Create a Java program", deadline);
        
        Course course = new Course("Java Programming", "JAVA101");
        course.submitAssignment(student, assignment, submission);
        Course javaCourse=new Course("12345","java",5);
        javaCourse.subscribeStudent("3456", "12345");
        javaCourse.subscribeStudent("345", "12345");
        javaCourse.subscribeStudent("34", "12345");
        javaCourse.subscribeStudent("3457", "12345");
        javaCourse.subscribeStudent("3457", "12345");
        
        System.out.println("");
        
        javaCourse.addCourse(new Course("CS101", "Introduction to Computer Science", 30));
        javaCourse.addCourse(new Course("MA101", "Calculus I", 40));
        
        javaCourse.searchCourse();
        
        System.out.println("");
       
        Manager.deleteFaculity(1357,123456);
        
        System.out.println("");

    }
    
    
     
}
