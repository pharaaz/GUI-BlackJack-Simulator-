/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newassignment;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Owner
 */
public class DealerTest {
    
    public DealerTest() {
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
     * Test of toString method, of class Dealer.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Dealer instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hit method, of class Dealer.
     */
    @Test
    public void testHit() {
        System.out.println("hit");
        Dealer instance = null;
        int expResult = 0;
        int result = instance.hit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of value method, of class Dealer.
     */
    @Test
    public void testValue() {
        System.out.println("value");
        Dealer instance = null;
        int expResult = 0;
        int result = instance.value();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of posBlackJack method, of class Dealer.
     */
    @Test
    public void testPosBlackJack() {
        System.out.println("posBlackJack");
        Dealer instance = null;
        int expResult = 0;
        int result = instance.posBlackJack();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnCards method, of class Dealer.
     */
    @Test
    public void testReturnCards() {
        System.out.println("returnCards");
        Deck currentDeck = null;
        Dealer instance = null;
        instance.returnCards(currentDeck);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of faceCardValue method, of class Dealer.
     */
    @Test
    public void testFaceCardValue() {
        System.out.println("faceCardValue");
        Dealer instance = null;
        int expResult = 0;
        int result = instance.faceCardValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
