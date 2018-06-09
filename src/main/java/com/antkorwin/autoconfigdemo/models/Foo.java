package com.antkorwin.autoconfigdemo.models;


import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by Korovin Anatolii on 09.06.2018.
 *
 * @author Korovin Anatolii
 * @version 1.0
 */
@Slf4j
@Getter
public class Foo {

    private String value = "ops";

    public Foo() {
        log.warn("new Foo()");
    }
}
