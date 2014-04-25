package fr.istic.tpjpa.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;



@Entity
public class Person {

	private String lastName;
	private String firstName;
	private int age;
	private String nickname;
	private String hobbies;
	private String job;
	private List<Person> friend = new ArrayList<Person>();
	private List<Home> sweetoodHomes = new ArrayList<Home>();
	private List<ElectronicDevice> devices = new ArrayList<ElectronicDevice>();
	
	public Person(){}
	
	

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getNickname() {
		return nickname;
	}


	public void setNickname(String nickname) {
		this.nickname = nickname;
	}


	public String getHobbies() {
		return hobbies;
	}


	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	private int id;
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", lastName=" + lastName + ", firstName="
				+ firstName + ", age=" + age + ", nickname=" + nickname
				+ ", hobbies=" + hobbies + ", job=" + job + ", friend="
				+ friend + ", sweetoodHomes=" + sweetoodHomes + ", devices="
				+ devices + "]";
	}


	public String getJob() {
		return job;
	}


	public void setJob(String job) {
		this.job = job;
	}


	public List<Person> getFriend() {
		return friend;
	}

	@OneToMany
	@JoinTable(name = "P2P")
	public void setFriend(List<Person> friend) {
		this.friend = friend;
	}


	public List<Home> getSweetoodHomes() {
		return sweetoodHomes;
	}

	@OneToMany(mappedBy = "resident", cascade = CascadeType.PERSIST)
	public void setSweetoodHomes(List<Home> sweetoodHomes) {
		this.sweetoodHomes = sweetoodHomes;
	}


	@OneToMany(mappedBy="owner", cascade = CascadeType.PERSIST)
	public List<ElectronicDevice> getDevices() {
		return devices;
	}


	public void setDevices(List<ElectronicDevice> devices) {
		this.devices = devices;
	}
	
	
	
	

}
