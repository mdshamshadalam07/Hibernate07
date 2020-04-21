package com.nit.model;

import java.util.List;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name="Stdtab1")
public class Student1 {	
	@Id
	@Column(name="sid")
	private Integer StdId;
	@Column(name="sname")
	private String StdName;
	@Column(name="sfee")
	private double StdFee;
	@ElementCollection
    @CollectionTable(name = "stdmarks", joinColumns = @JoinColumn(name = "sid"))
    @OrderColumn(name = "pos")
	@Column(name="marks")
	private List<Double>marks;
	public Student1() {
		super();
	}
	public Integer getStdId() {
		return StdId;
	}
	public void setStdId(Integer stdId) {
		StdId = stdId;
	}
	public String getStdName() {
		return StdName;
	}
	public void setStdName(String stdName) {
		StdName = stdName;
	}
	public double getStdFee() {
		return StdFee;
	}
	public void setStdFee(double stdFee) {
		StdFee = stdFee;
	}
	public List<Double>getMarks() {
		return marks;
	}
	public void setMarks(List<Double> marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Stdtab1 [StdId=" + StdId + ", StdName=" + StdName + ", StdFee=" + StdFee + ", marks=" + marks + "]";
	}
}