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
public class Android {
//properties
	private String brand;
	private String color;
	private double cost;
	@Autowired
	private Carrier carrier;
	
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Carrier getCarrier() {
		return carrier;
	}
	@Autowired
	public void setCarrier(Carrier carrier) {
		this.carrier = carrier;
	}


}
