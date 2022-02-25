/**
 * 
 */
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author sophi
 *
 */
@Component
public class Iphone {
	
	private String camera;
	private char model;
	private double cost;
	private String brand;
	
	@Autowired
	private Carrier carrier;

	public Iphone(){
		 
	 }
	
	public String getCamera() {
		return camera;
	}
	public void setCamera(String camera) {
		this.camera = camera;
	}
	public char getModel() {
		return model;
	}
	public void setModel(char model) {
		this.model = model;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Carrier getCarrier() {
		return carrier;
	}
	@Autowired
	public void setCarrier(Carrier carrier) {
		this.carrier = carrier;
	}
 
}