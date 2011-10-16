package com.tomsovi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author P3400177
 */
public class SelectableList<T> implements Iterable<T> {
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
    
    public T get(int index) {
        return list.get(index);
    }
    
    public List<T> select( Selector<T> selector ) {
        List<T> result = new ArrayList<T>();
        for (T i : list) {
            if (selector.evaluate(i) ) 
                result.add(i);
        }
        return result;
     }
    
    public List<Object> collect( Collector<T> collector ) {
        List<Object> result = new ArrayList<Object>();
        for (T i : list) {
            result.add( ((Collector<T>)collector).evaluate(i) );
        }
        return result;
    }

    public Iterator<T> iterator() {
        return list.iterator();
    }
}
