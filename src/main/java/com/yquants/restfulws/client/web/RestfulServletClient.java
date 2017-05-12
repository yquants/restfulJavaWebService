package com.yquants.restfulws.client.web;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

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

    @RequestMapping("/twitter")
    public ResponseEntity<String> twitter() throws Exception{
        URI location = new URI("abc");
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.setLocation(location);
        responseHeaders.set("MyResponseHeader", "MyValue");
        return new ResponseEntity<String>("Hello World", responseHeaders, HttpStatus.CREATED);
    }

}
