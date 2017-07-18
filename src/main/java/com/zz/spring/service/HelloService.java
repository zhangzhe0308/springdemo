package com.zz.spring.service;

import com.zz.spring.bean.Hello;

/**
 * Created by zzhang on 2017/7/12.
 */
public class HelloService {

    public Hello getHello() {
        return hello;
    }

    public void setHello(Hello hello) {
        this.hello = hello;
    }

    private Hello hello;

    public HelloService(Hello hello) {
        this.hello = hello;
    }

    public HelloService() {
    }

    public void Say() {
        hello.SayHello();
    }
}
