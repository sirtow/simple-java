package com.test;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AppTest {
    App calculator=null;

    @Before
    public void init(){
        calculator=new App();

    }

    @Test
    public void sumTest(){
        int sum = calculator.sum(3, 2);
        Assert.assertTrue("Sum is wrong",4==sum);

    }
//    @Test
    public void subTest(){

    }
}
