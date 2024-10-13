package com.example.demo.service.impl;

import com.example.demo.service.GatewayRouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.event.RefreshRoutesEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class GatewayRouteServiceImpl implements GatewayRouteService {
  
  @Autowired
  private ApplicationEventPublisher applicationEventPublisher;

  @Override
  public void refreshRoutes() {
    applicationEventPublisher.publishEvent(new RefreshRoutesEvent(this));
  }
}
