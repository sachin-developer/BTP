package com.cnc.vendorproject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cnc.vendorproject.entitites.Vendor;

@Component
public class VendorService {

    @Autowired
    IVendorPersistence vendorDB; 

    public List<Vendor> getAllVendors() {
          return vendorDB.findAll();
    }

    public Optional<Vendor> readVendorByCode(String code){
        return vendorDB.findById(code);
    }

    public Vendor addVendor(Vendor newVendor){
        return vendorDB.save(newVendor);
    }

    public Vendor updatVendor(String vendorCode, Vendor vendorData ){
        Optional<Vendor> vendorFound = vendorDB.findById(vendorCode);
        return vendorDB.save(vendorData);
    }

    public String deleteVendorById(String vendorCode){
        vendorDB.deleteById(vendorCode);
        return "Vendor Deleted";
    }

    public List<Vendor> getVendorsByCompanyName(String companyName){
        return vendorDB.findByCompanyName(companyName);
    }

     public List<Vendor> getVendorsByEMail(String emailId){
        return vendorDB.lookupByEmailId(emailId);
    }



}
