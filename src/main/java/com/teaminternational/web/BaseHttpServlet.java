package com.teaminternational.web;

import javax.servlet.http.HttpServlet;

public abstract class BaseHttpServlet extends HttpServlet {

    protected <T> T getBean(String name) {
        return (T) getServletContext().getAttribute(name);
    }
}
