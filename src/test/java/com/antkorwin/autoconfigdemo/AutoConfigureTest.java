package com.antkorwin.autoconfigdemo;

import com.antkorwin.autoconfigdemo.models.Bar;
import com.antkorwin.autoconfigdemo.models.Foo;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("foo")
public class AutoConfigureTest {

    @Autowired
    private Foo foo;

    @Autowired
    private Bar bar;

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void contextLoads() {
        Assertions.assertThat(foo).isNotNull();
        Assertions.assertThat(bar).isNotNull();

        Assertions.assertThat(applicationContext.containsBean("foo")).isTrue();
        Assertions.assertThat(applicationContext.containsBean("bar")).isTrue();
    }
}
