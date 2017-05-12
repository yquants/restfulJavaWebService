package com.yquants.restfulws.client.web;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Wei on 2017/5/12.
 */
@Component
@RestController
public class RestfulServletClient {

    @RequestMapping("/index")
    public String index() {

        return "hello";
    }

}
