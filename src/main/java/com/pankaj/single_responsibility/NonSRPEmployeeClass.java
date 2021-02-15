package com.pankaj.single_responsibility;

import java.time.LocalDate;



public class NonSRPEmployeeClass {

	private Long employeeId;
	private String name;
	private String address;
	private LocalDate dateOfJoining; 
	
	
	
	public boolean isPromotionDueThisYear() { 
		
		return true;
	}
	
	public Double calculateIncomeTaxForCurrentYear() { 
		
		return 1.00;
	}
	
	
}
