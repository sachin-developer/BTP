package com.cnc.springmicroservices.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.cnc.springmicroservices.entities.Vendor;
import com.cnc.springmicroservices.services.VendorServices;

import org.springframework.web.bind.annotation.RequestMapping;



@RestController
public class VendorController {

    @Autowired  
    private VendorServices myVendorSrv;

    @RequestMapping("/vendors")
    public HashMap<String, Vendor> getAll(){
        return myVendorSrv.getAllVendors();
    }
   
    
}
