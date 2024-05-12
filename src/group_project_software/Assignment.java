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
    private String details;
    private LocalDate deadlineDate;
    private String Title;

    public Assignment(String Title,String details, LocalDate deadlineDate) {
        this.deadlineDate = deadlineDate;
        this.details = details;
        this.Title = Title;
    }

    public String getDetails() {
        return details;
    }


    public LocalDate getDeadlineDate() {
        return deadlineDate;
    }

    public String getTitle() {
        return Title;
    }
    
    
}

