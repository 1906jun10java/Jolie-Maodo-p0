package com.mj.users;

public class PaymentTransactions {
	
	private int paymentCode;
	private double paymentAmount;
	private int carVIN;

	public int getPaymentCode() {
		return paymentCode;
	}

	public void setPaymentCode(int paymentCode) {
		this.paymentCode = paymentCode;
	}

	public double getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public int getCarVIN() {
		return carVIN;
	}

	public void setCarVIN(int carVIN) {
		this.carVIN = carVIN;
	}

	@Override
	public String toString() {
		return "PaymentTransactions [paymentCode=" + paymentCode + ", paymentAmount=" + paymentAmount + ", carVIN="
				+ carVIN + "]";
	}

	
	
}

