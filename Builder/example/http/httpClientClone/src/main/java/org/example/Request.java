package org.example;

import java.util.Map;

public interface Request {
    String getUrl();

    RequestMethods getMethod();

    Map<String, String> getHeaders();

    String getBody();
}
