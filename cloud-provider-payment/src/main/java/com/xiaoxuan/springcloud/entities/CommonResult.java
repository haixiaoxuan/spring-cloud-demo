package com.xiaoxuan.springcloud.entities;

import java.io.Serializable;

/**
 * description
 * <p>
 * Created by xiexiaoxuan on 2020/11/21.
 */

public class CommonResult<T> implements Serializable{

    private int code;
    private String msg;
    private T data;

    public CommonResult(int code, String msg){
        this(code, msg, null);
    }

    public CommonResult() {
    }

    public CommonResult(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
