package com.jayden.graphqlserver.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.jayden.graphqlserver.domain.Vehicle;
import com.jayden.graphqlserver.service.VehicleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Component
public class Query implements GraphQLQueryResolver {

    private final VehicleService vehicleService;

    public List<Vehicle> getVehicles(final int count) {
        return this.vehicleService.getAllVehicles(count);
    }

    public Optional<Vehicle> getVehicle(final int id) {
        return this.vehicleService.getVehicle(id);
    }
}
