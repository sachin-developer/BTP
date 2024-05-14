package com.cnc.dboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cnc.dboot.entities.Vendor;

@Component
public class VendorService {

    @Autowired
    IVendorPersistence vendorDB;

    public List<Vendor> getAllVendors(){
        return vendorDB.findAll();
    }

    public Vendor addVendor(Vendor newVendor){
         return vendorDB.save(newVendor);
    }

    public Optional<Vendor> readVendorById(String code){
         return vendorDB.findById(code);
    }

    public Vendor updateVendorById(String vendorId, Vendor vendorData){
       Optional<Vendor> vendorFound = vendorDB.findById(vendorId);
       return vendorDB.save(vendorData);
    }
   
    public String deleteVendorById(String vendorID){
        vendorDB.deleteById(vendorID);
        return "Vendor deleted";
    }

    public List<Vendor> getCustomerByCompanyName(String companyName){
        return vendorDB.findByCompanyName(companyName);
    }

    public List<Vendor> searchCustomerByEMail(String emailId){
        return vendorDB.lookupVendorByEmailID(emailId);
    }
}
