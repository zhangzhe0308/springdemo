package com.zz.spring.main;

import com.zz.spring.service.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zzhang on 2017/7/12.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        HelloService service = (HelloService) context.getBean(HelloService.class);
        service.Say();
    }
}
