package com.sreeram.didemo.config;

import com.sreeram.didemo.examplebeans.FakeDataSource;
import com.sreeram.didemo.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@PropertySource({"classpath:datasource.properties","classpath:jms.properties"})
//@PropertySources({
//        @PropertySource("classpath:datasource.properties"),
//        @PropertySource("classpath:jms.properties")
//
//})
public class PropertyConfig {

//    @Autowired
//    org.springframework.core.env.Environment env;

    @Value("${sreeram.user}")
    String user;

    @Value("${sreeram.password}")
    String password;

    @Value("${sreeram.url}")
    String url;

    @Value("${sreeram.jms.username}")
    String jmsUserName;

    @Value("${sreeram.jms.password}")
    String jmsPassword;

    @Value("${sreeram.jms.url}")
    String jmsUrl;



    @Bean
    public FakeDataSource fakeDataSource() {

        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setPassword(password);
//        fakeDataSource.setUser(env.getProperty("USERNAME"));
        fakeDataSource.setUser(user);
        fakeDataSource.setUrl(url);

        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker(){
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUsername(jmsUserName);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsUrl);

        return fakeJmsBroker;
    }
//    @Bean
//    public PropertySourcesPlaceholderConfigurer properties() {
//        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
//        return propertySourcesPlaceholderConfigurer;
//    }
}
