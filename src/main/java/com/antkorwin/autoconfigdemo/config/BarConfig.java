package com.antkorwin.autoconfigdemo.config;

import com.antkorwin.autoconfigdemo.models.Bar;
import com.antkorwin.autoconfigdemo.models.Foo;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Korovin Anatolii on 09.06.2018.
 *
 * @author Korovin Anatolii
 * @version 1.0
 */
@Configuration
@AutoConfigureAfter(FooConfig.class)
@ConditionalOnBean(name = "foo")
public class BarConfig {

    @Bean
    public Bar bar(Foo foo) {
        return new Bar(foo);
    }
}
