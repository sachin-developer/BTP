package com.cnc.dboot.entities;

import java.util.Date;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Scope("prototype")
@Entity
@Table(name="VENDOR")
public class Vendor {
    @Id
    @Column(nullable = false, name="ID")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    private String code;
    @Column(nullable = false, name = "COMPANY_NAME")
    private String companyName;
    @Column(nullable = false, name = "CONTACT_PERSON")
    private String contactPerson;
    @Column(nullable = false, name = "FIRST_NAME")
    private String firstName;
    @Column(nullable = false, name = "LAST_NAME")
    private String lastName;
    @Column(nullable = false, name = "WEBSITE")
    private String website;
    @Column(nullable = false, name = "EMAIL")
    private String email;
    @Column(nullable = false, name = "STATUS")
    private Integer status;
    @Column(nullable = false, name = "REG_DATE")
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
