package com.cnc.springbasics.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
    private Integer length;
    private Integer width;
    private String brandName;
    @Autowired
    private IHardDisk hardDisk;

    public Laptop(){
        System.out.println("Laptop object is created");
    }

    @Override
    public String toString() {
        return "Laptop [length=" + length + ", width=" + width + ", brandName=" + brandName + "]";
    }

    public void bootLaptop(){
        this.hardDisk.startHDD();
        System.out.println("Laptop Started with "+ brandName);
        this.hardDisk.readHDD();
    }

    public Integer getLength() {
        return length;
    }
    public void setLength(Integer length) {
        this.length = length;
    }
    public Integer getWidth() {
        return width;
    }
    public void setWidth(Integer width) {
        this.width = width;
    }
    public String getBrandName() {
        return brandName;
    }
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
    

}
