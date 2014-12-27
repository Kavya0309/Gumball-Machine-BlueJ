

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class GumballMachineTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class GumballMachineTest
{
    /**
     * Default constructor for test class GumballMachineTest
     */
    public GumballMachineTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void insertInsufficientMoneyAndTurnCrank()
    {
        GumballMachine gumballM4 = new GumballMachine(5);
        gumballM4.insertQuarter();
        gumballM4.insertDime();
        gumballM4.turnCrank();
        assertEquals(false, gumballM4.isGumballInSlot());
    }

    @Test
    public void returningChange()
    {
        GumballMachine gumballM1 = new GumballMachine(5);
        gumballM1.insertQuarter();
        gumballM1.insertQuarter();
        gumballM1.insertNickel();
        gumballM1.turnCrank();
    }

    @Test
    public void TurningCrankWithoutTakingGumBall()
    {
        GumballMachine gumballM1 = new GumballMachine(5);
        gumballM1.insertQuarter();
        gumballM1.insertQuarter();
        assertEquals(false, gumballM1.isGumballInSlot());
        gumballM1.turnCrank();
        assertEquals(true, gumballM1.isGumballInSlot());
        gumballM1.turnCrank();
        gumballM1.insertQuarter();
        gumballM1.insertQuarter();
        gumballM1.turnCrank();
        gumballM1.takeGumballFromSlot();
        assertEquals(false, gumballM1.isGumballInSlot());
    }

    @Test
    public void Test1()
    {
        GumballMachine gumballM1 = new GumballMachine(5);
        gumballM1.insertQuarter();
        gumballM1.turnCrank();
        assertEquals(false, gumballM1.isGumballInSlot());
        gumballM1.turnCrank();
        gumballM1.insertQuarter();
        gumballM1.turnCrank();
        gumballM1.takeGumballFromSlot();
        assertEquals(false, gumballM1.isGumballInSlot());
    }

    @Test
    public void Test()
    {
        GumballMachine gumballM1 = new GumballMachine(5);
        gumballM1.insertQuarter();
        gumballM1.insertNickel();
        gumballM1.insertDime();
        gumballM1.insertQuarter();
        gumballM1.insertQuarter();
        gumballM1.turnCrank();
        gumballM1.insertQuarter();
        gumballM1.insertQuarter();
        gumballM1.takeGumballFromSlot();
        gumballM1.turnCrank();
        assertEquals(true, gumballM1.isGumballInSlot());
    }
    
    
    @Test
    public void GiveChange()
    {
        GumballMachine gumballM1 = new GumballMachine(5);
        gumballM1.insertQuarter();
        gumballM1.insertNickel();
        gumballM1.insertQuarter();
        gumballM1.insertDime();
        gumballM1.turnCrank();
        assertEquals(true, gumballM1.isGumballInSlot());
        gumballM1.takeGumballFromSlot();
        assertEquals(false, gumballM1.isGumballInSlot());
    }

    @Test
    public void GumballsInSlot()
    {
        GumballMachine gumballM1 = new GumballMachine(4);
        gumballM1.insertQuarter();
        gumballM1.insertDime();
        gumballM1.insertNickel();
        gumballM1.insertNickel();
        gumballM1.insertNickel();
        gumballM1.turnCrank();
        assertEquals(true, gumballM1.isGumballInSlot());
        gumballM1.takeGumballFromSlot();
        assertEquals(false, gumballM1.isGumballInSlot());
        assertEquals(3, gumballM1.getCount());
    } 
    
     
    

    @Test
    public void LessMoney()
    {
        GumballMachine gumballM1 = new GumballMachine(3);
        gumballM1.insertQuarter();
        gumballM1.insertNickel();
        gumballM1.turnCrank();
        assertEquals(false, gumballM1.isGumballInSlot());
        gumballM1.takeGumballFromSlot();
        gumballM1.turnCrank();
        gumballM1.insertQuarter();
        gumballM1.turnCrank();
        assertEquals(true, gumballM1.isGumballInSlot());
    }

    @Test
    public void MoreGumballsInSlot()
    {
        GumballMachine gumballM1 = new GumballMachine(3);
        gumballM1.insertQuarter();
        gumballM1.insertQuarter();
        gumballM1.turnCrank();
        assertEquals(true, gumballM1.isGumballInSlot());
        gumballM1.insertQuarter();
        gumballM1.insertNickel();
        gumballM1.insertDime();
        gumballM1.insertQuarter();
        gumballM1.turnCrank();
        assertEquals(true, gumballM1.isGumballInSlot());
        assertEquals(1, gumballM1.getCount());
        gumballM1.takeGumballFromSlot();
        assertEquals(false, gumballM1.isGumballInSlot());
    }

    @Test
    public void SoldOut()
    {
        GumballMachine gumballM1 = new GumballMachine(1);
        gumballM1.insertQuarter();
        gumballM1.insertQuarter();
        gumballM1.turnCrank();
        assertEquals(true, gumballM1.isGumballInSlot());  
        assertEquals(0, gumballM1.getCount());
        gumballM1.insertQuarter();
        gumballM1.takeGumballFromSlot();
        assertEquals(false, gumballM1.isGumballInSlot());
        gumballM1.takeGumballFromSlot();
    }
    
    
    
    
    @Test
    public void test50Cents()
    {
        GumballMachine gumballM1 = new GumballMachine(5);
        gumballM1.insertQuarter();
        gumballM1.insertQuarter();
        gumballM1.turnCrank();
        gumballM1.takeGumballFromSlot();
    }

    @Test
    public void testToCollectChange()
    {
        GumballMachine gumballM1 = new GumballMachine(3);
        gumballM1.insertNickel();
        gumballM1.insertQuarter();
        gumballM1.insertDime();
        gumballM1.insertQuarter();
        gumballM1.turnCrank();
        gumballM1.takeGumballFromSlot();
    }

    @Test
    public void testFor30Cents()
    {
        GumballMachine gumballM1 = new GumballMachine(2);
        gumballM1.insertQuarter();
        gumballM1.insertNickel();
        gumballM1.turnCrank();
        assertEquals(false, gumballM1.isGumballInSlot());
    }

    @Test
    public void TestForMoreThan1$()
    {
        GumballMachine gumballM1 = new GumballMachine(3);
        gumballM1.insertQuarter();
        gumballM1.insertQuarter();
        gumballM1.insertQuarter();
        gumballM1.insertQuarter();
        gumballM1.insertDime();
        gumballM1.turnCrank();
        gumballM1.turnCrank();
        gumballM1.takeGumballFromSlot();
    }

    @Test
    public void testFor100Cents()
    {
        GumballMachine gumballM1 = new GumballMachine(5);
        gumballM1.insertQuarter();
        gumballM1.insertQuarter();
        gumballM1.insertQuarter();
        gumballM1.insertQuarter();
        gumballM1.turnCrank();
        assertEquals(true, gumballM1.isGumballInSlot());
        gumballM1.turnCrank();
        assertEquals(true, gumballM1.isGumballInSlot());
        gumballM1.takeGumballFromSlot();
        assertEquals(false, gumballM1.isGumballInSlot());
    }

    @Test
    public void testNoGumballsInMachine()
    {
        GumballMachine gumballM1 = new GumballMachine(1);
        gumballM1.insertQuarter();
        gumballM1.insertQuarter();
        gumballM1.turnCrank();
        assertEquals(true, gumballM1.isGumballInSlot());
        gumballM1.takeGumballFromSlot();
        gumballM1.insertQuarter();
        gumballM1.insertQuarter();
        gumballM1.turnCrank();
    }
}



    





