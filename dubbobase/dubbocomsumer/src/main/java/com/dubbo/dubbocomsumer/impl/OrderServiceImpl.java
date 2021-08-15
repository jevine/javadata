package com.dubbo.dubbocomsumer.impl;



import com.dubbo.dubboproduce.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author : JJZheng
 * @create 2021/8/12 23:05
 * */

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired(required = false)
    private AddressService addressService;
    @Override
    public String doOrderInfo() {

        String hh=addressService.doAddressService();
        return hh;
    }
}
