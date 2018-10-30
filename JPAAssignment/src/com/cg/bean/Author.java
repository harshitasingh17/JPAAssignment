package com.cg.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Authors")
public class Author 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="author_id", length=10)
	private int authorId;

	@Column(name="f_name", length=10)
	private String fName;

	@Column(name="m_name", length=10)
	private String mName;
	
	@Column(name="l_name", length=10)
	private String lName;
	
	@Column(name="phone_no", length=10)
	private double phNo;

	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Author(int authorId, String fName, String mName, String lName,
			double phNo) {
		super();
		this.authorId = authorId;
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
		this.phNo = phNo;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public double getPhNo() {
		return phNo;
	}

	public void setPhNo(double phNo) {
		this.phNo = phNo;
	}

	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", fName=" + fName + ", mName="
				+ mName + ", lName=" + lName + ", phNo=" + phNo + "]";
	}
	
	
}
