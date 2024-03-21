package com.revolution.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.revolution.hrpayroll.entities.Payment;

@Service
public class PaymentServices {
	
	public Payment getPayment(long workedId, int days) {
		return new Payment("Bob", 200.0, days);
	}

}
