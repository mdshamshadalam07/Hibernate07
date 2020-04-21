package com.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EmailDetails")

public class Email {
	@Id
	@Column(name ="Eid")
	private Integer eid;

	@Column(name = "Eto")
	private String eto;

	@Column(name = "EFrom")
	private String efrom;

	@Column(name = "ESub")
	private String esub;
	
	@Column(name = "EText")
	private String eText;

	public Email() {
		super();
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEto() {
		return eto;
	}

	public void setEto(String eto) {
		this.eto = eto;
	}

	public String getEfrom() {
		return efrom;
	}

	public void setEfrom(String efrom) {
		this.efrom = efrom;
	}

	public String getEsub() {
		return esub;
	}

	public void setEsub(String esub) {
		this.esub = esub;
	}

	public String geteText() {
		return eText;
	}

	public void seteText(String eText) {
		this.eText = eText;
	}

	@Override
	public String toString() {
		return "Email [eid=" + eid + ", eto=" + eto + ", efrom=" + efrom + ", esub=" + esub + ", eText=" + eText + "]";
	}

	

	
	
	}//class