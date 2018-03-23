package com.nt.map;

public class Parent {
	String pname;
	Long pmdno;
    String address;
    String mailid;
    Parent(String pname,Long pmdno,String address,String mailid){
    	this.pname=pname;
    	this.pmdno=pmdno;
    	this.address=address;
    	this.mailid=mailid;
    	
    }
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Long getPmdno() {
		return pmdno;
	}
	public void setPmdno(Long pmdno) {
		this.pmdno = pmdno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	@Override
	public String toString() {
		return "Parent[pname=" + pname + ", pmdno=" + pmdno + ", address=" + address + ", mailid=" + mailid + "]";
	}

}

