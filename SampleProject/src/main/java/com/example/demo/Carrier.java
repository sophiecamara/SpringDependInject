/**
 * 
 */
package com.example.demo;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;

/**
 * @author sophi
 *
 */
@Component
@Scope(value="prototype")
public class Carrier {
	private String name;
	private String location;
	private double price_tag;
	
public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getPrice_tag() {
		return price_tag;
	}
	public void setPrice_tag(double price_tag) {
		this.price_tag = price_tag;
	}
public void display() {
	System.out.print( "Carrier [name=" + name + ", location=" + location + ", price_tag=" + price_tag + "]");
}

	
}

