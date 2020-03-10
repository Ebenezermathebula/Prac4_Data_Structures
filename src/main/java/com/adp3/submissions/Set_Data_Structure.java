package com.adp3.submissions;

import java.util.*;

public class Set_Data_Structure {

    Collection set;

    public void hashSet(){
        set = new HashSet();
        set.add("Floyd");
        set.add("Canelo");
        set.add("Pacman");
        set.add("Lomachenko");
        set.add("Canelo");

        System.out.println("Set contains Pacman: "+set.contains("Pacman"));
        set.remove("Pacman");
        System.out.println("Set contains Pacman: "+set.contains("Pacman"));
        System.out.println("");

        Iterator<String> iterator = set.iterator();

        System.out.println("TRAVERSING THROUGH THE SET USING ITERATOR:");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }       //end hashSet()

    public void linkedHashSet(){
        set = new LinkedHashSet();
        set.add("Floyd");
        set.add("Canelo");
        set.add("Pacman");
        set.add("Lomachenko");
        set.add("Canelo");

        System.out.println("Set contains Pacman: "+set.contains("Pacman"));
        set.remove("Pacman");
        System.out.println("Set contains Pacman: "+set.contains("Pacman"));
        System.out.println("");

        Iterator<String> iterator = set.iterator();

        System.out.println("TRAVERSING THROUGH THE SET USING ITERATOR:");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


}       //end class
