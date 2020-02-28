package com.lvov;

import org.apache.commons.lang.mutable.MutableInt;

/**
 * Hello world!
 *
 */
public class App 
{
    protected static class WrapInt
    {
        private int value;
        public WrapInt(int value)
        {
            this.value = value;
        }
        
        public int getValue(){
            return value;
        }
        
        public void setValue(int value)
        {
            this.value = value;
        }
        
        public void Add(int number){
            value += number;
        }
    }
    
    public static void reverseArray(int[] array) {
        for (int i = 0, j = array.length - 1; i < j; ++i, --j) {
            int buff = array[j];
            array[j] = array[i];
            array[i] = buff;
        }
    }
    
    public static int fibonacci(int n)
        {
            int res = n < 2? 1 : fibonacci(n -2) + fibonacci(n - 1);
        return res;
    }
    
    public static void swapInt(WrapInt a, WrapInt b)
    {
        a.Add(b.getValue());
        b.Add(- a.getValue());
        b.setValue(- b.getValue());
        a.Add(- b.getValue());
        
    }
    
    public static void main( String[] args )
    {
        System.out.println( "test tasks\n" );
        int[] arr = new int[]{1,2,3,4,5};
        reverseArray(arr);
        for(int i = 0; i < arr.length; ++i)
        {
            System.out.println("i: " + i + "v: " + arr[i]);
        }
        
        System.out.println("fibonacci 7:" + fibonacci(7));
        WrapInt a = new WrapInt(5), b = new WrapInt(3);
        swapInt(a, b);
        System.out.println("a: " + a.getValue() + " b: " + b.getValue());
        
    }
}
