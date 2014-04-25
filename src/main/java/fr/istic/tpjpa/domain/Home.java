package fr.istic.tpjpa.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Home {
	


	private int id;
	private String address;
	private String cityArea;
	private String cityTown;
	private String county;
	private String country;
	private Person resident;
	private List<Heater> heaters = new ArrayList<Heater>();
	
	public Home(){}
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCityArea() {
		return cityArea;
	}

	public void setCityArea(String cityArea) {
		this.cityArea = cityArea;
	}

	public String getCityTown() {
		return cityTown;
	}

	public void setCityTown(String cityTown) {
		this.cityTown = cityTown;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@ManyToOne
	public Person getResident() {
		return resident;
	}

	public void setResident(Person resident) {
		this.resident = resident;
	}

	@OneToMany(mappedBy="owner", cascade = CascadeType.PERSIST)
	public List<Heater> getHeaters() {
		return heaters;
	}

	public void setHeaters(List<Heater> heaters) {
		this.heaters = heaters;
	}
	
	@Override
	public String toString() {
		return "Home [id=" + id + ", address=" + address + ", cityArea="
				+ cityArea + ", cityTown=" + cityTown + ", county=" + county
				+ ", country=" + country + ", resident=" + resident
				+ ", heaters=" + heaters + "]";
	}


}
