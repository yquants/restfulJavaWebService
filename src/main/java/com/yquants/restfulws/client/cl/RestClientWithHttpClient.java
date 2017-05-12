package com.yquants.restfulws.client.cl;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;

/**
 * Created by Wei on 2017/5/12.
 */
public class RestClientWithHttpClient {

    public static final String REST_WEB_SERVICE_URL = "https://pcs.baidu.com/rest/2.0/pcs/quota?method=info&access_token=1.54be391000a16ee6a21791d4a8ea04fe.86400.1331206383.67272939-188383";

    public static void main(String... args) throws Exception {
        try (CloseableHttpClient httpclient = HttpClients.createDefault()) {
            HttpGet get = new HttpGet(REST_WEB_SERVICE_URL);

            httpclient.execute(get, new ResponseHandler<String>() {

                        @Override
                        public String handleResponse(HttpResponse httpResponse) throws ClientProtocolException, IOException {
                            System.out.println(httpResponse.getStatusLine().getStatusCode());
                            return "";
                        }
                    }
            );
        }


    }
}
