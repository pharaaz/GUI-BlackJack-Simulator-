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
public class DeckTest {
    
    public DeckTest() {
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
     * Test of fullDeck method, of class Deck.
     */
    @Test
    public void testFullDeck() {
        System.out.println("fullDeck");
        Deck instance = new Deck();
        instance.fullDeck();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeCard method, of class Deck.
     */
    @Test
    public void testRemoveCard() {
        System.out.println("removeCard");
        int pick = 0;
        Deck instance = new Deck();
        instance.removeCard(pick);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCard method, of class Deck.
     */
    @Test
    public void testGetCard() {
        System.out.println("getCard");
        int pick = 0;
        Deck instance = new Deck();
        Cards expResult = null;
        Cards result = instance.getCard(pick);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCardName method, of class Deck.
     */
    @Test
    public void testGetCardName() {
        System.out.println("getCardName");
        int pick = 0;
        Deck instance = new Deck();
        String expResult = "";
        String result = instance.getCardName(pick);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCrad method, of class Deck.
     */
    @Test
    public void testAddCrad() {
        System.out.println("addCrad");
        Cards newCard = null;
        Deck instance = new Deck();
        instance.addCrad(newCard);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pick method, of class Deck.
     */
    @Test
    public void testPick() {
        System.out.println("pick");
        Deck from = null;
        Deck instance = new Deck();
        instance.pick(from);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sum method, of class Deck.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        Deck instance = new Deck();
        int expResult = 0;
        int result = instance.sum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class Deck.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Deck instance = new Deck();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnC method, of class Deck.
     */
    @Test
    public void testReturnC() {
        System.out.println("returnC");
        Deck cc = null;
        Deck instance = new Deck();
        instance.returnC(cc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cardArt method, of class Deck.
     */
    @Test
    public void testCardArt() {
        System.out.println("cardArt");
        Deck instance = new Deck();
        instance.cardArt();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Deck.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Deck instance = new Deck();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
