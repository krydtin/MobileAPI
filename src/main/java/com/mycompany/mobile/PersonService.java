/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mobile;

import com.mycompany.mobile.model.PersonModel;
import java.io.IOException;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * REST Web Service
 *
 * @author maq
 */
@Path("testjson")
public class PersonService {

    private static final Logger LOG = LoggerFactory.getLogger(PersonService.class);
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of TestjsonService
     */
    public PersonService() {
    }

    /**
     * Retrieves representation of an instance of
     * com.mycompany.mobile.TestjsonService
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    public String getText() {
        return "";
    }

    /**
     * PUT method for updating or creating an instance of TestjsonService
     *
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @POST
    @Path("save1")
    public PersonModel save1(@FormParam("content") String content) throws IOException {

        final ObjectMapper mapper = new ObjectMapper();
        PersonModel object = mapper.readValue(content, PersonModel.class);
        return object;

    }

    @POST
    @Path("save2")
    public Response save2(PersonModel personModel) {
        LOG.info("model : {}", personModel.getFirstname());
        return Response.status(Response.Status.OK).entity(personModel).build();
    }
}
