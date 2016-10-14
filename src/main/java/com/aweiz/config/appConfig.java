package com.aweiz.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by daweizhuang on 10/14/16.
 */
@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = { "com.aweiz.service" })
public class appConfig {
}
