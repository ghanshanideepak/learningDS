package prep.collections;

import java.util.*;

public class Treeset
{
    public static void main(String[] args)
    {
    	TreeSet<String> treeSet = new TreeSet<>();
 
    	treeSet.add("Deepak");
    	treeSet.add("Ghanshani");
    	treeSet.add("F");
    	treeSet.add("deep");
       
    /*    treeSet.add("for");
        treeSet.add("Geeks");
        treeSet.add("GeeksforGeeks");
        treeSet.add("Geeks");
 */
        for (String temp : treeSet)
            System.out.printf(temp + " ");
 
        System.out.println("\n");
        
        
        System.out.println("\n");
        System.out.println("\n");
        
        
        HashSet<String> hashSet = new HashSet<>();
        
        hashSet.add("Geeks");
        hashSet.add("for");
        hashSet.add("Geeks");
        hashSet.add("GeeksforGeeks");
 
        for (String temp : hashSet)
            System.out.printf(temp + " ");
 
        System.out.println("\n");
    }
}