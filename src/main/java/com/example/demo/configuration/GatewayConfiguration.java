package com.example.demo.configuration;

import com.example.demo.service.ApiRouteService;
import com.example.demo.service.impl.ApiPathRouteLocatorImpl;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfiguration {
  
  @Bean
  public RouteLocator routeLocator(ApiRouteService apiRouteService,
                                   RouteLocatorBuilder routeLocatorBuilder) {
    return new ApiPathRouteLocatorImpl(apiRouteService, routeLocatorBuilder);
  }
}
