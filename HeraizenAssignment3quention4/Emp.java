package com.HeraizenAssignmentNo3.QuestionNo4;

public class Emp {
	int empId;
	String empName;
	String designation;
	double basic;
	double hra;

	
	public String printDet() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", designation=" + designation + "]";
	}
	
	public double calculateHRA(){
		if(designation.equalsIgnoreCase("manager")) {
			return hra = basic*0.1;
		}
		if(designation.equalsIgnoreCase("Officer")) {
			return hra = basic*0.12;
		}
		if(designation.equalsIgnoreCase("CLERK")) {
			return hra = basic*0.05;
		}
		return 0;
	}

	public Emp(int empId, String empName, String designation, double basic) throws LowSalException {
		super();
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		
		if(basic<=500) {
			throw new LowSalException("low basic");
		}
		this.basic = basic;
	}
	
}
