package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After properties set method");
    }

    public void customInit()
    {
        System.out.println("Custom init method init");
    }

    public void customDestroy()
    {
        System.out.println("Custom destroy method destroyed");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("obj destroyed");
    }
}
