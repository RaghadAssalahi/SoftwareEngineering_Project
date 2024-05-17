/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package group_project_software;

import java.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yarahalghamdi
 */
public class AssignmentTest {
    
     private Assignment assignment;
    public AssignmentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         // Initialize the Assignment object with sample data before each test
        assignment = new Assignment("Sample Assignment", "This is a sample assignment.", LocalDate.of(2024, 5, 20));
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDetails method, of class Assignment.
     * This test checks if the getDetails method returns the correct details.
     */
    @Test
    public void testGetDetails() {
       System.out.println("getDetails");
        String expResult = "This is a sample assignment.";
        String result = assignment.getDetails();
        assertEquals(expResult, result);
    }

    /**
     * Test of GetSubmissiondate method, of class Assignment.
     * This test checks if the getSubmissiondate method returns the correct submission date.
    */
    @Test
    public void testGetsubmissiondate() {
        System.out.println("getSubmissiondate");
        LocalDate expResult = LocalDate.of(2024, 5, 20);
        LocalDate result = assignment.Getsubmissiondate();
        assertEquals(expResult, result);
    }

    /**
     *Test of getTitle method, of class Assignment.
     * This test checks if the getTitle method returns the correct title.
     *
     */
    
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        String expResult = "Sample Assignment";
        String result = assignment.getTitle();
        assertEquals(expResult, result);
    }
    
}
