package com.teaminternational.web;

import com.teaminternational.HelloWorldGenerator;
import com.teaminternational.HelloWorldGeneratorImpl;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent servletContextEvent) {
        servletContextEvent.getServletContext().setAttribute(HelloWorldGenerator.COMPONENT_NAME, new HelloWorldGeneratorImpl());
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
