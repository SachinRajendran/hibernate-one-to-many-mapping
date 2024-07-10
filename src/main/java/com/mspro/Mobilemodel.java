package com.mspro;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="mobilemodel")
public class Mobilemodel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long modelid;
	private long Mobileid;
	private String MobileName;
	@Column(name = "Model",nullable = false,unique = true)
	private String Model;
	private long price;
	
	public long getModelid() {
		return modelid;
	}
	public void setModelid(long modelid) {
		this.modelid = modelid;
	}
	
	public long getMobileid() {
		return Mobileid;
	}
	public void setMobileid(long mobileid) {
		Mobileid = mobileid;
	}
	public String getMobileName() {
		return MobileName;
	}
	public void setMobileName(String mobileName) {
		MobileName = mobileName;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Mobilemodel [modelid=" + modelid + ", Mobileid=" + Mobileid + ", MobileName=" + MobileName + ", Model="
				+ Model + ", price=" + price + "]";
	}

	

}
