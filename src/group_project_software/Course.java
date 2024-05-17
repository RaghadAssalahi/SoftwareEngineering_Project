/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group_project_software;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author LAYAN
 */
public class Course {
    private String courseID; // ID of the course
    private String courseName; // Name of the course
    private String[] subscriptionStudent; // Array to store subscribed student IDs
    // Static list to keep track of all courses
    private static List<String> courses = new ArrayList<>();
    private int courseCapasity; // Maximum capacity of the course
    private int counter; // Counter for subscribed students
    private ArrayList<Assignment> assignments; // List of assignments for the course

  
  public Course(String courseName, String courseID){
      this.courseName=courseName;
      this.courseID=courseID;
      this.assignments=new ArrayList<>();
      
  }
  
  //Constructor to initialize a Course object with course ID, course name, and course capacity.
  public Course(String courseID, String courseName, int courseCapasity) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseCapasity=courseCapasity;
        this.subscriptionStudent=new String[courseCapasity];
        this.counter=0;
        this.courses=new ArrayList<>();
        this.assignments = new ArrayList<>();
         courses.add(courseID);
          System.out.println("Course "+courseName+" is successfully added ");
         
  }
  
   
    
   // Private method to find if a student is already subscribed to the course. 
  private boolean findStudent(String studentID){
      for(int i=0; i<subscriptionStudent.length;i++){
         if(subscriptionStudent[i]!=null&&!subscriptionStudent[i].isEmpty()){
          if(subscriptionStudent[i].equals(studentID))
              return true;
      }}
      return false;
  }
    
    // Getter method for the course name.
    public String getCourseName() {
        return courseName;
    }
    
  //Method to subscribe a student to the course.
  public void subscribeStudent(String studentID, String courseid){
      if(courses.contains(courseid)){
          if(counter<courseCapasity){
              if(!findStudent(studentID)){
                  subscriptionStudent[counter]=studentID;
                  System.out.println("student successfully subscribe in the "+getCourseName()+" course");
                  counter++;
              }else
                  System.out.println("student is already subscribe in the "+getCourseName()+" course");
              
          }else
              System.out.println("there is no capasity in the "+getCourseName()+" course");
      }else
          System.out.println("there is no course with this ID ");
  }
  
  
     //Method to search for a course by its ID.
   public void searchCourse(Scanner scanner) {
        System.out.print("Enter the course ID to search or type 'exit' to stop: ");
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            if ("exit".equalsIgnoreCase(input)) {
                System.out.println("Exiting search...");
                break;
            }
            if (courses.contains(input)) {
                System.out.println("The course with ID " + input + " is found.");
            } else {
                System.out.println("The course with ID " + input + " is not found.");
            }
            System.out.print("Enter the course ID to search or type 'exit' to stop: ");
        }
    }
  

      //Method to add an assignment to the course.
      public void addAssignment(Assignment assignment){
        assignments.add(assignment);
    }
      //Method to submit an assignment for a student.
     public void submitAssignment(Student student, Assignment assignment, String submission){
          if( "submit".equals(submission))
          System.out.println(student.getName() + " submitted assignment: " + assignment.getTitle());
          else
              System.out.println("Please re-submit");
          
      }
     
     //Setter method for the list of courses.
     public void setCourses(List<String> courses) {
        this.courses = courses;
    }
   
   // Method to get the number of subscribed students
    public int getSubscribedCount() {
        return counter;
    }
    
    // Getter for assignments for the testing
    public ArrayList<Assignment> getAssignments() {
        return assignments;
    }
    
    // Getter method for the list of courses.
    public List<String> getCourses() {
        return courses;
    }

}
