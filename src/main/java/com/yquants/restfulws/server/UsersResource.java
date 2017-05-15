package com.yquants.restfulws.server;

import com.yquants.restfulws.server.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;

/**
 * Created by Wei on 2017/5/15.
 */
@Component
@Path("/users")
public class UsersResource {

    @Autowired
    private UserDAO dao;

    @GET
    @Produces("application/xml")
    public String getXML() {
        return dao.getUsersAsXML();
    }

    @GET
    @Produces("application/json")
    public String getJSON() {
        return dao.getUsersAsJSON();
    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public String createUser(String representation) {
        return dao.createUser(representation);
    }
}
