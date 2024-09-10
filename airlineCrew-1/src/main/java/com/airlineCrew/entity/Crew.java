package com.airlineCrew.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="crew_details")
public class Crew {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cId;
	
	private String cname;
	
	private String crole;
	
	public Crew() {
		// TODO Auto-generated constructor stub
	}
	

	public Crew(Integer cId, String cname, String crole) {
		super();
		this.cId = cId;
		this.cname = cname;
		this.crole = crole;
	}

	public Integer getcId() {
		return cId;
	}

	public void setcId(Integer cId) {
		this.cId = cId;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCrole() {
		return crole;
	}

	public void setCrole(String crole) {
		this.crole = crole;
	}

	@Override
	public String toString() {
		return "Crew [cId=" + cId + ", cname=" + cname + ", crole=" + crole + "]";
	}

	
	

}
