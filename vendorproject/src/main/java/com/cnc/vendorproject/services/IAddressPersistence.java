package com.cnc.vendorproject.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cnc.vendorproject.entitites.Address;

public interface IAddressPersistence extends JpaRepository<Address, String> {

}
