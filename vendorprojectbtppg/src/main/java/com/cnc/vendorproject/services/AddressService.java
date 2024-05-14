package com.cnc.vendorproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cnc.vendorproject.entitites.Address;

@Component
public class AddressService {

    @Autowired
    IAddressPersistence addressDB;

    public List<Address> getAddresses(){
        return addressDB.findAll();
    }
}
