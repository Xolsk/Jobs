package com.jobs.domain;

public class Volunteer extends AbsStaffMember {
	

	protected String description;
	
	public Volunteer(String name, String address, String phone, String description) throws Exception {
		super(name, address, phone);
		this.description=description;
	}

	
	@Override
	public void pay() {
		System.out.println(this.getName() +" is Volunteer, does not get anything lol");
		totalPaid=0;
		
	}

}
