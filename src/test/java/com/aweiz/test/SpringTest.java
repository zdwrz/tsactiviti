package com.aweiz.test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.aweiz.service.TsService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.task.Task;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:app-context.xml")
public class SpringTest {
	@Autowired
	private RuntimeService runtimeService;
	@Autowired
	private TaskService taskService;

//	@Test
//	public void simpleSpringTest() {
//		Map<String, Object> variableMap = new HashMap<String, Object>();
//		variableMap.put("isbn", 123456L);
//		runtimeService.startProcessInstanceByKey("bookorder", variableMap);
//		Task task = taskService.createTaskQuery().singleResult();
//		assertEquals("Complete order", task.getName());
//		taskService.complete(task.getId());
//		assertEquals(0, runtimeService.createProcessInstanceQuery().count());
//	}
	@Test
	public void simpleTsSpringTest() {
		Map<String, Object> variableMap = new HashMap<String, Object>();
		variableMap.put("tsId", 123456L);
		variableMap.put("valid", false);
		variableMap.put("requestApproved", true);
		runtimeService.startProcessInstanceByKey("time_sheet_process", variableMap);
		List<Task> taskList = taskService.createTaskQuery().list();
		for (Task task : taskList) {
			//assertEquals("submit", task.getName());
			taskService.complete(task.getId());
		}
//		Task task = taskService.createTaskQuery().singleResult();
//		assertEquals("submit", task.getName());
//		taskService.complete(task.getId());
//		//	assertEquals(0, runtimeService.createProcessInstanceQuery().count());
//
//		task = taskService.createTaskQuery().singleResult();
//		assertEquals("Approver Review", task.getName());
//		taskService.complete(task.getId());

	}
}