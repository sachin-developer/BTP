package com.cnc.springmicroservices.services;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cnc.springmicroservices.entities.Vendor;

@Component
public class VendorServices {
    private HashMap<String, Vendor>  vendors = new HashMap<String, Vendor>();

    @Autowired
    private Vendor ven1;

    @Autowired
    private Vendor ven2;

    @Autowired
    private Vendor ven3;

    private void fillVendors(){
            vendors.put("1", ven1);
            vendors.put("2", ven2);
            vendors.put("3", ven3);
            ven1.setCode("Vend1");
            ven2.setCode("Vend2");
            ven3.setCode("Vend3");
    }

    public VendorServices(){
    }

    public HashMap<String, Vendor> getAllVendors(){
        fillVendors();
        return vendors;
    }

    public Vendor readVendorById(String vendorId){
        fillVendors();
        return vendors.get(vendorId);
    }

    public Vendor updateVendorById(String vendorId, Vendor vendorData){
        fillVendors();
        vendors.put(vendorId, vendorData);
        return vendorData;
    }

    public Vendor addVendor(Vendor newVendor){
        fillVendors();
        vendors.put("4",newVendor);
        return newVendor;

    }

    public void delteVendorById(String vendorId){
        fillVendors();
        vendors.remove(vendorId);
    }
}
