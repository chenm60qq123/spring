package com.cwb.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringController {

    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("classpath:spring/ApplicationContext.xml");
        SpringBean bean=context.getBean("springBean",SpringBean.class);
//        bean.setName("Hallo Spring");
        System.out.print(bean.getName());
    }
}
