package com.tomsovi;

import java.util.List;

/**
 * Excercise some tricks with SelectableList
 *
 */
public class App 
{
    SelectableList<Integer> list = new SelectableList<Integer>();

    public App() {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(100);
        list.add(200);
        list.add(1000);
    }
    
    private void execute(final Integer limit, final Integer multiplier) {
        System.out.println( "The list has " + list.size() + " items." );
        exerciseSelect( limit );
        exerciseCollect( multiplier );
    }

    private void exerciseSelect(final Integer limit) {
        List<Integer> filteredList = list.select(new Selector<Integer>() {
                                            public boolean evaluate(Integer n) {
                                                return n > limit;
                                            }
                                        });
        System.out.println( "The filtered list (> "+limit+") has " + filteredList.size() + " items." );
    }
    
    private void exerciseCollect(final Integer multiplier) {
        System.out.println("Original list: "+listToString(list));
        List<Object> collectedList = list.collect(new Collector<Integer>() {
                                                        public Object evaluate(Integer n) {
                                                            return n * multiplier;
                                                        }
                                                    });
        System.out.println("Multiplied list: "+listToString(collectedList));
    }

    private String listToString( Iterable l ) {
        String result = "[";
        for (Object i : l ) {
            result += i.toString()+",";
        }
        return result.substring(0, result.length()-1) + "]";
    }
    
    public static void main( String[] args )
    {
        App app = new App();
        Integer limit = 10;
        Integer multiplier = 5;
        
        System.out.println("args.length: " + args.length);
        if (args.length>0) {
            limit = Integer.parseInt(args[0]);
            if (args.length>1)
                multiplier = Integer.parseInt(args[1]);
        }
        app.execute(limit,multiplier);
    }
}
