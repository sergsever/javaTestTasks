package com.lvov;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void reverseArray(int[] array){
        for(int i = 0, j = array.length - 1; i < j; ++i, --j )
        {
            int buff = array[j];
            array[j] = array[i];
            array[i] = buff;
        }
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
        
    }
}
