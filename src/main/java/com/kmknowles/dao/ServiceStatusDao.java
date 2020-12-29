package com.kmknowles.dao;

import com.kmknowles.entity.*;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ServiceStatusDao {

    private static ServiceStatus status;

    static {
        status= new ServiceStatus(31,"Index DaaS Service",
                    "Service provides daily and historic Index and Index Constituent data.",
                 "Joe Bloggs","IndexDaaS@email.com");
    };

    public ServiceStatus getServiceStatus() {
        return status;
    }
}



