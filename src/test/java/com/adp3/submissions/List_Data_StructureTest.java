package com.adp3.submissions;

import org.junit.Before;
import org.junit.Test;

public class List_Data_StructureTest {
    List_Data_Structure listDS;

    @Before
    public void setUp(){
        listDS = new List_Data_Structure();
    }


    @Test
    public void stack() {
        listDS.stack();
    }

}
