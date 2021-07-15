package restapp.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int accno;
	private String accnm;
	private String acctype;
	private double balance;
	private String opendate;
	private String userid;
	public Account(int accno, String accnm, String acctype, double balance, String opendate, String userid) {
		super();
		this.accno = accno;
		this.accnm = accnm;
		this.acctype = acctype;
		this.balance = balance;
		this.opendate = opendate;
		this.userid = userid;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Account [accno=" + accno + ", accnm=" + accnm + ", acctype=" + acctype + ", balance=" + balance
				+ ", opendate=" + opendate + ", userid=" + userid + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
