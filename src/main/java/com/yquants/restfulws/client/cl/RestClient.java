package com.yquants.restfulws.client.cl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Wei on 2017/5/12.
 */
public class RestClient {

    public static void main(String... args) throws Exception {
//        System.setProperty("javax.net.debug", "all");

        URL twitter = new URL("https://pcs.baidu.com/rest/2.0/pcs/quota?method=info&access_token=1.54be391000a16ee6a21791d4a8ea04fe.86400.1331206383.67272939-188383");
        URLConnection connection = twitter.openConnection();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
