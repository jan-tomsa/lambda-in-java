package com.tomsovi;

import java.util.List;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class SelectIntegerTest extends TestCase {

    private SelectableList<Integer> list;

     /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SelectIntegerTest( String testName ) {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite( SelectIntegerTest.class );
    }

    @Override
    public void setUp() {
        list = new SelectableList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(100);
        list.add(200);
        list.add(1000);
    }
    
    public void testSizeIs9() {
        int size = list.size();
        assertEquals(9, size);
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
        List<Integer> reducedList = list.select(allSelector);
        int listSize = list.size();
        int reducedListSize = reducedList.size();
        assertEquals(listSize, reducedListSize);
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
        List<Integer> reducedList = list.select(greaterThan100Selector);
        int size = reducedList.size();
        assertEquals(2, size);
    }
    
    /** 
     * Test selector as anonymous class - concise syntax
     */
    public void testAnonymousSelectorGreaterThan100ShouldSelect2_Concise() {
        List<Integer> reducedList = list.select( new Selector<Integer>() {
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
    public void testAnonymousSelectorLessThan10ShouldSelect3_MoreConcise() {
        int size = list.select( new Selector<Integer>() {
                                    public boolean evaluate(Integer n) {
                                        return n < 10;
                                    }
                                }).size();
        assertEquals(3, size);
    }
}
