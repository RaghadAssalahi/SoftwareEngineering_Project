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
        
    
        
        System.out.println("-----------------------Learnsphere------------------------");
        System.out.println("Press 1: To submit your assignment ");
        System.out.println("Press 2: To add a course ");
        System.out.println("Press 3: To subscribe in a course");
        System.out.println("Press 4: if you want to search course");
        System.out.println("Press 5: If you are the manager and you want to delete a faculty member");
        System.out.println("Press 6: To send a message to the faculty");
        
        System.out.println("----------------------------------------------------------");
        
        
        Student student = null; // Declare student variable
        Assignment assignment = null; // Declare assignment variable
        Course javaCourse=new Course("12345","java",5);
        Course newCourse=null;
        String input;
        while(true) {
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
                    // Ask the user about new course info
                    System.out.print("Enter course's ID : ");
                    String courseid = in.nextLine();
                    System.out.print("Enter course's name : ");
                    String courseName = in.nextLine();
                    System.out.print("Enter course's capacity : ");
                    int courseCapacity = in.nextInt();
                    in.nextLine(); // Consume the leftover newline

                    // Add new course to the website
                    newCourse = new Course(courseid, courseName, courseCapacity);
                    break;

                    
                case 3:
                  try{
                   System.out.print("Enter student's ID : ");
                   String studentID = in.nextLine();
                   System.out.print("Enter course's ID : ");
                   String courseID = in.nextLine();
                   newCourse.subscribeStudent(studentID, courseID);
                   
                  }catch(NullPointerException e){
                      System.out.println("There is no course with this ID, first you must add the course then the student can subscrib ");
                  }
                     break;
                case 4:
                    //Call method search course  
                    javaCourse.searchCourse();
                    break;
                    
                case 5:
                    
                    // Create objects of type Faculty
                    Faculty f1 =new Faculty("wejdan",123456);
                    Faculty f2 =new Faculty("nada",123789);
                    // Create object of type Manager
                    Manager M1 = new Manager("rehab",1357);
                    
                    // Ask the user to enter the required data
                    System.out.println("Enter your ID number (you must be the manager):");
                    int manager_ID = in.nextInt();
                    System.out.println("Enter the ID number of the faculty member :");
                    int faculty_ID = in.nextInt();
                    
                    // Call method to delete a faculty member
                    Manager.deleteFaculity(manager_ID,faculty_ID);
                    
                    break;
                  
                case 6:
                    System.out.print("write the message you want to send to the Instructor :");
                    System.out.println("");
                    String message =in.nextLine(); //
                    System.out.print("Enter your name:");
                    System.out.println("");
                    String name=in.next();//
                    student = new Student(name);//
                    student.sendMessage(student, message);//
                    System.out.println("The message was sent successfully");
                    
                    
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
    
    
     

