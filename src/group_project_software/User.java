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
   
   private String userFNme;
   private String userLNme;
   private String userID;
   private String userEmail;
   private String userPass;
   private String userSpecilization;

    public User(String userFNme, String userLNme, String userID, String userEmail, String userPass, String userSpecilization) {
        this.userFNme = userFNme;
        this.userLNme = userLNme;
        this.userID = userID;
        this.userEmail = userEmail;
        this.userPass = userPass;
        this.userSpecilization = userSpecilization;
    }

    public String getUserFNme() {
        return userFNme;
    }

    public void setUserFNme(String userFNme) {
        this.userFNme = userFNme;
    }

    public String getUserLNme() {
        return userLNme;
    }

    public void setUserLNme(String userLNme) {
        this.userLNme = userLNme;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getUserSpecilization() {
        return userSpecilization;
    }

    public void setUserSpecilization(String userSpecilization) {
        this.userSpecilization = userSpecilization;
    }
}
