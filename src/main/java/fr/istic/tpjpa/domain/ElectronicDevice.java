package fr.istic.tpjpa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ElectronicDevice {

	private int id;
	private boolean lowcost;
	private int wattage;
	private Person owner;
	
	public ElectronicDevice(){}
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isLowcost() {
		return lowcost;
	}
	public void setLowcost(boolean lowcost) {
		this.lowcost = lowcost;
	}
	public int getWattage() {
		return wattage;
	}
	public void setWattage(int wattage) {
		this.wattage = wattage;
	}
	
	@ManyToOne
	public Person getOwner() {
		return owner;
	}
	public void setOwner(Person owner) {
		this.owner = owner;
	}
	
	@Override
	public String toString() {
		return "ElectronicDevice [id=" + id + ", lowcost=" + lowcost
				+ ", wattage=" + wattage + ", onwer=" + owner + "]";
	}
	
	
}
