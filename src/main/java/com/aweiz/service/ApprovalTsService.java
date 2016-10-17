package com.aweiz.service;

import org.activiti.engine.delegate.DelegateExecution;
import org.springframework.stereotype.Service;

@Service
public class ApprovalTsService {
	
	public void deny(DelegateExecution execution) {
		System.out.println("deny you");
	}
	
	public void validate(DelegateExecution execution) {
		System.out.println("validate you");
	}
	
	public void save(DelegateExecution execution) {
		System.out.println("save you");
	}
	
	public void invalidNotify(DelegateExecution execution) {
		System.out.println("notify you invalid");
	}
	
	public void approve(DelegateExecution execution) {
		System.out.println("approve you");
	}
}
