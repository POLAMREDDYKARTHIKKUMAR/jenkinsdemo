package com.sapient.jenkins.jenkins_demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
    	System.out.println("Testing");
        assertEquals(5,Calculator.sum(2, 3));
        System.out.println("Testing 2");
        assertEquals(5,Calculator.sum(3, 3));
    }
}
