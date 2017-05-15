package com.yquants.restfulws.server;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 * Created by Wei on 2017/5/15.
 */
@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(UsersResource.class);
    }
}
