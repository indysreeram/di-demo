package com.sreeram.didemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        if(bean instanceof SpringLifeCycleDemoBean )
            ((SpringLifeCycleDemoBean) bean).beforeInit();

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        if (bean instanceof SpringLifeCycleDemoBean)
            ((SpringLifeCycleDemoBean) bean).afterInit();

        return bean;
    }
}