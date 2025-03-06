package com.example.haarmonika.Controller;

import com.example.haarmonika.Model.Service;

public class ServiceController {
    DatabaseRepository databaseRepository = new DatabaseRepository();

    public Service createNewService(String serviceName, int serviceDuration, double servicePrice) {
        Service service = new Service(serviceName,serviceDuration,servicePrice);
        // database
        return service;
    }

    public Service getService(int serviceId) {
        //databaseRepository.getService(serviceId);
        return null;
    }


}
