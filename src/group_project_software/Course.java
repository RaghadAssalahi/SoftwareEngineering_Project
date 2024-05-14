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
  private String courseID; 
  private String courseName;
  private String[] subscriptionStudent;
  private List<String> courses;
  private int courseCapasity;
  private int counter;
  private ArrayList<Assignment> assignments;
  
  public Course(String courseName, String courseID){
      this.courseName=courseName;
      this.courseID=courseID;
      this.assignments=new ArrayList<>();
      
  }
  public Course(String courseID, String courseName, int courseCapasity) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseCapasity=courseCapasity;
        this.subscriptionStudent=new String[courseCapasity];
        this.counter=0;
         this.courses=new ArrayList<>();
         
         courses.add(courseID);
          System.out.println("Course "+courseName+" is successfully added ");
         
  }

    
    
  private boolean findStudent(String studentID){
      for(int i=0; i<subscriptionStudent.length;i++){
         if(subscriptionStudent[i]!=null&&!subscriptionStudent[i].isEmpty()){
          if(subscriptionStudent[i].equals(studentID))
              return true;
      }}
      return false;
  }

    public String getCourseName() {
        return courseName;
    }
  
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
          System.out.println("there is no course in this name "+getCourseName()+" course");
  }
  
  
    //method to search for a course 
    public void searchCourse() {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a course ID or 'exit' to stop
        System.out.print("Enter the course ID to search or type 'exit' to stop:");
       
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            
            // Check if the user wants to exit the search
            if ("exit".equalsIgnoreCase(input)) {
                System.out.println("Exiting search...");
                break;
            }
            
            // Check if the course ID is in the list of courses
            if (courses.contains(input)) {
                System.out.println("The course with ID " + input + " is found.");
            } else {
                System.out.println("The course with ID " + input + " is not found.");
            }
        }
    }
  

    
      public void addAssignment(Assignment assignment){
        assignments.add(assignment);
    }
      
     public void submitAssignment(Student student, Assignment assignment, String submission){
          if( "submit".equals(submission))
          System.out.println(student.getName() + " submitted assignment: " + assignment.getTitle());
          else
              System.out.println("Please re-submit");
          
      }
}
