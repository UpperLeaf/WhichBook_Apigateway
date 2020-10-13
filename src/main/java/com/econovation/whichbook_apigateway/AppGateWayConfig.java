package com.econovation.whichbook_apigateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppGateWayConfig {
    @Bean
    public RouteLocator appRouteLocator(RouteLocatorBuilder builder){
        return builder.routes()
                .route("/book", r -> r.path("/book").uri("http://localhost:8081"))
                .route("/user", r -> r.path("/user").uri("http://localhost:8082"))
                .route("/review", r -> r.path("/review").uri("http://localhost:8083"))
                .build();
    }
}
