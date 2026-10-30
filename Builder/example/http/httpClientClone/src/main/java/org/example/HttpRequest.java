package org.example;

import java.util.HashMap;
import java.util.Map;

public class HttpRequest implements Request {
    private final String url;
    private final RequestMethods method;
    private final Map<String, String> headers;
    private final String body;

    private HttpRequest(Builder builder) {
        this.url = builder.url;
        this.method = builder.method;
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String getUrl() {
        return url;
    }

    @Override
    public RequestMethods getMethod() {
        return method;
    }

    @Override
    public Map<String, String> getHeaders() {
        return headers;
    }

    @Override
    public String getBody() {
        return body;
    }

    public static class Builder {
        private String url;
        private RequestMethods method = RequestMethods.GET;
        private final Map<String, String> headers = new HashMap<>();
        private String body;

        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public Builder method(RequestMethods method) {
            this.method = method;
            return this;
        }

        public Builder header(String name, String value) {
            this.headers.put(name, value);
            return this;
        }

        public Builder body(String body) {
            this.body = body;
            return this;
        }

        public HttpRequest build() {
            if (url == null) {
                throw new IllegalStateException("url kerak");
            }
            return new HttpRequest(this);
        }
    }
}
