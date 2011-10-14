package com.tomsovi;

import java.util.List;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

    private SelectableList sl;

     /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName ) {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite( AppTest.class );
    }

    public void setUp() {
        sl = new SelectableList();
        sl.add(1);
        sl.add(2);
        sl.add(3);
        sl.add(10);
        sl.add(20);
        sl.add(30);
        sl.add(100);
        sl.add(200);
        sl.add(1000);
    }
    
    public void testSizeIs9() {
        int size = sl.size();
        assertEquals(9, size);
    }
    
    public void testLessThan100ShouldReturn6Items() {
        List<Integer> reducedList = sl.selectLessThan(100);
        int size = reducedList.size();
        assertEquals(6, size);
    }
}
