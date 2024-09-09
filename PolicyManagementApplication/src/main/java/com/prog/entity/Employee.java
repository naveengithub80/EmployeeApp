package com.prog.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="policyTable")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int policyId;
	public String policyGroup;
	public String premium;
	public String startdate;
	public String endDate;
	
	
	public String patientName;
	public String address;
	public String policy;
	public String DOA;
	public int claimamount;
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public String getPolicyGroup() {
		return policyGroup;
	}
	public void setPolicyGroup(String policyGroup) {
		this.policyGroup = policyGroup;
	}
	public String getPremium() {
		return premium;
	}
	public void setPremium(String premium) {
		this.premium = premium;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPolicy() {
		return policy;
	}
	public void setPolicy(String policy) {
		this.policy = policy;
	}
	public String getDOA() {
		return DOA;
	}
	public void setDOA(String dOA) {
		DOA = dOA;
	}
	public int getClaimamount() {
		return claimamount;
	}
	public void setClaimamount(int claimamount) {
		this.claimamount = claimamount;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Employee [policyId=" + policyId + ", policyGroup=" + policyGroup + ", premium=" + premium
				+ ", startdate=" + startdate + ", endDate=" + endDate + ", patientName=" + patientName + ", address="
				+ address + ", policy=" + policy + ", DOA=" + DOA + ", claimamount=" + claimamount + "]";
	}
	
	
	
	
	
		
	
	
	
	
	
	
	
	

}
