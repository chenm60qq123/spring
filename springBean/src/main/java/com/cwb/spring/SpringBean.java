package com.cwb.spring;

import java.io.Serializable;

public class SpringBean implements Serializable{


    public static  SpringBean getInstance(){
        return  new SpringBean();
    }

    public SpringBean(){

    }

    public SpringBean(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public void kill(){
        System.out.print("自杀");
    }



}
