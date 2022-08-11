package toy_project;

public class insert {

	private String id;
	private String ipaydate;
	private String itype;
	private String ipay;
	private int iamount;
	private int iperiod;
	private String inote;
	
	public insert(String id, String ipaydate, String itype, 
			String ipay, int iamount, int iperiod, String inote) {
		
		this.id = id;
		this.ipaydate = ipaydate;
		this.itype = itype;
		this.ipay = ipay;
		this.iamount = iamount;
		this.iperiod = iperiod;
		this.inote = inote;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIpaydate() {
		return ipaydate;
	}
	public void setIpaydate(String ipaydate) {
		this.ipaydate = ipaydate;
	}

	public String getItype() {
		return itype;
	}
	public void setItype(String itype) {
		this.itype = itype;
	}
	public String getIpay() {
		return ipay;
	}
	public void setIpay(String ipay) {
		this.ipay = ipay;
	}
	public int getIamount() {
		return iamount;
	}
	public void setIamount(int iamount) {
		this.iamount = iamount;
	}
	public int getIperiod() {
		return iperiod;
	}
	public void setIperiod(int iperiod) {
		this.iperiod = iperiod;
	}
	public String getInote() {
		return inote;
	}
	public void setInote(String inote) {
		this.inote = inote;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "아이디 : " +id +"  " +"지불일자 : " +ipaydate +"  " +"목적 : " +itype +"  "
				+"지불방법 : " +ipay +"  " +"금액 : " +iamount +"  " +"할부기간 : " +iperiod +"  "
				+"메모 : " +inote;
	}
	
	
}
