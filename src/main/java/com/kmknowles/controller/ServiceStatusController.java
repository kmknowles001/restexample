package com.kmknowles.controller;

import com.kmknowles.entity.ServiceStatus;
import com.kmknowles.service.ServiceStatusService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController @RequestMapping("/status")
public class ServiceStatusController {

    private ServiceStatusService serviceStatusService;

    public ServiceStatusController(){
        serviceStatusService = new ServiceStatusService();
    }

    @RequestMapping(method= RequestMethod.GET)
    public ServiceStatus getServiceStatement(){
        return serviceStatusService.getServiceStatus();
    }
}
