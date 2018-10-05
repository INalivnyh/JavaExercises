package hw3.lesson.Collections.src;

import java.util.*;

public class OrderAndPosition
{
    public static <T> void dumpArray(T[] array)
    {
        System.out.println("=============");
        for (int i=0; i<array.length; i++)
            System.out.println("Position " + i + ": " + array[i]);
    }
    public static <T> void dumpList(List<T> list)
    {
        System.out.println("=============");
        for (int i=0; i<list.size(); i++)
            System.out.println("Ordinal " + i + ": " + list.get(i));
    }
    
    public static void main(String[] args)
    {
        List<String> argList = new ArrayList<String>(Arrays.asList(args));

//        dumpArray(args);
//        args[1] = null;
//        dumpArray(args);
        
//        dumpList(argList);
//        argList.remove(1);
//        dumpList(argList);
    }
}