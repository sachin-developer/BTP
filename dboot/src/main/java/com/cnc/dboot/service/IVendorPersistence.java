package com.cnc.dboot.service;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cnc.dboot.entities.Vendor;

public interface IVendorPersistence extends JpaRepository<Vendor, String> {

    List<Vendor> findByCompanyName(String companyName);

    @Query(nativeQuery = true, value = "SELECT * FROM public.vendor where EMAIL like %?1%")
    List<Vendor> lookupVendorByEmailID(String emailId);

}
