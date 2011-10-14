/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
}
