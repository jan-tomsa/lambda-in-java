package com.tomsovi;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author P3400177
 */
public class SelectableList {
    private List<Integer> list;
    
    public SelectableList() {
        list = new ArrayList<Integer>();
    }
    
    public void add(Integer i) {
        list.add(i);
    }
    
    public int size() {
        return list.size();
    }
    
    public List<Integer> selectLessThan(Integer n) {
        List result = new ArrayList<Integer>();
        for (Integer i : list) {
            if (i<n) 
                result.add(i);
        }
        return result;
    }
}
