package com.cnc.vendorproject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.cnc.vendorproject.entitites.Vendor;
import com.cnc.vendorproject.services.VendorService;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;







@RestController
public class VendorController {

    @Autowired
    private VendorService myVendorSrv;

    @RequestMapping("/vendors")
    public List<Vendor> getAllVendors() {
        return myVendorSrv.getAllVendors();
    }

    @RequestMapping("/vendor/{vendorCode}")
    public Optional<Vendor> getVendorByCode(@PathVariable("vendorCode")String code) {
        return myVendorSrv.readVendorByCode(code);
    }

    @PostMapping("/vendors")
    public Vendor addVendor(@RequestBody Vendor newVendor) {
        return myVendorSrv.addVendor(newVendor);
    }
    
    @RequestMapping(value="/vendor/{vendorCode}", method=RequestMethod.PUT)
    public Vendor updateVendor(@PathVariable("vendorCode")String code, @RequestBody Vendor vendor) {
        return myVendorSrv.updatVendor(code, vendor);
    }
    
    @RequestMapping(value = "/vendor/{vendorCode}", method=RequestMethod.DELETE)
    public String deleteVendorById(@PathVariable("vendorCode")String vendorCode) {
        return myVendorSrv.deleteVendorById(vendorCode);
    }
    
    @RequestMapping(value="/vendor/search")
    public List<Vendor> getVendorsByCompanyName (@RequestParam String companyName) {
        return myVendorSrv.getVendorsByCompanyName(companyName);
    }

    @RequestMapping(value="/vendor/lookup/{emailId}")
    public List<Vendor> getVendorsByEmailId (@PathVariable("emailId") String emailId) {
        return myVendorSrv.getVendorsByEMail(emailId);
    }
    
    
}
