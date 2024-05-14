package com.cnc.springbasics.classes;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class sonyHDD implements IHardDisk {

    @Override
    public void startHDD(){
        System.out.println("Sony Harddisk Started Now");
    }

    @Override
    public void readHDD(){
        System.out.println("Sony Harddisk reading @10m rps ");
    }

}
