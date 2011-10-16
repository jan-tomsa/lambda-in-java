package com.tomsovi;

import java.util.List;

/**
 * Excercise some tricks with SelectableList
 *
 */
public class App 
{
    SelectableList<Integer> list = new SelectableList<Integer>();

    private void execute(final Integer limit) {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(100);
        list.add(200);
        list.add(1000);
        List<Integer> newList = list.select(new Selector<Integer>() {
                                            public boolean evaluate(Integer n) {
                                                return n > limit;
                                            }
                                        });
        System.out.println( "The list has " + list.size() + " items." );
        System.out.println( "The sublist (> "+limit+") has " + newList.size() + " items." );
    }
    
    public static void main( String[] args )
    {
        App app = new App();
        System.out.println("args.length: " + args.length);
        if (args.length>0) {
            app.execute(Integer.parseInt(args[0]));
        } else {
            app.execute(10);
        }
    }
}
