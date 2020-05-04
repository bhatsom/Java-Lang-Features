package com.somnath.apps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        List<Integer> myIntList = Arrays.asList(1, 2, 3, 4, 5);
        myIntList.forEach(i -> System.out.println(i));

    }

    private class ImmutableShoppingList {

        private final List<String> list;

        public ImmutableShoppingList(String[] list){
            this.list = Collections.unmodifiableList(Arrays.asList(list));
        }

        public String[] getList(){
            return (String[]) list.toArray();
        }
    }
}
