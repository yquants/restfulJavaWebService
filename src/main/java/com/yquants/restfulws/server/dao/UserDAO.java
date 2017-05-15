package com.yquants.restfulws.server.dao;

/**
 * Created by Wei on 2017/5/15.
 */
public interface UserDAO {

    String getUsersAsXML();

    String getUsersAsJSON();

    String createUser(String jsonUser);
}
