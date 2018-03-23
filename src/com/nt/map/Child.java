package com.nt.map;

public class Child {
	String cname;
	Long mdno;
	String address;
	String mailid;
	Child(String cname,Long mdno,String address,String mailid){
		this.cname=cname;
		this.mdno=mdno;
		this.address=address;
		this.mailid=mailid;
		
		
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Long getMdno() {
		return mdno;
	}
	public void setMdno(Long mdno) {
		this.mdno = mdno;
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
		return "Child [cname=" + cname + ", mdno=" + mdno + ", address=" + address + ", mailid=" + mailid + "]";
	}

}
