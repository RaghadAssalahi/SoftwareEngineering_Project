/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
 * 
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
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of deleteFaculity method, of class Manager.
     */
    
    
    //Test of deleteFaculity method for successful deletion.
    @Test
    public void testDeleteFaculity_successfully() {
        System.out.println("deleteFaculity");
        int IDManager = 1234;
        int IDFaculty = 7756;
        String expResult = "The deletion process was completed successfully";
        String result = Manager.deleteFaculity(IDManager, IDFaculty);
        assertEquals(expResult, result);
        
    }

    
    
    // Test of deleteFaculity method when manager does not have authorization.
     public void testDeleteFaculity_authorization_M() {
        System.out.println("deleteFaculity");
        int IDManager = 4567;
        int IDFaculty = 7756;
        String expResult = "You don't have authorization to delete faculty";
        String result = Manager.deleteFaculity(IDManager, IDFaculty);
        assertEquals(expResult, result);
        
    }
     //Test of deleteFaculity method when faculty ID is not found.
      public void testDeleteFaculity_authorization_F() {
        System.out.println("deleteFaculity");
        int IDManager = 1234;
        int IDFaculty = 5467;
        String expResult = "There is no Instructor with this ID";
        String result = Manager.deleteFaculity(IDManager, IDFaculty);
        assertEquals(expResult, result);
        
    }
      // Test of deleteFaculity method when both manager and faculty IDs are not valid.
      public void testDeleteFaculity_authorization() {
        System.out.println("deleteFaculity");
        int IDManager = 9087;
        int IDFaculty = 5467;
        String expResult = "You don't have authorization to delete faculty";
        String result = Manager.deleteFaculity(IDManager, IDFaculty);
        assertEquals(expResult, result);
        
    }

    
}
