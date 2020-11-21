package com.xiaoxuan.springcloud.service;

import com.xiaoxuan.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * description
 * <p>
 * Created by xiexiaoxuan on 2020/11/21.
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") long id);
}
