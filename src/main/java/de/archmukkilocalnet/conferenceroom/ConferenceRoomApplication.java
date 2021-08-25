package de.archmukkilocalnet.conferenceroom;

import de.archmukkilocalnet.conferenceroom.servlet.SimpleFilter;
import de.archmukkilocalnet.conferenceroom.servlet.SimpleListener;
import de.archmukkilocalnet.conferenceroom.servlet.SimpleServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class ConferenceRoomApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConferenceRoomApplication.class, args);
    }

    @Bean
    public ServletRegistrationBean getServletRegistrationBean() {
        ServletRegistrationBean servletBean = new ServletRegistrationBean(new SimpleServlet());
        servletBean.addUrlMappings("/SimpleServlet");
        return servletBean;
    }

    @Bean
    public ServletListenerRegistrationBean getListenerRegistrationBean() {
        ServletListenerRegistrationBean listenerBean = new ServletListenerRegistrationBean(new SimpleListener());
        return listenerBean;
    }

    @Bean
    public FilterRegistrationBean getFilterRegistrationBean() {
        FilterRegistrationBean filterBean = new FilterRegistrationBean(new SimpleFilter());
        filterBean.addUrlPatterns("/SimpleServlet");
        return filterBean;
    }
}
