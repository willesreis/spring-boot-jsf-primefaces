package org.acme.springjsf.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Initializer implements ServletContextInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        System.out.println("*** setInitParameter(primefaces.CLIENT_SIDE_VALIDATION, true) ***");
        servletContext.setInitParameter("primefaces.CLIENT_SIDE_VALIDATION", "true");
    }
}
