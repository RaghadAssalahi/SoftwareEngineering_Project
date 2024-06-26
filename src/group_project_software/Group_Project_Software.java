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
        
    
         // Display the menu options
        System.out.println("-----------------------Learnsphere------------------------");
        System.out.println("Press 1: To submit your assignment ");
        System.out.println("Press 2: To add a course ");
        System.out.println("Press 3: To subscribe in a course");
        System.out.println("Press 4: if you want to search course");
        System.out.println("Press 5: If you are the manager and you want to delete a faculty member");
        System.out.println("Press 6: To send a message to the faculty");
        
        System.out.println("----------------------------------------------------------");
        
        
        // Initialize necessary variables
        Student student = null; // Declare student variable
        Assignment assignment = null; // Declare assignment variable
        Course courses = new Course("12345", "java", 5); // Create a default course
        Course newCourse = null; // Declare new course variable
        String input; // Variable to store user input
        
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
                    // Submit an assignment
                    
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
                   courses.submitAssignment(student, assignment, submission);
                    break;
                    
               case 2:
                   // Add a new course
                   
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
                    System.out.println("Course " + courseName + " is successfully added");
                    
                    break;

                    
                case 3:
                    // Subscribe a student to a course
                    
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
                    // Search for a course
                    
                    //Call method search  
                    courses.searchCourse(in);
                    break;
                    
                case 5:
                    // Delete a faculty member
                    
                    // Create objects of type Faculty
                    Faculty f1 =new Faculty("wejdan",7770);
                    Faculty f2 =new Faculty("nada",7700);
                    // Create object of type Manager
                    Manager M1 = new Manager("rehab",7770);
                    
                    // Ask the user to enter the required data
                    System.out.print("Enter your ID number (you must be the manager):");
                    System.out.println("");
                    int manager_ID = in.nextInt();
                    System.out.print("Enter the ID number of the faculty member :");
                    int faculty_ID = in.nextInt();
                    
                    in.nextLine(); // Consume the leftover newline
                    
                    // Call method to delete a faculty member
                    Manager.deleteFaculity(manager_ID,faculty_ID);
                    
                    break;
                  
                case 6:
                    // Send a message to the faculty
                    
                    System.out.print("write the message you want to send to the Instructor :");
                    System.out.println("");
                    String message =in.nextLine(); //
                    System.out.print("Enter your name:");
                    System.out.println("");
                    String name=in.next();//
                    student = new Student(name);//
                    student.sendMessage(student, message);//
                    System.out.println("The message was sent successfully");
                    
                    in.nextLine(); // Consume the leftover newline
                    
                    
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
    
    
     

