package com.antkorwin.autoconfigdemo.config;

import com.antkorwin.autoconfigdemo.models.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by Korovin Anatolii on 09.06.2018.
 *
 * @author Korovin Anatolii
 * @version 1.0
 */
@Profile("foo")
@Configuration
public class FooConfig {

    @Bean
    public Foo foo() {
        return new Foo();
    }
}
