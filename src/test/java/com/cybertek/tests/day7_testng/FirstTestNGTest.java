package com.cybertek.tests.day7_testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestNGTest {
    @Test
    public void test1() {
        System.out.println("test1");
    }

    @Test
    public void test2() {
        System.out.println("test1");
    }

    @Test
    public void test3 () {
        Assert.assertEquals("adil","adil", "it must be Adil");
        Assert.assertNotEquals("adil12","adil", "it must not be Adil");
        Assert.assertFalse(0>1,"0 never can be grater than 1");
        Assert.assertTrue(1>0,"0 never can be grater than 1");
    }
}
