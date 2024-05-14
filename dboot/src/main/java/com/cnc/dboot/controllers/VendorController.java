package com.cnc.dboot.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.cnc.dboot.entities.Vendor;
import com.cnc.dboot.service.VendorService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;





@RestController
public class VendorController {

    @Autowired  
    private VendorService myVendorSrv;

    @RequestMapping("/vendors")
    public List<Vendor> getAll(){
        return myVendorSrv.getAllVendors();
    }
    
    @PostMapping("/vendors")
    public Vendor createVendor(@RequestBody Vendor myVendor) {
        System.out.println(myVendor);
        return myVendorSrv.addVendor(myVendor);
    }

    @RequestMapping("/vendor/{vendorCode}")
    public  Optional<Vendor> getVendorById(@PathVariable("vendorCode")String code) {
        return myVendorSrv.readVendorById(code);
    }
    
    @RequestMapping(method=RequestMethod.PUT, value = "/vendor/{vendorId}")
    public Vendor updateVendorById(@PathVariable("vendorId") String vendorCode, @RequestBody Vendor vendor) {
        return myVendorSrv.updateVendorById(vendorCode, vendor);
    }
    
    @RequestMapping( value = "/vendor/{vendorId}", method=RequestMethod.DELETE)
    public String requestMethodName(@PathVariable("vendorId") String vendorId) {
        return myVendorSrv.deleteVendorById(vendorId);
    }

    @RequestMapping("/vendor/search")
    public List<Vendor> searchByCompany(@RequestParam String company) {
       return myVendorSrv.getCustomerByCompanyName(company);
    }

    @RequestMapping("/vendor/lookup/{emailId}")
    public List<Vendor> searchVendorByEMailId(@PathVariable("emailId") String emailId) {
       return myVendorSrv.searchCustomerByEMail(emailId);
    }
    
    
    
    
}
 