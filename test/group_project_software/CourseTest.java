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
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author yarahalghamdi
 */
public class CourseTest {
    
    private Course course;
    private Student student;
    private Assignment assignment;
    
    
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
        // Set up resources before each test
        
        course = new Course("java", "CSE101", 30);
        List<String> courses = new ArrayList<>();
        courses.add("CSE101");
        courses.add("MAT101");
        courses.add("PHY101");
        course.setCourses(courses);
        
        course = new Course("java", "CSE101", 2);
        course.setCourses(List.of("CSE101", "MAT101", "PHY101"));
        course.setCourses(Arrays.asList("CSE101", "MAT101", "PHY101"));
        student = new Student("John Doe");
        assignment = new Assignment("Assignment 1", "Details of Assignment 1", java.time.LocalDate.now());
   
    }

    
    @After
    public void tearDown() {
    }

    

    /**
     * Test of subscribeStudent method, of class Course.
     */
    //Test of subscribeStudent method for adding a new student.
     @Test
    public void testSubscribeStudentNew() {
        System.out.println("subscribeStudentNew");
        String studentID = "student1";
        String courseID = "CSE101";
        Course instance = course;
        instance.subscribeStudent(studentID, courseID);
        int expResult = 1;
        int result = instance.getSubscribedCount();
        assertEquals(expResult, result);
    }
// Test of subscribeStudent method for adding a duplicate student.
    @Test
    public void testSubscribeStudentDuplicate() {
        System.out.println("subscribeStudentDuplicate");
        String studentID = "student1";
        String courseID = "CSE101";
        Course instance = course;
        instance.subscribeStudent(studentID, courseID);
        instance.subscribeStudent(studentID, courseID);
        int expResult = 1;
        int result = instance.getSubscribedCount();
        assertEquals(expResult, result);
    }
//Test of subscribeStudent method when the course is full.
    @Test
    public void testSubscribeStudentFull() {
        System.out.println("subscribeStudentFull");
        String studentID1 = "student1";
        String studentID2 = "student2";
        String studentID3 = "student3";
        String courseID = "CSE101";
        Course instance = course;
        instance.subscribeStudent(studentID1, courseID);
        instance.subscribeStudent(studentID2, courseID);
        instance.subscribeStudent(studentID3, courseID);
        int expResult = 2;
        int result = instance.getSubscribedCount();
        assertEquals(expResult, result);
    }
//Test of subscribeStudent method for a non-existent course.
    @Test
    public void testSubscribeStudentNonExistentCourse() {
        System.out.println("subscribeStudentNonExistentCourse");
        String studentID = "student1";
        String courseID = "NON_EXISTENT";
        Course instance = course;
        instance.subscribeStudent(studentID, courseID);
        int expResult = 0;
        int result = instance.getSubscribedCount();
        assertEquals(expResult, result);
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

        // Add the assignment to the course
        course.addAssignment(assignment);

        // Expected result: the assignments list should contain the added assignment
        ArrayList<Assignment> expectedAssignments = new ArrayList<>();
        expectedAssignments.add(assignment);

        // Assert the assignments list contains the added assignment
        assertEquals(expectedAssignments, course.getAssignments());
    }

    /**
     * Test of submitAssignment method, of class Course.
     */
    @Test
    public void testSubmitAssignmentSuccessful() {
        System.out.println("submitAssignmentSuccessful");

        // Capture the console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Call the method
        course.submitAssignment(student, assignment, "submit");

        // Restore the original System.out
        System.setOut(originalOut);

        // Expected and actual output
        String expectedOutput = "John Doe submitted assignment: Assignment 1\n";
        String actualOutput = outputStream.toString();

        // Assert the output
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testSubmitAssignmentFailed() {
        System.out.println("submitAssignmentFailed");

        // Capture the console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Call the method
        course.submitAssignment(student, assignment, "not submit");

        // Restore the original System.out
        System.setOut(originalOut);

        // Expected and actual output
        String expectedOutput = "Please re-submit\n";
        String actualOutput = outputStream.toString();

        // Assert the output
        assertEquals(expectedOutput, actualOutput);
    }
    
    
    
    /**
     * Test of FindStudent method, of class Course.
     */
    @Test
    public void testFindStudent() throws Exception {
        System.out.println("findStudent");
        
        // Access the private method using reflection
        Method method = Course.class.getDeclaredMethod("findStudent", String.class);
        method.setAccessible(true);
        
        // Test case 1: Student is not in the list
        String studentID = "student1";
        boolean expResult = false;
        boolean result = (boolean) method.invoke(course, studentID);
        assertEquals(expResult, result);
        
        // Test case 2: Add a student and find it
        course.subscribeStudent(studentID, "CSE101");
        expResult = true;
        result = (boolean) method.invoke(course, studentID);
        assertEquals(expResult, result);
        
        // Test case 3: Another student who is not in the list
        String newStudentID = "student2";
        expResult = false;
        result = (boolean) method.invoke(course, newStudentID);
        assertEquals(expResult, result);
        
        // Test case 4: Add the new student and find it
        course.subscribeStudent(newStudentID, "CSE101");
        expResult = true;
        result = (boolean) method.invoke(course, newStudentID);
        assertEquals(expResult, result);
    }

   

   

    /**
     * Test of setCourses method, of class Course.
     */
    @Test
    public void testSetCourses() {
        System.out.println("setCourses");
        List<String> newCourses = Arrays.asList("CSE102", "MAT102", "PHY102");
        course.setCourses(newCourses);
        assertEquals(newCourses, course.getCourses());
    }


   

    /**
     * Test of getAssignments method, of class Course.
     */
   @Test
    public void testGetAssignments() {
        System.out.println("getAssignments");
        
        // Add the assignment to the course
        course.addAssignment(assignment);
        
        // Expected result: the assignments list should contain the added assignment
        ArrayList<Assignment> expectedAssignments = new ArrayList<>();
        expectedAssignments.add(assignment);

        // Assert the assignments list contains the added assignment
        assertEquals(expectedAssignments, course.getAssignments());
    }
    
    
    
}
