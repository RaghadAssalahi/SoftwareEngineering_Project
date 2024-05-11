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
  private List<Course> courseList;
          
  public Course(String courseID, String courseName, int courseCapasity) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseCapasity=courseCapasity;
        this.subscriptionStudent=new String[courseCapasity];
        this.counter=0;
         this.courses=new ArrayList<>();
         this.courseList = new ArrayList<>();
         
         courses.add(courseID);
         System.out.println("Course "+courseName+" is successfully added ");
  }

    public void addCourse(Course course) {
        courseList.add(course);
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
  
   // Method to search for a course by name
    public void searchCourse() {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter the course name to search or type 'exit' to stop:");
            String input = scanner.nextLine();

            if ("exit".equalsIgnoreCase(input)) {
                System.out.println("Exiting search...");
                break;
            }

            boolean found = false;
            for (Course course : courseList) {
                if (course.getCourseName().equalsIgnoreCase(input)) {
                    System.out.println("The course " + input + " is found.");
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("The course " + input + " is not found.");
            }
        }
 
  
}
}
