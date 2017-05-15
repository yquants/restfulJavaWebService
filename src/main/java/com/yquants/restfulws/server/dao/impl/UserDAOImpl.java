package com.yquants.restfulws.server.dao.impl;

import com.yquants.restfulws.server.dao.UserDAO;
import org.springframework.stereotype.Component;

/**
 * Created by Wei on 2017/5/15.
 */
@Component
public class UserDAOImpl implements UserDAO {
    @Override
    public String getUsersAsXML() {
        return "<User><name>123</name></User>";
    }

    @Override
    public String getUsersAsJSON() {
        return "[name:123]";
    }

    @Override
    public String createUser(String jsonUser) {
        return null;
    }
}
