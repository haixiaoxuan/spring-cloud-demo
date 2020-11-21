package com.xiaoxuan.springcloud.entities;

import java.io.Serializable;

/**
 * description
 * <p>
 * Created by xiexiaoxuan on 2020/11/21.
 */

public class Payment implements Serializable{

    private long id;
    private String serial;

    public Payment(){
    }

    public Payment(long id, String serial) {
        this.id = id;
        this.serial = serial;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }
}
