# lab1
package com;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Ticket {
	private String source;
	private String destination;
	private int price;
	@Id
	private Date date;
	public String getSource() {
		return source;
	}
	public Ticket() {}
	public Ticket(String source, String destination, int price, Date date) {
		this.source = source;
		this.destination = destination;
		this.price = price;
		this.date = date;
	}
	
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Ticket [source=" + source + ", destination=" + destination + ", price=" + price + ", date=" + date
				+ "]";
	}
	

}