/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tomsovi;

import java.util.Arrays;
import java.util.List;
import junit.framework.TestCase;

/**
 *
 * @author P3400177
 */
public class SelectStringTest extends TestCase {
    private SelectableList<String> list;
    public SelectStringTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        List<String> l = Arrays.asList("A", "B", "C", "Hello", "World", "Do", "You", "Like", "Java", "?");
        list = new SelectableList<String>();
        //list.addAll(l);
        for (String s : l)
            list.add(s);
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
    public void testSelectableListSize() {
        int size = list.size();
        assertEquals(10, size);
    }
    
    public void testSelectByLength() {
        int size =
            list.select( new Selector<String>() {
                            public boolean evaluate(String n) {
                                return n.length() == 1;
                            }
                        } ).size();
        assertEquals(4, size);
    }
    
}
