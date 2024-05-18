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
public class ManagerTest {
    
    public ManagerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
       // Reset static variables before each test
        Manager.i = 0;
        for (int j = 0; j < Manager.getAll_Manager_ID().length; j++) {
            Manager.getAll_Manager_ID()[j] = 0;
        }
        Faculty.count = 0;
        for (int j = 0; j < Faculty.getAll_faculty_ID().length; j++) {
            Faculty.getAll_faculty_ID()[j] = 0;
        }
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of deleteFaculity method, of class Manager.
     */
    @Test
    public void testDeleteFaculity() {
        Manager manager = new Manager("John", 1);
        Faculty faculty = new Faculty("Doe", 2);

        String result = Manager.deleteFaculity(1, 2);

        assertEquals("The deletion process was completed successfully", result);
        assertEquals(-1, Faculty.getAll_faculty_ID()[0]);
    }
    
    

    /**
     * Test of getAll_Manager_ID method, of class Manager.
     */
     @Test
    public void testGetAll_Manager_ID() {
        System.out.println("getAll_Manager_ID");

        // Setup
        Manager manager1 = new Manager("John", 1);
        Manager manager2 = new Manager("Jane", 2);

        // Action
        int[] result = Manager.getAll_Manager_ID();

        // Verify
        int[] expected = new int[100];
        expected[0] = 1;
        expected[1] = 2;
        assertArrayEquals(expected, result);
    }
    
}
