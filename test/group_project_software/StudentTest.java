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

/**
 *
 * @author yarahalghamdi
 */
public class StudentTest {
    
    public StudentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Student.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Student instance = new Student("John Doe");
        String expResult = "John Doe";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of sendMessage method, of class Student.
     */
    @Test
    public void testSendMessage() {
        
        System.out.println("sendMessage");
        Student sender = new Student("Alice");
        Student receiver = new Student("Bob");
        String messageContent = "Hello Bob!";
        
        // Since the receiveMessage method only prints the message, we can override the println method in the test.
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));
        
        sender.sendMessage(receiver, messageContent);

        String expectedOutput = "Message received by Student Bob: Hello Bob! (from: Alice)\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    /**
     * Test of receiveMessage method, of class Student.
     */
    @Test
    public void testReceiveMessage() {
         System.out.println("receiveMessage");
        Student receiver = new Student("Charlie");
        Message message = new Message("Hello Charlie!", "Alice");
        
        // Since the receiveMessage method only prints the message, we can override the println method in the test.
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        receiver.receiveMessage(message);

        String expectedOutput = "Message received by Student Charlie: Hello Charlie! (from: Alice)\n";
        assertEquals(expectedOutput, outContent.toString());
    }
    
}
