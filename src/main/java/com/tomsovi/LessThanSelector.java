package com.tomsovi;

/**
 * Selector of values that are less than constant
 * @author P3400177
 */
public class LessThanSelector implements Selector {
    Integer value;
    
    public LessThanSelector( Integer value ) {
        this.value = value;
    }
    
    public boolean evaluate( Integer n ) {
        return n < value;
    }
}
