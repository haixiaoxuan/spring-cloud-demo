package com.xiaoxuan.springcloud.controller;

import com.xiaoxuan.springcloud.entities.CommonResult;
import com.xiaoxuan.springcloud.entities.Payment;
import com.xiaoxuan.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * description
 * <p>
 * Created by xiexiaoxuan on 2020/11/21.
 */

@RestController
@Slf4j
public class PaymentController {


    @Resource
    private PaymentService paymentService;

    public CommonResult<Payment> create(Payment payment){
        int num = paymentService.create(payment);

    }
}
