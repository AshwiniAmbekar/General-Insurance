package com.lti.entity;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class BuyInsuranceEntity {

	@Id
	@GeneratedValue
	private Long registrationNumber;
	private int planType;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateAndTime;
	
    private String vehicleType;
	private String vehicleModel;
	private Long drivingLicence;
	private int engineNumber;

 public int getPlanType() {
	 return planType;
 }
 public void setPlanType(int planType) {
	 this.planType=planType;
 }
	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public Long getDrivingLicence() {
		return drivingLicence;
	}

	public void setDrivingLicence(Long drivingLicence) {
		this.drivingLicence = drivingLicence;
	}

	public Long getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(Long registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public int getEngineNumber() {
		return engineNumber;
	}

	public void setEngineNumber(int engineNumber) {
		this.engineNumber = engineNumber;
	}
	public Date getDateAndTime() {
		return dateAndTime;
	}

	public void setDateAndTime(Date dateAndTime) {
		this.dateAndTime = dateAndTime;
	}

}
