package com.tomsovi;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SelectableList sl = new SelectableList();
        sl.add(1);
        sl.add(2);
        sl.add(3);
        sl.add(10);
        sl.add(20);
        sl.add(30);
        sl.add(100);
        sl.add(200);
        sl.add(1000);
        System.out.println( "The list has " + sl.size() + " items." );
    }
}
