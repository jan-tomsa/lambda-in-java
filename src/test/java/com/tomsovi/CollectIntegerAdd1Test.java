package com.tomsovi;

import java.util.List;
import junit.framework.TestCase;

/**
 *
 * @author P3400177
 */
public class CollectIntegerAdd1Test extends TestCase {

    private SelectableList<Integer> sl;
    private List<Object> selectionResult;
    
    public CollectIntegerAdd1Test(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        sl = new SelectableList<Integer>();
        sl.add(1);
        sl.add(2);
        sl.add(3);
        sl.add(10);
        sl.add(20);
        sl.add(30);
        sl.add(100);
        sl.add(200);
        sl.add(1000);
        selectionResult = sl.collect(new Collector<Integer>() {
                                            public Object evaluate(Integer n) {
                                                return n+1;
                                            }
                                        });
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testEqualSize() {
        assertEquals(sl.size(), selectionResult.size());
    }
    
    public void testAdd1() {
        for (int i=0; i<=sl.size()-1; i++) {
            System.out.println("original: " + sl.get(i) + ", modified: " + selectionResult.get(i));
            assertEquals(sl.get(i)+1,selectionResult.get(i));
        }
    }
}
