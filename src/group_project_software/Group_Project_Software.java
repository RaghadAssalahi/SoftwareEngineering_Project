/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package group_project_software;

import java.time.LocalDate;
import java.util.Scanner;

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
         Scanner in=new Scanner(System.in);
         
        Faculty f1 =new Faculty("wejdan",123456);
        Faculty f2 =new Faculty("nada",123789);
        Manager M1 = new Manager("rehab",1357);
        
       
        
        Course course = new Course("Java Programming", "JAVA101");
        Course javaCourse=new Course("12345","java",5);
        javaCourse.subscribeStudent("3456", "12345");
        javaCourse.subscribeStudent("345", "12345");
        javaCourse.subscribeStudent("34", "12345");
        javaCourse.subscribeStudent("3457", "12345");
        javaCourse.subscribeStudent("3457", "12345");
        
        System.out.println("");
        
//        javaCourse.addCourse(new Course("CS101", "Introduction to Computer Science", 30));
//        javaCourse.addCourse(new Course("MA101", "Calculus I", 40));
//        
//        javaCourse.searchCourse();
        
        System.out.println("");
       
       Manager.deleteFaculity(1357,123456);
        
        System.out.println("-----------------------Learnsphere------------------------");
        System.out.println("Press 1:To submit your assignment ");
        System.out.println("Press 2: ");
        System.out.println("Press 3: ");
        System.out.println("Press 4: if you want to search course");
        System.out.println("Press 5: ");
        
        System.out.println("----------------------------------------------------------");
        
        
        Student student = null; // Declare student variable
        Assignment assignment = null; // Declare assignment variable
        String input;
        while (true) {
            System.out.print("\nYour choice (type 'exit' to quit): ");
            input = in.nextLine();
            System.out.println("");
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            
            int choice = -1;
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'exit'.");
                continue;
            }
            
            
            switch (choice) {
                case 1:
                    System.out.print("Enter student's name: ");
        String studentName = in.nextLine();

        // Create a Student object with the provided name
        student = new Student(studentName);

        // Take assignment details from user
        System.out.print("Enter assignment title: ");
        String title = in.nextLine();
        System.out.print("Enter assignment details: ");
        String details = in.nextLine();
        System.out.print("Enter submission date (YYYY-MM-DD): ");
        LocalDate submissiondate = LocalDate.parse(in.nextLine());
        System.out.print("Enter submission (submit / not submitted): ");
        String submission = in.nextLine();

        // Create assignment object
        assignment = new Assignment(title, details, submissiondate);

        // Call course.submitAssignment(student, assignment, submission) to submit the assignment
        javaCourse.submitAssignment(student, assignment, submission);
                    break;
                    
                case 2:
                   
                    
                    
                    break;
                    
                case 3:
                   
                    break;
                    
                case 4:
                    javaCourse.searchCourse();
                    break;
                    
                case 5:
                    
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        
        System.out.println("Exiting the system.");
        in.close();
    }
            
        
        
        
        
        
        

    }
    
    
     

