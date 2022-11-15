package com.inti.model;

public class Avis {
	long idavis; 
	String commentaire;
	
	public Hotel hotel;
	public void setHotel (Hotel hotel) {
		this.hotel=hotel;
	}
	public Hotel getavis() {
		return hotel;
	}
}
