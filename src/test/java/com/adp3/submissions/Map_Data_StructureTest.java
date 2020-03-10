package com.adp3.submissions;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Map_Data_StructureTest {

    Map_Data_Structure mapDS;

    @Before
    public void setUp(){
        mapDS = new Map_Data_Structure();
    }

    @Test
    public void testLinkedHashMap() {
        String result = mapDS.thirdP4P();
        Assert.assertEquals("The third Pound4Pound fighter is: ", "Canelo Alverez", result);
    }

}
