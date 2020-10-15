package com.econovation.whichbook_apigateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppGateWayConfig {

    ServersProperties serversProperties;

    AppGateWayConfig(ServersProperties serversProperties) {
        this.serversProperties = serversProperties;
    }

    @Bean
    public RouteLocator appRouteLocator(RouteLocatorBuilder locatorBuilder){
        RouteLocatorBuilder.Builder builder =  locatorBuilder.routes();
        serversProperties.getEndPoints().forEach((key, value) -> builder.route(key, r -> r.path(value.getPath()).uri(value.getUri())));

        return builder.build();
    }
}
