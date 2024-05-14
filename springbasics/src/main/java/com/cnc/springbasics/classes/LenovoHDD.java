package com.cnc.springbasics.classes;

public class LenovoHDD implements IHardDisk {

    @Override
    public void startHDD(){
        System.out.println("Lenovo Harddisk Started Now");
    }

    @Override
    public void readHDD(){
        System.out.println("Lenovo Harddisk reading @200m rps ");
    }

}
