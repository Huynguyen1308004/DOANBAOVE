package ghidevanapchong;

public class mainBank {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank SBIBANK = new SBI();
		System.out.println("tỷ lệ lãi suât của ngân hàng là"+ SBIBANK.getRate()+"%");	
		Bank ICICIBANK = new ICICI();
		System.out.println("tỷ lệ lãi suât của ngân hàng là"+ ICICIBANK.getRate()+"%");	
		Bank AXISBANK = new AXIS();
		System.out.println("tỷ lệ lãi suât của ngân hàng là"+ AXISBANK.getRate()+"%");	
	}

}