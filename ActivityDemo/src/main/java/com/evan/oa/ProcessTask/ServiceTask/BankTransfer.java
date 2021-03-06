package com.evan.oa.ProcessTask.ServiceTask;

import com.evan.oa.entity.ExpenseAccount;
import org.activiti.engine.delegate.BpmnError;
import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * 此方法演示使用ServiceTask的activiti:class 属性执行Java类
 * 该java类必须是JavaDelegate或者ActivitiBehavior的实现类
 * @author evan
 *
 */

@Component
public class BankTransfer implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		ExpenseAccount expense = (ExpenseAccount) execution.getVariable("entity");
		if (expense.getMoney().compareTo(new BigDecimal(1000)) == 1 ) {
			System.out.println("银行转账失败");
			throw new BpmnError("to much");
		} else {
			//具体业务
			System.out.println("银行转帐成功");
		}
	
	}

}
