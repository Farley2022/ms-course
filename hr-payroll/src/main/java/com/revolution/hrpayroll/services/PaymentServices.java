package com.revolution.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revolution.hrpayroll.entities.Payment;
import com.revolution.hrpayroll.entities.Worker;
import com.revolution.hrpayroll.feignclients.WorkerFeignClients;

@Service
public class PaymentServices {
	
	
	@Autowired
	private WorkerFeignClients workerFeignClients;
	
	
	public Payment getPayment(long workerId, int days) {
		
		
		Worker worker = workerFeignClients.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}

}
