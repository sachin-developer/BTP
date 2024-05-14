package com.cnc.vendorproject.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cnc.vendorproject.entitites.Vendor;
import java.util.List;


public interface IVendorPersistence extends JpaRepository<Vendor, String>{

    List<Vendor> findByCompanyName(String companyName);

    @Query(nativeQuery = true, value = "SELECT * FROM public.vendor where EMAIL like %?1%")
    List<Vendor> lookupByEmailId(String emailId);

}
