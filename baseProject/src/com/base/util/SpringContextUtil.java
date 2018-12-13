package com.base.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * spring容器工具类
 * 
 * @author viccai
 *
 */
public class SpringContextUtil implements ApplicationContextAware {

	private static ApplicationContext context;
	
	@Override
	@SuppressWarnings("static-access" )
	public void setApplicationContext(ApplicationContext contex)
			throws BeansException {
		this.context = contex;
	}

	public static <T> T getBean(String beanName, Class<T> clazz) {
        return context.getBean(beanName, clazz);
    }

    public static <T> T getBean(Class<T> clazz) {
        return context.getBean(clazz);
    }
	
}
