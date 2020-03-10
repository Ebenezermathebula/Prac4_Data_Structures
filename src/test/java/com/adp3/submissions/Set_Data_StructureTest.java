package com.adp3.submissions;
import org.junit.Before;
import org.junit.Test;


public class Set_Data_StructureTest {

    Set_Data_Structure setDS;

    @Before
    public void setUp(){
        setDS = new Set_Data_Structure();
    }

    @Test
    public void testHashSet() {
        System.out.println("TESTING HASHSET:");
        setDS.hashSet();
    }

    @Test
    public void testLinkedHashSet(){
        System.out.println("TESTING LINKEDHASHSET:");
        setDS.linkedHashSet();
    }

}
