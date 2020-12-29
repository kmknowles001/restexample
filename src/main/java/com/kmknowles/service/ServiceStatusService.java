package com.kmknowles.service;

import com.kmknowles.dao.ServiceStatusDao;
import com.kmknowles.entity.ServiceStatus;
import org.springframework.stereotype.Service;

@Service
public class ServiceStatusService {

    private ServiceStatusDao dao;

    public ServiceStatusService()
    {
        this.dao = new ServiceStatusDao();
    }

    public ServiceStatus getServiceStatus(){
        return dao.getServiceStatus();
    }
}
