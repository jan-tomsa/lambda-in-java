package com.tomsovi;

/**
 * Collects objects from SelectableList and converts them to arbitrary values 
 * (of arbitrary types - needs casting)
 * @author P3400177
 */
public interface Collector<T> {
    public Object evaluate(T n);
}
