package com.xiaoxuan.springcloud.dao;

import com.xiaoxuan.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * description
 * <p>
 * Created by xiexiaoxuan on 2020/11/21.
 */

@Mapper
@Repository
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") long id);
}
