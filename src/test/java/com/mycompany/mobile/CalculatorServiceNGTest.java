/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.mobile;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author maq
 */
public class CalculatorServiceNGTest {
    
    public CalculatorServiceNGTest() {
    }
    private final CalculatorService instance = new CalculatorService();

    @Test
    public void testAdd() {
        Integer param1 = 10;
        Integer param2 = 3;
        
        Integer expResult = 13;
        Integer result = instance.add(param1, param2);
        assertEquals(result, expResult);
    }
    
    @Test
    public void testMinus() {
        Integer param1 = 10;
        Integer param2 = 3;
        
        Integer expResult = 7;
        Integer result = instance.minus(param1, param2);
        assertEquals(result, expResult);
    }
    
    
//    public void testGetText() {
//        System.out.println("getText");
//        CalculatorService instance = new CalculatorService();
//        String expResult = "";
//        String result = instance.getText();
//        assertEquals(result, expResult);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testPutText() {
//        System.out.println("putText");
//        String content = "";
//        CalculatorService instance = new CalculatorService();
//        instance.putText(content);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
