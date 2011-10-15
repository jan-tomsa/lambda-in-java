package com.tomsovi;

import java.util.List;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class IntegerTest extends TestCase {

    private SelectableList sl;

     /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public IntegerTest( String testName ) {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite( IntegerTest.class );
    }

    @Override
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
    
    /** 
     * Test less than n selector as static class
     */
    public void testLessThan100ShouldReturn6Items() {
        List<Integer> reducedList = sl.selectLessThan(100);
        int size = reducedList.size();
        assertEquals(6, size);
    }
    
    /** 
     * Test selector as anonymous class
     */
    public void testAnonymousSelectorShouldSelectAll9() {
        Selector<Integer> allSelector = new Selector<Integer>() {
            public boolean evaluate(Integer n) {
                return true;
            }
        };
        List<Integer> reducedList = sl.select(allSelector);
        int size = reducedList.size();
        assertEquals(9, size);
    }
    
    /** 
     * Test selector as anonymous class
     */
    public void testAnonymousSelectorGreaterThan100ShouldSelect2() {
        Selector<Integer> greaterThan100Selector = new Selector<Integer>() {
            public boolean evaluate(Integer n) {
                return n > 100;
            }
        };
        List<Integer> reducedList = sl.select(greaterThan100Selector);
        int size = reducedList.size();
        assertEquals(2, size);
    }
    
    /** 
     * Test selector as anonymous class - concise syntax
     */
    public void testAnonymousSelectorGreaterThan100ShouldSelect2Concise() {
        List<Integer> reducedList = sl.select( new Selector<Integer>() {
                                                    public boolean evaluate(Integer n) {
                                                        return n > 100;
                                                    }
                                                });
        int size = reducedList.size();
        assertEquals(2, size);
    }

    /** 
     * Test selector as anonymous class - more concise syntax
     */
    public void testAnonymousSelectorLessThan10ShouldSelect3MoreConcise() {
        int size = sl.select( new Selector<Integer>() {
                                    public boolean evaluate(Integer n) {
                                        return n < 10;
                                    }
                                }).size();
        assertEquals(3, size);
    }
}
