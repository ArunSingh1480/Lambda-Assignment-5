package com.knoldus;

import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.List;

class getDistinctStringTest {
      getDistinctString testbed=new getDistinctString();
    @org.junit.jupiter.api.Test
    void getDistinctString() {
        List<String> testbedString=testbed.getString();
        List<String> list = Arrays.asList("a","an","the","three");
        Assertions.assertEquals(list,testbedString);
    }

    @org.junit.jupiter.api.Test
    void getInvalidString() {
        List<String> testbedString=testbed.getString();
        List<String> list = Arrays.asList("the", "three", "the", "three", "the", "three", "an" ,"an", "a");
        Assertions.assertNotEquals(list,testbedString);
    }
}