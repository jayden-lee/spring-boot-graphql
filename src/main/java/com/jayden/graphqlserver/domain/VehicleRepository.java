package com.jayden.graphqlserver.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}