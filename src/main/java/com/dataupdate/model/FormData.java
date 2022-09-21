package com.dataupdate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
public class FormData {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private String FirstName;
	private String LastName;
    private String PreferredContactMethod;
    private String TicketNumber;
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getPreferredContactMethod() {
		return PreferredContactMethod;
	}
	public void setPreferredContactMethod(String preferredContactMethod) {
		PreferredContactMethod = preferredContactMethod;
	}
	public String getTicketNumber() {
		return TicketNumber;
	}
	public void setTicketNumber(String ticketNumber) {
		TicketNumber = ticketNumber;
	}
    
    
}
