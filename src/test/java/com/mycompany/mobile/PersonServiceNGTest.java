/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mobile;

import com.mycompany.mobile.model.PersonModel;
import java.io.IOException;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author maq
 */
public class PersonServiceNGTest {

    public PersonServiceNGTest() {
    }
    private static final Logger LOG = LoggerFactory.getLogger(PersonServiceNGTest.class);
    private final String jsonString = "{\"username\":\"nuboat\",\"id\":1,\"firstname\":\"Peerapat\",\"lastname\":\"A\"}";

    @Test
    public void testGetPersonJSONShouldReturnPersonObject() throws IOException {
        final PersonModel instance = new PersonModel();
        instance.setId(1L);
        instance.setUsername("nuboat");
        instance.setFirstname("Peerapat");
        instance.setLastname("A");

        final ObjectMapper mapper = new ObjectMapper();
        final String json = mapper.writeValueAsString(instance);
        LOG.info("my debug " + json);

        assertEquals(jsonString, json);
        PersonService personService = new PersonService();
        PersonModel personModel = personService.save1(jsonString);
        assertEquals(personModel.getFirstname(), instance.getFirstname());
        assertEquals(personModel.getId(), instance.getId());
        assertEquals(personModel.getLastname(), instance.getLastname());
        assertEquals(personModel.getUsername(), instance.getUsername());
    }

//    @Test
//    public void testGetText() {
//        System.out.println("getText");
//        TestjsonService instance = new TestjsonService();
//        String expResult = "";
//        String result = instance.getText();
//        assertEquals(result, expResult);
//    }

//    @Test
//    public void testPutText() {
//        System.out.println("putText");
//        String content = "";
//        TestjsonService instance = new TestjsonService();
//        instance.putText(content);
//    }
}
