package com.example.demo.repository;

import com.example.demo.model.database.ApiRoute;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ApiRouteRepository extends ReactiveCrudRepository<ApiRoute, Long> {
  
}
