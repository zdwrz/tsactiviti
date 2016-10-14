package com.aweiz.service;

import org.activiti.engine.delegate.DelegateExecution;
import org.springframework.stereotype.Service;

/**
 * Created by daweizhuang on 10/14/16.
 */
@Service
public class TsServiceImpl implements TsService{
    public void validate(DelegateExecution execution) {
        System.out.println("validating order for isbn " + execution.getVariable("isbn"));
    }
}
