package com.cnc.springmicroservices.entities;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Vendor {

    private String code;
    private String companyName;
    private String contactPerson;
    private String firstName;
    private String lastName;
    private String website;
    private String email;
    private Integer status;
    private Date regDate;

    

    public Vendor() {
        this.code = "VEND";
        this.companyName = "CODE&CLAP";
        this.contactPerson = "Bharathi";
        this.firstName = "Sachin";
        this.lastName = "Singh";
        this.website = this.companyName + ".com";
        this.email = this.firstName + "." + this.lastName + "@" + this.website;
        this.status = 0;
        this.regDate = new Date();

    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getcompanyName() {
        return companyName;
    }
    public void setcompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getContactPerson() {
        return contactPerson;
    }
    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getWebsite() {
        return website;
    }
    public void setWebsite(String website) {
        this.website = website;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public Date getRegDate() {
        return regDate;
    }
    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    
}
