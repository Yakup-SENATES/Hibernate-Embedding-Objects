package com.hibernate.demo;

import javax.persistence.*;

@Entity 
@Table(name = "city")
public class City {

	@Id	 @Column(name = "ID") 
	
	private int id;

	@Column(name = "Population")
	private int population;

	@Column(name = "Name")
	private String name;

	@Column(name = "CountryCode")
	private String countryCode;

	@Column(name = "District")
	private String district;
	
	
	@Embedded
	private Adress adress;
	
	

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	public City() {
	}

	public City(int id, int population, String name, String countryCode, String district) {
		super();
		this.id = id;
		this.population = population;
		this.name = name;
		this.countryCode = countryCode;
		this.district = district;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String disrtrict) {
		this.district = disrtrict;
	}

}
