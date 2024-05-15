/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group_project_software;

import java.util.*;

/**
 *
 * @author LAYAN
 */
public class Manager extends User{
   private Date startDate;
   private String jobTitle;
   private String salary;
   private static int [] all_Manager_ID =new int [100];
   private  static int i =2 ;
  

    public Manager(Date startDate, String jobTitle, String salary, String userFNme, String userLNme, int userID, String userEmail, String userPass, String userSpecilization) {
        super(userFNme, userLNme, userID, userEmail, userPass, userSpecilization);
        this.startDate = startDate;
        this.jobTitle = jobTitle;
        this.salary = salary;
        addManager(userID);
    }
   
    public Manager(String FName,int MID){
       super(FName,MID);
       addManager(MID);
    
    }
    
    public static String deleteFaculity(int IDManager,int IDFaculty){
        
        
        Arrays.sort(all_Manager_ID);
        Arrays.sort(Faculty.all_faculty_ID);
        
           if(  0 >( Arrays.binarySearch(getAll_Manager_ID(),IDManager)) ){
           
               System.out.println("You don't have authorization to delete faculty");
               return "You don't have authorization to delete faculty" ;
               
           }else if(0 > Arrays.binarySearch( Faculty.all_faculty_ID , IDFaculty )){
           
           
               System.out.println("There is no Instructor with this ID");
               return "There is no Instructor with this ID" ;
           
           }else {
           
               Scanner input=new Scanner(System.in);
               System.out.print("Are you sure you want to delete the faculty member with ID ="+IDFaculty+"? "+"(yes/no) : ");
               String answer =input.next().toLowerCase();
               
               if(answer.equalsIgnoreCase("no")){
               
                   System.out.println("The deletion has been cancelled");
                   return "The deletion has been cancelled" ;
               
               }else if(answer.equalsIgnoreCase("yes")){
               
                   int index = Arrays.binarySearch( Faculty.all_faculty_ID , IDFaculty );
                   
                   Faculty.all_faculty_ID[index] = -1;
                   System.out.println("The deletion process was completed successfully");
               }

               }
            
               return "The deletion process was completed successfully"; 
    }
   
    
    private static void addManager(int IDManager ){
         all_Manager_ID[0] = 1234;
         all_Manager_ID[0] = 1256;
         all_Manager_ID[i]= IDManager ;
         i++;
  
  }

    public static int[] getAll_Manager_ID() {
        return all_Manager_ID;
    }
   
    
    
    
}

