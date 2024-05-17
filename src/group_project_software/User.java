/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group_project_software;

/**
 *
 * @author reemajez
 */
public class User {
   
   private String userFNme; // First name of the user
    private String userLNme; // Last name of the user
    private int userID; // ID of the user
    private String userEmail; // Email of the user
    private String userPass; // Password of the user
    private String userSpecilization; // Specialization of the user

    //Constructor to initialize a User object with all attributes.
    public User(String userFNme, String userLNme, int userID, String userEmail, String userPass, String userSpecilization) {
        this.userFNme = userFNme;
        this.userLNme = userLNme;
        this.userID = userID;
        this.userEmail = userEmail;
        this.userPass = userPass;
        this.userSpecilization = userSpecilization;
    }
    //Default constructor for the User class.
    public User(){}
    
    // Constructor to initialize a User object with first name and ID.
    public User(String userFNme ,int userID){
    
        this.userFNme = userFNme;
        this.userID = userID;
    
    
    }
//  Getter for the first name of the user.
    public String getUserFNme() {
        return userFNme;
    }
//Setter for the first name of the user.
    public void setUserFNme(String userFNme) {
        this.userFNme = userFNme;
    }
//Getter for the last name of the user.
    public String getUserLNme() {
        return userLNme;
    }
// Setter for the last name of the user.
    public void setUserLNme(String userLNme) {
        this.userLNme = userLNme;
    }
//Getter for the ID of the user.
    public int getUserID() {
        return userID;
    }
// Getter for the email of the user.
    public void setUserID(int userID) {
        this.userID = userID;
    }
//Setter for the email of the user.
    public String getUserEmail() {
        return userEmail;
    }
//Getter for the password of the user.
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
// Setter for the password of the user.
    public String getUserPass() {
        return userPass;
    }
//Setter for the password of the user.
    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }
//Getter for the specialization of the user.
    public String getUserSpecilization() {
        return userSpecilization;
    }
//Setter for the specialization of the user.
    public void setUserSpecilization(String userSpecilization) {
        this.userSpecilization = userSpecilization;
    }
}
