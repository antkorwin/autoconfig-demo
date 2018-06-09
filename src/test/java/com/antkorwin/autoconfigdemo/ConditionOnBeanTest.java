package com.antkorwin.autoconfigdemo;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Korovin Anatolii on 10.06.2018.
 *
 * @author Korovin Anatolii
 * @version 1.0
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ConditionOnBeanTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void beanNotFoundTest() {
        Assertions.assertThat(applicationContext.containsBean("foo")).isFalse();
        Assertions.assertThat(applicationContext.containsBean("bar")).isFalse();
    }
}
