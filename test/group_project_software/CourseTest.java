/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package group_project_software;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author yarahalghamdi
 */
public class CourseTest {
    
     private Course course;
     
    public CourseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        course = new Course("java", "CSE101", 30);
        List<String> courses = new ArrayList<>();
        courses.add("CSE101");
        courses.add("MAT101");
        courses.add("PHY101");
        course.setCourses(courses);
    }

    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCourseName method, of class Course.
     */
    @Test
    public void testGetCourseName() {
        System.out.println("getCourseName");
        Course instance = null;
        String expResult = "";
        String result = instance.getCourseName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subscribeStudent method, of class Course.
     */
    @Test
    public void testSubscribeStudent() {
        System.out.println("subscribeStudent");
        String studentID = "";
        String courseid = "";
        Course instance = null;
        instance.subscribeStudent(studentID, courseid);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchCourse method, of class Course.
     */
    @Test
    public void testSearchCourse() {
        // Simulate user input
        String simulatedInput = "CSE101\nMAT101\nexit\n";
        InputStream in = new ByteArrayInputStream(simulatedInput.getBytes());
        Scanner scanner = new Scanner(in);

        // Call the searchCourse method
        course.searchCourse(scanner);
        
        // If no exceptions are thrown, the test is considered passed
        assertTrue(true);
    }
    
    
    
    /**
     * Test of addAssignment method, of class Course.
     */
    @Test
    public void testAddAssignment() {
        System.out.println("addAssignment");
        Assignment assignment = null;
        Course instance = null;
        instance.addAssignment(assignment);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of submitAssignment method, of class Course.
     */
    @Test
    public void testSubmitAssignment() {
        System.out.println("submitAssignment");
        Student student = null;
        Assignment assignment = null;
        String submission = "";
        Course instance = null;
        instance.submitAssignment(student, assignment, submission);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
