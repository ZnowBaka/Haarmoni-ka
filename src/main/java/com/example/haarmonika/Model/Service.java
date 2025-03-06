package com.example.haarmonika.Model;

public class Service {
    private int serviceId;
    private String serviceName;
    private int serviceDuration;
    private double servicePrice;

    public Service(int serviceId, String serviceName, int serviceDuration, double servicePrice) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.serviceDuration = serviceDuration;
        this.servicePrice = servicePrice;
    }

    // Constructor without Id
    public Service(String serviceName, int serviceDuration, double servicePrice) {
        this.serviceName = serviceName;
        this.serviceDuration = serviceDuration;
        this.servicePrice = servicePrice;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getServiceDuration() {
        return serviceDuration;
    }

    public void setServiceDuration(int serviceDuration) {
        this.serviceDuration = serviceDuration;
    }

    public double getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(double servicePrice) {
        this.servicePrice = servicePrice;
    }


}
