package com.xiaoxuan.springcloud.service.impl;

import com.xiaoxuan.springcloud.dao.PaymentDao;
import com.xiaoxuan.springcloud.entities.Payment;
import com.xiaoxuan.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * description
 * <p>
 * Created by xiexiaoxuan on 2020/11/21.
 */

@Service
public class PaymentServiceImpl implements PaymentService{

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return 0;
    }

    @Override
    public Payment getPaymentById(long id) {
        return null;
    }
}
