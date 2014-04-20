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
public class HelloServiceNGTest {
    
    public HelloServiceNGTest() {
    }

    @Test
    public void testGetText() {
        System.out.println("getText");
        HelloService instance = new HelloService();
        String expResult = "GET: Hello world";
        String result = instance.getText("xxx");
        assertEquals(result, expResult);
    }

    @Test
    public void testPutText() {
        System.out.println("putText");
        String content = "";
        HelloService instance = new HelloService();
        instance.putText(content);
    }
    
}
