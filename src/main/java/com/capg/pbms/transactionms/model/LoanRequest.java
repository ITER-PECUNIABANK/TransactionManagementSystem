package com.capg.pbms.transactionms.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LoanRequest {
	@Id
	private long loanRequestId;
	private String loanCustomerId;
	private double loanAmount;
	private String loanType;
	private int loanTenure;
	private double loanRoi;
	private String loanStatus;
	private Double loanEmi;
	private int CreditScore;
public LoanRequest() {
	
}
public long getLoanRequestId() {
	return loanRequestId;
}
public void setLoanRequestId(long loanRequestId) {
	this.loanRequestId = loanRequestId;
}
public String getLoanCustomerId() {
	return loanCustomerId;
}
public void setLoanCustomerId(String loanCustomerId) {
	this.loanCustomerId = loanCustomerId;
}
public double getLoanAmount() {
	return loanAmount;
}
public void setLoanAmount(double loanAmount) {
	this.loanAmount = loanAmount;
}
public String getLoanType() {
	return loanType;
}
public void setLoanType(String loanType) {
	this.loanType = loanType;
}
public int getLoanTenure() {
	return loanTenure;
}
public void setLoanTenure(int loanTenure) {
	this.loanTenure = loanTenure;
}
public double getLoanRoi() {
	return loanRoi;
}
public void setLoanRoi(double loanRoi) {
	this.loanRoi = loanRoi;
}
public String getLoanStatus() {
	return loanStatus;
}
public void setLoanStatus(String loanStatus) {
	this.loanStatus = loanStatus;
}
public Double getLoanEmi() {
	return loanEmi;
}
public void setLoanEmi(Double loanEmi) {
	this.loanEmi = loanEmi;
}
public int getCreditScore() {
	return CreditScore;
}
public void setCreditScore(int creditScore) {
	CreditScore = creditScore;
}
public LoanRequest(long loanRequestId, String loanCustomerId, double loanAmount, String loanType, int loanTenure,
		double loanRoi, String loanStatus, Double loanEmi, int creditScore) {
	super();
	this.loanRequestId = loanRequestId;
	this.loanCustomerId = loanCustomerId;
	this.loanAmount = loanAmount;
	this.loanType = loanType;
	this.loanTenure = loanTenure;
	this.loanRoi = loanRoi;
	this.loanStatus = loanStatus;
	this.loanEmi = loanEmi;
	CreditScore = creditScore;
}
@Override
public String toString() {
	return "LoanRequest [loanRequestId=" + loanRequestId + ", loanCustomerId=" + loanCustomerId + ", loanAmount="
			+ loanAmount + ", loanType=" + loanType + ", loanTenure=" + loanTenure + ", loanRoi=" + loanRoi
			+ ", loanStatus=" + loanStatus + ", loanEmi=" + loanEmi + ", CreditScore=" + CreditScore + "]";
}

}
