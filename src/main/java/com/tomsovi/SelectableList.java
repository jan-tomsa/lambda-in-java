package com.tomsovi;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author P3400177
 */
public class SelectableList<T> {
    private List<T> list;
    
    public SelectableList() {
        list = new ArrayList<T>();
    }
    
    public void add(T i) {
        list.add(i);
    }
    
    public void addAll(List<T> list) {
        for (T i : list)
            list.add(i);
    }
    
    public int size() {
        return list.size();
    }
    
    public List<T> select( Selector<T> selector ) {
        List result = new ArrayList<T>();
        for (T i : list) {
            if (selector.evaluate(i) ) 
                result.add(i);
        }
        return result;
     }
}
