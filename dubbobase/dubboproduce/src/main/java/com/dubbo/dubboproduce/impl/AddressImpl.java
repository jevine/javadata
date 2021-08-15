package com.dubbo.dubboproduce.impl;

import com.dubbo.dubboproduce.service.AddressService;
import com.dubbo.dubboproduce.pojo.Address;
import org.springframework.stereotype.Service;

/**
 * @Author : JJZheng
 * @create 2021/8/10 22:49
 */


@Service("addressImpl")
public class AddressImpl implements AddressService {
    public String doAddressService() {
        System.out.println("daowozhele ");
        return "hhhhhhhhhhhh";
        //return new Address("beijing","十阿哥","小金毛").toString();
    }
}
