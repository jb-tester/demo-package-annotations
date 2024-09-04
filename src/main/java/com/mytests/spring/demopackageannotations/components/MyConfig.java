package com.mytests.spring.demopackageannotations.components;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public GettersSetters nonLombokAccessors() {
        GettersSetters gettersSetters = new GettersSetters();
        gettersSetters.setId(null);// ok
        return gettersSetters;
    }

    @Bean
    public GetterSetterLombok lombokAccessors() {
        GetterSetterLombok getterSetterLombok = new GetterSetterLombok();
        getterSetterLombok.setId(null); // ok
        return getterSetterLombok;
    }

    @Bean
    public AllArgsConstructors nonLombokConstructor() {
        return new AllArgsConstructors(null); // ok
    }

    @Bean
    public AllArgsConstructorLombok lombokConstructor() {
        return new AllArgsConstructorLombok(null); // ok
    }
}
