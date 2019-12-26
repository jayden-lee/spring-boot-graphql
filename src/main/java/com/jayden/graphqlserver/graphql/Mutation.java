package com.jayden.graphqlserver.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.jayden.graphqlserver.domain.Vehicle;
import com.jayden.graphqlserver.service.VehicleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class Mutation implements GraphQLMutationResolver {

    private final VehicleService vehicleService;

    public Vehicle createVehicle(final String type, final String modelCode, final String brandName, final String launchDate) {
        return vehicleService.createVehicle(type, modelCode, brandName, launchDate);
    }
}
