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
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * REST Web Service
 *
 * @author maq
 */
@Path("calc")
public class CalculatorService {

    private static final Logger LOG = LoggerFactory.getLogger(CalculatorService.class);

    @Context
    private UriInfo context;

    @GET
    @Path("add/{param1}/{param2}")
    public int add(@PathParam("param1") final int param1, @PathParam("param2") final int param2) {
        final int result = param1 + param2;
        LOG.info("{} + {} = {}", param1, param2, result);
        return param1 + param2;
    }

    @GET
    @Path("minus/{param1}/{param2}")
    public int minus(@PathParam("param1") final int param1, @PathParam("param2") final int param2) {
        return param1 - param2;
    }

    @POST
    @Path("multiply")
    public int multiply(@FormParam("param1") final int param1, @FormParam("param2") final int param2) {
        return param1 * param2;
    }

}
