/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mobile;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * REST Web Service
 *
 * @author maq
 */
@Path("hello")
public class HelloService {

    private static final Logger LOG = LoggerFactory.getLogger(HelloService.class);
    
    @Context
    private UriInfo context;

    @GET
    @Produces("text/plain")
    public String getText(@QueryParam("source")final String source) {
        LOG.info("{}", source);
        return "GET: Hello world";
    }

    @PUT
    @Consumes({"text/plain", MediaType.APPLICATION_JSON})
    public void putText(String content) {
        System.out.println(content);
    }
}
