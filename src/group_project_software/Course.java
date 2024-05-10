/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group_project_software;

import java.util.List;
import java.util.ArrayList;
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
          
  public Course(String courseID, String courseName, int courseCapasity) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseCapasity=courseCapasity;
        this.subscriptionStudent=new String[courseCapasity];
        this.counter=0;
         this.courses=new ArrayList<>();
         courses.add(courseID);
  }
//  public void courses(Course c){
//      this.courses=new ArrayList<>();
//      courses.add(courseID);
//  }
  
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
 
  
}
