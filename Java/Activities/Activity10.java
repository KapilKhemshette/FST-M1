package Module_1.Com.FST_2;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        
        hs.add("Manmath");
        hs.add("Balaji");
        hs.add("CHIKLE");
        hs.add("ARJUN");
        hs.add("Madhu");
        hs.add("Xingping");
        
       
        System.out.println("Original HashSet: " + hs);        
       
        System.out.println("Size of HashSet: " + hs.size());
        
      
        System.out.println("Removing A from HashSet: " + hs.remove("A"));
       
        if(hs.remove("Z")) {
        	System.out.println("Z removed from the Set");
        } else {
        	System.out.println("Z is not present in the Set");
        }
        
       
        System.out.println("Checking if M is present: " + hs.contains("M"));
       
        System.out.println("Updated HashSet: " + hs);
    }
}