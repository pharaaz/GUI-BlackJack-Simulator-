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
public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of toString method, of class Player.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Player instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMoney method, of class Player.
     */
    @Test
    public void testSetMoney() {
        System.out.println("setMoney");
        float money = 0.0F;
        Player instance = null;
        instance.setMoney(money);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMoney method, of class Player.
     */
    @Test
    public void testGetMoney() {
        System.out.println("getMoney");
        Player instance = null;
        float expResult = 0.0F;
        float result = instance.getMoney();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBet method, of class Player.
     */
    @Test
    public void testSetBet() {
        System.out.println("setBet");
        float bet = 0.0F;
        Player instance = null;
        instance.setBet(bet);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBet method, of class Player.
     */
    @Test
    public void testGetBet() {
        System.out.println("getBet");
        Player instance = null;
        float expResult = 0.0F;
        float result = instance.getBet();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of check method, of class Player.
     */
    @Test
    public void testCheck() {
        System.out.println("check");
        Player instance = null;
        int expResult = 0;
        int result = instance.check();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hit method, of class Player.
     */
    @Test
    public void testHit() {
        System.out.println("hit");
        Player instance = null;
        int expResult = 0;
        int result = instance.hit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of posBlackJack method, of class Player.
     */
    @Test
    public void testPosBlackJack() {
        System.out.println("posBlackJack");
        Player instance = null;
        int expResult = 0;
        int result = instance.posBlackJack();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of value method, of class Player.
     */
    @Test
    public void testValue() {
        System.out.println("value");
        Player instance = null;
        int expResult = 0;
        int result = instance.value();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnCards method, of class Player.
     */
    @Test
    public void testReturnCards() {
        System.out.println("returnCards");
        Deck currentDeck = null;
        Player instance = null;
        instance.returnCards(currentDeck);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
