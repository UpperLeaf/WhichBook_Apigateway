package com.econovation.whichbook_apigateway;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
@ConfigurationProperties(prefix = "servers")
public class ServersProperties {

    Map<String, EndPoint> endpoints;

    public Map<String, EndPoint> getEndPoints() {
        return endpoints;
    }

    public void setEndPoints(Map<String, EndPoint> endPoints) {
        this.endpoints = endPoints;
    }

    public static class EndPoint {
        private String path;
        private String uri;

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public String getUri() {
            return uri;
        }

        public void setUri(String uri) {
            this.uri = uri;
        }
    }
}
