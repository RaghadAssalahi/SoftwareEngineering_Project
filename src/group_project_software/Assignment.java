/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group_project_software;

import java.time.LocalDate;


/**
 *
 * @author LAYAN
 */
public class Assignment {
    // Attributes of the Assignment class
    private String details; // Details of the assignment
    private LocalDate submissiondate; // Submission date of the assignment
    private String Title; // Title of the assignment

    public Assignment(String Title,String details, LocalDate deadlineDate) {
        this.submissiondate = deadlineDate;
        this.details = details;
        this.Title = Title;
    }
    
    //Getter method for the details of the assignment.
    public String getDetails() {
        return details;
    }

    //Getter method for the submission date of the assignment.
    public LocalDate Getsubmissiondate() {
        return submissiondate;
    }
    //Getter method for the title of the assignment.
    public String getTitle() {
        return Title;
    }
    
    
}

