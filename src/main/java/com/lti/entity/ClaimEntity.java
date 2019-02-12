package com.lti.entity;
public class ClaimEntity {
	private int planType;
	private Long mobileNumber;
	private String ReasonToClaim;
	public int getPlanType() {
		return planType;
	}
	public void setPlanType(int planType) {
		this.planType = planType;
	}
	public Long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getReasonToClaim() {
		return ReasonToClaim;
	}
	public void setReasonToClaim(String reasonToClaim) {
		ReasonToClaim = reasonToClaim;
	}
	
	

}
