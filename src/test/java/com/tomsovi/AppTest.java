package com.tomsovi;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        SelectableList sl = new SelectableList();
        sl.add(1);
        sl.add(2);
        sl.add(3);
        sl.add(10);
        sl.add(20);
        sl.add(30);
        sl.add(100);
        sl.add(200);
        sl.add(1000);
        int size = sl.size();
        assertEquals(9, size);
    }
}
