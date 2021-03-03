package com.gg.sfgdi.config;

import com.gg.sfgdi.persistence.FakeDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
//@PropertySource("classpath:datasource.properties")
/*
    Multiple property files configuration
@PropertySource({"classpath:datasource.properties, classpath:another.properties}")
OR
@PropertySources({
    @PropertySource("classpath:datasource.properties),
    @PropertySource("classpath:another.properties")
})

 */
public class PropertyConfig {

   //@Autowired
    //Environment env;

    @Value("${gg.username}")
    String user;

    @Value("${gg.password}")
    String password;

    @Value("${gg.dburl}")
    String url;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        fakeDataSource.setUser(user);
        return fakeDataSource;
    }



    //Redundant, this does not need to be especified. Spring5 thing only maybe?
   /* @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }*/

}
