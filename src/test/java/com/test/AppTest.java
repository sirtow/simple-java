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
        int sum = calculator.sum(2, 2);
        Assert.assertTrue("Sum is wrong",4==sum);

    }
//    @Test
//    public void subTest(){
//        int sub = calculator.sub(5, 3);
//        Assert.assertTrue("Sub is wrong",2==sub);
//    }
}
