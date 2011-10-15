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
public class StringTest extends TestCase {
    private List<String> list;
    public StringTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        list = Arrays.asList("A", "B", "C", "Hello", "World", "Do", "You", "Like", "Java", "?");        
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
    public void testHello() {
        ;
    }
    
}
