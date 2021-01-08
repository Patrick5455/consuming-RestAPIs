

import java.io.IOException;
import java.net.*;

public class Service {

    private static final String HOST = "https://postman-echo.com";
    private static final String CONTENT_TYPE = "Content-Type";
    private static final String APPLICATION_JSON_WITH_UTF_8 = "application/json; utf-8";
    private static final String APPLICATION_JSON = "application/json";
    private static final String ACCEPT = "Accept";

    private static final String GET_METHOD = "GET";
    private static final String POST_METHOD = "POST";
    private static final String PUT_METHOD = "PUT";
    private static final String PATCH_METHOD = "PATCH";
    private static final String DELETE_METHOD = "DELETE";

    private static final String GET_REQUEST_URL = "/get";
    private static final String POST_REQUEST_URL = "/post";
    private static  final String PUT_REQUEST_URL = "/put";
    private static final String PATCH_REQUEST_URL = "/patch";
    private static  final String DELETE_REQUEST_URL = "/delete";






    public static void main(String[] args)
            throws IOException {
    }

    public  static void makeGetRequest(String url){

    }

    public static void makePostRequest(String url){

    }

    public static void makeDeleteRequest(String url){

    }

    public static void makePutRequest(String url){

    }

    public static void makePatchRequest(String url){

    }

    private static HttpURLConnection init(String url, String requestMethod)
    throws IOException
    {

        URL url_ = new URL(HOST + url);
        HttpURLConnection connection =
                (HttpURLConnection) url_.openConnection();
        connection.setRequestMethod(requestMethod);

        if(!requestMethod.equals(DELETE_METHOD)){
            connection.setRequestProperty(CONTENT_TYPE, APPLICATION_JSON_WITH_UTF_8);
            connection.setRequestProperty(ACCEPT, APPLICATION_JSON);
            connection.setDoOutput(true);
        }
        return connection;
    }


}
