package com.kmknowles.entity;

public class ServiceStatus {

    private int serviceID = -1;
    private String serviceName= "";
    private String serviceDescription="";
    private String serviceSupportContact="";
    private String serviceSupportContactEmail="";

    public ServiceStatus() { }

    public ServiceStatus(int serviceID, String serviceName, String serviceDescription, String serviceSupportContact, String serviceSupportContactEmail) {
        this.serviceID = serviceID;
        this.serviceName = serviceName;
        this.serviceDescription = serviceDescription;
        this.serviceSupportContact = serviceSupportContact;
        this.serviceSupportContactEmail = serviceSupportContactEmail;
    }

    public int getServiceID() {
        return serviceID;
    }

    public void setServiceID(int serviceID) {
        this.serviceID = serviceID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public String getServiceSupportContact() {
        return serviceSupportContact;
    }

    public void setServiceSupportContact(String serviceSupportContact) {
        this.serviceSupportContact = serviceSupportContact;
    }

    public String getServiceSupportContactEmail() {
        return serviceSupportContactEmail;
    }

    public void setServiceSupportContactEmail(String serviceSupportContactEmail) {
        this.serviceSupportContactEmail = serviceSupportContactEmail;
    }
}