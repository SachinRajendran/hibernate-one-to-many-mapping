package com.mspro;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="Mobile")
public class Mobile {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     @Column(name = "Mobileid",nullable=false,unique=true)
	private long Mobileid;
	private String Mobilename;
	private String Manufacturer;
	
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name ="Mobileid")
	private List<Mobilemodel> mobilemodel;
	public List<Mobilemodel> getMobilemodel(){
		return mobilemodel;
	}

	public void setMobilemodel(List<Mobilemodel>mobilemodel) {
		this.mobilemodel=mobilemodel;
	}
	
	
	public long getMobileid() {
		return Mobileid;
	}
	public void setMobileid(long mobileid) {
		Mobileid = mobileid;
	}
	public String getMobilename() {
		return Mobilename;
	}
	public void setMobilename(String mobilename) {
		Mobilename = mobilename;
	}
	public String getManufacturer() {
		return Manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}
	@Override
	public String toString() {
		return "Mobile [Mobileid=" + Mobileid + ", Mobilename=" + Mobilename + ", Manufacturer=" + Manufacturer
				+ ", mobilemodel=" + mobilemodel + "]";
	}
}
