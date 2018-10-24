/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitalism.metier;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Damien
 */
public class CaseEmplacementTest {
    
    public CaseEmplacementTest() {
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
     * Test of getType method, of class CaseEmplacement.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        CaseEmplacement instance = null;
        TypeCase expResult = null;
        TypeCase result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsine method, of class CaseEmplacement.
     */
    @Test
    public void testGetUsine() {
        System.out.println("getUsine");
        CaseEmplacement instance = null;
        Usine expResult = null;
        Usine result = instance.getUsine();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsine method, of class CaseEmplacement.
     */
    @Test
    public void testSetUsine() {
        System.out.println("setUsine");
        Usine usine = null;
        CaseEmplacement instance = null;
        instance.setUsine(usine);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estOccupe method, of class CaseEmplacement.
     */
    @Test
    public void testEstOccupe() {
        System.out.println("estOccupe");
        CaseEmplacement instance = new CaseEmplacement(0,0,null);
        boolean expResultFaux = false;
        boolean result = instance.estOccupe();
        assertEquals(expResultFaux, result);
        boolean expResultVrai = true;
        instance.setUsine(new UsineProduit(null,null));
    }
    
}
